import { z } from 'zod';
import { BaseService } from '../base-service';
import { ContentType, HttpResponse, SdkConfig } from '../../http/types';
import { RequestBuilder } from '../../http/transport/request-builder';
import { SerializationStyle } from '../../http/serialization/base-serializer';
import { ThrowableError } from '../../http/errors/throwable-error';
import { Environment } from '../../http/environment';
import {
  CheckoutNewBookParams,
  CreateANewBookParams,
  FetchAListOfBooksParams,
  VerifyBookIsCheckedOutParams,
  VerifyTheBookExistsParams,
} from './request-params';

/**
 * Service class for ScenarioHappyPathService operations.
 * Provides methods to interact with ScenarioHappyPathService-related API endpoints.
 * All methods return promises and handle request/response serialization automatically.
 */
export class ScenarioHappyPathService extends BaseService {
  protected fetchAListOfBooksConfig: Partial<SdkConfig> = { environment: Environment.LIBRARY_API };

  protected createANewBookConfig: Partial<SdkConfig> = { environment: Environment.LIBRARY_API };

  protected verifyTheBookExistsConfig: Partial<SdkConfig> = {
    environment: Environment.LIBRARY_API,
  };

  protected checkoutNewBookConfig: Partial<SdkConfig> = { environment: Environment.LIBRARY_API };

  protected verifyBookIsCheckedOutConfig: Partial<SdkConfig> = {
    environment: Environment.LIBRARY_API,
  };

  /**
   * Sets method-level configuration for fetchAListOfBooks.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setFetchAListOfBooksConfig(config: Partial<SdkConfig>): this {
    this.fetchAListOfBooksConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createANewBook.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateANewBookConfig(config: Partial<SdkConfig>): this {
    this.createANewBookConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for verifyTheBookExists.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setVerifyTheBookExistsConfig(config: Partial<SdkConfig>): this {
    this.verifyTheBookExistsConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for checkoutNewBook.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCheckoutNewBookConfig(config: Partial<SdkConfig>): this {
    this.checkoutNewBookConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for verifyBookIsCheckedOut.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setVerifyBookIsCheckedOutConfig(config: Partial<SdkConfig>): this {
    this.verifyBookIsCheckedOutConfig = config;
    return this;
  }

  /**
   *
   * @param {string} params.xMockResponseCode -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async fetchAListOfBooks(
    params: FetchAListOfBooksParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.fetchAListOfBooksConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/books')
      .setRequestSchema(z.any())
      .addApiKeyAuth(resolvedConfig?.apiKey, 'api-key')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({
        key: 'x-mock-response-code',
        value: params?.xMockResponseCode,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} params.xMockResponseCode -
   * @param {string} params.xMockResponseName -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async createANewBook(
    params: CreateANewBookParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createANewBookConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/books')
      .setRequestSchema(z.any())
      .addApiKeyAuth(resolvedConfig?.apiKey, 'api-key')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({
        key: 'x-mock-response-code',
        value: params?.xMockResponseCode,
      })
      .addHeaderParam({
        key: 'x-mock-response-name',
        value: params?.xMockResponseName,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {string} params.xMockResponseCode -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async verifyTheBookExists(
    id: string,
    params: VerifyTheBookExistsParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.verifyTheBookExistsConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/books/{id}')
      .setRequestSchema(z.any())
      .addApiKeyAuth(resolvedConfig?.apiKey, 'api-key')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({
        key: 'x-mock-response-code',
        value: params?.xMockResponseCode,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {string} params.xMockResponseCode -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async checkoutNewBook(
    id: string,
    params: CheckoutNewBookParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.checkoutNewBookConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PATCH')
      .setPath('/books/{id}')
      .setRequestSchema(z.any())
      .addApiKeyAuth(resolvedConfig?.apiKey, 'api-key')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({
        key: 'x-mock-response-code',
        value: params?.xMockResponseCode,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {string} params.xMockResponseCode -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async verifyBookIsCheckedOut(
    id: string,
    params: VerifyBookIsCheckedOutParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.verifyBookIsCheckedOutConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/books/{id}')
      .setRequestSchema(z.any())
      .addApiKeyAuth(resolvedConfig?.apiKey, 'api-key')
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({
        key: 'x-mock-response-code',
        value: params?.xMockResponseCode,
      })
      .build();
    return this.client.callDirect<any>(request);
  }
}
