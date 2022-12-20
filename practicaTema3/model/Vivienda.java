package model;

import java.time.LocalDate;

public class Vivienda {
    //Atributos
    private String idVivienda;
    private String titulo;
    private String localidad;
    private String direccion;
    private int maximoHuespedes;
    private double precioNoche;

    private Reserva reserva1;
    private Reserva reserva2;

    //Constructor

    public Vivienda(String titulo, String localidad, String direccion, int maximoHuespedes, double precioNoche) {
        idVivienda = "V#" + (int) Math.floor(Math.random() * 10000000);
        this.titulo = titulo;
        this.localidad = localidad;
        this.direccion = direccion;
        this.maximoHuespedes = maximoHuespedes;
        this.precioNoche = precioNoche;
    }

    public Vivienda() {
        idVivienda = "V#" + (int) Math.floor(Math.random() * 10000000);
    }
    //Getters & Setters

    public String getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(String idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMaximoHuespedes() {
        return maximoHuespedes;
    }

    public void setMaximoHuespedes(int maximoHuespedes) {
        this.maximoHuespedes = maximoHuespedes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Reserva getReserva1() {
        return reserva1;
    }

    public void setReserva1(Reserva reserva1) { this.reserva1 = reserva1;
    }

    public Reserva getReserva2() {
        return reserva2;
    }

    public void setReserva2(Reserva reserva2) {
        this.reserva2 = reserva2;
    }


    //Metodos
    public int reservasDisponibles(){
        int libres = 0;
        if (reserva1 == null) libres++;
        if (reserva2 == null) libres++;
        return libres;
    }
    public boolean coincideCiudad(String ciudad){
        if (ciudad.equals(localidad)) return true;
        return false;
    }
    public boolean suficientesHuespedes(int huespedes){
        if (huespedes <= maximoHuespedes) return true;
        return false;
    }



    @Override
    public String toString() {
        return "=====================================================" + "\n" +
                "===Alojamiento con ID: " +  idVivienda + "===\n" +
                "Vivienda: " + titulo + "\n" +
                "Dirección: " + direccion + "\n" +
                "Número de huéspedes máximo: " + maximoHuespedes + "\n" +
                "Precio por noche: " + precioNoche + " euros" + "\n" +
                "====================================================" + "\n";
    }
}

