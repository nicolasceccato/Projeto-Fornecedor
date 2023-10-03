package repositories;

import entities.Supplier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SupplierRepositoryImpl implements SupplierRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("supplier-jpa");
    EntityManager em = emf.createEntityManager();

    @Override
    public List<Supplier> getAllSuppliers() {
        //List<Supplier> supplierList = em.find()
        return null;
    }

    @Override
    public Supplier getSupplier(String cnpj) {
        Supplier supplier = em.find(Supplier.class, cnpj);
        return supplier;
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        em.getTransaction().begin();
        em.persist(supplier);
        em.getTransaction().commit();
        closeConnection();
        return supplier;
    }

    @Override
    public Supplier editSupplier(String cnpj, Supplier supplier) {
        return null;
    }

    @Override
    public void deleteSupplier(String cnpj) {
        Supplier supplier = em.find(Supplier.class, cnpj);
        em.remove(supplier);

    }


    private void closeConnection() {
        em.close();
        emf.close();
    }

}
