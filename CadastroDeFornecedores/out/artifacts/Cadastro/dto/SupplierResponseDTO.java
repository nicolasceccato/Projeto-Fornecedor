package dto;

public class SupplierResponseDTO {
    private String cnpj;
    private String name;
    private String email;
    private String description;


    public SupplierResponseDTO() {

    }

    public SupplierResponseDTO(String name, String email, String description, String cnpj) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.cnpj = cnpj;
    }

    public SupplierResponseDTO(SupplierRequestDTO supplier) {
        this.name = supplier.getName();
        this.email = supplier.getEmail();
        this.description = supplier.getDescription();
        this.cnpj = supplier.getCnpj();
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
