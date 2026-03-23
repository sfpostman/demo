from typing import Union
from .services.users import UsersService
from .services.user import UserService
from .services.unknown import UnknownService
from .net.environment import Environment


class ApiDemoCollectionSdk:
    """
    Main SDK client class for ApiDemoCollectionSdk.
    Provides centralized configuration and access to all service endpoints.
    Supports authentication, environment management, and global timeout settings.
    """

    def __init__(
        self, base_url: Union[Environment, str, None] = None, timeout: int = 60000
    ):
        """
        Initializes ApiDemoCollectionSdk the SDK class.
        """

        self._base_url = (
            base_url.value if isinstance(base_url, Environment) else base_url
        )
        self.users = UsersService(base_url=self._base_url)
        self.user = UserService(base_url=self._base_url)
        self.unknown = UnknownService(base_url=self._base_url)
        self.set_timeout(timeout)

    def set_base_url(self, base_url: Union[Environment, str]):
        """
        Sets the base URL for the entire SDK.

        :param Union[Environment, str] base_url: The base URL to be set.
        :return: The SDK instance.
        """
        self._base_url = (
            base_url.value if isinstance(base_url, Environment) else base_url
        )

        self.users.set_base_url(self._base_url)
        self.user.set_base_url(self._base_url)
        self.unknown.set_base_url(self._base_url)

        return self

    def set_timeout(self, timeout: int):
        """
        Sets the timeout for the entire SDK.

        :param int timeout: The timeout (ms) to be set.
        :return: The SDK instance.
        """
        self.users.set_timeout(timeout)
        self.user.set_timeout(timeout)
        self.unknown.set_timeout(timeout)

        return self


# c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
