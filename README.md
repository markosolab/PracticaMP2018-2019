# PracticaMP2018-2019
Realizada por:
  - MARKOS AGUIRRE ELORZA
  - IVÁN MARTÍN GÓMEZ
  


Práctica MP del curso 2018-2019 que incluye:
  - README (EL PRESENTE DOCUMENTO)
  - SRS
  - APP (programas realizados con POO utilizando los patrones MVC con Observer)

JUEGO DE LA SERPIENTE:
  ESTE JUEGO ES MUY PARECIDO AL DESARROLLADO POR NOKIA EN SUS DISPOSITIVOS.
  EL JUEGO CONSISTE EN MOVER UNA SERPIENTE POR LA PANTALLA Y COMERSE LA FRUTA QUE APAREZCA, DE FORMA QUE SEGÚN MÁS FRUTA SE     COMA LA SERPIENTE MÁS GRANDE SE IRA HACIENDO. EL JUEGO FINALIZARA CUANDO LA SERPIENTE CHOQUE CON UNA DE LAS 4 PAREDES DE LA   PANTALLA O CON ELLA MISMA.
  
INSTRUCIONES:

  # PARA ARRANCAR LA APLICACIÓN SERÁ NECESARIO HACERLO DESDE LA CLASE SerpienteMP20182019 SITUADA EN EL PAQUETE MAIN
  # (SRC>MAIN>SerpienteMP20182019)
  
  
  ANTES DE EMPEZAR A JUGAR, EL JUGADOR DEBERÁ INTRODUCIR SU NOMBRE EN LA CASILLA HABILITADA. EL NOMBRE DEL JUGADOR NO PODRÁ     SER USADO POR DOS JUGADORES AL MISMO TIEMPO.
    
  ADEMAS DEL NOMBRE EL JUGADOR DEBERÁ ESCOGER UN COLOR DE SERPIENTE QUE TAMPOCO PODRÁ COINCIDIR CON UN COLOR YA ESCOGIDO         POR OTRO JUGADOR.
    
  EL JUGADOR DISPONE DE 4 TECLAS PARA MOVER A LA SERPIENTE EN LAS 4 DIRCCIONES (NORTE, SUR, ESTE, OESTE). ADEMÁS DE LAS 4       TECLAS EN LA PANTALLA EL JUGADOR PODRÁ HACER USO DE LAS 4 FLECHAS DEL TECLADO PARA MOVER LA SERPIENTE.
  
  LOS JUGADORES DISPONDRAN DE UNA VENTANA EN LA UE SE MOSTRARA SU SITUACIÓN EN LA PARTIDA.

 MODO MULTIJUGADOR:
  POR DEFECTO EL JUEGO ESTA DISPONIBLE EN MODO MULTIJUGADOR. APARECERAN 4 VENTANAS (2 PARA MOSTRAS A LAS SERPIENTES Y LOS       CONTROLES DE CADA UNO DE LOS JUGADORES Y DOS PANTALLAS MÁS PARA MOSTRAR LAS PUNTUACIONES DE CADA UNO DE LOS JUGADORES)
  
  PARA DEHABILITAR EL MODO MULTIJUGADOR HAY QUE IR A LA CLASE MAIN DEL CÓDIGO Y COMENTAR LAS SIGUIENTES LINEAS DEL CÓDIGO:
  
                    VentanaSecundaria ventanaPuntuacion2 = new VentanaSecundaria(2);
                    VentanaPrincipal ventanaPrincipal2 = new VentanaPrincipal(2,controlador, ALTURA_TABLERO,                                                                                                 ANCHURA_TABLERO,VELOCIDAD_SERPIENTE);
                    modelo.addObserver(ventanaPuntuacion2);  
                    modelo.addObserver(ventanaPrincipal2); 
                    ventanaPuntuacion2.setVisible(true);
                    ventanaPrincipal2.setVisible(true);




