-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-10-21 02:18:18.025

-- tables
-- Table: aula
CREATE TABLE aula (
    id_aula int  NOT NULL,
    nombre_aula varchar(20)  NOT NULL,
    capacidad int  NOT NULL,
    disponibilidad bool  NOT NULL,
    CONSTRAINT aula_pk PRIMARY KEY (id_aula)
);

-- Table: cursos
CREATE TABLE cursos (
    id_curso int  NOT NULL,
    paralelo varchar(3)  NOT NULL,
    formato bool  NOT NULL,
    cupos int  NOT NULL,
    gestion varchar(10)  NOT NULL,
    duracion int  NOT NULL,
    horarios_id_horarios int  NOT NULL,
    malla_id_malla int  NOT NULL,
    CONSTRAINT cursos_pk PRIMARY KEY (id_curso)
);

-- Table: empleados
CREATE TABLE empleados (
    id_empleado int  NOT NULL,
    fecha_registro date  NOT NULL,
    experiencia varchar(50)  NOT NULL,
    detalles varchar(50)  NOT NULL,
    sueldo double(5,2)  NOT NULL,
    tipo_empleos_id_tipo_empleo int  NOT NULL,
    personas_id_persona int  NOT NULL,
    CONSTRAINT empleados_pk PRIMARY KEY (id_empleado)
);

-- Table: estudiantes
CREATE TABLE estudiantes (
    id_estudiante int  NOT NULL,
    fecha_inscripcion date  NOT NULL,
    estado_inscripcion bool  NOT NULL,
    personas_id_persona int  NOT NULL,
    CONSTRAINT estudiantes_pk PRIMARY KEY (id_estudiante)
);

-- Table: facturas
CREATE TABLE facturas (
    num_factura int  NOT NULL,
    razon_soc varchar(50)  NOT NULL,
    fecha_emision datetime  NOT NULL,
    detalle_factura varchar(50)  NOT NULL,
    CONSTRAINT facturas_pk PRIMARY KEY (num_factura)
);

-- Table: facturas_pagos
CREATE TABLE facturas_pagos (
    monto int  NOT NULL,
    id_facturas_pagos int  NOT NULL,
    facturas_num_factura int  NOT NULL,
    CONSTRAINT facturas_pagos_pk PRIMARY KEY (id_facturas_pagos)
);

-- Table: horarios
CREATE TABLE horarios (
    id_horarios int  NOT NULL,
    dia varchar(50)  NOT NULL,
    horas_id_horas int  NOT NULL,
    aula_id_aula int  NOT NULL,
    CONSTRAINT horarios_pk PRIMARY KEY (id_horarios)
);

-- Table: horas
CREATE TABLE horas (
    id_horas int  NOT NULL,
    hora_inicio time  NOT NULL,
    hora_fin time  NOT NULL,
    CONSTRAINT horas_pk PRIMARY KEY (id_horas)
);

-- Table: inscripciones
CREATE TABLE inscripciones (
    Id_inscripciones int  NOT NULL,
    facturas_num_factura int  NOT NULL,
    estudiantes_id_estudiante int  NOT NULL,
    cursos_id_curso int  NOT NULL,
    CONSTRAINT inscripciones_pk PRIMARY KEY (Id_inscripciones)
);

-- Table: malla
CREATE TABLE malla (
    id_malla int  NOT NULL,
    detalles_evaluacion varchar(20)  NOT NULL,
    temas_id_temas int  NOT NULL,
    plan_curricular_id_plan_curricular int  NOT NULL,
    fecha_consulta int  NOT NULL,
    fecha_recuperatorio int  NOT NULL,
    CONSTRAINT malla_pk PRIMARY KEY (id_malla)
);

-- Table: personas
CREATE TABLE personas (
    id_persona int  NOT NULL,
    nombre varchar(20)  NOT NULL,
    ap_paterno varchar(20)  NOT NULL,
    ap_materno varchar(20)  NOT NULL,
    ci varchar(9)  NOT NULL,
    fecha_nacimiento date  NOT NULL,
    telefono varchar(9)  NOT NULL,
    email varchar(50)  NOT NULL,
    CONSTRAINT personas_pk PRIMARY KEY (id_persona)
);

-- Table: plan_curricular
CREATE TABLE plan_curricular (
    id_plan_curricular int  NOT NULL,
    detalles_tema varchar(50)  NOT NULL,
    CONSTRAINT plan_curricular_pk PRIMARY KEY (id_plan_curricular)
);

-- Table: temas
CREATE TABLE temas (
    id_temas int  NOT NULL,
    area varchar(50)  NOT NULL,
    nombre_tema varchar(50)  NOT NULL,
    capitulo varchar(20)  NOT NULL,
    CONSTRAINT temas_pk PRIMARY KEY (id_temas)
);

-- Table: tipo_empleos
CREATE TABLE tipo_empleos (
    id_tipo_empleo int  NOT NULL,
    nombre_empleo varchar(20)  NOT NULL,
    CONSTRAINT tipo_empleos_pk PRIMARY KEY (id_tipo_empleo)
);

-- foreign keys
-- Reference: cursos_horarios (table: cursos)
ALTER TABLE cursos ADD CONSTRAINT cursos_horarios FOREIGN KEY cursos_horarios (horarios_id_horarios)
    REFERENCES horarios (id_horarios);

-- Reference: cursos_malla (table: cursos)
ALTER TABLE cursos ADD CONSTRAINT cursos_malla FOREIGN KEY cursos_malla (malla_id_malla)
    REFERENCES malla (id_malla);

-- Reference: empleados_personas (table: empleados)
ALTER TABLE empleados ADD CONSTRAINT empleados_personas FOREIGN KEY empleados_personas (personas_id_persona)
    REFERENCES personas (id_persona);

-- Reference: empleados_tipo_empleos (table: empleados)
ALTER TABLE empleados ADD CONSTRAINT empleados_tipo_empleos FOREIGN KEY empleados_tipo_empleos (tipo_empleos_id_tipo_empleo)
    REFERENCES tipo_empleos (id_tipo_empleo);

-- Reference: estudiantes_personas (table: estudiantes)
ALTER TABLE estudiantes ADD CONSTRAINT estudiantes_personas FOREIGN KEY estudiantes_personas (personas_id_persona)
    REFERENCES personas (id_persona);

-- Reference: facturas_pagos_facturas (table: facturas_pagos)
ALTER TABLE facturas_pagos ADD CONSTRAINT facturas_pagos_facturas FOREIGN KEY facturas_pagos_facturas (facturas_num_factura)
    REFERENCES facturas (num_factura);

-- Reference: horarios_aula (table: horarios)
ALTER TABLE horarios ADD CONSTRAINT horarios_aula FOREIGN KEY horarios_aula (aula_id_aula)
    REFERENCES aula (id_aula);

-- Reference: horarios_horas (table: horarios)
ALTER TABLE horarios ADD CONSTRAINT horarios_horas FOREIGN KEY horarios_horas (horas_id_horas)
    REFERENCES horas (id_horas);

-- Reference: inscripciones_cursos (table: inscripciones)
ALTER TABLE inscripciones ADD CONSTRAINT inscripciones_cursos FOREIGN KEY inscripciones_cursos (cursos_id_curso)
    REFERENCES cursos (id_curso);

-- Reference: inscripciones_estudiantes (table: inscripciones)
ALTER TABLE inscripciones ADD CONSTRAINT inscripciones_estudiantes FOREIGN KEY inscripciones_estudiantes (estudiantes_id_estudiante)
    REFERENCES estudiantes (id_estudiante);

-- Reference: inscripciones_facturas (table: inscripciones)
ALTER TABLE inscripciones ADD CONSTRAINT inscripciones_facturas FOREIGN KEY inscripciones_facturas (facturas_num_factura)
    REFERENCES facturas (num_factura);

-- Reference: malla_plan_curricular (table: malla)
ALTER TABLE malla ADD CONSTRAINT malla_plan_curricular FOREIGN KEY malla_plan_curricular (plan_curricular_id_plan_curricular)
    REFERENCES plan_curricular (id_plan_curricular);

-- Reference: malla_temas (table: malla)
ALTER TABLE malla ADD CONSTRAINT malla_temas FOREIGN KEY malla_temas (temas_id_temas)
    REFERENCES temas (id_temas);

-- End of file.

