from typing import Union
from .net.environment import Environment
from .sdk import BookE2eWorkflowSdk
from .services.async_.scenario_happy_path import ScenarioHappyPathServiceAsync


class BookE2eWorkflowSdkAsync(BookE2eWorkflowSdk):
    """
    BookE2eWorkflowSdkAsync is the asynchronous version of the BookE2eWorkflowSdk SDK Client.
    """

    def __init__(
        self,
        api_key: str = None,
        api_key_header: str = "X-API-KEY",
        base_url: Union[Environment, str, None] = None,
        timeout: int = 60000,
    ):
        super().__init__(
            api_key=api_key,
            api_key_header=api_key_header,
            base_url=base_url,
            timeout=timeout,
        )

        self.scenario_happy_path = ScenarioHappyPathServiceAsync(
            base_url=self._base_url
        )
