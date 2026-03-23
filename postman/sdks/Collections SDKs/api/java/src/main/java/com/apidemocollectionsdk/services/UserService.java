package com.apidemocollectionsdk.services;

import com.apidemocollectionsdk.config.ApiDemoCollectionSdkConfig;
import com.apidemocollectionsdk.config.RequestConfig;
import com.apidemocollectionsdk.exceptions.ApiError;
import com.apidemocollectionsdk.http.Environment;
import com.apidemocollectionsdk.http.HttpMethod;
import com.apidemocollectionsdk.http.ModelConverter;
import com.apidemocollectionsdk.http.util.RequestBuilder;
import com.apidemocollectionsdk.models.GetReqWithQueryParamsParameters;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * UserService Service
 */
public class UserService extends BaseService {

  private RequestConfig getReqWithQueryParamsConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI_1)
    .build();

  /**
   * Constructs a new instance of UserService.
   *
   * @param httpClient The HTTP client to use for requests
   * @param config The SDK configuration
   */
  public UserService(@NonNull OkHttpClient httpClient, ApiDemoCollectionSdkConfig config) {
    super(httpClient, config);
  }

  /**
   * Sets method-level configuration for {@code getReqWithQueryParams}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UserService setGetReqWithQueryParamsConfig(RequestConfig config) {
    this.getReqWithQueryParamsConfig = config;
    return this;
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @return response of {@code Object}
   */
  public Object getReqWithQueryParams() throws ApiError {
    return this.getReqWithQueryParams(GetReqWithQueryParamsParameters.builder().build());
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @param requestParameters {@link GetReqWithQueryParamsParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object getReqWithQueryParams(@NonNull GetReqWithQueryParamsParameters requestParameters)
    throws ApiError {
    return this.getReqWithQueryParams(requestParameters, null);
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @param requestParameters {@link GetReqWithQueryParamsParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object getReqWithQueryParams(
    @NonNull GetReqWithQueryParamsParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.getReqWithQueryParamsConfig, requestConfig);
    Request request = this.buildGetReqWithQueryParamsRequest(requestParameters, resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getReqWithQueryParamsAsync() throws ApiError {
    return this.getReqWithQueryParamsAsync(GetReqWithQueryParamsParameters.builder().build());
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @param requestParameters {@link GetReqWithQueryParamsParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getReqWithQueryParamsAsync(
    @NonNull GetReqWithQueryParamsParameters requestParameters
  ) throws ApiError {
    return this.getReqWithQueryParamsAsync(requestParameters, null);
  }

  /**
   * Method getReqWithQueryParams
   * GET /User
   *
   * @param requestParameters {@link GetReqWithQueryParamsParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getReqWithQueryParamsAsync(
    @NonNull GetReqWithQueryParamsParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.getReqWithQueryParamsConfig, requestConfig);
    Request request = this.buildGetReqWithQueryParamsRequest(requestParameters, resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildGetReqWithQueryParamsRequest(
    @NonNull GetReqWithQueryParamsParameters requestParameters,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI_1),
      "User"
    )
      .setOptionalQueryParameter("page", requestParameters.getPage())
      .build();
  }
}
