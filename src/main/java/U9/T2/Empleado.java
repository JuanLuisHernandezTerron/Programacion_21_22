package U9.T2;

public class Empleado {
    private int numeroEmpleado;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private int numeroJefe;
    private String jobTitle;

    public Empleado(int numeroEmpleado, String lastName, String firstName, String extension, String email, String officeCode, int numeroJefe, String jobTitle) {
        this.numeroEmpleado = numeroEmpleado;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.numeroJefe = numeroJefe;
        this.jobTitle = jobTitle;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public int getNumeroJefe() {
        return numeroJefe;
    }

    public void setNumeroJefe(int numeroJefe) {
        this.numeroJefe = numeroJefe;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", officeCode='" + officeCode + '\'' +
                ", numeroJefe=" + numeroJefe +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
