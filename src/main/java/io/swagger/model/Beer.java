package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Brewery;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer Object
 */
@ApiModel(description = "Beer Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T22:17:40.425Z[GMT]")
public class Beer   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("beerName")
  private String beerName = null;

  /**
   * Gets or Sets style
   */
  public enum StyleEnum {
    ALE("ALE"),
    
    PALE_ALE("PALE_ALE"),
    
    IPA("IPA"),
    
    WHEAT("WHEAT"),
    
    LAGER("LAGER");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("style")
  private StyleEnum style = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("quantityOnHand")
  private Integer quantityOnHand = null;

  @JsonProperty("brewery")
  private Brewery brewery = null;

  public Beer id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Beer beerName(String beerName) {
    this.beerName = beerName;
    return this;
  }

  /**
   * Get beerName
   * @return beerName
  **/
  @ApiModelProperty(value = "")
  
    public String getBeerName() {
    return beerName;
  }

  public void setBeerName(String beerName) {
    this.beerName = beerName;
  }

  public Beer style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  
    public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Beer price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  
    public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Beer quantityOnHand(Integer quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
    return this;
  }

  /**
   * Get quantityOnHand
   * @return quantityOnHand
  **/
  @ApiModelProperty(value = "")
  
    public Integer getQuantityOnHand() {
    return quantityOnHand;
  }

  public void setQuantityOnHand(Integer quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }

  public Beer brewery(Brewery brewery) {
    this.brewery = brewery;
    return this;
  }

  /**
   * Get brewery
   * @return brewery
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Brewery getBrewery() {
    return brewery;
  }

  public void setBrewery(Brewery brewery) {
    this.brewery = brewery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.id, beer.id) &&
        Objects.equals(this.beerName, beer.beerName) &&
        Objects.equals(this.style, beer.style) &&
        Objects.equals(this.price, beer.price) &&
        Objects.equals(this.quantityOnHand, beer.quantityOnHand) &&
        Objects.equals(this.brewery, beer.brewery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beerName, style, price, quantityOnHand, brewery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beerName: ").append(toIndentedString(beerName)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantityOnHand: ").append(toIndentedString(quantityOnHand)).append("\n");
    sb.append("    brewery: ").append(toIndentedString(brewery)).append("\n");
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
