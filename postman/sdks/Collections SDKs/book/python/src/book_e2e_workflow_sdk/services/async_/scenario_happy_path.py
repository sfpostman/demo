from typing import Awaitable, Optional, Any, Union
from .utils.to_async import to_async
from ..scenario_happy_path import ScenarioHappyPathService
from ...net.sdk_config import SdkConfig


class ScenarioHappyPathServiceAsync(ScenarioHappyPathService):
    """
    Async Wrapper for ScenarioHappyPathServiceAsync
    """

    def fetch_a_list_of_books(
        self,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().fetch_a_list_of_books)(
            x_mock_response_code, request_config=request_config
        )

    def create_a_new_book(
        self,
        x_mock_response_code: Union[str, None],
        x_mock_response_name: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().create_a_new_book)(
            x_mock_response_code, x_mock_response_name, request_config=request_config
        )

    def verify_the_book_exists(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().verify_the_book_exists)(
            id_, x_mock_response_code, request_config=request_config
        )

    def checkout_new_book(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().checkout_new_book)(
            id_, x_mock_response_code, request_config=request_config
        )

    def verify_book_is_checked_out(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().verify_book_is_checked_out)(
            id_, x_mock_response_code, request_config=request_config
        )
