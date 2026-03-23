package com.apidemocollectionsdk.services;

import com.apidemocollectionsdk.config.ApiDemoCollectionSdkConfig;
import com.apidemocollectionsdk.config.RequestConfig;
import com.apidemocollectionsdk.exceptions.ApiError;
import com.apidemocollectionsdk.http.Environment;
import com.apidemocollectionsdk.http.HttpMethod;
import com.apidemocollectionsdk.http.ModelConverter;
import com.apidemocollectionsdk.http.util.RequestBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * UnknownService Service
 */
public class UnknownService extends BaseService {

  private RequestConfig getListConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();
  private RequestConfig getNotfoundConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();

  /**
   * Constructs a new instance of UnknownService.
   *
   * @param httpClient The HTTP client to use for requests
   * @param config The SDK configuration
   */
  public UnknownService(@NonNull OkHttpClient httpClient, ApiDemoCollectionSdkConfig config) {
    super(httpClient, config);
  }

  /**
   * Sets method-level configuration for {@code getList}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UnknownService setGetListConfig(RequestConfig config) {
    this.getListConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getNotfound}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UnknownService setGetNotfoundConfig(RequestConfig config) {
    this.getNotfoundConfig = config;
    return this;
  }

  /**
   * Method getList
   * GET /unknown
   *
   * @return response of {@code Object}
   */
  public Object getList() throws ApiError {
    return this.getList(null);
  }

  /**
   * Method getList
   * GET /unknown
   *
   * @return response of {@code Object}
   */
  public Object getList(RequestConfig requestConfig) throws ApiError {
    RequestConfig resolvedConfig = this.getResolvedConfig(this.getListConfig, requestConfig);
    Request request = this.buildGetListRequest(resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method getList
   * GET /unknown
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getListAsync() throws ApiError {
    return this.getListAsync(null);
  }

  /**
   * Method getList
   * GET /unknown
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getListAsync(RequestConfig requestConfig) throws ApiError {
    RequestConfig resolvedConfig = this.getResolvedConfig(this.getListConfig, requestConfig);
    Request request = this.buildGetListRequest(resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildGetListRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "unknown"
    ).build();
  }

  /**
   * Method getNotfound
   * GET /unknown/25
   *
   * @return response of {@code Object}
   */
  public Object getNotfound() throws ApiError {
    return this.getNotfound(null);
  }

  /**
   * Method getNotfound
   * GET /unknown/25
   *
   * @return response of {@code Object}
   */
  public Object getNotfound(RequestConfig requestConfig) throws ApiError {
    RequestConfig resolvedConfig = this.getResolvedConfig(this.getNotfoundConfig, requestConfig);
    Request request = this.buildGetNotfoundRequest(resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method getNotfound
   * GET /unknown/25
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getNotfoundAsync() throws ApiError {
    return this.getNotfoundAsync(null);
  }

  /**
   * Method getNotfound
   * GET /unknown/25
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getNotfoundAsync(RequestConfig requestConfig) throws ApiError {
    RequestConfig resolvedConfig = this.getResolvedConfig(this.getNotfoundConfig, requestConfig);
    Request request = this.buildGetNotfoundRequest(resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildGetNotfoundRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "unknown/25"
    ).build();
  }
}
