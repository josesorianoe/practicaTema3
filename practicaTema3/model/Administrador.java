package model;

public class Administrador {
    //Atributos
    private String nombre;
    private String apellidos;
    private String email;
    private String userName;
    private String clave;

    //Constructor

    public Administrador(String nombre, String apellidos, String email, String userName, String clave) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.userName = userName;
        this.clave = clave;
    }


    //Getters & Setters

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

    //Metodos
    public boolean confirmacionNuevaClave(String p1, String p2){
        if (p1.equals(p2)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "===================================\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Email: " + email + "\n" +
                "Nombre de usuario: " + userName + "\n" +
                "Contraseña: " + clave + "\n" +
                "==================================";
    }
}

