import { z } from 'zod';

/**
 * Zod schema for the PatchRequestToReplaceRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const patchRequestToReplaceRequest = z.lazy(() => {
  return z.object({
    op: z.string().optional().nullable(),
    path: z.string().optional().nullable(),
    value: z.string().optional().nullable(),
  });
});

/**
 *
 * @typedef  {PatchRequestToReplaceRequest} patchRequestToReplaceRequest
 * @property {string}
 * @property {string}
 * @property {string}
 */
export type PatchRequestToReplaceRequest = z.infer<typeof patchRequestToReplaceRequest>;

/**
 * Zod schema for mapping API responses to the PatchRequestToReplaceRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const patchRequestToReplaceRequestResponse = z.lazy(() => {
  return z
    .object({
      op: z.string().optional().nullable(),
      path: z.string().optional().nullable(),
      value: z.string().optional().nullable(),
    })
    .transform((data) => ({
      op: data['op'],
      path: data['path'],
      value: data['value'],
    }));
});

/**
 * Zod schema for mapping the PatchRequestToReplaceRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const patchRequestToReplaceRequestRequest = z.lazy(() => {
  return z
    .object({
      op: z.string().optional().nullable(),
      path: z.string().optional().nullable(),
      value: z.string().optional().nullable(),
    })
    .transform((data) => ({
      op: data['op'],
      path: data['path'],
      value: data['value'],
    }));
});
