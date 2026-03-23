# UnknownService

A list of all methods in the `UnknownService` service. Click on the method name to view detailed information about that method.

| Methods                     | Description |
| :-------------------------- | :---------- |
| [getList](#getlist)         |             |
| [getNotfound](#getnotfound) |             |

## getList

- HTTP Method: `GET`
- Endpoint: `/unknown`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const data = await apiDemoCollectionSdk.unknown.getList();

  console.log(data);
})();
```

## getNotfound

- HTTP Method: `GET`
- Endpoint: `/unknown/25`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ApiDemoCollectionSdk } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const data = await apiDemoCollectionSdk.unknown.getNotfound();

  console.log(data);
})();
```
