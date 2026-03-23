from typing import Any, Optional
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.cast_models import cast_models
from ..models import (
    PatchRequestToReplaceRequest,
    PostReqToAddUserRequest,
    PutReqToUpdateTheRecordRequest,
)


class UsersService(BaseService):
    """
    Service class for UsersService operations.
    Provides methods to interact with UsersService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._get_request_with_singel_user_config: SdkConfig = {
            "environment": Environment.QAURLAPI
        }
        self._post_req_to_add_user_config: SdkConfig = {
            "environment": Environment.QAURLAPI
        }
        self._put_req_to_update_the_record_config: SdkConfig = {
            "environment": Environment.QAURLAPI
        }
        self._patch_request_to_replace_config: SdkConfig = {
            "environment": Environment.QAURLAPI
        }

    def set_get_request_with_singel_user_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_request_with_singel_user.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_request_with_singel_user_config = config
        return self

    def set_post_req_to_add_user_config(self, config: SdkConfig):
        """
        Sets method-level configuration for post_req_to_add_user.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._post_req_to_add_user_config = config
        return self

    def set_put_req_to_update_the_record_config(self, config: SdkConfig):
        """
        Sets method-level configuration for put_req_to_update_the_record.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._put_req_to_update_the_record_config = config
        return self

    def set_patch_request_to_replace_config(self, config: SdkConfig):
        """
        Sets method-level configuration for patch_request_to_replace.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._patch_request_to_replace_config = config
        return self

    @cast_models
    def get_request_with_singel_user(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """get_request_with_singel_user

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._get_request_with_singel_user_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/users/2",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def post_req_to_add_user(
        self,
        request_body: PostReqToAddUserRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """post_req_to_add_user

        :param request_body: The request body.
        :type request_body: PostReqToAddUserRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(PostReqToAddUserRequest).is_nullable().validate(request_body)

        resolved_config = self._get_resolved_config(
            self._post_req_to_add_user_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/users",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def put_req_to_update_the_record(
        self,
        request_body: PutReqToUpdateTheRecordRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """put_req_to_update_the_record

        :param request_body: The request body.
        :type request_body: PutReqToUpdateTheRecordRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(PutReqToUpdateTheRecordRequest).is_nullable().validate(request_body)

        resolved_config = self._get_resolved_config(
            self._put_req_to_update_the_record_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/users/147",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def patch_request_to_replace(
        self,
        request_body: PatchRequestToReplaceRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """patch_request_to_replace

        :param request_body: The request body.
        :type request_body: PatchRequestToReplaceRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(PatchRequestToReplaceRequest).is_nullable().validate(request_body)

        resolved_config = self._get_resolved_config(
            self._patch_request_to_replace_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.QAURLAPI.url or Environment.DEFAULT.url}/users/147",
                [],
                resolved_config,
            )
            .serialize()
            .set_method("PATCH")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response
