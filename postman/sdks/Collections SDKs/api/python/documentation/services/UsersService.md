# UsersService

A list of all methods in the `UsersService` service. Click on the method name to view detailed information about that method.

| Methods                                                       | Description |
| :------------------------------------------------------------ | :---------- |
| [get_request_with_singel_user](#get_request_with_singel_user) |             |
| [post_req_to_add_user](#post_req_to_add_user)                 |             |
| [put_req_to_update_the_record](#put_req_to_update_the_record) |             |
| [patch_request_to_replace](#patch_request_to_replace)         |             |

## get_request_with_singel_user

- HTTP Method: `GET`
- Endpoint: `/users/2`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.users.get_request_with_singel_user()

print(result)
```

## post_req_to_add_user

- HTTP Method: `POST`
- Endpoint: `/users`

**Parameters**

| Name         | Type                                                            | Required | Description       |
| :----------- | :-------------------------------------------------------------- | :------- | :---------------- |
| request_body | [PostReqToAddUserRequest](../models/PostReqToAddUserRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment
from api_demo_collection_sdk.models import PostReqToAddUserRequest

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

request_body = PostReqToAddUserRequest(
    name="Jamal",
    job="Test Manager"
)

result = sdk.users.post_req_to_add_user(request_body=request_body)

print(result)
```

## put_req_to_update_the_record

- HTTP Method: `PUT`
- Endpoint: `/users/147`

**Parameters**

| Name         | Type                                                                          | Required | Description       |
| :----------- | :---------------------------------------------------------------------------- | :------- | :---------------- |
| request_body | [PutReqToUpdateTheRecordRequest](../models/PutReqToUpdateTheRecordRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment
from api_demo_collection_sdk.models import PutReqToUpdateTheRecordRequest

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

request_body = PutReqToUpdateTheRecordRequest(
    job="Test Manager Updated 1"
)

result = sdk.users.put_req_to_update_the_record(request_body=request_body)

print(result)
```

## patch_request_to_replace

- HTTP Method: `PATCH`
- Endpoint: `/users/147`

**Parameters**

| Name         | Type                                                                      | Required | Description       |
| :----------- | :------------------------------------------------------------------------ | :------- | :---------------- |
| request_body | [PatchRequestToReplaceRequest](../models/PatchRequestToReplaceRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment
from api_demo_collection_sdk.models import PatchRequestToReplaceRequest

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

request_body = PatchRequestToReplaceRequest(
    op="replace",
    path="/name",
    value="Jamal Ahmed"
)

result = sdk.users.patch_request_to_replace(request_body=request_body)

print(result)
```
