import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.fetchAListOfBooks({
    xMockResponseCode: '500',
  });

  console.log(data);
})();
