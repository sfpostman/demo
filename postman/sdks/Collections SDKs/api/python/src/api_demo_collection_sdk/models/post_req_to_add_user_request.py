from pydantic import Field
from typing import Optional
from typing import Union
from .utils.base_model import BaseModel


class PostReqToAddUserRequest(BaseModel):
    """PostReqToAddUserRequest

    :param name: name, defaults to None
    :type name: str, optional
    :param job: job, defaults to None
    :type job: str, optional
    """

    name: Optional[str] = Field(default=None)
    job: Optional[str] = Field(default=None)
