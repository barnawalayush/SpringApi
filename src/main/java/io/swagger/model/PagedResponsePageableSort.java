package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PagedResponsePageableSort
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T22:17:40.425Z[GMT]")
public class PagedResponsePageableSort   {
  @JsonProperty("sorted")
  private Boolean sorted = null;

  @JsonProperty("unsorted")
  private Boolean unsorted = null;

  public PagedResponsePageableSort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  /**
   * Get sorted
   * @return sorted
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public PagedResponsePageableSort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

  /**
   * Get unsorted
   * @return unsorted
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponsePageableSort pagedResponsePageableSort = (PagedResponsePageableSort) o;
    return Objects.equals(this.sorted, pagedResponsePageableSort.sorted) &&
        Objects.equals(this.unsorted, pagedResponsePageableSort.unsorted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponsePageableSort {\n");
    
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
