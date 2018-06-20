package com.appscode.stash.client.examples;

import com.appscode.stash.client.ApiClient;
import com.appscode.stash.client.ApiException;
import com.appscode.stash.client.Configuration;
import com.appscode.stash.client.apis.StashAppscodeComV1alpha1Api;
import com.appscode.stash.client.models.V1alpha1Restic;
import com.appscode.stash.client.util.Config;
import com.appscode.stash.client.util.Watch;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** A simple example of how to use Watch API to watch changes in Restic list. */
public class WatchExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);

    StashAppscodeComV1alpha1Api api = new StashAppscodeComV1alpha1Api();

    Watch<V1alpha1Restic> watch =
        Watch.createWatch(
            client,
            api.listResticForAllNamespacesCall(
                null, null, null, null, null, "false", null, null, Boolean.TRUE, null, null),
            new TypeToken<Watch.Response<V1alpha1Restic>>() {}.getType());

    for (Watch.Response<V1alpha1Restic> item : watch) {
      System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
    }
  }
}
