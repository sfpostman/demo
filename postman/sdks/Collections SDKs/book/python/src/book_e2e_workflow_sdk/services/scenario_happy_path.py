from typing import Any, Optional, Union
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.cast_models import cast_models


class ScenarioHappyPathService(BaseService):
    """
    Service class for ScenarioHappyPathService operations.
    Provides methods to interact with ScenarioHappyPathService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._fetch_a_list_of_books_config: SdkConfig = {
            "environment": Environment.LIBRARY_API
        }
        self._create_a_new_book_config: SdkConfig = {
            "environment": Environment.LIBRARY_API
        }
        self._verify_the_book_exists_config: SdkConfig = {
            "environment": Environment.LIBRARY_API
        }
        self._checkout_new_book_config: SdkConfig = {
            "environment": Environment.LIBRARY_API
        }
        self._verify_book_is_checked_out_config: SdkConfig = {
            "environment": Environment.LIBRARY_API
        }

    def set_fetch_a_list_of_books_config(self, config: SdkConfig):
        """
        Sets method-level configuration for fetch_a_list_of_books.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._fetch_a_list_of_books_config = config
        return self

    def set_create_a_new_book_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_a_new_book.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_a_new_book_config = config
        return self

    def set_verify_the_book_exists_config(self, config: SdkConfig):
        """
        Sets method-level configuration for verify_the_book_exists.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._verify_the_book_exists_config = config
        return self

    def set_checkout_new_book_config(self, config: SdkConfig):
        """
        Sets method-level configuration for checkout_new_book.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._checkout_new_book_config = config
        return self

    def set_verify_book_is_checked_out_config(self, config: SdkConfig):
        """
        Sets method-level configuration for verify_book_is_checked_out.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._verify_book_is_checked_out_config = config
        return self

    @cast_models
    def fetch_a_list_of_books(
        self,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """fetch_a_list_of_books

        :param x_mock_response_code: x_mock_response_code
        :type x_mock_response_code: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_nullable().validate(x_mock_response_code)

        resolved_config = self._get_resolved_config(
            self._fetch_a_list_of_books_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.LIBRARY_API.url or Environment.DEFAULT.url}/books",
                [self.get_api_key(resolved_config)],
                resolved_config,
            )
            .add_header("x-mock-response-code", x_mock_response_code)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_a_new_book(
        self,
        x_mock_response_code: Union[str, None],
        x_mock_response_name: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_a_new_book

        :param x_mock_response_code: x_mock_response_code
        :type x_mock_response_code: str
        :param x_mock_response_name: x_mock_response_name
        :type x_mock_response_name: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_nullable().validate(x_mock_response_code)
        Validator(str).is_nullable().validate(x_mock_response_name)

        resolved_config = self._get_resolved_config(
            self._create_a_new_book_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.LIBRARY_API.url or Environment.DEFAULT.url}/books",
                [self.get_api_key(resolved_config)],
                resolved_config,
            )
            .add_header("x-mock-response-code", x_mock_response_code)
            .add_header("x-mock-response-name", x_mock_response_name)
            .serialize()
            .set_method("POST")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def verify_the_book_exists(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """verify_the_book_exists

        :param id_: id_
        :type id_: str
        :param x_mock_response_code: x_mock_response_code
        :type x_mock_response_code: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_)
        Validator(str).is_nullable().validate(x_mock_response_code)

        resolved_config = self._get_resolved_config(
            self._verify_the_book_exists_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.LIBRARY_API.url or Environment.DEFAULT.url}/books/{{id}}",
                [self.get_api_key(resolved_config)],
                resolved_config,
            )
            .add_header("x-mock-response-code", x_mock_response_code)
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def checkout_new_book(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """checkout_new_book

        :param id_: id_
        :type id_: str
        :param x_mock_response_code: x_mock_response_code
        :type x_mock_response_code: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_)
        Validator(str).is_nullable().validate(x_mock_response_code)

        resolved_config = self._get_resolved_config(
            self._checkout_new_book_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.LIBRARY_API.url or Environment.DEFAULT.url}/books/{{id}}",
                [self.get_api_key(resolved_config)],
                resolved_config,
            )
            .add_header("x-mock-response-code", x_mock_response_code)
            .add_path("id", id_)
            .serialize()
            .set_method("PATCH")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def verify_book_is_checked_out(
        self,
        id_: str,
        x_mock_response_code: Union[str, None],
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """verify_book_is_checked_out

        :param id_: id_
        :type id_: str
        :param x_mock_response_code: x_mock_response_code
        :type x_mock_response_code: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_)
        Validator(str).is_nullable().validate(x_mock_response_code)

        resolved_config = self._get_resolved_config(
            self._verify_book_is_checked_out_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{resolved_config.get('base_url') or self.base_url or Environment.LIBRARY_API.url or Environment.DEFAULT.url}/books/{{id}}",
                [self.get_api_key(resolved_config)],
                resolved_config,
            )
            .add_header("x-mock-response-code", x_mock_response_code)
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response
