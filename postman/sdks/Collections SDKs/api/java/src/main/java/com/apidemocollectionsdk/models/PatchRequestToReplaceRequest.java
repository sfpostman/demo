package com.apidemocollectionsdk.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;
import org.openapitools.jackson.nullable.JsonNullable;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class PatchRequestToReplaceRequest {

  @JsonProperty("op")
  private JsonNullable<String> op;

  @JsonProperty("path")
  private JsonNullable<String> path;

  @JsonProperty("value")
  private JsonNullable<String> value;

  @JsonIgnore
  public String getOp() {
    return op.orElse(null);
  }

  @JsonIgnore
  public String getPath() {
    return path.orElse(null);
  }

  @JsonIgnore
  public String getValue() {
    return value.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class PatchRequestToReplaceRequestBuilder {

    private JsonNullable<String> op = JsonNullable.undefined();

    @JsonProperty("op")
    public PatchRequestToReplaceRequestBuilder op(String value) {
      this.op = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> path = JsonNullable.undefined();

    @JsonProperty("path")
    public PatchRequestToReplaceRequestBuilder path(String value) {
      this.path = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> value = JsonNullable.undefined();

    @JsonProperty("value")
    public PatchRequestToReplaceRequestBuilder value(String value) {
      this.value = JsonNullable.of(value);
      return this;
    }
  }
}
