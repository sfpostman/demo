import { z } from 'zod';

/**
 * Zod schema for the PostReqToAddUserRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const postReqToAddUserRequest = z.lazy(() => {
  return z.object({
    name: z.string().optional().nullable(),
    job: z.string().optional().nullable(),
  });
});

/**
 *
 * @typedef  {PostReqToAddUserRequest} postReqToAddUserRequest
 * @property {string}
 * @property {string}
 */
export type PostReqToAddUserRequest = z.infer<typeof postReqToAddUserRequest>;

/**
 * Zod schema for mapping API responses to the PostReqToAddUserRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const postReqToAddUserRequestResponse = z.lazy(() => {
  return z
    .object({
      name: z.string().optional().nullable(),
      job: z.string().optional().nullable(),
    })
    .transform((data) => ({
      name: data['name'],
      job: data['job'],
    }));
});

/**
 * Zod schema for mapping the PostReqToAddUserRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const postReqToAddUserRequestRequest = z.lazy(() => {
  return z
    .object({
      name: z.string().optional().nullable(),
      job: z.string().optional().nullable(),
    })
    .transform((data) => ({
      name: data['name'],
      job: data['job'],
    }));
});
