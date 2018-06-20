package com.appscode.stash.client.examples;

import com.appscode.stash.client.ApiClient;
import com.appscode.stash.client.ApiException;
import com.appscode.stash.client.Configuration;
import com.appscode.stash.client.apis.StashAppscodeComV1alpha1Api;
import com.appscode.stash.client.models.V1alpha1Restic;
import com.appscode.stash.client.util.ClientBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of Restic using Json Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>.
 *
 * <ul>
 *   <li>Creates restic stash-demo with <b>spec.schedule</b> value as @every 1m.
 *   <li>Patches restic stash-demo with <b>spec.schedule</b> value as @every 5m.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.stash.client.examples.PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr =
      "{\"op\":\"replace\",\"path\":\"/spec/schedule\",\"value\":\"@every 5m\"}";
  static String jsonDepStr =
      "{\"apiVersion\":\"stash.appscode.com/v1alpha1\",\"kind\":\"Restic\",\"metadata\":{\"name\":\"stash-demo\",\"namespace\":\"default\"},\"spec\":{\"selector\":{\"matchLabels\":{\"app\":\"stash-demo\"}},\"fileGroups\":[{\"path\":\"/source/data\",\"retentionPolicyName\":\"keep-last-5\"}],\"backend\":{\"local\":{\"mountPath\":\"/safe/data\",\"hostPath\":{\"path\":\"/data/stash-test/restic-repo\"}},\"storageSecretName\":\"stash-demo\"},\"schedule\":\"@every 1m\",\"volumeMounts\":[{\"mountPath\":\"/source/data\",\"name\":\"source-data\"}],\"retentionPolicies\":[{\"name\":\"keep-last-5\",\"keepLast\":5,\"prune\":true}]}}";

  public static void main(String[] args) throws IOException, ApiException {
    PatchExample example = new PatchExample();
    ApiClient client = ClientBuilder.defaultClient();
    Configuration.setDefaultApiClient(client);

    V1alpha1Restic body = (V1alpha1Restic) example.deserialize(jsonDepStr, V1alpha1Restic.class);
    V1alpha1Restic deploy1 = example.createRestic("default", body, "false");
    System.out.println("original restic" + deploy1);

    ArrayList<JsonObject> arr = new ArrayList<>();
    arr.add(((JsonElement) example.deserialize(jsonPatchStr, JsonElement.class)).getAsJsonObject());
    V1alpha1Restic deploy2 = example.PatchRestic("stash-demo", "default", arr, "false");
    System.out.println("patched restic" + deploy2);
  }

  public V1alpha1Restic createRestic(String namespace, V1alpha1Restic body, String pretty)
      throws ApiException {
    StashAppscodeComV1alpha1Api api = new StashAppscodeComV1alpha1Api();
    V1alpha1Restic deploy = api.createNamespacedRestic(namespace, body, pretty);
    return deploy;
  }

  public V1alpha1Restic PatchRestic(String deployName, String namespace, Object body, String pretty)
      throws ApiException {
    StashAppscodeComV1alpha1Api api = new StashAppscodeComV1alpha1Api();
    V1alpha1Restic deploy = api.patchNamespacedRestic(deployName, namespace, body, pretty);
    return deploy;
  }

  public Object deserialize(String jsonStr, Class<?> targetClass) {
    Object obj = (new Gson()).fromJson(jsonStr, targetClass);
    return obj;
  }
}
