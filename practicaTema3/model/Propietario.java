package model;

public class Propietario {
    //Atributos
    private String idPropietario;
    private String nombre;
    private String apellidos;
    private String email;
    private String userName;
    private String clave;
    private Vivienda vivienda;



    //Constructor
    public Propietario(String nombre, String apellidos, String email, String userName, String clave) {
        idPropietario = "P#" + (int) Math.floor(Math.random() * 10000000);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.userName = userName;
        this.clave = clave;
        vivienda = null;
    }

    public Propietario(){
        idPropietario = "P#" + (int) Math.floor(Math.random() * 10000000);
    }

    //Getters & Setters

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }


    //Metodos

    public Vivienda crearVivienda(String titulo, String localidad, String direccion, int maximoHuespedes, double precioNoche) {
        return new Vivienda(titulo,localidad, direccion, maximoHuespedes, precioNoche);
    }
    public boolean confirmacionNuevaClave(String p1, String p2){
        if (p1.equals(p2)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "=========================================" + "\n" +
                "Id de propietario: " + idPropietario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Email: " + email + "\n" +
                "Nombre de usuario: " + userName + "\n" +
                "Contraseña: " + clave + "\n" +
                "========================================" + "\n";
    }
}
