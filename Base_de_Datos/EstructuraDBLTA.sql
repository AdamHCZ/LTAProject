-- DROP TABLE IF EXISTS aula;
CREATE TABLE aula (
  id_aula int(11) NOT NULL AUTO_INCREMENT,
  nombre_aula varchar(50) NOT NULL,
  capacidad int(11) NOT NULL,
  disponibilidad tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (id_aula)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES aula WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS hora;
CREATE TABLE hora (
  id_hora int(11) NOT NULL AUTO_INCREMENT,
  dia enum('L','M','X','J','V','S') NOT NULL,
  hora_inicio time NOT NULL,
  hora_fin time NOT NULL,
  PRIMARY KEY (id_hora)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES hora WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS tipo_empleo;
CREATE TABLE tipo_empleo (
  id_tipo_empleo int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  nivel int(11) NOT NULL,
  PRIMARY KEY (id_tipo_empleo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES tipo_empleo WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS empleado;
CREATE TABLE empleado (
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

LOCK TABLES empleado WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS estudiante;
CREATE TABLE estudiante (
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

LOCK TABLES estudiante WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS malla;
CREATE TABLE malla (
  id_malla int(11) NOT NULL AUTO_INCREMENT,
  evaluaciones int(11) NOT NULL,
  fecha_recuperacion date NOT NULL,
  fecha_consulta date NOT NULL,
  PRIMARY KEY (id_malla)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES malla WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS temario;
CREATE TABLE temario (
  id_temario int(11) NOT NULL AUTO_INCREMENT,
  area varchar(50) NOT NULL,
  tema varchar(50) NOT NULL,
  capitulos varchar(50) NOT NULL,
  PRIMARY KEY (id_temario)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES temario WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS plan_curricular;
CREATE TABLE plan_curricular (
  id_plan_curricular int(11) NOT NULL AUTO_INCREMENT,
  temario_id int NOT NULL,
  malla_id int NOT NULL,
  PRIMARY KEY (id_plan_curricular),
  FOREIGN KEY (temario_id) REFERENCES temario(id_temario) ON DELETE CASCADE,
  FOREIGN KEY (malla_id) REFERENCES malla(id_malla) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES plan_curricular WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS curso;
CREATE TABLE curso (
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

LOCK TABLES curso WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS horario;
CREATE TABLE horario (
  id_horario int(11) NOT NULL AUTO_INCREMENT,
  hora_id int(11) NOT NULL,
  aula_id int(11) NOT NULL,
  curso_id int(11) DEFAULT NULL,
  PRIMARY KEY (id_horario),
  FOREIGN KEY (aula_id) REFERENCES aula (id_aula) ON DELETE CASCADE,
  FOREIGN KEY (hora_id) REFERENCES hora (id_hora) ON DELETE CASCADE,
  FOREIGN KEY (curso_id) REFERENCES curso(id_curso) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES horario WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS inscripcion;
CREATE TABLE inscripcion (
  id_inscripcion int(11) NOT NULL AUTO_INCREMENT,
  curso_id int(11) NOT NULL,
  horario_id int(11) NOT NULL,
  estudiante_id int(11) NOT NULL,
  PRIMARY KEY (id_inscripcion),
  FOREIGN KEY (curso_id) REFERENCES curso (id_curso) ON DELETE CASCADE,
  FOREIGN KEY (estudiante_id) REFERENCES estudiante (id_estudiante) ON DELETE CASCADE,
  FOREIGN KEY (horario_id) REFERENCES horario (id_horario) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES inscripcion WRITE;

UNLOCK TABLES;

-- DROP TABLE IF EXISTS factura;
CREATE TABLE factura (
  id_factura int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  ci varchar(10) NOT NULL,
  inscripcion_id int(11) NOT NULL,
  PRIMARY KEY (id_factura),
  FOREIGN KEY (inscripcion_id) REFERENCES inscripcion (id_inscripcion) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

LOCK TABLES factura WRITE;

UNLOCK TABLES;
