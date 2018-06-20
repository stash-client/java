package com.appscode.stash.client.examples;

import com.appscode.stash.client.ApiClient;
import com.appscode.stash.client.ApiException;
import com.appscode.stash.client.Configuration;
import com.appscode.stash.client.apis.StashAppscodeComV1alpha1Api;
import com.appscode.stash.client.models.V1alpha1Restic;
import com.appscode.stash.client.models.V1alpha1ResticList;
import com.appscode.stash.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.stash.client.examples.Example"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class Example {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    StashAppscodeComV1alpha1Api api = new StashAppscodeComV1alpha1Api();
    V1alpha1ResticList list =
        api.listResticForAllNamespaces(null, null, null, null, null, null, null, null, null);
    for (V1alpha1Restic item : list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
