package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Reserva {
    // Atributos
    private String idReserva;
    private String idUsuario;
    private String idVivienda;
    private int numNoches;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int numHuespedes;
    private double precioTotal;

    private Usuario usuario;
    private Vivienda vivienda;

    // Constructor


    public Reserva(int numNoches, LocalDate fechaEntrada, int numHuespedes) {
        idReserva = "R#" + (int) Math.floor(Math.random() * 10000000);
        idUsuario = "-1";
        idVivienda = "-1";
        this.numNoches = numNoches;
        this.fechaEntrada = fechaEntrada;
        this.numHuespedes = numHuespedes;
    }

    public Reserva(int numNoches, LocalDate fechaEntrada){
        idReserva = "R#" + (int) Math.floor(Math.random() * 10000000);
        this.numNoches = numNoches;
        this.fechaEntrada = fechaEntrada;
        numHuespedes = 0;
    }

    //Getters && Setters


    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(String idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public int getNumNoches() {
        return numNoches;
    }

    public void setNumNoches(int numNoches) {
        this.numNoches = numNoches;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumHuespedes() {
        return numHuespedes;
    }

    public void setNumHuespedes(int numHuespedes) {
        this.numHuespedes = numHuespedes;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    //Metodos

    public String devuelveUsuario(String idUsuario){
        if (usuario == null) return "Propietario";
        idUsuario = usuario.getIdUsuario();
        return usuario.getNombre() + " " + usuario.getApellidos();
    }

    public LocalDate calculaFechaSalida(LocalDate fechaEntrada, int noches){
        return fechaEntrada.plusDays(noches);
    }

    public double calculaPrecioTotal(){
        precioTotal = vivienda.getPrecioNoche() * numNoches;
        return precioTotal;
    }


    @Override
    public String toString() {
        return "===========================================" + "\n" +
                "===Reserva con ID: " + idReserva + "===" + "\n" +
                "Usuario: " + ((usuario != null) ? devuelveUsuario(idUsuario) : "Reserva propia") + "\n" +
                ((vivienda != null) ? "Vivienda: " +  vivienda.getTitulo() + " (ID: " + vivienda.getIdVivienda() + ")" : "") + "\n" +
                "Noches: " + numNoches + "\n" +
                "Entrada: " + fechaEntrada + "\n" +
                "Salida: " + calculaFechaSalida(fechaEntrada, numNoches) + "\n" +
                "Hu??spedes: " + numHuespedes + "\n" +
                "Precio por noche: " + vivienda.getPrecioNoche() + " euros; " +  "Precio total: " + calculaPrecioTotal() + "\n" +
                "==========================================";
    }
}

