import { z } from 'zod';

/**
 * Zod schema for the PutReqToUpdateTheRecordRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const putReqToUpdateTheRecordRequest = z.lazy(() => {
  return z.object({
    job: z.string().optional().nullable(),
  });
});

/**
 *
 * @typedef  {PutReqToUpdateTheRecordRequest} putReqToUpdateTheRecordRequest
 * @property {string}
 */
export type PutReqToUpdateTheRecordRequest = z.infer<typeof putReqToUpdateTheRecordRequest>;

/**
 * Zod schema for mapping API responses to the PutReqToUpdateTheRecordRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const putReqToUpdateTheRecordRequestResponse = z.lazy(() => {
  return z
    .object({
      job: z.string().optional().nullable(),
    })
    .transform((data) => ({
      job: data['job'],
    }));
});

/**
 * Zod schema for mapping the PutReqToUpdateTheRecordRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const putReqToUpdateTheRecordRequestRequest = z.lazy(() => {
  return z
    .object({
      job: z.string().optional().nullable(),
    })
    .transform((data) => ({
      job: data['job'],
    }));
});
