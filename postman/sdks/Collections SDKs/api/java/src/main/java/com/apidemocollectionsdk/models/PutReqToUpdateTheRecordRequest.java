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
public class PutReqToUpdateTheRecordRequest {

  @JsonProperty("job")
  private JsonNullable<String> job;

  @JsonIgnore
  public String getJob() {
    return job.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class PutReqToUpdateTheRecordRequestBuilder {

    private JsonNullable<String> job = JsonNullable.undefined();

    @JsonProperty("job")
    public PutReqToUpdateTheRecordRequestBuilder job(String value) {
      this.job = JsonNullable.of(value);
      return this;
    }
  }
}
