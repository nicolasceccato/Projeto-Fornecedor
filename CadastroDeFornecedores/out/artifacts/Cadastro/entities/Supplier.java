package entities;

import dto.SupplierRequestDTO;
import dto.SupplierResponseDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    private String cnpj;
    private String name;
    private String email;
    private String description;


    public Supplier() {

    }

    public Supplier(String name, String email, String description, String cnpj) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.cnpj = cnpj;
    }

    public Supplier(SupplierRequestDTO supplierRequestDTO) {
        this.name = supplierRequestDTO.getName();
        this.email = supplierRequestDTO.getEmail();
        this.description = supplierRequestDTO.getDescription();
        this.cnpj = supplierRequestDTO.getCnpj();
    }

    public SupplierResponseDTO toResponse() {
        SupplierResponseDTO supplierResponseDTO = new SupplierResponseDTO(this.name, this.email, this.description, this.cnpj);
        return supplierResponseDTO;
    }

    public Supplier requestToSupplier(SupplierRequestDTO supplierRequestDTO) {
        Supplier supplier = new Supplier(supplierRequestDTO.getName(),
                supplierRequestDTO.getEmail(),
                supplierRequestDTO.getDescription(),
                supplierRequestDTO.getCnpj());
        return supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
