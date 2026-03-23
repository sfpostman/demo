import { Environment } from './http/environment';
import { SdkConfig } from './http/types';
import { ScenarioHappyPathService } from './services/scenario-happy-path';

export * from './services/scenario-happy-path';

export * from './http';
export { Environment } from './http/environment';

export class BookE2eWorkflowSdk {
  public readonly scenarioHappyPath: ScenarioHappyPathService;

  constructor(public config: SdkConfig) {
    this.scenarioHappyPath = new ScenarioHappyPathService(this.config);
  }

  set baseUrl(baseUrl: string) {
    this.scenarioHappyPath.baseUrl = baseUrl;
  }

  set environment(environment: Environment) {
    this.scenarioHappyPath.baseUrl = environment;
  }

  set timeoutMs(timeoutMs: number) {
    this.scenarioHappyPath.timeoutMs = timeoutMs;
  }

  set apiKey(apiKey: string) {
    this.scenarioHappyPath.apiKey = apiKey;
  }

  set apiKeyHeader(apiKeyHeader: string) {
    this.scenarioHappyPath.apiKeyHeader = apiKeyHeader;
  }
}

// c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
