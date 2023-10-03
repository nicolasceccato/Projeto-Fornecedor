package services;

import dto.SupplierRequestDTO;
import dto.SupplierResponseDTO;

public interface SupplierService {
    SupplierResponseDTO getAllSuppliers();

    SupplierResponseDTO getSupplier(String cnpj);

    SupplierResponseDTO addSupplier(SupplierRequestDTO supplier);

    SupplierResponseDTO editSupplier(String cnpj, SupplierRequestDTO supplier);

    SupplierResponseDTO deleteSupplier(SupplierRequestDTO supplier);
}
