# UserService

A list of all methods in the `UserService` service. Click on the method name to view detailed information about that method.

| Methods                                                 | Description |
| :------------------------------------------------------ | :---------- |
| [get_req_with_query_params](#get_req_with_query_params) |             |

## get_req_with_query_params

- HTTP Method: `GET`
- Endpoint: `/User`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| page | str  | ❌       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.user.get_req_with_query_params(page="2")

print(result)
```
