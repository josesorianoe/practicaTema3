package model;

public class Usuario {
    //Atributos
    private String idUsuario;
    private String nombre;
    private String apellidos;
    private String email;
    private String userName;
    private String clave;

    private Reserva reserva1;
    private Reserva reserva2;

    //Constructor

    public Usuario(String nombre, String apellidos, String email, String userName, String clave) {
        idUsuario = "U#" + (int) Math.floor(Math.random() * 10000000);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.userName = userName;
        this.clave = clave;
    }


    //Getters & Setters

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public Reserva getReserva1() {
        return reserva1;
    }

    public void setReserva1(Reserva reserva1) {
        this.reserva1 = reserva1;
    }

    public Reserva getReserva2() {
        return reserva2;
    }

    public void setReserva2(Reserva reserva2) {
        this.reserva2 = reserva2;
    }

    //Metodos
    public boolean puedeReservar(){
        if (reserva1 != null && reserva2 != null) return false;
        return true;
    }
    public boolean confirmacionNuevaClave(String p1, String p2){
        if (p1.equals(p2)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "=========================================" + "\n" +
                "Id de usuario: " + idUsuario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Email: " + email + "\n" +
                "Nombre de usuario: " + userName + "\n" +
                "Contraseña: " + clave + "\n" +
                "========================================" + "\n";
    }
}
