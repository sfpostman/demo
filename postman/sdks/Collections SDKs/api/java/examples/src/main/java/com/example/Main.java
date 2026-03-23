package com.example;

import com.apidemocollectionsdk.ApiDemoCollectionSdk;
import com.apidemocollectionsdk.exceptions.ApiError;

public class Main {

  public static void main(String[] args) {
    ApiDemoCollectionSdk apiDemoCollectionSdk = new ApiDemoCollectionSdk();

    try {
      Object response = apiDemoCollectionSdk.users.getRequestWithSingelUser();

      System.out.println(response);
    } catch (ApiError e) {
      e.printStackTrace();
    }

    System.exit(0);
  }
}
