DROP DATABASE IF EXISTS piodb;
DROP USER IF EXISTS pio;
CREATE DATABASE piodb;
CREATE USER pio WITH PASSWORD 'P10p@55' SUPERUSER;
GRANT ALL PRIVILEGES ON DATABASE piodb to pio;
\c piodb;

CREATE TABLE Edificio (

       nombre		varchar(30) PRIMARY KEY,
       direccion        varchar(140),
       borrado		boolean DEFAULT false
);

CREATE TABLE aula (

       lugar            varchar(38) PRIMARY KEY,
       capacidad        integer,
       implementos      varchar(50),
       borrado		boolean DEFAULT false
);


CREATE TABLE representante (

       nombres          varchar(25),
       apellidos        varchar(25),
       cedula           varchar(11) PRIMARY KEY,
       lugar_trabajo    varchar(20),
       telefonos        varchar(35),
       direccion        varchar(140),
       grado_estudio    varchar(30),
       borrado		boolean DEFAULT false
);

CREATE TABLE proveedor (

       rif             varchar(12) PRIMARY KEY,
       nombre          varchar(30),
       area            varchar(16),
       email           varchar(30),
       direccion       varchar(140),
       telefonos       varchar(35),
       borrado	       boolean DEFAULT false
);

CREATE TABLE evento (

       nombre           varchar(70) PRIMARY KEY,
       descripcion      varchar(140),
       fecha_inicio     date,
       fecha_fin        date,
       lugar            varchar(140),
       borrado		boolean DEFAULT false
);

CREATE TABLE proveedores_evento (

       rif              varchar(12),
       evento           varchar(70),
       borrado		boolean DEFAULT false,
       PRIMARY KEY (rif,evento)
);

CREATE TABLE carrera (
       codigo          varchar(10) PRIMARY KEY,
       nombre          varchar(11),
       descripcion     varchar(140),
       borrado	       boolean DEFAULT false	
);

CREATE TABLE catedra (
       codigo        varchar(10) PRIMARY KEY,
       nombre        varchar(20),
       descripcion   varchar(140),
       borrado	     boolean DEFAULT false
);

CREATE TABLE estudiante_sc (

       nombres             varchar(25),
       apellidos           varchar(25),
       carnet              varchar(10) PRIMARY KEY,
       email               varchar(30),
       telefonos           varchar(35),
       horas_cumplidas     integer DEFAULT 0,
       borrado		   boolean DEFAULT false
);

CREATE TABLE personal_apoyo (

       cedula               varchar(11) PRIMARY KEY,
       nombres              varchar(25),
       apellidos            varchar(25),
       email                varchar(30),
       telefonos            varchar(35),
       borrado		    boolean DEFAULT false
);

CREATE TABLE plantel (

       rif              varchar(12) PRIMARY KEY,
       nombre           varchar(70),
       distrito         varchar(30),
       tipo             varchar(12),
       telefonos        varchar(47),
       direccion        varchar(140),
       correo           varchar(30),
       coordinador_pio  varchar(11),
       director         varchar(11),
       menciones        varchar(100),
       materias_falla   varchar(100),
       programas_remit  varchar(100),
       danos_planta     varchar(200),
       matricula        integer,
       casos_embarazo   integer,
       asistio_charla   boolean,
       orientacion_fam  boolean,
       orientacion_ind  boolean,
       borrado		boolean DEFAULT false
);

CREATE TABLE charla_plantel (

       plantel          varchar(12),
       estudiante       varchar(10),
       fecha            date,
       borrado		boolean DEFAULT false,
       PRIMARY KEY (plantel,estudiante,fecha)
);

CREATE TABLE violencia_plantel (

       plantel          varchar(12) PRIMARY KEY,
       tipo_violencia   varchar(12),
       medio_violencia  varchar(25),
       causa_violencia  varchar(25),
       grupo_agresor    varchar(25),
       grupo_victima    varchar(25),
       consecuencias    varchar(140),
       medidas_tomadas  varchar(140),
       borrado		boolean DEFAULT false
);

CREATE TABLE usuario (
       nombres        varchar(25),
       apellidos      varchar(25),
       email          varchar(30) unique,
       cedula         varchar(11) PRIMARY KEY,
       es_admin       boolean,
       fecha_registro date,
       telefonos      varchar(35),
       borrado	      boolean DEFAULT false
);

CREATE TABLE personal_pio (
       cedula             varchar (11) PRIMARY KEY,
       cargo              varchar (10),
       borrado		  boolean DEFAULT false

);


CREATE TABLE profesor (
       cedula         varchar(11) PRIMARY KEY,
       fecha_ingreso  date,
       cargo          varchar(10),
       borrado	      boolean DEFAULT false
);


CREATE TABLE profesor_materia (
       cedula		      varchar(11) PRIMARY KEY,
       materia                varchar(11),
       borrado		      boolean DEFAULT false
);


CREATE TABLE mensaje (

       fecha         timestamp,
       emisor        varchar(11),
       receptor      varchar(11),
       leido         boolean DEFAULT false,
       asunto        varchar(20),
       borrado	     boolean DEFAULT false,
       PRIMARY KEY (fecha,emisor)
);



CREATE TABLE aspirante (
       cedula          varchar(11) PRIMARY KEY,
       plantel         varchar(12),
       representante   varchar(11),
       nivel_ingreso   varchar(20),
       horas_trabajo   integer,
       beca            varchar(30),
       hermanos_univ   integer,
       servicios       varchar(100),
       actividad_extr  varchar(100),
       materias_falla  varchar(100),
       dependencia_eco varchar(10),
       habitos_estudio varchar(100),
       promedio        numeric,
       borrado	       boolean DEFAULT false
);

CREATE TABLE preinscrito (

       cedula           varchar(11) PRIMARY KEY,
       numero_preins    varchar(30),
       fecha_preins     date,
       borrado		boolean DEFAULT false
);

CREATE TABLE estudiante (

       cedula           varchar(11) PRIMARY KEY,
       numero_ins       varchar(30),
       fecha_ins        date,
       borrado		boolean DEFAULT false
);

CREATE TABLE estudiante_representante (

       representado     varchar(11),
       representante    varchar(11),
       borrado		boolean DEFAULT false,
       PRIMARY KEY (representado,representante)
);

CREATE TABLE preinscrito_carrera (

       preinscrito      varchar(11),
       carrera          varchar(10),
       borrado		boolean DEFAULT false,
       PRIMARY KEY (preinscrito,carrera)
);

CREATE TABLE examen (

       codigo           varchar(18) PRIMARY KEY,
       fecha            date,
       aula             varchar(38),
       tipo             varchar(25),
       borrado		boolean DEFAULT false

);

CREATE TABLE examen_asisten (

       examen           varchar(18),
       preinscrito      varchar(11),
       nota_obtenida    real,
       borrado		boolean DEFAULT false,
       PRIMARY KEY (examen,preinscrito)
);

CREATE TABLE examen_apoyo (

       examen           varchar(18),
       personal_apoyo   varchar(11),
       borrado		boolean DEFAULT false,
       PRIMARY KEY (examen,personal_apoyo)
);

CREATE TABLE clase (

       codigo      varchar(9) PRIMARY KEY,
       profesor    varchar(11),
       catedra     varchar(10),
       aula        varchar(38),
       periodo     varchar(12),
       borrado	   boolean DEFAULT false
);

CREATE TABLE clase_estudiante (

       clase            varchar(9),
       estudiante       varchar(11),
       borrado		boolean DEFAULT false,
       PRIMARY KEY (clase,estudiante)
);



ALTER TABLE profesor ADD CONSTRAINT fk_profced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE profesor_materia ADD CONSTRAINT fk_profced_profesor FOREIGN KEY (cedula) REFERENCES profesor (cedula);
ALTER TABLE profesor_materia ADD CONSTRAINT fk_profmat_catedra FOREIGN KEY (materia) REFERENCES catedra (codigo);
ALTER TABLE personal_pio ADD CONSTRAINT fk_perced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE mensaje ADD CONSTRAINT fk_menemi_usuario FOREIGN KEY (emisor) REFERENCES usuario (cedula);
ALTER TABLE mensaje ADD CONSTRAINT fk_menrec_personalpio FOREIGN KEY (receptor) REFERENCES personal_pio (cedula);
ALTER TABLE proveedores_evento ADD CONSTRAINT fk_prorif_proveedor_ FOREIGN KEY (rif) REFERENCES proveedor (rif);
ALTER TABLE proveedores_evento ADD CONSTRAINT fk_proeve_evento_ FOREIGN KEY (evento) REFERENCES evento (nombre);
ALTER TABLE clase ADD CONSTRAINT fk_clapro_profesor FOREIGN KEY (profesor) REFERENCES profesor (cedula);
ALTER TABLE clase ADD CONSTRAINT fk_clacat_catedra FOREIGN KEY (catedra) REFERENCES catedra (codigo);
ALTER TABLE clase ADD CONSTRAINT fk_claaul_aula FOREIGN KEY (aula) REFERENCES aula (lugar);

ALTER TABLE violencia_plantel ADD CONSTRAINT fk_viopla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE aspirante ADD CONSTRAINT fk_asppla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE aspirante ADD CONSTRAINT fk_aspced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE preinscrito ADD CONSTRAINT fk_preced_aspirante FOREIGN KEY (cedula) REFERENCES aspirante (cedula);
ALTER TABLE estudiante ADD CONSTRAINT fk_estced_preinscrito FOREIGN KEY (cedula) REFERENCES preinscrito (cedula);
ALTER TABLE estudiante_representante ADD CONSTRAINT fk_estrep_aspirante FOREIGN KEY (representado) REFERENCES aspirante (cedula);
ALTER TABLE estudiante_representante ADD CONSTRAINT fk_estrep_representante FOREIGN KEY (representante) REFERENCES representante (cedula);
ALTER TABLE preinscrito_carrera ADD CONSTRAINT fk_prepre_preinscrito FOREIGN KEY (preinscrito) REFERENCES preinscrito (cedula);
ALTER TABLE preinscrito_carrera ADD CONSTRAINT fk_precar_carrera FOREIGN KEY (carrera) REFERENCES carrera (codigo);
ALTER TABLE examen ADD CONSTRAINT fk_exaaul_aula FOREIGN KEY (aula) REFERENCES aula (lugar);
ALTER TABLE examen_asisten ADD CONSTRAINT fk_exaexa_examen FOREIGN KEY (examen) REFERENCES examen (codigo);
ALTER TABLE examen_asisten ADD CONSTRAINT fk_exapre_preinscrito FOREIGN KEY (preinscrito) REFERENCES preinscrito (cedula);
ALTER TABLE examen_apoyo ADD CONSTRAINT fk_exapexa_examen FOREIGN KEY (examen) REFERENCES examen (codigo);
ALTER TABLE examen_apoyo ADD CONSTRAINT fk_exapper_presonalapoyo FOREIGN KEY (personal_apoyo) REFERENCES personal_apoyo (cedula);
ALTER TABLE clase_estudiante ADD CONSTRAINT fk_clacla_clase FOREIGN KEY (clase) REFERENCES clase (codigo);
ALTER TABLE clase_estudiante ADD CONSTRAINT fk_claest_estudiante FOREIGN KEY (estudiante) REFERENCES estudiante (cedula);
ALTER TABLE charla_plantel ADD CONSTRAINT fk_chapla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE charla_plantel ADD CONSTRAINT fk_chaest_estudiantesc FOREIGN KEY (estudiante) REFERENCES estudiante_sc (carnet);



