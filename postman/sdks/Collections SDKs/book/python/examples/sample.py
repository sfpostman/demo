from book_e2e_workflow_sdk import BookE2eWorkflowSdk, Environment

sdk = BookE2eWorkflowSdk(
    api_key="YOUR_API_KEY",
    api_key_header="YOUR_API_KEY_HEADER",
    base_url=Environment.DEFAULT.value,
    timeout=10000,
)

result = sdk.scenario_happy_path.fetch_a_list_of_books(x_mock_response_code="500")

print(result)
