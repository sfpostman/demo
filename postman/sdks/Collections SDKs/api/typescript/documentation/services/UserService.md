# UserService

A list of all methods in the `UserService` service. Click on the method name to view detailed information about that method.

| Methods                                         | Description |
| :---------------------------------------------- | :---------- |
| [getReqWithQueryParams](#getreqwithqueryparams) |             |

## getReqWithQueryParams

- HTTP Method: `GET`
- Endpoint: `/User`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| page | string | ❌       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const data = await apiDemoCollectionSdk.user.getReqWithQueryParams({
    page: '2',
  });

  console.log(data);
})();
```
