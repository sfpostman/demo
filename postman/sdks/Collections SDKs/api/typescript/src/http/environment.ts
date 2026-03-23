/**
 * Available API environments with their base URLs.
 * Use these constants to configure the SDK for different environments (production, staging, etc.).
 */
export enum Environment {
  /** DEFAULT environment base URL */
  DEFAULT = 'https://{{QAUrl}}api',
  /** QAURLAPI environment base URL */
  QAURLAPI = 'https://{{QAUrl}}api',
  /** QAURLAPI_1 environment base URL */
  QAURLAPI_1 = 'https://{{QAUrl}}API',
}
