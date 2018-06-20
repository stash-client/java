package com.appscode.stash.client.util.credentials;

import com.appscode.stash.client.ApiClient;
import com.google.common.base.Preconditions;

/** Uses a Bearer Token to configure {@link ApiClient} authentication to the Kubernetes API. */
public class AccessTokenAuthentication implements Authentication {
  private String token;

  public AccessTokenAuthentication(final String token) {
    Preconditions.checkNotNull(token, "Access Token cannot be null");
    this.token = token;
  }

  @Override
  public void provide(ApiClient client) {
    client.setApiKeyPrefix("Bearer");
    client.setApiKey(token);
  }
}
