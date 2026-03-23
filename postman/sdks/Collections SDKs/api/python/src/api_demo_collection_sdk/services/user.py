from typing import Any, Optional, Union
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.sentinel import SENTINEL
from ..models.utils.cast_models import cast_models


class UserService(BaseService):
    """
    Service class for UserService operations.
    Provides methods to interact with UserService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._get_req_with_query_params_config: SdkConfig = {
            "environment": Environment.QAURLAPI_1
        }

    def set_get_req_with_query_params_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_req_with_query_params.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_req_with_query_params_config = config
        return self

    @cast_models
    def get_req_with_query_params(
        self,
        page: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """get_req_with_query_params

        :param page: page, defaults to None
        :type page: str, optional
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_optional().is_nullable().validate(page)

        resolved_config = self._get_resolved_config(
            self._get_req_with_query_params_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI_1.url or Environment.DEFAULT.url}/User",
                [],
                resolved_config,
            )
            .add_query("page", page, nullable=True)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response
