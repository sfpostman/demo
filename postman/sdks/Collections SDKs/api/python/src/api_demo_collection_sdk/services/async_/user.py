from typing import Awaitable, Optional, Any, Union
from .utils.to_async import to_async
from ..user import UserService
from ...net.sdk_config import SdkConfig
from ...models.utils.sentinel import SENTINEL


class UserServiceAsync(UserService):
    """
    Async Wrapper for UserServiceAsync
    """

    def get_req_with_query_params(
        self,
        page: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().get_req_with_query_params)(
            page, request_config=request_config
        )
