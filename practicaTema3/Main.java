import model.*;
import utils.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha1 = LocalDate.parse("10/12/2022", formatoFecha);
        Administrador admin = new Administrador("Juan", "Garrido", "juan@gmail.com", "juanga", "1234");
        Propietario owner1 = new Propietario("Pablo", "González", "pgonzalez@gmail.com", "pablez", "5678");
        Propietario owner2 = null, ownerLogueado;
        Usuario user1 = new Usuario("Eva", "Navarro", "eva@gmail.com", "evavarro", "9123");
        Usuario user2 = null, userLogueado, otroUser;
        Vivienda v1 = new Vivienda("Apartamento en Madrid", "Madrid", "Calle Picasso 29", 6, 50);
        Vivienda v2 = null;
        Reserva r1 = new Reserva(3, fecha1, 4);
        Reserva r2 = null, r3 = null, r4 = null;
        owner1.setVivienda(v1);
        v1.setReserva1(r1);
        user1.setReserva1(r1);
        r1.setUsuario(user1);
        r1.setVivienda(v1);
        String opInicial, opPrincipal, op, nombreTeclado, apellidosTeclado, emailTeclado, userNameTeclado, claveTeclado,
                funcionTeclado, tituloTeclado, localidadTeclado, direccionTeclado, nuevoParametro, ciudadTeclado = "", fechaTeclado,
                idReservaTeclado, idViviendaTeclado;
        int maximoHuespedesTeclado, huespedes, noches;
        double precioNocheTeclado;
        boolean logueado, idViviendaCorrecto = false, reservaAplicada;

        do {
            logueado = false;
            ownerLogueado = null;
            userLogueado = null;
            otroUser = null;
            System.out.print("""
                    === BIENVENIDO A FERNANBnB ===
                    1.- Iniciar sesión
                    2.- Registrarse
                    3.- Apagar
                    Elije una opción: """);
            opInicial = s.nextLine();
            switch (opInicial) {
                case "1": //Iniciar sesión

                    System.out.print("Introduzca nombre de usuario: ");
                    userNameTeclado = s.nextLine();
                    System.out.print("Introduzca contraseña: ");
                    claveTeclado = s.nextLine();
                    Utils.limpiarPantalla();
                    if (userNameTeclado.equals(admin.getUserName()) && claveTeclado.equals(admin.getClave())) { // Inicio Sesion admin
                        Utils.iniciarSesion();
                        do {
                            logueado = true;
                            System.out.println("Bienvenido " + admin.getNombre() + ", perfil administración");
                            System.out.println("""
                                    Menu principal
                                    1.- Ver todas las viviendas en alquiler
                                    2.- Ver todos los usuarios del sistema
                                    3.- Ver todas las reservas de viviendas
                                    4.- Ver mi perfil
                                    5.- Modificar mi perfil
                                    6.- Cerrar sesion
                                    """);
                            System.out.print("Elige una opcion: ");
                            opPrincipal = s.nextLine();
                            Utils.limpiarPantalla();
                            switch (opPrincipal) {
                                case "1": // Ver todas las viviendas en alquiler
                                    if (v1 == null && v2 == null)
                                        System.out.println("No hay viviendas registradas");
                                    else {
                                        System.out.println("=== VIVIENDAS ===");
                                        if (v1 != null) System.out.println(v1);
                                        if (v2 != null) System.out.println(v2);
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "2": // Ver todos los usuarios del sistema
                                    //Mostrar propietarios
                                    if (owner1 == null && owner2 == null)
                                        System.out.println("No hay propietarios registrados");
                                    else {
                                        System.out.println("=== PROPIETARIOS ===");
                                        if (owner1 != null) System.out.println(owner1);
                                        if (owner2 != null) System.out.println(owner2);
                                    }

                                    //Mostrar usuarios
                                    if (user1 == null && user2 == null)
                                        System.out.println("No hay usuarios registrados");
                                    else {
                                        System.out.println("=== USUARIOS ===");
                                        if (user1 != null) System.out.println(user1);
                                        if (user2 != null) System.out.println(user2);
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "3": // Ver todas las reservas de viviendas
                                    if (r1 == null && r2 == null && r3 == null && r4 == null) //Mostrar reservas
                                        System.out.println("No se han realizado reservas");
                                    else {
                                        if (r1 != null) System.out.println(r1);
                                        if (r2 != null) System.out.println(r2);
                                        if (r3 != null) System.out.println(r3);
                                        if (r4 != null) System.out.println(r4);
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "4": // Ver mi perfil
                                    System.out.println(admin);
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "5": //Modificar mi perfil
                                    do {
                                        System.out.print("""
                                                Modificación de perfil
                                                1.- Nombre
                                                2.- Apellidos
                                                3.- Email
                                                4.- Nombre de usuario
                                                5.- Contraseña
                                                6.- Volver al menú de administrador
                                                Elija el campo que quiera modificar: """);
                                        op = s.nextLine();
                                        switch (op) {

                                            case "1": // Modificar nombre
                                                System.out.println("Nombre: " + admin.getNombre());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                admin.setNombre(nuevoParametro);
                                                System.out.println("Nombre actualizado: " + admin.getNombre());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "2": // Modificar apellidos
                                                System.out.println("Apellidos: " + admin.getApellidos());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                admin.setApellidos(nuevoParametro);
                                                System.out.println("Apellidos actualizados: " + admin.getApellidos());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "3": // Modificar email
                                                System.out.println("Email: " + admin.getEmail());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                admin.setEmail(nuevoParametro);
                                                System.out.println("Email actualizado: " + admin.getEmail());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "4": // Modificar nombre de usuario
                                                System.out.println("Nombre de usuario: " + admin.getUserName());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                admin.setUserName(nuevoParametro);
                                                System.out.println("Nombre de usuario actualizado: " + admin.getUserName());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "5": //Modificar contraseña
                                                String nuevaClave;
                                                do {
                                                    System.out.println("Contraseña: " + admin.getClave());
                                                    System.out.print("Introduzca nuevo valor: ");
                                                    nuevoParametro = s.nextLine();
                                                    System.out.print("Introduzca de nuevo la nueva contraseña: ");
                                                    nuevaClave = s.nextLine();
                                                    if (!admin.confirmacionNuevaClave(nuevoParametro, nuevaClave))
                                                        System.out.println("Los valores no coinciden");
                                                    else {
                                                        admin.setClave(nuevoParametro);
                                                        System.out.println("Contraseña actualizada: " + admin.getClave());
                                                    }
                                                } while (!admin.confirmacionNuevaClave(nuevoParametro, nuevaClave));
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "6": // Volver al menú anterior
                                                Utils.volverMenuAnterior();
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                        }
                                    } while (!op.equals("6"));
                                    break;

                                case "6": //Cerrar sesión
                                    Utils.cerrarSesion();
                                    break;

                                default:
                                    System.out.println("Opción no válida");
                            }

                        } while (!opPrincipal.equals("6"));
                    }

                    //Inicio sesion propietario

                    if ((owner1 != null && userNameTeclado.equals(owner1.getUserName()) && claveTeclado.equals(owner1.getClave())))
                        ownerLogueado = owner1;

                    if ((owner2 != null && userNameTeclado.equals(owner2.getUserName()) && claveTeclado.equals(owner2.getClave())))
                        ownerLogueado = owner2;

                    if (ownerLogueado != null) {
                        Utils.iniciarSesion();
                        do {
                            logueado = true;
                            System.out.println("Bienvenido " + ownerLogueado.getNombre() + ", gestione sus viviendas en alquiler");
                            System.out.println("""
                                    Menu principal
                                    1.- Ver mis viviendas en alquiler
                                    2.- Añadir una vivienda
                                    3.- Eliminar vivienda
                                    4.- Editar mis viviendas
                                    5.- Ver las reservas de mis viviendas
                                    6.- Establecer un periodo de no disponible para una vivienda
                                    7.- Ver mi perfil
                                    8.- Modificar mi perfil
                                    9.- Cerrar sesion
                                    """);
                            System.out.print("Elige una opcion: ");
                            opPrincipal = s.nextLine();
                            Utils.limpiarPantalla();
                            switch (opPrincipal) {
                                case "1": //Ver mis viviendas en alquiler
                                    if (ownerLogueado.getVivienda() == null)
                                        System.out.println("No tienes una vivienda registrada");
                                    else System.out.println(ownerLogueado.getVivienda());
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "2": // Añadir vivienda
                                    if (ownerLogueado.getVivienda() != null)
                                        System.out.println("No puedes añadir más de una vivienda");
                                    else {
                                        System.out.print("Introduce título: ");
                                        tituloTeclado = s.nextLine();
                                        System.out.print("Introduce localidad: ");
                                        localidadTeclado = s.nextLine();
                                        System.out.print("Introduce dirección: ");
                                        direccionTeclado = s.nextLine();
                                        System.out.print("Introduce el número máximo de huéspedes: ");
                                        maximoHuespedesTeclado = Integer.parseInt(s.nextLine());
                                        System.out.print("Introduce el precio por noche: ");
                                        precioNocheTeclado = Double.parseDouble(s.nextLine());
                                        ownerLogueado.setVivienda(ownerLogueado.crearVivienda(tituloTeclado, localidadTeclado, direccionTeclado, maximoHuespedesTeclado, precioNocheTeclado));
                                        System.out.println("Vivienda creada:");
                                        System.out.println(ownerLogueado.getVivienda());

                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "3": // Eliminar vivienda
                                    if (ownerLogueado.getVivienda() == null)
                                        System.out.println("No hay ninguna vivienda");
                                    else{
                                        ownerLogueado.setVivienda(null);
                                        System.out.println("Vivienda borrada");
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "4": //Editar mis viviendas
                                    do {
                                        System.out.print("""
                                                Modificación de vivienda
                                                1.- Título
                                                2.- Dirección
                                                3.- Número máximo de huéspedes
                                                4.- Precio por noche
                                                5.- Volver al menú de propietario
                                                Elija el campo que quiera modificar: """);
                                        op = s.nextLine();
                                        Utils.limpiarPantalla();
                                        switch (op) {

                                            case "1": // Modificar titulo
                                                System.out.println("Título: " + ownerLogueado.getVivienda().getTitulo());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.getVivienda().setTitulo(nuevoParametro);
                                                System.out.println("Título actualizado: " + ownerLogueado.getVivienda().getTitulo());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "2": // Modificar dirección
                                                System.out.println("Dirección: " + ownerLogueado.getVivienda().getDireccion());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.getVivienda().setDireccion(nuevoParametro);
                                                System.out.println("Dirección actualizada: " + ownerLogueado.getVivienda().getDireccion());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "3": // Modificar número máximo de huéspedes
                                                System.out.println("Número máximo de huéspedes: " + ownerLogueado.getVivienda().getDireccion());
                                                System.out.print("Introduzca nuevo valor: ");
                                                maximoHuespedesTeclado = Integer.parseInt(s.nextLine());
                                                ownerLogueado.getVivienda().setMaximoHuespedes(maximoHuespedesTeclado);
                                                System.out.println("Número máximo de huéspedes actualizado: " + ownerLogueado.getVivienda().getMaximoHuespedes());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "4": // Modificar precio por noche
                                                System.out.println("Precio por noche: " + ownerLogueado.getVivienda().getPrecioNoche());
                                                System.out.print("Introduzca nuevo valor: ");
                                                precioNocheTeclado = Double.parseDouble(s.nextLine());
                                                ownerLogueado.getVivienda().setPrecioNoche(precioNocheTeclado);
                                                System.out.println("Precio por noche actualizado: " + ownerLogueado.getVivienda().getPrecioNoche());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "5": // Volver al menú anterior
                                                Utils.volverMenuAnterior();
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                        }

                                    } while (!op.equals("5"));
                                    break;
                                case "5": //Ver las reservas de mis viviendas
                                    if (ownerLogueado.getVivienda().getReserva1() == null &&
                                            ownerLogueado.getVivienda().getReserva2() == null)
                                        System.out.println("No hay reservas realizadas en la vivienda");
                                    else {
                                        System.out.println("=== RESERVAS ===");
                                        if (ownerLogueado.getVivienda().getReserva1() != null)
                                            System.out.println(ownerLogueado.getVivienda().getReserva1());
                                        if (ownerLogueado.getVivienda().getReserva2() != null)
                                            System.out.println(ownerLogueado.getVivienda().getReserva2());
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "6": // Establecer un periodo de no disponible para una vivienda
                                    do {
                                        System.out.print("""
                                                1.- Establecer un periodo de no disponible
                                                2.- Volver al menú anterior
                                                Elija una opción: """);
                                        op = s.nextLine();
                                        Utils.limpiarPantalla();
                                        switch (op) {
                                            case "1": // Establecer un periodo de no disponible
                                                if (ownerLogueado.getVivienda().getReserva1() != null &&
                                                        ownerLogueado.getVivienda().getReserva2() != null)
                                                    System.out.println("No se puede establecer un periodo de no disponible");
                                                else {
                                                    System.out.print("Introduzca una fecha de incio: ");
                                                    LocalDate fechaInicio = LocalDate.parse(s.nextLine().formatted(formatoFecha), formatoFecha);
                                                    System.out.print("Introduzca una fecha de fin: ");
                                                    LocalDate fechaFin = LocalDate.parse(s.nextLine().formatted(formatoFecha), formatoFecha);
                                                    if (ownerLogueado.getVivienda().getReserva1() == null) {
                                                        ownerLogueado.getVivienda().getReserva1().setFechaEntrada(fechaInicio);
                                                        ownerLogueado.getVivienda().getReserva1().setFechaSalida(fechaFin);
                                                    } else {
                                                        ownerLogueado.getVivienda().getReserva2().setFechaEntrada(fechaInicio);
                                                        ownerLogueado.getVivienda().getReserva2().setFechaSalida(fechaFin);
                                                    }
                                                    System.out.println("Se ha establecido un periodo de no disponibilidad del " +
                                                            fechaInicio + " al " + fechaFin);
                                                }
                                                Utils.pulsaUnaTecla();
                                                break;
                                            case "2": // Volver al menú anterior
                                                Utils.volverMenuAnterior();
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                        }
                                    } while (!op.equals("2"));
                                    break;
                                case "7": // Ver mi perfil
                                    System.out.println(ownerLogueado);
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "8": // Modificar mi perfil
                                    do {
                                        System.out.print("""
                                                Modificación de perfil
                                                1.- Nombre
                                                2.- Apellidos
                                                3.- Email
                                                4.- Nombre de usuario
                                                5.- Contraseña
                                                6.- Volver al menú de propietario
                                                Elija el campo que quiera modificar: """);
                                        op = s.nextLine();
                                        Utils.limpiarPantalla();
                                        switch (op) {
                                            case "1": // Modificar nombre
                                                System.out.println("Nombre: " + ownerLogueado.getNombre());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.setNombre(nuevoParametro);
                                                System.out.println("Nombre actualizado: " + ownerLogueado.getNombre());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "2": // Modificar apellidos
                                                System.out.println("Apellidos: " + ownerLogueado.getApellidos());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.setApellidos(nuevoParametro);
                                                System.out.println("Apellidos actualizados: " + ownerLogueado.getApellidos());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "3": // Modificar email
                                                System.out.println("Email: " + ownerLogueado.getEmail());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.setEmail(nuevoParametro);
                                                System.out.println("Email actualizado: " + ownerLogueado.getEmail());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "4": // Modificar nombre de usuario
                                                System.out.println("Nombre de usuario: " + ownerLogueado.getUserName());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                ownerLogueado.setUserName(nuevoParametro);
                                                System.out.println("Nombre de usuario actualizado: " + ownerLogueado.getUserName());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "5": //Modificar contraseña
                                                String nuevaClave;
                                                do {
                                                    System.out.println("Contraseña: " + ownerLogueado.getClave());
                                                    System.out.print("Introduzca nuevo valor: ");
                                                    nuevoParametro = s.nextLine();
                                                    System.out.print("Introduzca de nuevo la nueva contraseña: ");
                                                    nuevaClave = s.nextLine();
                                                    if (!ownerLogueado.confirmacionNuevaClave(nuevoParametro, nuevaClave))
                                                        System.out.println("Los valores no coinciden");
                                                    else {
                                                        ownerLogueado.setClave(nuevoParametro);
                                                        System.out.println("Contraseña actualizada: " + ownerLogueado.getClave());
                                                    }
                                                } while (!ownerLogueado.confirmacionNuevaClave(nuevoParametro, nuevaClave));
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "6": // Volver al menú anterior
                                                Utils.volverMenuAnterior();
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                        }

                                    } while (!op.equals("6"));
                                    break;
                                case "9": // Cerrar sesión
                                    Utils.cerrarSesion();
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        } while (!opPrincipal.equals("9"));
                    }

                    //Inicio sesión usuario
                    if ((user1 != null && userNameTeclado.equals(user1.getUserName()) && claveTeclado.equals(user1.getClave()))){
                        userLogueado = user1;
                        otroUser = user2;
                    }

                    if ((user2 != null && userNameTeclado.equals(user2.getUserName()) && claveTeclado.equals(user2.getClave()))){
                        userLogueado = user2;
                        otroUser = user1;
                    }

                    if (userLogueado != null) {
                        Utils.iniciarSesion();
                        logueado = true;
                        do {
                            reservaAplicada = false;
                            System.out.println("Bienvenido " + userLogueado.getNombre() + ", busque un alojamiento para sus proximas vacaciones");
                            System.out.println("""
                                    Menu principal
                                    1.- Búsqueda de alojamientos
                                    2.- Ver mis reservas
                                    3.- Cancelar reservas
                                    4.- Ver mi perfil
                                    5.- Modificar mi perfil
                                    6.- Cerrar sesion
                                    """);
                            System.out.print("Elige una opcion: ");
                            opPrincipal = s.next();
                            Utils.limpiarPantalla();
                            switch (opPrincipal) {
                                case "1": //Busqueda de alojamientos
                                    System.out.print("Introduzca una ciudad para buscar: ");
                                    ciudadTeclado = s.nextLine(); // TODO: Error. No permite recoger un valor por teclado
                                    System.out.print("Introduzca una fecha: ");
                                    fechaTeclado = s.nextLine().formatted(formatoFecha);
                                    LocalDate fechaEntrada = LocalDate.parse(fechaTeclado, formatoFecha);
                                    System.out.print("Introduzca números de huéspedes: ");
                                    huespedes = Integer.parseInt(s.nextLine());
                                    System.out.print("Introduzca número de noches de su estancia: ");
                                    noches = Integer.parseInt(s.nextLine());
                                    Utils.limpiarPantalla();

                                    if (v1 != null && !userLogueado.puedeReservar() ||
                                            !userLogueado.getReserva1().getVivienda().coincideCiudad(ciudadTeclado) ||
                                            (!userLogueado.getReserva1().getVivienda().suficientesHuespedes(huespedes)) ||
                                            userLogueado.getReserva1().calculaFechaSalida(fechaEntrada, noches).isBefore(otroUser.getReserva1().getFechaEntrada()) ||
                                            userLogueado.getReserva1().calculaFechaSalida(fechaEntrada, noches).isBefore(otroUser.getReserva2().getFechaEntrada()) &&
                                                    (v2 != null && !userLogueado.puedeReservar() ||
                                                            !userLogueado.getReserva2().getVivienda().coincideCiudad(ciudadTeclado) ||
                                                            (!userLogueado.getReserva2().getVivienda().suficientesHuespedes(huespedes)) ||
                                                            userLogueado.getReserva2().calculaFechaSalida(fechaEntrada, noches).isBefore(otroUser.getReserva1().getFechaEntrada()) ||
                                                            userLogueado.getReserva2().calculaFechaSalida(fechaEntrada, noches).isBefore(otroUser.getReserva2().getFechaEntrada())))
                                        System.out.println("No se encontraron alojamientos disponibles");
                                    else{
                                        if (v1 != null && v1.reservasDisponibles() != 0 && userLogueado.puedeReservar() &&
                                                userLogueado.getReserva1().getVivienda().coincideCiudad(ciudadTeclado) &&
                                                (userLogueado.getReserva1().getVivienda().suficientesHuespedes(huespedes)) &&
                                                userLogueado.getReserva1().calculaFechaSalida(fechaEntrada, noches).isAfter(otroUser.getReserva1().getFechaEntrada()) &&
                                                userLogueado.getReserva1().calculaFechaSalida(fechaEntrada, noches).isAfter(otroUser.getReserva2().getFechaEntrada())){

                                            System.out.println(v1);
                                        }
                                        if (v2 != null && v2.reservasDisponibles() != 0 && userLogueado.puedeReservar() &&
                                                userLogueado.getReserva2().getVivienda().coincideCiudad(ciudadTeclado) &&
                                                (userLogueado.getReserva2().getVivienda().suficientesHuespedes(huespedes)) &&
                                                userLogueado.getReserva2().calculaFechaSalida(fechaEntrada, noches).isAfter(otroUser.getReserva1().getFechaEntrada()) &&
                                                userLogueado.getReserva2().calculaFechaSalida(fechaEntrada, noches).isAfter(otroUser.getReserva2().getFechaEntrada()))
                                            System.out.println(v2);

                                        System.out.print("Introduzca el id de la vivienda que desea reservar: ");
                                        idViviendaTeclado = s.nextLine();
                                        if (!idViviendaTeclado.equals(v1.getIdVivienda()) && !idViviendaTeclado.equals(v2.getIdVivienda()))
                                            System.out.println("Código erróneo");
                                        else{
                                            if (idViviendaTeclado.equals(v1.getIdVivienda())){ // La reserva se aplica a la primera vivienda
                                                idViviendaCorrecto = true;
                                                if (userLogueado.getReserva1() == null && !reservaAplicada){ //Primera reserva de la vivienda libre

                                                    if (!reservaAplicada && r1 == null) { // r1 null
                                                        reservaAplicada = true;
                                                        r1 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva1(r1);
                                                        userLogueado.setReserva1(r1);
                                                        r1.setUsuario(userLogueado);
                                                        r1.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r2 == null) { // r2 null
                                                        reservaAplicada = true;
                                                        r2 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva1(r2);
                                                        userLogueado.setReserva1(r2);
                                                        r2.setUsuario(userLogueado);
                                                        r2.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r3 == null) { // r3 null
                                                        reservaAplicada = true;
                                                        r3 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva1(r3);
                                                        userLogueado.setReserva1(r3);
                                                        r3.setUsuario(userLogueado);
                                                        r3.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r4 == null) { // r4 null
                                                        reservaAplicada = true;
                                                        r4 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva1(r4);
                                                        userLogueado.setReserva1(r4);
                                                        r4.setUsuario(userLogueado);
                                                        r4.setVivienda(v1);
                                                    }
                                                    System.out.println(userLogueado.getReserva1());
                                                }

                                                if (userLogueado.getReserva2() == null && !reservaAplicada){ //Segunda reserva de la vivienda libre

                                                    if (!reservaAplicada && r1 == null) { // r1 null
                                                        reservaAplicada = true;
                                                        r1 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva2(r1);
                                                        userLogueado.setReserva2(r1);
                                                        r1.setUsuario(userLogueado);
                                                        r1.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r2 == null) { // r2 null
                                                        reservaAplicada = true;
                                                        r2 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva2(r2);
                                                        userLogueado.setReserva2(r2);
                                                        r2.setUsuario(userLogueado);
                                                        r2.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r3 == null) { // r3 null
                                                        reservaAplicada = true;
                                                        r3 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva2(r3);
                                                        userLogueado.setReserva2(r3);
                                                        r3.setUsuario(userLogueado);
                                                        r3.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r4 == null) { // r4 null
                                                        reservaAplicada = true;
                                                        r4 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v1.setReserva2(r4);
                                                        userLogueado.setReserva2(r4);
                                                        r4.setUsuario(userLogueado);
                                                        r4.setVivienda(v1);
                                                    }
                                                    System.out.println(userLogueado.getReserva2());
                                                }
                                            }

                                            if (idViviendaTeclado.equals(v2.getIdVivienda())){ // La reserva se aplica a la segunda vivienda
                                                idViviendaCorrecto = true;
                                                if (userLogueado.getReserva1() == null && !reservaAplicada){ //Primera reserva de la vivienda libre

                                                    if (!reservaAplicada && r1 == null) { // r1 null
                                                        reservaAplicada = true;
                                                        r1 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva1(r1);
                                                        userLogueado.setReserva1(r1);
                                                        r1.setUsuario(userLogueado);
                                                        r1.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r2 == null) { // r2 null
                                                        reservaAplicada = true;
                                                        r2 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva1(r2);
                                                        userLogueado.setReserva1(r2);
                                                        r2.setUsuario(userLogueado);
                                                        r2.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r3 == null) { // r3 null
                                                        reservaAplicada = true;
                                                        r3 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva1(r3);
                                                        userLogueado.setReserva1(r3);
                                                        r3.setUsuario(userLogueado);
                                                        r3.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r4 == null) { // r4 null
                                                        reservaAplicada = true;
                                                        r4 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva1(r4);
                                                        userLogueado.setReserva1(r4);
                                                        r4.setUsuario(userLogueado);
                                                        r4.setVivienda(v1);
                                                    }
                                                    System.out.println(userLogueado.getReserva1());
                                                }

                                                if (userLogueado.getReserva2() == null && !reservaAplicada){ //Segunda reserva de la vivienda libre

                                                    if (!reservaAplicada && r1 == null) { // r1 null
                                                        reservaAplicada = true;
                                                        r1 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva2(r1);
                                                        userLogueado.setReserva2(r1);
                                                        r1.setUsuario(userLogueado);
                                                        r1.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r2 == null) { // r2 null
                                                        reservaAplicada = true;
                                                        r2 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva2(r2);
                                                        userLogueado.setReserva2(r2);
                                                        r2.setUsuario(userLogueado);
                                                        r2.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r3 == null) { // r3 null
                                                        reservaAplicada = true;
                                                        r3 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva2(r3);
                                                        userLogueado.setReserva2(r3);
                                                        r3.setUsuario(userLogueado);
                                                        r3.setVivienda(v1);
                                                    }

                                                    if (!reservaAplicada && r4 == null) { // r4 null
                                                        reservaAplicada = true;
                                                        r4 = new Reserva(noches, fechaEntrada, huespedes);
                                                        v2.setReserva2(r4);
                                                        userLogueado.setReserva2(r4);
                                                        r4.setUsuario(userLogueado);
                                                        r4.setVivienda(v1);
                                                    }
                                                    System.out.println(userLogueado.getReserva2());
                                                }
                                            }
                                        }
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "2": //Ver mis reservas
                                    if (userLogueado.getReserva1() == null && userLogueado.getReserva2() == null)
                                        System.out.println("No hay reservas realizadas");
                                    else {
                                        System.out.println("=== RESERVAS ===");
                                        if (userLogueado.getReserva1() != null)
                                            System.out.println(userLogueado.getReserva1());
                                        if (userLogueado.getReserva2() != null)
                                            System.out.println(userLogueado.getReserva2());
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "3": //Cancelar reservas

                                    if (userLogueado.getReserva1() == null && userLogueado.getReserva2() == null)
                                        System.out.println("No hay reservas realizadas");
                                    else {
                                        System.out.print("Introduzca id de su reserva: ");
                                        idReservaTeclado = s.nextLine(); // TODO: Error. No permite recoger un valor por teclado
                                        if (!idReservaTeclado.equals(userLogueado.getReserva1().getIdReserva()) &&
                                                !idReservaTeclado.equals(userLogueado.getReserva2().getIdReserva()))
                                            System.out.println("ID de reserva incorrecto");
                                        else{
                                            if (idReservaTeclado.equals(userLogueado.getReserva1().getIdReserva())){ // Primera reserva del usuario
                                                if (userLogueado.getReserva1().getIdReserva().equals(r1.getIdReserva())) // ocupa r1 en memoria
                                                    r1 = null;
                                                if (userLogueado.getReserva1().getIdReserva().equals(r2.getIdReserva())) // ocupa r2 en memoria
                                                    r2 = null;
                                                if (userLogueado.getReserva1().getIdReserva().equals(r3.getIdReserva())) // ocupa r3 en memoria
                                                    r3 = null;
                                                if (userLogueado.getReserva1().getIdReserva().equals(r4.getIdReserva())) // ocupa r4 en memoria
                                                    r4 = null;

                                                userLogueado.setReserva1(null);
                                            }
                                            if (idReservaTeclado.equals(userLogueado.getReserva2().getIdReserva())){ // Segunda reserva del usuario
                                                if (userLogueado.getReserva2().getIdReserva().equals(r1.getIdReserva())) // ocupa r1 en memoria
                                                    r1 = null;
                                                if (userLogueado.getReserva2().getIdReserva().equals(r2.getIdReserva())) // ocupa r2 en memoria
                                                    r2 = null;
                                                if (userLogueado.getReserva2().getIdReserva().equals(r3.getIdReserva())) // ocupa r3 en memoria
                                                    r3 = null;
                                                if (userLogueado.getReserva2().getIdReserva().equals(r4.getIdReserva())) // ocupa r4 en memoria
                                                    r4 = null;

                                                userLogueado.setReserva2(null);
                                            }

                                            System.out.println("Reserva cancelada");
                                        }
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;

                                case "4": //Ver mi perfil
                                    System.out.println(userLogueado);
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "5": //Modificar mi perfil
                                    do {
                                        System.out.print("""
                                                Modificación de perfil
                                                1.- Nombre
                                                2.- Apellidos
                                                3.- Email
                                                4.- Nombre de usuario
                                                5.- Contraseña
                                                6.- Volver al menú de propietario
                                                Elija el campo que quiera modificar: """);
                                        op = s.nextLine();
                                        Utils.limpiarPantalla();
                                        switch (op) {

                                            case "1": // Modificar nombre
                                                System.out.println("Nombre: " + userLogueado.getNombre());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                userLogueado.setNombre(nuevoParametro);
                                                System.out.println("Nombre actualizado: " + userLogueado.getNombre());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "2": // Modificar apellidos
                                                System.out.println("Apellidos: " + userLogueado.getApellidos());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                userLogueado.setApellidos(nuevoParametro);
                                                System.out.println("Apellidos actualizados: " + userLogueado.getApellidos());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "3": // Modificar email
                                                System.out.println("Email: " + userLogueado.getEmail());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                userLogueado.setEmail(nuevoParametro);
                                                System.out.println("Email actualizado: " + userLogueado.getEmail());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "4": // Modificar nombre de usuario
                                                System.out.println("Nombre de usuario: " + userLogueado.getUserName());
                                                System.out.print("Introduzca nuevo valor: ");
                                                nuevoParametro = s.nextLine();
                                                userLogueado.setUserName(nuevoParametro);
                                                System.out.println("Nombre de usuario actualizado: " + userLogueado.getUserName());
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "5": //Modificar contraseña
                                                String nuevaClave;
                                                do {
                                                    System.out.println("Contraseña: " + userLogueado.getClave());
                                                    System.out.print("Introduzca nuevo valor: ");
                                                    nuevoParametro = s.nextLine();
                                                    System.out.print("Introduzca de nuevo la nueva contraseña: ");
                                                    nuevaClave = s.nextLine();
                                                    if (!userLogueado.confirmacionNuevaClave(nuevoParametro, nuevaClave))
                                                        System.out.println("Los valores no coinciden");
                                                    else {
                                                        userLogueado.setClave(nuevoParametro);
                                                        System.out.println("Contraseña actualizada: " + userLogueado.getClave());
                                                    }
                                                } while (!userLogueado.confirmacionNuevaClave(nuevoParametro, nuevaClave));
                                                Utils.pulsaUnaTecla();
                                                break;

                                            case "6": // Volver al menú anterior
                                                Utils.volverMenuAnterior();
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                        }
                                    } while (!op.equals("6"));
                                    break;
                                case "6": //Cerrar sesión
                                    Utils.cerrarSesion();
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        } while (!opPrincipal.equals("6"));
                    }

                    if (!logueado) System.out.println("Usuario o contraseña incorrectos");
                    break;

                case "2": // Registrarse

                    System.out.print("Introduzca email: ");
                    emailTeclado = s.nextLine();
                    if (emailTeclado.equals("") || (emailTeclado.equals(admin.getEmail())) ||
                            (owner1 != null && emailTeclado.equals(owner1.getEmail())) ||
                            (owner2 != null && emailTeclado.equals(owner2.getEmail())) ||
                            (user1 != null && emailTeclado.equals(user1.getEmail())) ||
                            (user2 != null && emailTeclado.equals(user2.getEmail())))
                        System.out.println("Ya se ha creado una cuenta con este email");
                    else {
                        System.out.print("Introduzca nombre: ");
                        nombreTeclado = s.nextLine();
                        System.out.print("Introduzca apellidos: ");
                        apellidosTeclado = s.nextLine();
                        System.out.print("Introduzca nombre de usuario: ");
                        userNameTeclado = s.nextLine();
                        System.out.print("Introduzca contraseña: ");
                        claveTeclado = s.nextLine();
                        do {
                            System.out.print("""
                                    1.- Propietario
                                    2.- Usuario
                                    Introduzca el perfil que desea sea su cuenta: """);
                            funcionTeclado = s.nextLine();
                            switch (funcionTeclado) {
                                case "1":
                                    if (owner1 != null && owner2 != null)
                                        System.out.println("No pueden crearse más perfiles de propietario");
                                    else {
                                        System.out.println("Perfil de propietario creado:");
                                        if (owner1 == null) {
                                            owner1 = new Propietario(nombreTeclado, apellidosTeclado, emailTeclado, userNameTeclado, claveTeclado);
                                            System.out.println(owner1);
                                        } else {
                                            owner2 = new Propietario(nombreTeclado, apellidosTeclado, emailTeclado, userNameTeclado, claveTeclado);
                                            System.out.println(owner2);
                                        }
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                case "2":
                                    if (user1 != null && user2 != null)
                                        System.out.println("No pueden crearse más perfiles de usuario");
                                    else {
                                        System.out.println("Perfil de usuario creado:");
                                        if (user1 == null) {
                                            user1 = new Usuario(nombreTeclado, apellidosTeclado, emailTeclado, userNameTeclado, claveTeclado);
                                            System.out.println(user1);
                                        } else {
                                            user2 = new Usuario(nombreTeclado, apellidosTeclado, emailTeclado, userNameTeclado, claveTeclado);
                                            System.out.println(user2);
                                        }
                                    }
                                    Utils.pulsaUnaTecla();
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        } while (!funcionTeclado.equals("1") && !funcionTeclado.equals("2"));
                    }

                    break;
                case "3": //Apagar
                    Utils.apagarApp();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!opInicial.equals("3"));
    }
}
