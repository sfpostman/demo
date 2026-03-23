import { z } from 'zod';
import { BaseService } from '../base-service';
import { ContentType, HttpResponse, SdkConfig } from '../../http/types';
import { RequestBuilder } from '../../http/transport/request-builder';
import { SerializationStyle } from '../../http/serialization/base-serializer';
import { ThrowableError } from '../../http/errors/throwable-error';
import { Environment } from '../../http/environment';
import {
  PostReqToAddUserRequest,
  postReqToAddUserRequestRequest,
} from './models/post-req-to-add-user-request';
import {
  PutReqToUpdateTheRecordRequest,
  putReqToUpdateTheRecordRequestRequest,
} from './models/put-req-to-update-the-record-request';
import {
  PatchRequestToReplaceRequest,
  patchRequestToReplaceRequestRequest,
} from './models/patch-request-to-replace-request';

/**
 * Service class for UsersService operations.
 * Provides methods to interact with UsersService-related API endpoints.
 * All methods return promises and handle request/response serialization automatically.
 */
export class UsersService extends BaseService {
  protected getRequestWithSingelUserConfig: Partial<SdkConfig> = {
    environment: Environment.QAURLAPI,
  };

  protected postReqToAddUserConfig: Partial<SdkConfig> = { environment: Environment.QAURLAPI };

  protected putReqToUpdateTheRecordConfig: Partial<SdkConfig> = {
    environment: Environment.QAURLAPI,
  };

  protected patchRequestToReplaceConfig: Partial<SdkConfig> = { environment: Environment.QAURLAPI };

  /**
   * Sets method-level configuration for getRequestWithSingelUser.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetRequestWithSingelUserConfig(config: Partial<SdkConfig>): this {
    this.getRequestWithSingelUserConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for postReqToAddUser.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setPostReqToAddUserConfig(config: Partial<SdkConfig>): this {
    this.postReqToAddUserConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for putReqToUpdateTheRecord.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setPutReqToUpdateTheRecordConfig(config: Partial<SdkConfig>): this {
    this.putReqToUpdateTheRecordConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for patchRequestToReplace.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setPatchRequestToReplaceConfig(config: Partial<SdkConfig>): this {
    this.patchRequestToReplaceConfig = config;
    return this;
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async getRequestWithSingelUser(requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(
      this.getRequestWithSingelUserConfig,
      requestConfig,
    );
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/users/2')
      .setRequestSchema(z.any())
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async postReqToAddUser(
    body: PostReqToAddUserRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.postReqToAddUserConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/users')
      .setRequestSchema(postReqToAddUserRequestRequest)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async putReqToUpdateTheRecord(
    body: PutReqToUpdateTheRecordRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(
      this.putReqToUpdateTheRecordConfig,
      requestConfig,
    );
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/users/147')
      .setRequestSchema(putReqToUpdateTheRecordRequestRequest)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async patchRequestToReplace(
    body: PatchRequestToReplaceRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.patchRequestToReplaceConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PATCH')
      .setPath('/users/147')
      .setRequestSchema(patchRequestToReplaceRequestRequest)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }
}
