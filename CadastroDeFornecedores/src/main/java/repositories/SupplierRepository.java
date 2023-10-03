package repositories;

import entities.Supplier;

import java.util.List;

public interface SupplierRepository {
    List<Supplier> getAllSuppliers();

    Supplier getSupplier(String cnpj);

    Supplier addSupplier(Supplier supplier);

    Supplier editSupplier(String cnpj, Supplier supplier);

    void deleteSupplier(String cnpj);
}
