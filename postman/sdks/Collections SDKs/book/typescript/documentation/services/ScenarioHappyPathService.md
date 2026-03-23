# ScenarioHappyPathService

A list of all methods in the `ScenarioHappyPathService` service. Click on the method name to view detailed information about that method.

| Methods                                           | Description |
| :------------------------------------------------ | :---------- |
| [fetchAListOfBooks](#fetchalistofbooks)           |             |
| [createANewBook](#createanewbook)                 |             |
| [verifyTheBookExists](#verifythebookexists)       |             |
| [checkoutNewBook](#checkoutnewbook)               |             |
| [verifyBookIsCheckedOut](#verifybookischeckedout) |             |

## fetchAListOfBooks

- HTTP Method: `GET`
- Endpoint: `/books`

**Parameters**

| Name              | Type   | Required | Description |
| :---------------- | :----- | :------- | :---------- |
| xMockResponseCode | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.fetchAListOfBooks({
    xMockResponseCode: '500',
  });

  console.log(data);
})();
```

## createANewBook

- HTTP Method: `POST`
- Endpoint: `/books`

**Parameters**

| Name              | Type   | Required | Description |
| :---------------- | :----- | :------- | :---------- |
| xMockResponseCode | string | ✅       |             |
| xMockResponseName | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.createANewBook({
    xMockResponseCode: '201',
    xMockResponseName: 'Dynamic Variables Mock Demo',
  });

  console.log(data);
})();
```

## verifyTheBookExists

- HTTP Method: `GET`
- Endpoint: `/books/{id}`

**Parameters**

| Name              | Type   | Required | Description |
| :---------------- | :----- | :------- | :---------- |
| id                | string | ✅       |             |
| xMockResponseCode | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.verifyTheBookExists('id', {
    xMockResponseCode: '200',
  });

  console.log(data);
})();
```

## checkoutNewBook

- HTTP Method: `PATCH`
- Endpoint: `/books/{id}`

**Parameters**

| Name              | Type   | Required | Description |
| :---------------- | :----- | :------- | :---------- |
| id                | string | ✅       |             |
| xMockResponseCode | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.checkoutNewBook('id', {
    xMockResponseCode: '200',
  });

  console.log(data);
})();
```

## verifyBookIsCheckedOut

- HTTP Method: `GET`
- Endpoint: `/books/{id}`

**Parameters**

| Name              | Type   | Required | Description |
| :---------------- | :----- | :------- | :---------- |
| id                | string | ✅       |             |
| xMockResponseCode | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { BookE2eWorkflowSdk } from 'book-e2e-workflow-sdk';

(async () => {
  const bookE2eWorkflowSdk = new BookE2eWorkflowSdk({});

  const data = await bookE2eWorkflowSdk.scenarioHappyPath.verifyTheBookExists('id', {
    xMockResponseCode: '200',
  });

  console.log(data);
})();
```
