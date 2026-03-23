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
public class GetReqWithQueryParamsParameters {

  @JsonProperty("page")
  private JsonNullable<String> page;

  @JsonIgnore
  public String getPage() {
    return page.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class GetReqWithQueryParamsParametersBuilder {

    private JsonNullable<String> page = JsonNullable.undefined();

    @JsonProperty("page")
    public GetReqWithQueryParamsParametersBuilder page(String value) {
      this.page = JsonNullable.of(value);
      return this;
    }
  }
}
