# UsersService

A list of all methods in the `UsersService` service. Click on the method name to view detailed information about that method.

| Methods                                               | Description |
| :---------------------------------------------------- | :---------- |
| [getRequestWithSingelUser](#getrequestwithsingeluser) |             |
| [postReqToAddUser](#postreqtoadduser)                 |             |
| [putReqToUpdateTheRecord](#putreqtoupdatetherecord)   |             |
| [patchRequestToReplace](#patchrequesttoreplace)       |             |

## getRequestWithSingelUser

- HTTP Method: `GET`
- Endpoint: `/users/2`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const data = await apiDemoCollectionSdk.users.getRequestWithSingelUser();

  console.log(data);
})();
```

## postReqToAddUser

- HTTP Method: `POST`
- Endpoint: `/users`

**Parameters**

| Name | Type                                                            | Required | Description       |
| :--- | :-------------------------------------------------------------- | :------- | :---------------- |
| body | [PostReqToAddUserRequest](../models/PostReqToAddUserRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk, PostReqToAddUserRequest } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const postReqToAddUserRequest: PostReqToAddUserRequest = {
    name: 'Jamal',
    job: 'Test Manager',
  };

  const data = await apiDemoCollectionSdk.users.postReqToAddUser(postReqToAddUserRequest);

  console.log(data);
})();
```

## putReqToUpdateTheRecord

- HTTP Method: `PUT`
- Endpoint: `/users/147`

**Parameters**

| Name | Type                                                                          | Required | Description       |
| :--- | :---------------------------------------------------------------------------- | :------- | :---------------- |
| body | [PutReqToUpdateTheRecordRequest](../models/PutReqToUpdateTheRecordRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk, PutReqToUpdateTheRecordRequest } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const putReqToUpdateTheRecordRequest: PutReqToUpdateTheRecordRequest = {
    job: 'Test Manager Updated 1',
  };

  const data = await apiDemoCollectionSdk.users.putReqToUpdateTheRecord(
    putReqToUpdateTheRecordRequest,
  );

  console.log(data);
})();
```

## patchRequestToReplace

- HTTP Method: `PATCH`
- Endpoint: `/users/147`

**Parameters**

| Name | Type                                                                      | Required | Description       |
| :--- | :------------------------------------------------------------------------ | :------- | :---------------- |
| body | [PatchRequestToReplaceRequest](../models/PatchRequestToReplaceRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk, PatchRequestToReplaceRequest } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const patchRequestToReplaceRequest: PatchRequestToReplaceRequest = {
    op: 'replace',
    path: '/name',
    value: 'Jamal Ahmed',
  };

  const data = await apiDemoCollectionSdk.users.patchRequestToReplace(patchRequestToReplaceRequest);

  console.log(data);
})();
```
