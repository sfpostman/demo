from typing import Awaitable, Optional, Any
from .utils.to_async import to_async
from ..unknown import UnknownService
from ...net.sdk_config import SdkConfig


class UnknownServiceAsync(UnknownService):
    """
    Async Wrapper for UnknownServiceAsync
    """

    def get_list(self, *, request_config: Optional[SdkConfig] = None) -> Awaitable[Any]:
        return to_async(super().get_list)(request_config=request_config)

    def get_notfound(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().get_notfound)(request_config=request_config)
