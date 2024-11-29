# Proyecto-2-Cursos-de-capacitacion
Proyecto # 2 de la materia de Programacion II. Se realiza un sistema de gestion de cursos de capacitacion con Java.
# DESCRIPCION
el siguiente proyecto es un Sistema de Gestión de Cursos que utiliza una interfaz gráfica y está respaldado por una base de datos para almacenar y gestionar información de manera eficiente de los usuarios como estudiantes, docentes y trabajadores. El sistema está diseñado para facilitar la administración de cursos, estudiantes, maestros y trabajadores, proporcionando una experiencia intuitiva y completa.
# Funcionalidades principales
El programa cotiene una interfaz grafica con menu intuitivo en el que nos da las sig opciones: ver curso,  crear nuevo curso, ver registro de personas, añadir o editar usuarios. a continuacion se explicara el funcionamiento de cada una de las funciones
1.VER CUROS: En esta ventana nos muestra los cursos que seleccionesmos de nuestra base de datos con dos tablas, una donde estan los horarios del curso seleccionado, mientras que al otro lado tenemos una tabla con datos como paralelo, costo, cupos, docente, modalidad, etc. 
2.CREAR NUEVO CURSO: En esta vetna nos aparecen los datos a añadir como: paralelo, costo, cupos, docente y modalidad, despues de llenar y poner los datos correcto tal y como nos piden podremos ver otra ventana de horario, donde en esta veremos  los horarios disponibles en una tabla con dias y horas, al poner aceptar esta guardara los datos y los enviara a la base de datos
3.VER REGISTRO DE PERSONAS: En esta ventana tendremos un panel en la parte superior donde podremos seleccionar que de que tipo de usuario veremos los datos(sacados de la base de datos), al seleccionarlo tendremos una tabla con los datos de todos los usuarios seleccionados, con datos como por ejemplo: nombre, apellido, telefono, correo, ci, etc.
.AÑADIR O EDITAR USUARIO: En esta parte tendremos una ventana con dos opciones, una con la opcion de añadir estudiantes y la otra con la opcion de añadir trabajadores, la diferenecia entre ambas es que en estudiantes pediremos edad, mientras que en trabajadores pediremos tipo de trabajador y sueldo, cada uno de los datos tiene restricciones para que los datos se ingresen correctamente, como por ejemplo pide que se llenen todos antes de guardarlos, tambien de que variables como ci y telefono esten en en tipo entero, o que el correo tenga un fromato @gmail.com, etc.

# INSTALACION
1. Clona este repositorio: `git clone https://github.com/usuario/proyecto-cursos.git`
2. Abre el proyecto en tu IDE preferido (NetBeans, IntelliJ, Eclipse, etc.).
3. Asegúrate de tener instalado Java 8 o superior.
4. Ejecuta la clase principal para iniciar el programa.
# USO
1. Selecciona un curso del menú desplegable.
2. Observa los detalles del curso y el horario.
3. Administra los datos según sea necesario.
