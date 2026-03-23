from pydantic import Field
from typing import Optional
from typing import Union
from .utils.base_model import BaseModel


class PatchRequestToReplaceRequest(BaseModel):
    """PatchRequestToReplaceRequest

    :param op: op, defaults to None
    :type op: str, optional
    :param path: path, defaults to None
    :type path: str, optional
    :param value: value, defaults to None
    :type value: str, optional
    """

    op: Optional[str] = Field(default=None)
    path: Optional[str] = Field(default=None)
    value: Optional[str] = Field(default=None)
