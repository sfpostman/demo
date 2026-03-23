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
public class PostReqToAddUserRequest {

  @JsonProperty("name")
  private JsonNullable<String> name;

  @JsonProperty("job")
  private JsonNullable<String> job;

  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonIgnore
  public String getJob() {
    return job.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class PostReqToAddUserRequestBuilder {

    private JsonNullable<String> name = JsonNullable.undefined();

    @JsonProperty("name")
    public PostReqToAddUserRequestBuilder name(String value) {
      this.name = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> job = JsonNullable.undefined();

    @JsonProperty("job")
    public PostReqToAddUserRequestBuilder job(String value) {
      this.job = JsonNullable.of(value);
      return this;
    }
  }
}
