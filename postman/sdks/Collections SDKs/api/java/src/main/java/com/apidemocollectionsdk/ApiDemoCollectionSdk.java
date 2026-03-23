package com.apidemocollectionsdk;

import com.apidemocollectionsdk.config.ApiDemoCollectionSdkConfig;
import com.apidemocollectionsdk.http.Environment;
import com.apidemocollectionsdk.http.interceptors.DefaultHeadersInterceptor;
import com.apidemocollectionsdk.http.interceptors.RetryInterceptor;
import com.apidemocollectionsdk.services.UnknownService;
import com.apidemocollectionsdk.services.UserService;
import com.apidemocollectionsdk.services.UsersService;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/**
 * Main SDK client class for ApiDemoCollectionSdk.
 * Provides centralized access to all service endpoints with configurable authentication,
 * environment management, hooks, and HTTP client settings.
 */
public class ApiDemoCollectionSdk {

  public final UsersService users;
  public final UserService user;
  public final UnknownService unknown;

  private final ApiDemoCollectionSdkConfig config;

  /**
   * Constructs a new instance of ApiDemoCollectionSdk with default configuration.
   */
  public ApiDemoCollectionSdk() {
    // Default configs
    this(ApiDemoCollectionSdkConfig.builder().build());
  }

  /**
   * Constructs a new instance of ApiDemoCollectionSdk with custom configuration.
   * Initializes all services, HTTP client, and optional OAuth token manager.
   *
   * @param config The SDK configuration including base URL, authentication, timeout, and retry settings
   */
  public ApiDemoCollectionSdk(ApiDemoCollectionSdkConfig config) {
    this.config = config;

    final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new DefaultHeadersInterceptor(config))
      .addInterceptor(new RetryInterceptor(config.getRetryConfig()))
      .readTimeout(config.getTimeout(), TimeUnit.MILLISECONDS)
      .build();

    this.users = new UsersService(httpClient, config);
    this.user = new UserService(httpClient, config);
    this.unknown = new UnknownService(httpClient, config);
  }

  /**
   * Sets the environment for all API requests.
   *
   * @param environment The environment to use (e.g., DEFAULT, PRODUCTION, STAGING)
   */
  public void setEnvironment(Environment environment) {
    setBaseUrl(environment.getUrl());
  }

  /**
   * Sets the base URL for all API requests.
   *
   * @param baseUrl The base URL to use for API requests
   */
  public void setBaseUrl(String baseUrl) {
    this.config.setBaseUrl(baseUrl);
  }
}
// c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
