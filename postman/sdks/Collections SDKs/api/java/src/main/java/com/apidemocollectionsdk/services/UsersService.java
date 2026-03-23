package com.apidemocollectionsdk.services;

import com.apidemocollectionsdk.config.ApiDemoCollectionSdkConfig;
import com.apidemocollectionsdk.config.RequestConfig;
import com.apidemocollectionsdk.exceptions.ApiError;
import com.apidemocollectionsdk.http.Environment;
import com.apidemocollectionsdk.http.HttpMethod;
import com.apidemocollectionsdk.http.ModelConverter;
import com.apidemocollectionsdk.http.util.RequestBuilder;
import com.apidemocollectionsdk.models.PatchRequestToReplaceRequest;
import com.apidemocollectionsdk.models.PostReqToAddUserRequest;
import com.apidemocollectionsdk.models.PutReqToUpdateTheRecordRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * UsersService Service
 */
public class UsersService extends BaseService {

  private RequestConfig getRequestWithSingelUserConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();
  private RequestConfig postReqToAddUserConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();
  private RequestConfig putReqToUpdateTheRecordConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();
  private RequestConfig patchRequestToReplaceConfig = RequestConfig.builder()
    .environment(Environment.QAURLAPI)
    .build();

  /**
   * Constructs a new instance of UsersService.
   *
   * @param httpClient The HTTP client to use for requests
   * @param config The SDK configuration
   */
  public UsersService(@NonNull OkHttpClient httpClient, ApiDemoCollectionSdkConfig config) {
    super(httpClient, config);
  }

  /**
   * Sets method-level configuration for {@code getRequestWithSingelUser}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UsersService setGetRequestWithSingelUserConfig(RequestConfig config) {
    this.getRequestWithSingelUserConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code postReqToAddUser}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UsersService setPostReqToAddUserConfig(RequestConfig config) {
    this.postReqToAddUserConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code putReqToUpdateTheRecord}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UsersService setPutReqToUpdateTheRecordConfig(RequestConfig config) {
    this.putReqToUpdateTheRecordConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code patchRequestToReplace}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public UsersService setPatchRequestToReplaceConfig(RequestConfig config) {
    this.patchRequestToReplaceConfig = config;
    return this;
  }

  /**
   * Method getRequestWithSingelUser
   * GET /users/2
   *
   * @return response of {@code Object}
   */
  public Object getRequestWithSingelUser() throws ApiError {
    return this.getRequestWithSingelUser(null);
  }

  /**
   * Method getRequestWithSingelUser
   * GET /users/2
   *
   * @return response of {@code Object}
   */
  public Object getRequestWithSingelUser(RequestConfig requestConfig) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.getRequestWithSingelUserConfig, requestConfig);
    Request request = this.buildGetRequestWithSingelUserRequest(resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method getRequestWithSingelUser
   * GET /users/2
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getRequestWithSingelUserAsync() throws ApiError {
    return this.getRequestWithSingelUserAsync(null);
  }

  /**
   * Method getRequestWithSingelUser
   * GET /users/2
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getRequestWithSingelUserAsync(RequestConfig requestConfig)
    throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.getRequestWithSingelUserConfig, requestConfig);
    Request request = this.buildGetRequestWithSingelUserRequest(resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildGetRequestWithSingelUserRequest(RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "users/2"
    ).build();
  }

  /**
   * Method postReqToAddUser
   * POST /users
   *
   * @param postReqToAddUserRequest {@link PostReqToAddUserRequest} Request Body
   * @return response of {@code Object}
   */
  public Object postReqToAddUser(@NonNull PostReqToAddUserRequest postReqToAddUserRequest)
    throws ApiError {
    return this.postReqToAddUser(postReqToAddUserRequest, null);
  }

  /**
   * Method postReqToAddUser
   * POST /users
   *
   * @param postReqToAddUserRequest {@link PostReqToAddUserRequest} Request Body
   * @return response of {@code Object}
   */
  public Object postReqToAddUser(
    @NonNull PostReqToAddUserRequest postReqToAddUserRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.postReqToAddUserConfig, requestConfig);
    Request request = this.buildPostReqToAddUserRequest(postReqToAddUserRequest, resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method postReqToAddUser
   * POST /users
   *
   * @param postReqToAddUserRequest {@link PostReqToAddUserRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> postReqToAddUserAsync(
    @NonNull PostReqToAddUserRequest postReqToAddUserRequest
  ) throws ApiError {
    return this.postReqToAddUserAsync(postReqToAddUserRequest, null);
  }

  /**
   * Method postReqToAddUser
   * POST /users
   *
   * @param postReqToAddUserRequest {@link PostReqToAddUserRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> postReqToAddUserAsync(
    @NonNull PostReqToAddUserRequest postReqToAddUserRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.postReqToAddUserConfig, requestConfig);
    Request request = this.buildPostReqToAddUserRequest(postReqToAddUserRequest, resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildPostReqToAddUserRequest(
    @NonNull PostReqToAddUserRequest postReqToAddUserRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "users"
    )
      .setJsonContent(postReqToAddUserRequest)
      .build();
  }

  /**
   * Method putReqToUpdateTheRecord
   * PUT /users/147
   *
   * @param putReqToUpdateTheRecordRequest {@link PutReqToUpdateTheRecordRequest} Request Body
   * @return response of {@code Object}
   */
  public Object putReqToUpdateTheRecord(
    @NonNull PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest
  ) throws ApiError {
    return this.putReqToUpdateTheRecord(putReqToUpdateTheRecordRequest, null);
  }

  /**
   * Method putReqToUpdateTheRecord
   * PUT /users/147
   *
   * @param putReqToUpdateTheRecordRequest {@link PutReqToUpdateTheRecordRequest} Request Body
   * @return response of {@code Object}
   */
  public Object putReqToUpdateTheRecord(
    @NonNull PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.putReqToUpdateTheRecordConfig, requestConfig);
    Request request =
      this.buildPutReqToUpdateTheRecordRequest(putReqToUpdateTheRecordRequest, resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method putReqToUpdateTheRecord
   * PUT /users/147
   *
   * @param putReqToUpdateTheRecordRequest {@link PutReqToUpdateTheRecordRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> putReqToUpdateTheRecordAsync(
    @NonNull PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest
  ) throws ApiError {
    return this.putReqToUpdateTheRecordAsync(putReqToUpdateTheRecordRequest, null);
  }

  /**
   * Method putReqToUpdateTheRecord
   * PUT /users/147
   *
   * @param putReqToUpdateTheRecordRequest {@link PutReqToUpdateTheRecordRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> putReqToUpdateTheRecordAsync(
    @NonNull PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.putReqToUpdateTheRecordConfig, requestConfig);
    Request request =
      this.buildPutReqToUpdateTheRecordRequest(putReqToUpdateTheRecordRequest, resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildPutReqToUpdateTheRecordRequest(
    @NonNull PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "users/147"
    )
      .setJsonContent(putReqToUpdateTheRecordRequest)
      .build();
  }

  /**
   * Method patchRequestToReplace
   * PATCH /users/147
   *
   * @param patchRequestToReplaceRequest {@link PatchRequestToReplaceRequest} Request Body
   * @return response of {@code Object}
   */
  public Object patchRequestToReplace(
    @NonNull PatchRequestToReplaceRequest patchRequestToReplaceRequest
  ) throws ApiError {
    return this.patchRequestToReplace(patchRequestToReplaceRequest, null);
  }

  /**
   * Method patchRequestToReplace
   * PATCH /users/147
   *
   * @param patchRequestToReplaceRequest {@link PatchRequestToReplaceRequest} Request Body
   * @return response of {@code Object}
   */
  public Object patchRequestToReplace(
    @NonNull PatchRequestToReplaceRequest patchRequestToReplaceRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.patchRequestToReplaceConfig, requestConfig);
    Request request =
      this.buildPatchRequestToReplaceRequest(patchRequestToReplaceRequest, resolvedConfig);
    Response response = this.execute(request, resolvedConfig);
    byte[] bodyBytes = ModelConverter.readBytes(response);
    return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
  }

  /**
   * Method patchRequestToReplace
   * PATCH /users/147
   *
   * @param patchRequestToReplaceRequest {@link PatchRequestToReplaceRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> patchRequestToReplaceAsync(
    @NonNull PatchRequestToReplaceRequest patchRequestToReplaceRequest
  ) throws ApiError {
    return this.patchRequestToReplaceAsync(patchRequestToReplaceRequest, null);
  }

  /**
   * Method patchRequestToReplace
   * PATCH /users/147
   *
   * @param patchRequestToReplaceRequest {@link PatchRequestToReplaceRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> patchRequestToReplaceAsync(
    @NonNull PatchRequestToReplaceRequest patchRequestToReplaceRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    RequestConfig resolvedConfig =
      this.getResolvedConfig(this.patchRequestToReplaceConfig, requestConfig);
    Request request =
      this.buildPatchRequestToReplaceRequest(patchRequestToReplaceRequest, resolvedConfig);
    CompletableFuture<Response> futureResponse = this.executeAsync(request, resolvedConfig);
    return futureResponse.thenApplyAsync(response -> {
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return ModelConverter.convert(bodyBytes, new TypeReference<Object>() {});
    });
  }

  private Request buildPatchRequestToReplaceRequest(
    @NonNull PatchRequestToReplaceRequest patchRequestToReplaceRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PATCH,
      resolveBaseUrl(resolvedConfig, Environment.QAURLAPI),
      "users/147"
    )
      .setJsonContent(patchRequestToReplaceRequest)
      .build();
  }
}
