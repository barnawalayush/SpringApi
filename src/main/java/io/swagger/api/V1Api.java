/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Beer;
import io.swagger.model.BeerOrder;
import io.swagger.model.BeerPagedList;
import io.swagger.model.Customer;
import io.swagger.model.CustomerPagedList;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T22:17:40.425Z[GMT]")
@Api(value = "v1", description = "the v1 API")
public interface V1Api {

    @ApiOperation(value = "Delete Beer by Id", nickname = "deleteBeerV1", notes = "Delete a beer resource by its ID value.", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Beers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Beer Resource Deleted"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/beers/{beerId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBeerV1(@ApiParam(value = "Beer Id",required=true) @PathVariable("beerId") UUID beerId);


    @ApiOperation(value = "Delete Customer By ID", nickname = "deleteCustomerV1", notes = "Delete a customer by its Id value.", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Customer Delete"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomerV1(@ApiParam(value = "Customer Id",required=true) @PathVariable("customerId") UUID customerId);


    @ApiOperation(value = "Get Beer by ID", nickname = "getBeerByIdV1", notes = "Get a single beer by its ID value.", response = Beer.class, authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Beers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Found Beer by Id", response = Beer.class),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/beers/{beerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Beer> getBeerByIdV1(@ApiParam(value = "Beer Id",required=true) @PathVariable("beerId") UUID beerId);


    @ApiOperation(value = "Get Customer By ID", nickname = "getCustomerByIdV1", notes = "Get a single **Customer** by its Id value.", response = Customer.class, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Found Customer", response = Customer.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Customer> getCustomerByIdV1(@ApiParam(value = "Customer Id",required=true) @PathVariable("customerId") UUID customerId);


    @ApiOperation(value = "List Beers", nickname = "listBeersV1", notes = "List all beers in system.", response = BeerPagedList.class, authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Beers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Beers", response = BeerPagedList.class),
        @ApiResponse(code = 404, message = "No Beers Found") })
    @RequestMapping(value = "/v1/beers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BeerPagedList> listBeersV1(@ApiParam(value = "Page Number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "Page Size") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "List Customers", nickname = "listCustomersV1", notes = "Get a list of customers in the system", response = CustomerPagedList.class, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Customers", response = CustomerPagedList.class) })
    @RequestMapping(value = "/v1/customers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CustomerPagedList> listCustomersV1(@ApiParam(value = "Page Number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "Page Size") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "Update Beer by ID", nickname = "updateBeerByIdV1", notes = "Update a beer by its ID value.", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Beers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Beer Updated"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 409, message = "Conflict") })
    @RequestMapping(value = "/v1/beers/{beerId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateBeerByIdV1(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Beer body,@ApiParam(value = "Beer Id",required=true) @PathVariable("beerId") UUID beerId);


    @ApiOperation(value = "New Beer", nickname = "v1BeersPost", notes = "Create a new Beer Object", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Beers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Beer Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 409, message = "Conflict") })
    @RequestMapping(value = "/v1/beers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> v1BeersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Beer body);


    @ApiOperation(value = "", nickname = "v1CustomersCustomerIdOrdersPost", notes = "Place Order", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Order Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Order Created"),
        @ApiResponse(code = 400, message = "Bad Reqeust"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 409, message = "Conflict") })
    @RequestMapping(value = "/v1/customers/{customerId}/orders",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> v1CustomersCustomerIdOrdersPost(@ApiParam(value = "Customer Id",required=true) @PathVariable("customerId") UUID customerId,@ApiParam(value = ""  )  @Valid @RequestBody BeerOrder body);


    @ApiOperation(value = "Update Customer", nickname = "v1CustomersCustomerIdPut", notes = "Update customer by id.", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Customer Updated"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 409, message = "Conflict") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> v1CustomersCustomerIdPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Customer body,@ApiParam(value = "Customer Id",required=true) @PathVariable("customerId") UUID customerId);


    @ApiOperation(value = "New Customer", nickname = "v1CustomersPost", notes = "Create a new customer", authorizations = {
        @Authorization(value = "BasicAuth"),
@Authorization(value = "JwtAuthToken")    }, tags={ "Customers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Customer Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 409, message = "Conflict") })
    @RequestMapping(value = "/v1/customers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> v1CustomersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Customer body);

}