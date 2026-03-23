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

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    Object response = apiDemoCollectionSdk.users.getRequestWithSingelUser();

    System.out.println(response);
  }
}

```

## postReqToAddUser

- HTTP Method: `POST`
- Endpoint: `/users`

**Parameters**

| Name                    | Type                                                            | Required | Description  |
| :---------------------- | :-------------------------------------------------------------- | :------- | :----------- |
| postReqToAddUserRequest | [PostReqToAddUserRequest](../models/PostReqToAddUserRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;
import com.apidemocollectionsdk.models.PostReqToAddUserRequest;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    PostReqToAddUserRequest postReqToAddUserRequest = PostReqToAddUserRequest.builder()
      .name("Jamal")
      .job("Test Manager")
      .build();

    Object response = apiDemoCollectionSdk.users.postReqToAddUser(postReqToAddUserRequest);

    System.out.println(response);
  }
}

```

## putReqToUpdateTheRecord

- HTTP Method: `PUT`
- Endpoint: `/users/147`

**Parameters**

| Name                           | Type                                                                          | Required | Description  |
| :----------------------------- | :---------------------------------------------------------------------------- | :------- | :----------- |
| putReqToUpdateTheRecordRequest | [PutReqToUpdateTheRecordRequest](../models/PutReqToUpdateTheRecordRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;
import com.apidemocollectionsdk.models.PutReqToUpdateTheRecordRequest;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    PutReqToUpdateTheRecordRequest putReqToUpdateTheRecordRequest =
      PutReqToUpdateTheRecordRequest.builder().job("Test Manager Updated 1").build();

    Object response = apiDemoCollectionSdk.users.putReqToUpdateTheRecord(
      putReqToUpdateTheRecordRequest
    );

    System.out.println(response);
  }
}

```

## patchRequestToReplace

- HTTP Method: `PATCH`
- Endpoint: `/users/147`

**Parameters**

| Name                         | Type                                                                      | Required | Description  |
| :--------------------------- | :------------------------------------------------------------------------ | :------- | :----------- |
| patchRequestToReplaceRequest | [PatchRequestToReplaceRequest](../models/PatchRequestToReplaceRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;
import com.apidemocollectionsdk.models.PatchRequestToReplaceRequest;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    PatchRequestToReplaceRequest patchRequestToReplaceRequest =
      PatchRequestToReplaceRequest.builder()
        .op("replace")
        .path("/name")
        .value("Jamal Ahmed")
        .build();

    Object response = apiDemoCollectionSdk.users.patchRequestToReplace(
      patchRequestToReplaceRequest
    );

    System.out.println(response);
  }
}

```
