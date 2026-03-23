from api_demo_collection_sdk import ApiDemoCollectionSdk, Environment

sdk = ApiDemoCollectionSdk(base_url=Environment.DEFAULT.value, timeout=10000)

result = sdk.users.get_request_with_singel_user()

print(result)
