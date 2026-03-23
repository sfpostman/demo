# ScenarioHappyPathService

A list of all methods in the `ScenarioHappyPathService` service. Click on the method name to view detailed information about that method.

| Methods                                                   | Description |
| :-------------------------------------------------------- | :---------- |
| [fetch_a_list_of_books](#fetch_a_list_of_books)           |             |
| [create_a_new_book](#create_a_new_book)                   |             |
| [verify_the_book_exists](#verify_the_book_exists)         |             |
| [checkout_new_book](#checkout_new_book)                   |             |
| [verify_book_is_checked_out](#verify_book_is_checked_out) |             |

## fetch_a_list_of_books

- HTTP Method: `GET`
- Endpoint: `/books`

**Parameters**

| Name                 | Type | Required | Description |
| :------------------- | :--- | :------- | :---------- |
| x_mock_response_code | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.scenario_happy_path.fetch_a_list_of_books(x_mock_response_code="500")

print(result)
```

## create_a_new_book

- HTTP Method: `POST`
- Endpoint: `/books`

**Parameters**

| Name                 | Type | Required | Description |
| :------------------- | :--- | :------- | :---------- |
| x_mock_response_code | str  | ✅       |             |
| x_mock_response_name | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.scenario_happy_path.create_a_new_book(
    x_mock_response_code="201",
    x_mock_response_name="Dynamic Variables Mock Demo"
)

print(result)
```

## verify_the_book_exists

- HTTP Method: `GET`
- Endpoint: `/books/{id}`

**Parameters**

| Name                 | Type | Required | Description |
| :------------------- | :--- | :------- | :---------- |
| id\_                 | str  | ✅       |             |
| x_mock_response_code | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.scenario_happy_path.verify_the_book_exists(
    id_="id",
    x_mock_response_code="200"
)

print(result)
```

## checkout_new_book

- HTTP Method: `PATCH`
- Endpoint: `/books/{id}`

**Parameters**

| Name                 | Type | Required | Description |
| :------------------- | :--- | :------- | :---------- |
| id\_                 | str  | ✅       |             |
| x_mock_response_code | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.scenario_happy_path.checkout_new_book(
    id_="id",
    x_mock_response_code="200"
)

print(result)
```

## verify_book_is_checked_out

- HTTP Method: `GET`
- Endpoint: `/books/{id}`

**Parameters**

| Name                 | Type | Required | Description |
| :------------------- | :--- | :------- | :---------- |
| id\_                 | str  | ✅       |             |
| x_mock_response_code | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000
)

result = sdk.scenario_happy_path.verify_the_book_exists(
    id_="id",
    x_mock_response_code="200"
)

print(result)
```
