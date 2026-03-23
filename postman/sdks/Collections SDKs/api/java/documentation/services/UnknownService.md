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

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    Object response = apiDemoCollectionSdk.unknown.getList();

    System.out.println(response);
  }
}

```

## getNotfound

- HTTP Method: `GET`
- Endpoint: `/unknown/25`

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.apidemocollectionsdk.ApiDemoCollectionSdk;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    Object response = apiDemoCollectionSdk.unknown.getNotfound();

    System.out.println(response);
  }
}

```
