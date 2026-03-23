from typing import Union
from .net.environment import Environment
from .sdk import ApiDemoCollectionSdk
from .services.async_.users import UsersServiceAsync
from .services.async_.user import UserServiceAsync
from .services.async_.unknown import UnknownServiceAsync


class ApiDemoCollectionSdkAsync(ApiDemoCollectionSdk):
    """
    ApiDemoCollectionSdkAsync is the asynchronous version of the ApiDemoCollectionSdk SDK Client.
    """

    def __init__(
        self, base_url: Union[Environment, str, None] = None, timeout: int = 60000
    ):
        super().__init__(base_url=base_url, timeout=timeout)

        self.users = UsersServiceAsync(base_url=self._base_url)
        self.user = UserServiceAsync(base_url=self._base_url)
        self.unknown = UnknownServiceAsync(base_url=self._base_url)
