package com.appscode.stash.client.util.credentials;

import com.appscode.stash.client.ApiClient;
import com.appscode.stash.client.util.ClientBuilder;

/**
 * Allows the implementation of different authentication mechanisms for the Kubernetes API.
 *
 * @see ClientBuilder#setAuthentication(Authentication)
 */
public interface Authentication {

  void provide(ApiClient client);
}
