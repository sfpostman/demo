# UserService

A list of all methods in the `UserService` service. Click on the method name to view detailed information about that method.

| Methods                                         | Description |
| :---------------------------------------------- | :---------- |
| [getReqWithQueryParams](#getreqwithqueryparams) |             |

## getReqWithQueryParams

- HTTP Method: `GET`
- Endpoint: `/User`

**Parameters**

| Name              | Type                                                                            | Required | Description               |
| :---------------- | :------------------------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [GetReqWithQueryParamsParameters](../models/GetReqWithQueryParamsParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;
import com.apidemocollectionsdk.models.GetReqWithQueryParamsParameters;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    GetReqWithQueryParamsParameters requestParameters = GetReqWithQueryParamsParameters.builder()
      .page("2")
      .build();

    Object response = apiDemoCollectionSdk.user.getReqWithQueryParams(requestParameters);

    System.out.println(response);
  }
}

```
