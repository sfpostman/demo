import { z } from 'zod';
import { BaseService } from '../base-service';
import { ContentType, HttpResponse, SdkConfig } from '../../http/types';
import { RequestBuilder } from '../../http/transport/request-builder';
import { SerializationStyle } from '../../http/serialization/base-serializer';
import { ThrowableError } from '../../http/errors/throwable-error';
import { Environment } from '../../http/environment';
import { GetReqWithQueryParamsParams } from './request-params';

/**
 * Service class for UserService operations.
 * Provides methods to interact with UserService-related API endpoints.
 * All methods return promises and handle request/response serialization automatically.
 */
export class UserService extends BaseService {
  protected getReqWithQueryParamsConfig: Partial<SdkConfig> = {
    environment: Environment.QAURLAPI_1,
  };

  /**
   * Sets method-level configuration for getReqWithQueryParams.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetReqWithQueryParamsConfig(config: Partial<SdkConfig>): this {
    this.getReqWithQueryParamsConfig = config;
    return this;
  }

  /**
   *
   * @param {string} [params.page] -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async getReqWithQueryParams(
    params?: GetReqWithQueryParamsParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getReqWithQueryParamsConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/User')
      .setRequestSchema(z.any())
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addQueryParam({
        key: 'page',
        value: params?.page,
      })
      .build();
    return this.client.callDirect<any>(request);
  }
}
