from typing import Awaitable, Optional, Any
from .utils.to_async import to_async
from ..users import UsersService
from ...net.sdk_config import SdkConfig
from ...models import (
    PostReqToAddUserRequest,
    PutReqToUpdateTheRecordRequest,
    PatchRequestToReplaceRequest,
)


class UsersServiceAsync(UsersService):
    """
    Async Wrapper for UsersServiceAsync
    """

    def get_request_with_singel_user(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().get_request_with_singel_user)(
            request_config=request_config
        )

    def post_req_to_add_user(
        self,
        request_body: PostReqToAddUserRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().post_req_to_add_user)(
            request_body, request_config=request_config
        )

    def put_req_to_update_the_record(
        self,
        request_body: PutReqToUpdateTheRecordRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().put_req_to_update_the_record)(
            request_body, request_config=request_config
        )

    def patch_request_to_replace(
        self,
        request_body: PatchRequestToReplaceRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().patch_request_to_replace)(
            request_body, request_config=request_config
        )
