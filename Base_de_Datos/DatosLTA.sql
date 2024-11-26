-- DROP TABLE IF EXISTS aula;
/*CREATE TABLE aula (
  id_aula int(11) NOT NULL AUTO_INCREMENT,
  nombre_aula varchar(50) NOT NULL,
  capacidad int(11) NOT NULL,
  disponibilidad tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (id_aula)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES aula WRITE;

UNLOCK TABLES;
INSERT INTO aula (nombre_aula, capacidad, disponibilidad) VALUES
('Aula f1', 30, TRUE),
('Aula f2', 35, TRUE),
('Aula f3', 20, TRUE),
('Aula f4', 35, TRUE),
('Aula f5', 20, TRUE),
('Aula f6', 25, TRUE),
('Laboratorio 001', 20, TRUE),
('Laboratorio 002', 20, TRUE),
('Auditorio', 100, TRUE);

-- DROP TABLE IF EXISTS hora;
/*CREATE TABLE hora (
  id_hora int(11) NOT NULL,
  dia enum('L','M','X','J','V','S') NOT NULL,
  hora_inicio time NOT NULL,
  hora_fin time NOT NULL,
  PRIMARY KEY (id_hora)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES hora WRITE;

UNLOCK TABLES;
INSERT INTO hora (id_hora, dia, hora_inicio, hora_fin) VALUES
(1, 'L', '07:00:00', '08:40:00'),
(2, 'L', '08:55:00', '10:35:00'),
(3, 'L', '10:50:00', '12:30:00'),
(4, 'L', '12:45:00', '14:25:00'),
(5, 'L', '14:40:00', '16:20:00'),
(6, 'L', '16:35:00', '18:15:00'),
(7, 'L', '18:30:00', '20:10:00'),

(8, 'M', '07:00:00', '08:40:00'),
(9, 'M', '08:55:00', '10:35:00'),
(10, 'M', '10:50:00', '12:30:00'),
(11, 'M', '12:45:00', '14:25:00'),
(12, 'M', '14:40:00', '16:20:00'),
(13, 'M', '16:35:00', '18:15:00'),
(14, 'M', '18:30:00', '20:10:00'),

(15, 'X', '07:00:00', '08:40:00'),
(16, 'X', '08:55:00', '10:35:00'),
(17, 'X', '10:50:00', '12:30:00'),
(18, 'X', '12:45:00', '14:25:00'),
(19, 'X', '14:40:00', '16:20:00'),
(20, 'X', '16:35:00', '18:15:00'),
(21, 'X', '18:30:00', '20:10:00'),

(22, 'J', '07:00:00', '08:40:00'),
(23, 'J', '08:55:00', '10:35:00'),
(24, 'J', '10:50:00', '12:30:00'),
(25, 'J', '12:45:00', '14:25:00'),
(26, 'J', '14:40:00', '16:20:00'),
(27, 'J', '16:35:00', '18:15:00'),
(28, 'J', '18:30:00', '20:10:00'),

(29, 'V', '07:00:00', '08:40:00'),
(30, 'V', '08:55:00', '10:35:00'),
(31, 'V', '10:50:00', '12:30:00'),
(32, 'V', '12:45:00', '14:25:00'),
(33, 'V', '14:40:00', '16:20:00'),
(34, 'V', '16:35:00', '18:15:00'),
(35, 'V', '18:30:00', '20:10:00'),

(29, 'S', '07:00:00', '08:40:00'),
(30, 'S', '08:55:00', '10:35:00'),
(31, 'S', '10:50:00', '12:30:00'),
(32, 'S', '12:45:00', '14:25:00'),
(33, 'S', '14:40:00', '16:20:00'),
(34, 'S', '16:35:00', '18:15:00'),
(35, 'S', '18:30:00', '20:10:00');

-- DROP TABLE IF EXISTS tipo_empleo;
/*CREATE TABLE tipo_empleo (
  id_tipo_empleo int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  nivel int(11) NOT NULL,
  PRIMARY KEY (id_tipo_empleo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES tipo_empleo WRITE;

UNLOCK TABLES;
INSERT TO tipo_empleo (nombrem ,nivel)VALUES

('Director General', 1),        -- Director General
('Subdirector', 2),             -- Subdirecto
('Coordinador', 3),             -- Coordinador 
('Jefe de Departamento', 4),    -- Jefe de un departamento
('Profesor', 5),                -- Docente
('secretario', 6),              -- Secretario
('Empleado de Oficina', 7),     -- Empleado normal
('Técnico', 8),                 -- Técnico 
('Operativo', 9),               -- Empleado operativo
('Personal de Limpieza', 10);    -- Personal de limpieza

-- DROP TABLE IF EXISTS empleado;
/*CREATE TABLE empleado (
  id_empleado int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  ci varchar(10) NOT NULL,
  fecha_nacimiento date NOT NULL,
  telefono varchar(15) NOT NULL,
  email varchar(100) NOT NULL,
  fecha_registro date DEFAULT NULL,
  sueldo double(10,2) NOT NULL,
  ubicacion varchar(100) NOT NULL,
  experiencia text NOT NULL,
  detalles text NOT NULL,
  tipo_empleo_id int(11) NOT NULL,
  PRIMARY KEY (id_empleado),
  UNIQUE KEY ci (ci),
  UNIQUE KEY email (email),
  FOREIGN KEY (tipo_empleo_id) REFERENCES tipo_empleo (id_tipo_empleo) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES empleado WRITE;

UNLOCK TABLES;
NSERT INTO mpleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Carlos', 'Vargas', 'Hernandez', '123456789', '1980-03-14', '987654380', 'carlos.vargas@gmail.com', 5000.00, 'Oficina Central', 'Más de 15 años de experiencia en gestión administrativa', 'Experto en planificación y gestión de proyectos', 1), -- Director General
('María', 'Gonzalez', 'Lopez', '987654321', '1985-07-22', '987654381', 'maria.gonzalez@gmail.com', 4500.00, 'Oficina Central', '10 años de experiencia en liderazgo', 'Experta en la dirección de equipos', 2), -- Subdirector
('Roberto', 'Calle', 'Morales', '852963741', '1990-02-10', '987654382', 'roberto.calle@gmail.com', 4000.00, 'Aula 1', '6 años de experiencia como coordinador', 'Responsable de la coordinación de cursos y recursos', 3), -- Coordinador
('Ana', 'Mendoza', 'Castro', '741258963', '1992-05-15', '987654383', 'ana.mendoza@gmail.com', 3500.00, 'Aula 2', '5 años de experiencia en gestión de equipos', 'Gestión y supervisión de la enseñanza en el aula', 4), -- Jefe de Departamento
('Pedro', 'Rodriguez', 'Moreno', '753159258', '1995-06-28', '987654385', 'pedro.rodriguez@gmail.com', 2800.00, 'Oficina Central', '3 años de experiencia en administración', 'Encargado de gestionar la oficina administrativa', 6), -- Secretario
('Laura', 'Castillo', 'Gomez', '258963147', '1994-12-01', '987654386', 'laura.castillo@gmail.com', 2800.00, 'Oficina Central', '2 años de experiencia en soporte administrativo', 'Encargada de la atención al cliente y gestión de documentos', 7), -- Empleado de Oficina
('David', 'Ríos', 'Serrano', '963741852', '1996-03-30', '987654387', 'david.rios@gmail.com', 3200.00, 'Aula 4', '4 años de experiencia en informática', 'Especialista en recursos tecnológicos para clases en línea', 8), -- Técnico
('Juan', 'Pérez', 'Martinez', '456789321', '1988-11-18', '987654388', 'juan.perez@gmail.com', 2700.00, 'Aula 5', '5 años de experiencia en logística', 'Encargado de apoyar en la organización de eventos y recursos', 9), -- Operativo
('Sandra', 'Hernandez', 'Morales', '159753369', '1997-02-02', '987654389', 'sandra.hernandez@gmail.com', 2200.00, 'Oficina Central', '3 años de experiencia en limpieza de oficinas', 'Encargada de mantener la limpieza de los espacios comunes', 10), -- Personal de Limpieza
('Carlos', 'Ruiz', 'Alvarez', '963852741', '1992-04-07', '987654390', 'carlos.ruiz@gmail.com', 3300.00, 'Aula 6', '7 años de experiencia en coordinación de proyectos', 'Responsable de organizar cursos y recursos para los docentes', 3), -- Coordinador
('Felipe', 'Martinez', 'Torres', '852741963', '1989-01-15', '987654392', 'felipe.martinez@gmail.com', 3700.00, 'Oficina Central', '6 años de experiencia en recursos humanos', 'Encargado de la gestión y contratación de personal', 2), -- Subdirector
('Mariana', 'Lopez', 'Rodriguez', '951753852', '1996-10-09', '987654393', 'mariana.lopez@gmail.com', 2800.00, 'Oficina Central', '2 años de experiencia como secretaria', 'Apoyo administrativo general y gestión de eventos', 6), -- Secretaria
('Esteban', 'Gutierrez', 'Hernandez', '159753258', '1991-12-03', '987654394', 'esteban.gutierrez@gmail.com', 4000.00, 'Aula 8', '5 años de experiencia en tecnología educativa', 'Desarrollo de contenido educativo digital y gestión de cursos en línea', 8); -- Técnico
-- Profesores para Matemáticas
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Carlos', 'Pérez', 'Sánchez', '12345678', '1980-05-12', '789654123', 'carlos.perez@gmail.com', 3500.00, 'La Paz', '10 años enseñando cálculo', 'Cálculo Diferencial', 5),
('Ana', 'López', 'Ramírez', '23456789', '1985-09-24', '654321987', 'ana.lopez@gmail.com', 3400.00, 'Cochabamba', 'Especialista en integración', 'Cálculo Integral', 5),
('Luis', 'Ramírez', 'Quispe', '34567890', '1990-08-15', '963852741', 'luis.ramirez@gmail.com', 3300.00, 'Sucre', 'Experto en probabilidad', 'Probabilidades y Estadística', 5);

-- Profesores para Física
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Javier', 'Rodríguez', 'García', '45678901', '1982-02-10', '987456321', 'javier.rodriguez@gmail.com', 3600.00, 'Santa Cruz', 'Experiencia en termodinámica avanzada', 'Termodinámica', 5),
('María', 'Gómez', 'Alvarado', '56789012', '1988-11-15', '123654789', 'maria.gomez@gmail.com', 3500.00, 'Tarija', 'Física aplicada a la óptica', 'Óptica', 5);

-- Profesores para Química
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Fernando', 'Jiménez', 'Hernández', '67890123', '1983-03-07', '789123654', 'fernando.jimenez@gmail.com', 3400.00, 'Potosí', 'Doctorado en físicoquímica', 'Físicoquímica', 5),
('Lucía', 'Martínez', 'Fernández', '78901234', '1990-07-19', '456987123', 'lucia.martinez@gmail.com', 3300.00, 'Oruro', 'Química orgánica avanzada', 'Química Orgánica', 5);

-- Profesores para Programación
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Diego', 'Torres', 'Rojas', '89012345', '1986-01-25', '321789654', 'diego.torres@gmail.com', 3200.00, 'La Paz', 'Instructor de Python básico', 'Python Básico', 5),
('Elena', 'Castro', 'Morales', '90123456', '1992-12-03', '159753486', 'elena.castro@gmail.com', 3100.00, 'Cochabamba', 'Desarrolladora experta en Python', 'Python Avanzado', 5);

-- Profesores para Diseño Gráfico
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Andrés', 'Salazar', 'Gutiérrez', '12389045', '1987-04-15', '987654321', 'andres.salazar@gmail.com', 3100.00, 'Santa Cruz', 'Certificado en Illustrator avanzado', 'Illustrator Avanzado', 5),
('Laura', 'Fernández', 'Ramos', '23456098', '1993-11-10', '654789321', 'laura.fernandez@gmail.com', 3000.00, 'Tarija', 'Especialista en edición de video', 'Edición de Video', 5);

-- Profesores para Historia
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Jorge', 'Navarro', 'López', '34567089', '1975-09-18', '123789654', 'jorge.navarro@gmail.com', 3200.00, 'La Paz', 'Historiador especializado en historia universal', 'Historia Universal', 5),
('Claudia', 'Vargas', 'Alonso', '45678923', '1985-06-22', '456987123', 'claudia.vargas@gmail.com', 3100.00, 'Sucre', 'Doctora en historia contemporánea', 'Historia Contemporánea', 5);

-- Profesores para Literatura
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Sofía', 'Méndez', 'Hurtado', '56789032', '1990-07-11', '789123456', 'sofia.mendez@gmail.com', 3400.00, 'Cochabamba', 'Crítica de literatura clásica', 'Literatura Clásica', 5),
('Héctor', 'Ortega', 'Campos', '67890145', '1982-03-08', '987321654', 'hector.ortega@gmail.com', 3300.00, 'La Paz', 'Especialista en literatura moderna', 'Literatura Moderna', 5);

-- Profesores para Economía
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Pablo', 'Quintero', 'Jiménez', '78901234', '1980-05-20', '654321789', 'pablo.quintero@gmail.com', 3500.00, 'Santa Cruz', 'Profesor de microeconomía', 'Microeconomía', 5),
('Daniela', 'Ríos', 'Salinas', '89012345', '1986-09-12', '321987654', 'daniela.rios@gmail.com', 3400.00, 'La Paz', 'Experta en macroeconomía', 'Macroeconomía', 5);

-- Profesores para Derecho
INSERT INTO Empleado (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES
('Francisco', 'Molina', 'Cruz', '90123456', '1981-12-05', '159357486', 'francisco.molina@gmail.com', 3600.00, 'Cochabamba', 'Especialista en derecho constitucional', 'Derecho Constitucional', 5),
('Gabriela', 'Ramos', 'Ortiz', '01234567', '1989-10-16', '753159486', 'gabriela.ramos@gmail.com', 3500.00, 'Tarija', 'Doctora en derecho penal', 'Derecho Penal', 5);

-- DROP TABLE IF EXISTS estudiante;
/*CREATE TABLE estudiante (
  id_estudiante int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  ci varchar(10) NOT NULL,
  fecha_nacimiento date NOT NULL,
  telefono varchar(15) NOT NULL,
  email varchar(100) NOT NULL,
  edad int(11) NOT NULL,
  fecha_registro date DEFAULT NULL,
  inscrito tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (id_estudiante),
  UNIQUE KEY ci (ci),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES estudiante WRITE;

UNLOCK TABLES;
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci, fecha_nacimiento, telefono, email, edad, fecha_inscripcion, estado_inscripcion) VALUES
('Juan', 'Perez', 'Lopez', '123456789', '2000-01-15', '987654321', 'juan.perez@gmail.com', 24, '2024-11-20', TRUE),
('Maria', 'Gomez', 'Fernandez', '987654321', '1998-05-22', '987654322', 'maria.gomez@gmail.com', 26, '2024-11-19', TRUE),
('Carlos', 'Rodriguez', 'Martinez', '135792468', '2001-03-10', '987654323', 'carlos.rodriguez@gmail.com', 23, '2024-11-18', TRUE),
('Ana', 'Sanchez', 'Ramirez', '246813579', '1997-12-05', '987654324', 'ana.sanchez@gmail.com', 27, '2024-11-17', TRUE),
('Pedro', 'Hernandez', 'Diaz', '369258147', '2000-07-30', '987654325', 'pedro.hernandez@gmail.com', 24, '2024-11-16', TRUE),
('Laura', 'Martinez', 'Vazquez', '468135792', '1999-09-11', '987654326', 'laura.martinez@gmail.com', 25, '2024-11-15', TRUE),
('Luis', 'Lopez', 'Garcia', '579135246', '2002-02-03', '987654327', 'luis.lopez@gmail.com', 22, '2024-11-14', TRUE),
('Isabel', 'Perez', 'Soto', '684213579', '1998-06-17', '987654328', 'isabel.perez@gmail.com', 26, '2024-11-13', TRUE),
('Ricardo', 'Santiago', 'Salazar', '791246835', '2000-04-21', '987654329', 'ricardo.santiago@gmail.com', 24, '2024-11-12', TRUE),
('Marta', 'Gonzalez', 'Castillo', '852963741', '2001-01-09', '987654330', 'marta.gonzalez@gmail.com', 23, '2024-11-11', TRUE),
('Jose', 'Ruiz', 'Moreno', '963741258', '1997-08-20', '987654331', 'jose.ruiz@gmail.com', 27, '2024-11-10', TRUE),
('Lucia', 'Flores', 'Cabrera', '741258963', '1999-11-30', '987654332', 'lucia.flores@gmail.com', 25, '2024-11-09', TRUE),
('Andres', 'Alvarez', 'Munoz', '123456987', '2000-05-15', '987654333', 'andres.alvarez@gmail.com', 24, '2024-11-08', TRUE),
('Patricia', 'Jimenez', 'Paredes', '987654123', '1998-02-17', '987654334', 'patricia.jimenez@gmail.com', 26, '2024-11-07', TRUE),
('Fernando', 'Diaz', 'Blanco', '456789123', '2001-06-14', '987654335', 'fernando.diaz@gmail.com', 23, '2024-11-06', TRUE),
('Sandra', 'Mendoza', 'Lopez', '159753486', '2002-12-09', '987654336', 'sandra.mendoza@gmail.com', 22, '2024-11-05', TRUE),
('Miguel', 'Rojas', 'Torres', '258963147', '1999-03-25', '987654337', 'miguel.rojas@gmail.com', 25, '2024-11-04', TRUE),
('Beatriz', 'Ruiz', 'Gonzalez', '753159258', '2000-10-04', '987654338', 'beatriz.ruiz@gmail.com', 24, '2024-11-03', TRUE),
('Oscar', 'Lopez', 'Perez', '369258741', '1997-12-16', '987654339', 'oscar.lopez@gmail.com', 27, '2024-11-02', TRUE),
('Raul', 'Jimenez', 'Vega', '741852963', '2001-07-22', '987654340', 'raul.jimenez@gmail.com', 23, '2024-11-01', TRUE),
('Elena', 'Mora', 'Hernandez', '258741369', '1998-04-12', '987654341', 'elena.mora@gmail.com', 26, '2024-10-31', TRUE),
('Diego', 'Salazar', 'Ruiz', '159753486', '2000-08-23', '987654342', 'diego.salazar@gmail.com', 24, '2024-10-30', TRUE),
('Sara', 'Lozano', 'Jimenez', '258963741', '1997-11-18', '987654343', 'sara.lozano@gmail.com', 27, '2024-10-29', TRUE),
('Antonio', 'Cabrera', 'Gomez', '987123654', '2001-03-19', '987654344', 'antonio.cabrera@gmail.com', 23, '2024-10-28', TRUE),
('Cristina', 'Gonzalez', 'Sanchez', '741369258', '2000-01-30', '987654345', 'cristina.gonzalez@gmail.com', 24, '2024-10-27', TRUE),
('David', 'Soto', 'Ramirez', '159852456', '1998-07-12', '987654346', 'david.soto@gmail.com', 26, '2024-10-26', TRUE),
('Victoria', 'Torres', 'Mendez', '753951852', '2001-05-07', '987654347', 'victoria.torres@gmail.com', 23, '2024-10-25', TRUE),
('Javier', 'Salazar', 'Morales', '852741963', '1999-10-14', '987654348', 'javier.salazar@gmail.com', 25, '2024-10-24', TRUE);
('Joaquin', 'Castillo', 'Mendoza', '852963741', '1995-11-20', '987654349', 'joaquin.castillo@gmail.com', 29, '2021-11-15', TRUE),
('Paula', 'Fernandez', 'Serrano', '741258369', '1999-04-05', '987654350', 'paula.fernandez@gmail.com', 25, '2022-03-20', TRUE),
('Esteban', 'Vega', 'Morales', '963852741', '2003-02-12', '987654351', 'esteban.vega@gmail.com', 21, '2024-02-10', TRUE),
('Sofia', 'Ramirez', 'Delgado', '159753258', '2001-06-22', '987654352', 'sofia.ramirez@gmail.com', 23, '2023-07-15', TRUE),
('Alejandro', 'Paredes', 'Gonzalez', '951753852', '1997-08-14', '987654353', 'alejandro.paredes@gmail.com', 27, '2022-09-10', TRUE),
('Carla', 'Lopez', 'Fernandez', '258963147', '1996-12-30', '987654354', 'carla.lopez@gmail.com', 28, '2020-11-02', TRUE),
('Andres', 'Mendez', 'Torres', '753159258', '2004-01-18', '987654355', 'andres.mendez@gmail.com', 20, '2024-03-05', TRUE),
('Laura', 'Bermudez', 'Salazar', '456789321', '1998-09-25', '987654356', 'laura.bermudez@gmail.com', 26, '2021-08-13', TRUE),
('Jose', 'Rodriguez', 'Navarro', '987456321', '1995-07-11', '987654357', 'jose.rodriguez@gmail.com', 29, '2019-01-21', TRUE),
('Marina', 'Gomez', 'Lopez', '741852963', '2002-05-13', '987654358', 'marina.gomez@gmail.com', 22, '2023-09-30', TRUE),
('Felipe', 'Torres', 'Castro', '963741852', '2000-08-01', '987654359', 'felipe.torres@gmail.com', 24, '2023-06-17', TRUE),
('Viviana', 'Soto', 'Alvarez', '951246753', '2001-10-03', '987654360', 'viviana.soto@gmail.com', 23, '2022-05-18', TRUE),
('Ricardo', 'Pacheco', 'Ruiz', '852741369', '1998-03-21', '987654361', 'ricardo.pacheco@gmail.com', 26, '2021-02-25', TRUE),
('Patricia', 'Gomez', 'Mora', '369852147', '1999-12-09', '987654362', 'patricia.gomez@gmail.com', 25, '2021-06-12', TRUE),
('Enrique', 'Lopez', 'Mendez', '741963852', '1997-02-28', '987654363', 'enrique.lopez@gmail.com', 27, '2020-01-19', TRUE),
('Santiago', 'Calle', 'Molina', '258741963', '2003-04-30', '987654364', 'santiago.calle@gmail.com', 21, '2024-01-08', TRUE),
('Jorge', 'Gonzalez', 'Castillo', '456123789', '2004-10-14', '987654365', 'jorge.gonzalez@gmail.com', 20, '2024-04-22', TRUE),
('Claudia', 'Reyes', 'Vargas', '741258369', '2001-01-10', '987654366', 'claudia.reyes@gmail.com', 23, '2023-07-02', TRUE),
('Hector', 'Caceres', 'Mendoza', '987654123', '1996-05-15', '987654367', 'hector.caceres@gmail.com', 28, '2022-11-29', TRUE),
('Gabriela', 'Martinez', 'Vega', '321654987', '2000-09-18', '987654368', 'gabriela.martinez@gmail.com', 24, '2023-04-10', TRUE),
('Julian', 'Morales', 'Salazar', '852741963', '1997-03-07', '987654369', 'julian.morales@gmail.com', 27, '2021-09-24', TRUE),
('Raquel', 'Perez', 'Hernandez', '159753258', '2003-07-22', '987654370', 'raquel.perez@gmail.com', 21, '2024-03-28', TRUE),
('Pablo','Escobar','Salvador', '10928215','1998-01-01','77764494','elchapo@gmail.com',26,'2024-03-28',TRUE);
('Goku','Son ','Kakaroto','7777777','1986-04-04','84561235','mondongo@gmail.com',54,'2024-04-04',TRUE)

-- DROP TABLE IF EXISTS malla;
/*CREATE TABLE malla (
  id_malla int(11) NOT NULL AUTO_INCREMENT,
  evaluaciones int(11) NOT NULL,
  fecha_recuperacion date NOT NULL,
  fecha_consulta date NOT NULL,
  PRIMARY KEY (id_malla)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES malla WRITE;

UNLOCK TABLES;}

INSERT INTO malla (num_evaluaciones, fecha_recuperacion, fecha_consulta, tema_id, plan_curricular_id) VALUES
(3, '2024-12-15', '2024-12-01', 1, 1),  
(2, '2024-12-20', '2024-12-05', 2, 2),  
(3, '2024-12-25', '2024-12-10', 3, 1), 
(1, '2025-01-05', '2024-12-15', 4, 3),  
(3, '2025-01-10', '2024-12-20', 5, 2),  
(3, '2025-01-12', '2024-12-25', 6, 1),  
(2, '2025-01-15', '2024-12-28', 7, 3),  
(1, '2025-02-01', '2025-01-10', 8, 2),  
(3, '2025-02-05', '2025-01-15', 9, 1);  


-- DROP TABLE IF EXISTS temario;
/*CREATE TABLE temario (
  id_temario int(11) NOT NULL AUTO_INCREMENT,
  area varchar(50) NOT NULL,
  tema varchar(50) NOT NULL,
  capitulos varchar(50) NOT NULL,
  PRIMARY KEY (id_temario)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES temario WRITE;

UNLOCK TABLES;
INSERT INTO temario (area, nombre_tema, capitulo) VALUES
('Matemáticas', 'Cálculo Diferencial', 'Capítulo 1'),
('Matemáticas', 'Cálculo Integral', 'Capítulo 2'),
('Matemáticas', 'Probabilidades y Estadística', 'Capítulo 1'),
('Física', 'Termodinámica', 'Capítulo 1'),
('Física', 'Óptica', 'Capítulo 2'),
('Química', 'Físicoquímica', 'Capítulo 1'),
('Química', 'Química Orgánica', 'Capítulo 2'),
('Programación', 'Python Básico', 'Capítulo 1'),
('Programación', 'Python Avanzado', 'Capítulo 2'),
('Diseño Gráfico', 'Illustrator Avanzado', 'Capítulo 1'),
('Diseño Gráfico', 'Edición de Video', 'Capítulo 1'),
('Historia', 'Historia Universal', 'Capítulo 1'),
('Historia', 'Historia Contemporánea', 'Capítulo 2'),
('Literatura', 'Literatura Clásica', 'Capítulo 1'),
('Literatura', 'Literatura Moderna', 'Capítulo 2'),
('Economía', 'Microeconomía', 'Capítulo 1'),
('Economía', 'Macroeconomía', 'Capítulo 2'),
('Derecho', 'Derecho Constitucional', 'Capítulo 1'),
('Derecho', 'Derecho Penal', 'Capítulo 2');

-- DROP TABLE IF EXISTS plan_curricular;
/*CREATE TABLE plan_curricular (
  id_plan_curricular int(11) NOT NULL AUTO_INCREMENT,
  temario_id int NOT NULL,
  malla_id int NOT NULL,
  PRIMARY KEY (id_plan_curricular),
  FOREIGN KEY (temario_id) REFERENCES temario(id_temario) ON DELETE CASCADE,
  FOREIGN KEY (malla_id) REFERENCES malla(id_malla) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES plan_curricular WRITE;

UNLOCK TABLES;
INSERT INTO plan_curricular (temario_id, malla_id) 
VALUES (1, 1),  -- Cálculo Diferencial, malla 1
       (2, 2),  -- Cálculo Integral, malla 2
       (3, 3),  -- Probabilidades y Estadística, malla 3
       (4, 4),  -- Termodinámica, malla 4
       (5, 5),  -- Óptica, malla 5
       (6, 6),  -- Físicoquímica, malla 6
       (7, 7),  -- Química Orgánica, malla 7
       (8, 8),  -- Python Básico, malla 8
       (9, 9);  -- Python Avanzado, malla 9



-- DROP TABLE IF EXISTS curso;
/*CREATE TABLE curso (
  id_curso int(11) NOT NULL AUTO_INCREMENT,
  paralelo varchar(3) NOT NULL,
  costo double(10,2) NOT NULL,
  formato enum('Presencial','Virtual','Híbrido') NOT NULL,
  cupos int(11) NOT NULL,
  gestion varchar(10) NOT NULL,
  duracion int(11) NOT NULL,
  docente_id int(11) NOT NULL,
  plan_curricular_id int(11) NOT NULL,
  PRIMARY KEY (id_curso),
  FOREIGN KEY (docente_id) REFERENCES empleado (id_empleado) ON DELETE CASCADE,
  FOREIGN KEY (plan_curricular_id) REFERENCES plan_curricular (id_plan_curricular) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES curso WRITE;

UNLOCK TABLES;
INSERT INTO curso (paralelo, costo, formato, cupos, gestion, duracion, docente_id, plan_curricular_id, horario_id) VALUES
('A', 350.00, 'Presencial', 30, '2024-1', 16, 1, 1, 1), -- Matemáticas: Cálculo Diferencial
('B', 300.00, 'Virtual', 25, '2024-1', 16, 2, 2, 2),   -- Matemáticas: Cálculo Integral
('A', 320.00, 'Híbrido', 20, '2024-1', 16, 3, 3, 3),   -- Matemáticas: Probabilidades y Estadística
('A', 400.00, 'Presencial', 40, '2024-1', 16, 4, 4, 4), -- Física: Termodinámica
('B', 420.00, 'Virtual', 35, '2024-1', 16, 5, 5, 5),   -- Física: Óptica
('A', 380.00, 'Presencial', 25, '2024-1', 16, 6, 6, 6), -- Química: Físicoquímica
('B', 360.00, 'Híbrido', 20, '2024-1', 16, 7, 7, 7),   -- Química: Química Orgánica
('A', 300.00, 'Virtual', 30, '2024-1', 12, 8, 8, 8),   -- Programación: Python Básico
('A', 350.00, 'Híbrido', 20, '2024-1', 12, 9, 9, 9),   -- Diseño Gráfico: Illustrator Avanzado
('B', 280.00, 'Presencial', 25, '2024-1', 12, 10, 10, 10); -- Historia: Historia Universal


-- DROP TABLE IF EXISTS horario;
/*REATE TABLE horario (
  id_horario int(11) NOT NULL AUTO_INCREMENT,
  hora_id int(11) NOT NULL,
  aula_id int(11) NOT NULL,
  curso_id int(11) DEFAULT NULL,
  PRIMARY KEY (id_horario),
  FOREIGN KEY (aula_id) REFERENCES aula (id_aula) ON DELETE CASCADE,
  FOREIGN KEY (hora_id) REFERENCES hora (id_hora) ON DELETE CASCADE,
  FOREIGN KEY (curso_id) REFERENCES curso(id_curso) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES horario WRITE;

UNLOCK TABLES;
INSERT INTO horario (hora_id, aula_id, curso_id) VALUES
(1, 1, 1), -- Lunes, 07:00-08:40, Aula 1, Curso 1
(2, 2, 2), -- Lunes, 08:55-10:35, Aula 2, Curso 2
(3, 3, 3), -- Lunes, 10:50-12:30, Aula 3, Curso 3
(4, 1, 4), -- Lunes, 12:45-14:25, Aula 1, Curso 4
(5, 2, 5), -- Lunes, 14:40-16:20, Aula 2, Curso 5
(6, 3, 6), -- Lunes, 16:35-18:15, Aula 3, Curso 6
(7, 1, 7), -- Lunes, 18:30-20:10, Aula 1, Curso 7
(1, 2, 8), -- Martes, 07:00-08:40, Aula 2, Curso 8
(2, 3, 9), -- Martes, 08:55-10:35, Aula 3, Curso 9
(3, 1, 10); -- Martes, 10:50-12:30, Aula 1, Curso 10


-- DROP TABLE IF EXISTS inscripcion;
/*CREATE TABLE inscripcion (
  id_inscripcion int(11) NOT NULL AUTO_INCREMENT,
  curso_id int(11) NOT NULL,
  horario_id int(11) NOT NULL,
  estudiante_id int(11) NOT NULL,
  PRIMARY KEY (id_inscripcion),
  FOREIGN KEY (curso_id) REFERENCES curso (id_curso) ON DELETE CASCADE,
  FOREIGN KEY (estudiante_id) REFERENCES estudiante (id_estudiante) ON DELETE CASCADE,
  FOREIGN KEY (horario_id) REFERENCES horario (id_horario) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES inscripcion WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS factura;
/*CREATE TABLE factura (
  id_factura int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  ci varchar(10) NOT NULL,
  inscripcion_id int(11) NOT NULL,
  PRIMARY KEY (id_factura),
  FOREIGN KEY (inscripcion_id) REFERENCES inscripcion (id_inscripcion) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/
LOCK TABLES factura WRITE;

UNLOCK TABLES;
