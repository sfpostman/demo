from .post_req_to_add_user_request import PostReqToAddUserRequest
from .put_req_to_update_the_record_request import PutReqToUpdateTheRecordRequest
from .patch_request_to_replace_request import PatchRequestToReplaceRequest

# Rebuild models to resolve circular forward references
# This ensures Pydantic can properly validate models that reference each other
PostReqToAddUserRequest.model_rebuild()
PutReqToUpdateTheRecordRequest.model_rebuild()
PatchRequestToReplaceRequest.model_rebuild()
