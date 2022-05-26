package U9.clases;

public class offices {
    private String officeCode;
    private String city;
    private String telephone;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String postalcode;
    private String territory;

    public offices(String codigoOficina, String city, String telephone, String addressLine1, String addressLine2, String state, String country, String postalcode, String territory) {
        this.officeCode = codigoOficina;
        this.city = city;
        this.telephone = telephone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.country = country;
        this.postalcode = postalcode;
        this.territory = territory;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "codigoOficina=" + officeCode +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", territory='" + territory + '\'' +
                '}';
    }
}
