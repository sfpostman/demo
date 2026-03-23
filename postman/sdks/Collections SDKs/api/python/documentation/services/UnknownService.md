# UnknownService

A list of all methods in the `UnknownService` service. Click on the method name to view detailed information about that method.

| Methods                       | Description |
| :---------------------------- | :---------- |
| [get_list](#get_list)         |             |
| [get_notfound](#get_notfound) |             |

## get_list

- HTTP Method: `GET`
- Endpoint: `/unknown`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.unknown.get_list()

print(result)
```

## get_notfound

- HTTP Method: `GET`
- Endpoint: `/unknown/25`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment

sdk = ApiDemoCollectionSdk(
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.unknown.get_notfound()

print(result)
```
