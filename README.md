# FernanBnB Tema 3 José Ángel Soriano & David García
<h1>Índice</h1>
    <ol>
    <li><a href="#1">Introducción</a></li>
    <li><a href="#2">Instalación</a></li>
        <li>
            <a href="#3">Menú principal</a>
            <ol>
                <li><a href="#4">Registrarse</a></li>
                <li>
                    <a href="#5">Iniciar sesión</a>
                    <ul>
                        <li>
                            <a href="#6">Perfil de propietario</a>
                            <ol>
                                <li><a href="#7">Ver viviendas en alquiler</a></li>
                                <li><a href="#8">Añadir una vivienda</a></li>
                                <li><a href="#9">Eliminar una vivienda</a></li>
                                <li><a href="#10">Editar viviendas</li>
                                <li><a href="#11">Ver reservas de viviendas</li>
                                <li><a href="#12">Establecer periodo de no disponible para una vivienda</li>
                                <li><a href="#13">Ver datos del perfil</li>
                                <li><a href="#14">Modificar datos del perfil</li>
                                <li><a href="#15">Cerrar sesión</li>
                            </ol>
                        </li>
                        <li>
                            <a href="#16">Perfil de usuario
                            <ol>
                                <li><a href="#17">Buscar alojamientos</li>
                                <li><a href="#18">Ver reservas realizadas</li>
                                <li>Cancelar reservas <em>Pendiente</em></li>
                                <li><a href="#19">Ver datos del perfil</li>
                                <li><a href="#19">Modificar datos del perfil</li>
                                <li><a href="#19">Cerrar sesión</li>
                            </ol>
                        </li>
                        <li>
                            <a href="#20">Perfil de administrador
                            <ol>
                                <li><a href="#21">Ver todas las viviendas en alquiler</li>
                                <li><a href="#22">Ver todos los usuarios</li>
                                <li><a href="#23">Ver todas las reservas</li>
                                <li><a href="#24">Ver datos del perfil</li>
                                <li><a href="#24">Modificar datos del perfil</li>
                                <li><a href="#24">Cerrar sesión</li>
                            </ol>
                        </li>
                    </ul>
                </li>
                <li><a href="#25">Apagar</li>
            </ol>
        </li>
    </ol>
    <br>
    <a id="1">
    <h1>Introducción</h1>
    <p>Presentamos la primera versión de FernanBnB, un programa que busca acercarse al funcionamiento básico de una web
        o app para gestionar el alquiler de viviendas.</p>
    <p>Para agilizar las pruebas realizadas sobre el programa, se han establecido algunos datos por defecto: </p>
    <ul>
        <li>Un perfil de administrador con nombre de usuario "juanga" y contraseña "1234"</li>
        <li>Un perfil como propietario con nombre de usuario "pablez" y contraseña "5678", el cual contará con una
            vivienda registrada</li>
        <li>Un perfil como usuario con nombre de usuario "evavarro" y contraseña "9123", el cual contará con una reserva
            asignada a la vivienda previamente registrada</li>
    </ul>
    <br>
    <a id="2">
    <h1>Instalación</h1>
    <p>Después de descargar la carpeta del programa, debemos asegurarnos de tener instalada alguna versión de Java para
        que pueda funcionar. Después, haremos doble click en el archivo "arranquePrograma" que se encuentra en la
        carpeta e iniciará el programa</p>
    <a id="3">    
    <h1>Menú principal</h1>
    <p>Al inciar el programa, nos encotraremos con el menú principal, en el que seleccionaremos las opciones deseadas
        tecleando el número correspondiente</p>
    <p><img src="practicaTema3/capturasPantalla/menuPrincipal.png"></p>
    <a id="4">    
    <h2>Registrarse</h2>
    <p>En esta sección, podremos registrarnos mediante una dirección e-mail que se haya registrado previamente.</p>
    <p>Una vez comprobado que el e-mail introducido no está registrado con anterioridad, deberemos introducir los
        siguientes datos:</p>
    <p><img src="practicaTema3/capturasPantalla/registro1.png"></p>
    <p>A continuación, elegiremos la función que tendrá el perfil. De ambas opciones, solo podrá haber dos perfiles
        registrados de cada tipo</p>
    <p><img src="practicaTema3/capturasPantalla/registro2.png"></p>
    <p>Una vez elegida, se nos mostrará el perfil creado, con un código generado y asociado al perfil</p>
    <p><img src="practicaTema3/capturasPantalla/registro3.png"></p>
    <br>
    <a id="5">    
    <h2>Inciciar sesión</h2>
    <p>Al elegir esta opción podremos iniciar sesión en nuestro perfil. Para ello, deberemos introducir nuestro nombre
        de usuario ("pablez") y contraseña ("5678")</p>
    <p><img src="practicaTema3/capturasPantalla/inicioSesion.png"></p>
    <a id="6">    
    <h3>Perfil de propietario</h3>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario1.png"></p>
    <br>
    <a id="7">    
    <h3>Ver viviendas en alquiler</h3>
    <p>Si el propietario tiene registrado una vivienda, este podrá ver los datos de esta</p>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario2.png"></p>
    <br>
    <a id="8">
    <h3>Añadir una vivienda</h3>
    <p>Aquí podremos registrar una vivienda rellenando estos datos. <strong>UN PROPIETARIO SOLO PUEDE TENER REGISTRADA
            UNA VIVIENDA</strong></p>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario3.png"></p>
    <br>
    <a id="9">    
    <h3>Eliminar una vivienda</h3>
    <p>Si el usuario tiene registrada una vivienda, está será borrada</p>
    <br>
    <a id="10">    
    <h3>Editar una vivienda</h3>
    <p>Aquí podremos modificar los mismos datos que introdujimos al crear la vivienda</p>
    <br>
    <a id="11">
    <h3>Ver reservas de la vivienda</h3>
    <p>Muestra las reservas aplicadas a dicha vivienda (máximo 2)</p>    
    <a id="12">    
    <h3>Establecer un periodo de no disponible para una vivienda</h3>
    <p>Aquí deberemos asignar una fecha de inicio (con formato dd/mm/yyyy) y un número de noches para crear una reserva propia para la
        vivienda. Si dicha vivienda ya tiene dos reservas, no podrá realizarse otra más</p>
        <p><img src="practicaTema3/capturasPantalla/menuPropietario6.png"></p>
        <p><img src="practicaTema3/capturasPantalla/menuPropietario7.png"></p>
    <br>
    <a id="13">    
    <h3>Ver mi perfil</h3>
    <p>Aquí podemos ver la información del perfil</p>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario4.png"></p>
    <br>
    <a id="14">    
    <h3>Modificar mi perfil</h3>
    <p>Aquí podemos modificar los distintos datos del perfil</p>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario5.png"></p>
    <br>
    <a id="15">    
    <h3>Cerrar sesión</h3>
    <p>Cierra la sesión y vuelve al menú principal</p>
    <br>
    <a id="16">    
    <h3>Perfil de usuario</h3>
    <p><img src="practicaTema3/capturasPantalla/menuUsuario1.png"></p>
    <br>
    <a id="17">    
    <h3>Búsqueda de alojamientos <em>Pendiente</em></h3>
    <p>En esta opción buscaremos alojamientos que estén libres introduciendo la localidad, fecha de entrada, número de
        huéspedes y las noches de estancia, con la que sabremos la fecha de salida y el precio total</p>
    <br>
    <a id="18">    
    <h3>Ver mis reservas <em>TODO</em></h3>
    <p>Aquí podemos ver las reservas que hemos realizado (máximo 2)</p>
    <p><img src="practicaTema3/capturasPantalla/menuUsuario2.png"></p>
    <br>
    <a id="19">    
    <h3>Tanto la opción de ver el perfil, modificar perfil y cerrar sesión son las mismas que en el anterior menú</h3>
    <br>
    <a id="20">    
    <h3>Perfil de administrador</h3>
    <p><img src="practicaTema3/capturasPantalla/menuAdmin1.png"></p>
    <br>
    <a id="21">    
    <h3>Ver todas las viviendas en alquiler</h3>
    <p>Muestra todas las viviendas registradas (máximo 2)</p>
    <p><img src="practicaTema3/capturasPantalla/menuPropietario2.png"></p>
    <br>
    <a id="22">        
    <h3>Ver todos los perfiles</h3>
    <p>Muestra todas los perfiles registrados (máximo 2 usuarios y 2 propietarios)</p>
    <p><img src="practicaTema3/capturasPantalla/menuAdmin2.png"></p>
    <br>
    <a id="23">        
    <h3>Ver todas las reservas del sistema</h3>
    <p>Muestra las reservas realizadas actualmente (máximo 2 por vivienda)</p>
    <p><img src="practicaTema3/capturasPantalla/menuAdmin3.png"></p>
    <br>
    <a id="24">        
    <h3>Tanto la opción de ver el perfil, modificar perfil y cerrar sesión son las mismas que en los demás perfiles</h3>
    <br>
    <a id="25">    
    <h2>Apagar</h2>
    <p>Apaga el programa por completo</p>
