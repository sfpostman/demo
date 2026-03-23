from pydantic import Field
from typing import Optional
from typing import Union
from .utils.base_model import BaseModel


class PutReqToUpdateTheRecordRequest(BaseModel):
    """PutReqToUpdateTheRecordRequest

    :param job: job, defaults to None
    :type job: str, optional
    """

    job: Optional[str] = Field(default=None)
