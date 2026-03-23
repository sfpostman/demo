import { Environment } from './http/environment';
import { SdkConfig } from './http/types';
import { UsersService } from './services/users';
import { UserService } from './services/user';
import { UnknownService } from './services/unknown';

export * from './services/users';
export * from './services/user';
export * from './services/unknown';

export * from './http';
export { Environment } from './http/environment';

export class ApiDemoCollectionSdk {
  public readonly users: UsersService;

  public readonly user: UserService;

  public readonly unknown: UnknownService;

  constructor(public config: SdkConfig) {
    this.users = new UsersService(this.config);

    this.user = new UserService(this.config);

    this.unknown = new UnknownService(this.config);
  }

  set baseUrl(baseUrl: string) {
    this.users.baseUrl = baseUrl;
    this.user.baseUrl = baseUrl;
    this.unknown.baseUrl = baseUrl;
  }

  set environment(environment: Environment) {
    this.users.baseUrl = environment;
    this.user.baseUrl = environment;
    this.unknown.baseUrl = environment;
  }

  set timeoutMs(timeoutMs: number) {
    this.users.timeoutMs = timeoutMs;
    this.user.timeoutMs = timeoutMs;
    this.unknown.timeoutMs = timeoutMs;
  }
}

// c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
