import { ApiDemoCollectionSdk } from 'api-demo-collection-sdk';

(async () => {
  const apiDemoCollectionSdk = new ApiDemoCollectionSdk({});

  const data = await apiDemoCollectionSdk.users.getRequestWithSingelUser();

  console.log(data);
})();
