package services;

import dto.SupplierRequestDTO;
import dto.SupplierResponseDTO;
import entities.Supplier;
import repositories.SupplierRepository;

import javax.inject.Inject;

public class SupplierServiceImpl implements SupplierService {

    @Inject
    private SupplierRepository supplierRepository;

    @Override
    public SupplierResponseDTO getAllSuppliers() {
        // return Response.ok().build();
        return null;
    }

    @Override
    public SupplierResponseDTO getSupplier(String cnpj) {
        return null;
    }

    @Override
    public SupplierResponseDTO addSupplier(SupplierRequestDTO supplierRequestDTO) {
        Supplier supplier = new Supplier(supplierRequestDTO);
        supplier = supplierRepository.addSupplier(supplier);
        return supplier.toResponse();
    }

    @Override
    public SupplierResponseDTO editSupplier(String cnpj, SupplierRequestDTO supplier) {
        return null;
    }

    @Override
    public SupplierResponseDTO deleteSupplier(SupplierRequestDTO supplier) {
        return null;
    }
}
