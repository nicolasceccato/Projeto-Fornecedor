package controller;

import dto.SupplierRequestDTO;
import dto.SupplierResponseDTO;
import jakarta.inject.Named;
import services.SupplierService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/supplier")
@RequestScoped
@Named
@Produces("application/json; charset=UTF-8")
public class SupplierController {

    @Inject
    private SupplierService supplierService;

    @GET
    public Response getAllSuppliers() {
        return null;
    }

    @GET
    @Path("/{cnpj}")
    public Response getSupplier(@PathParam("cnpj") String cnpj) {
        return null;
    }

    @POST
    @Consumes("application/json; charset=UTF-8")
    public Response addSupplier(SupplierRequestDTO supplier) {
        SupplierResponseDTO supplierResponseDTO = supplierService.addSupplier(supplier);
        return Response.status(Response.Status.CREATED)
                .entity(supplierResponseDTO)
                .build();
    }

    @POST
    @Consumes("application/json; charset=UTF-8")
    public Response addMultiplesSupplier(List<SupplierRequestDTO> listOfSupplier) {
        return null;
    }

    @PUT
    @Path("/{cnpj}")
    @Consumes("application/json; charset=UTF-8")
    public Response editSupplier(@PathParam("cnpj") String cnpj, SupplierRequestDTO supplier) {
        return null;
    }

    @DELETE
    @Path("/{cnpj}")
    public Response deleteSupplier(SupplierRequestDTO supplier) {
        return null;
    }

}
