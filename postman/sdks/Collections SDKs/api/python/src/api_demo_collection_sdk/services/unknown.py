from typing import Any, Optional
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.cast_models import cast_models


class UnknownService(BaseService):
    """
    Service class for UnknownService operations.
    Provides methods to interact with UnknownService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._get_list_config: SdkConfig = {"environment": Environment.QAURLAPI}
        self._get_notfound_config: SdkConfig = {"environment": Environment.QAURLAPI}

    def set_get_list_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_list.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_list_config = config
        return self

    def set_get_notfound_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_notfound.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_notfound_config = config
        return self

    @cast_models
    def get_list(self, *, request_config: Optional[SdkConfig] = None) -> Any:
        """get_list

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._get_list_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/unknown",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_notfound(self, *, request_config: Optional[SdkConfig] = None) -> Any:
        """get_notfound

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._get_notfound_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/unknown/25",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response
