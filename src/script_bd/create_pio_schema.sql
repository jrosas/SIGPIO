DROP DATABASE IF EXISTS piodb;
DROP USER IF EXISTS pio;
CREATE DATABASE piodb;
CREATE USER pio WITH PASSWORD 'P10p@55' SUPERUSER;
GRANT ALL PRIVILEGES ON DATABASE piodb to pio;
\c piodb;

-- XML SIN PROBLEMA

CREATE TABLE edificio (

       nombre		varchar(30) PRIMARY KEY,
       direccion        varchar(140),
       borrado		boolean DEFAULT false
);

-- XML LISTO (SE BORRO UN INVERSO Y SE DEJO OTRO HACIA LAS CLASES RELACIONADAS 
-- CON DICHO SALON)

CREATE TABLE aula (

       lugar            varchar(38) PRIMARY KEY,
       capacidad        integer,
       implementos      varchar(50),
       borrado		boolean DEFAULT false
);

-- XML LISTO SE ELIMINO HASH A REPRESENTADOS

CREATE TABLE representante (

       nombres          varchar(25) NOT NULL,
       apellidos        varchar(25) NOT NULL,
       cedula           varchar(11) PRIMARY KEY,
       lugartrabajo    varchar(20),
       telefonos        varchar(35),
       direccion        varchar(140),
       gradoestudio    varchar(30) ,
       borrado		boolean DEFAULT false
);

-- XML SIN PROBLEMA

CREATE TABLE proveedor (

       rif             varchar(12) PRIMARY KEY,
       nombre          varchar(30) NOT NULL,
       area            varchar(16) NOT NULL,
       email           varchar(30),
       direccion       varchar(140),
       telefonos       varchar(35),
       borrado	       boolean DEFAULT false
);

-- XML LISTO SE CAMBIO ID POR INCREMENT

CREATE TABLE evento (

       idevento		SERIAL PRIMARY KEY,
       nombre           varchar(70),
       descripcion      varchar(140),
       fechainicio      varchar(11),
       fechafin         varchar(11),
       lugar            varchar(140),
       borrado		boolean DEFAULT false
);

-- XML LISTO SE CAMBIO ID POR INCREMENT

CREATE TABLE proveedoresevento (

       id		SERIAL PRIMARY KEY,
       rif              varchar(12) NOT NULL,
       idevento         integer NOT NULL,
       borrado		boolean DEFAULT false NOT NULL
       
);

-- XML SIN PROBLEMA

CREATE TABLE carrera (
       codigo          varchar(10) PRIMARY KEY,
       nombre          varchar(64) NOT NULL,
-- AQUI SE CAMBIO EL TAMANO DE NOMBRE
       descripcion     varchar(140),
       borrado	       boolean DEFAULT false	
);

-- XML LISTO (SE ELIMINARON TODOS LOS HASH DE INVERSO)

CREATE TABLE catedra (
       codigo        varchar(10) PRIMARY KEY,
       nombre        varchar(20) NOT NULL,
       descripcion   varchar(140),
       borrado	     boolean DEFAULT false
);

-- XML SIN PROBLEMA

CREATE TABLE estudiantesc (

       nombres             varchar(25) NOT NULL,
       apellidos           varchar(25) NOT NULL,
       carnet              varchar(10) PRIMARY KEY,
       email               varchar(30),
       telefonos           varchar(35),
       horascumplidas      integer DEFAULT 0,
       borrado		   boolean DEFAULT false
);

-- XML LISTO (SE ELIMINO UN HASH)

CREATE TABLE personalapoyo (

       cedula               varchar(11) PRIMARY KEY,
       nombres              varchar(25) NOT NULL,
       apellidos            varchar(25) NOT NULL,
       email                varchar(30),
       telefonos            varchar(35),
       borrado		    boolean DEFAULT false
);

-- XML SIN PROBLEMA

CREATE TABLE plantel (

       rif              varchar(12) PRIMARY KEY,
       nombre           varchar(70) NOT NULL,
       distrito         varchar(30) NOT NULL,
       tipo             varchar(12) NOT NULL,
       telefonos        varchar(47),
       direccion        varchar(140),
       correo           varchar(30),
       coordnombres	varchar(25) NOT NULL,
       coordapellidos	varchar(25) NOT NULL,
       coordtelfs	varchar(35) NOT NULL,
       coordemail	varchar(30) NOT NULL,
       coordcedula	varchar(11) NOT NULL,	
       direcnombres    varchar(25),
       direcapellidos	varchar(25),
       directelfs	varchar(35),
       direcemail	varchar(30),
       direccedula	varchar(11),	
       menciones        varchar(100) NOT NULL,
       materiasfalla   varchar(100),
       programasremit  varchar(100),
       danosplanta     varchar(200),
       matricula        integer,
       asistiocharla   boolean,
       orientacionfam  boolean,
       orientacionind  boolean,
       borrado		boolean DEFAULT false
);

CREATE TABLE embarazoplantel(

       id	SERIAL PRIMARY KEY,
       plantel	varchar(12),
       tipo	varchar(10),
       grupo	varchar(16),
       cantidad	integer,
       borrado	boolean	DEFAULT false

);
-- XML LISTO SE CAMBIO ID POR INCREMENT

CREATE TABLE charlaplantel (

       id    		SERIAL PRIMARY KEY,
       plantel          varchar(12),
       estudiante       varchar(10),
       fecha            varchar(11),
       borrado		boolean DEFAULT false
       
);

-- XML LISTO SE BORRO ATRIBUTO PLANTEL_1 EL PK ES UN PLANTEL Y SE HIZO EL PK ONE-TO-ONE

CREATE TABLE violenciaplantel (

       id    		SERIAL PRIMARY KEY,
       plantel          varchar(12),
       tipoviolencia   varchar(12),
       medioviolencia  varchar(25),
       causaviolencia  varchar(25),
       grupoagresor    varchar(25),
       grupovictima    varchar(25),
       consecuencias    varchar(140),
       medidastomadas  varchar(140),
       borrado		boolean DEFAULT false
);

-- XML LISTO (SE ELIMINARON TODOS LOS REVERSE INNECESARIOS)

CREATE TABLE usuario (
       nombres        varchar(25) NOT NULL,
       apellidos      varchar(25) NOT NULL,
       email          varchar(30) unique,
       clave       varchar(64) NOT NULL,
       cedula         varchar(11) PRIMARY KEY,
       esadmin       boolean NOT NULL,
       fecharegistro varchar(11),
       telefonos      varchar(35),
       borrado	      boolean DEFAULT false
);

-- XML LISTO RELACION ONE-TO-ONE Y HASH REVERSOS INNECESARIOS

CREATE TABLE personalpio (
       cedula             varchar (11) PRIMARY KEY,
       cargo              varchar (30),
       borrado		  boolean DEFAULT false

);

-- XML LISTO RELACION ONE-TO-ONE Y HASH REVERSOS INNECESARIOS

CREATE TABLE profesor (
       cedula         varchar(11) PRIMARY KEY,
       fechaingreso  varchar(11),
       cargo          varchar(10),
       borrado	      boolean DEFAULT false
);

--XML LISTO PK INCREMENT

CREATE TABLE profesormateria (
       id		      SERIAL PRIMARY KEY,
       cedula		      varchar(11),
       materia                varchar(11),
       borrado		      boolean DEFAULT false
);

--XML LISTO PK INCREMENT

CREATE TABLE mensaje (

       idmensaje     SERIAL PRIMARY KEY,
       fecha         varchar(11),
       emisor        varchar(11),
       contenido     varchar(200),
       procesado     boolean DEFAULT false,
       asunto        varchar(64),
       borrado	     boolean DEFAULT false
       
);

-- Se le coloco relacion one to one con primary key foreign hacia usuario se le borro
-- unas cosas de usuario, el tipo de la clave primaria es del tipo usuario

CREATE TABLE aspirante (
       cedula          varchar(11) PRIMARY KEY,
       plantel         varchar(12),
       nivelingreso   varchar(20),
       horastrabajo   integer,
       beca            varchar(30),
       hermanosuniv   integer,
       servicios       varchar(100),
       actividadextr  varchar(100),
       materiasfalla  varchar(100),
       dependenciaeco varchar(10),
       habitosestudio varchar(100),
       promedio        double precision,
       sexo	       varchar(1),
       borrado	       boolean DEFAULT false
);

-- LISTO XML ONE TO ONE HACIA ASPIRANTE 

CREATE TABLE preinscrito (

       cedula           varchar(11) PRIMARY KEY,
       numeropreins    varchar(30),
       fechapreins     varchar(11),
       borrado		boolean DEFAULT false
);

-- LISTO XML ONE TO ONE HACIA ASPIRANTE 

CREATE TABLE estudiante (

       cedula           varchar(11) PRIMARY KEY,
       numeroins       varchar(30),
       fechains        varchar(11),
       borrado		boolean DEFAULT false
);

-- XML LISTO AUTO INCREMENT
CREATE TABLE estudianterepresentante (

       id		SERIAL PRIMARY KEY,
       representado     varchar(11),
       representante    varchar(11),
       borrado		boolean DEFAULT false
       
);


-- XML SIN PROBLEMA
CREATE TABLE preinscritocarrera (

       id    		SERIAL PRIMARY KEY,
       preinscrito      varchar(11),
       carrera          varchar(10),
       borrado		boolean DEFAULT false
       
);

-- XML SIN PROBLEMA
CREATE TABLE examen (

       codigo           SERIAL PRIMARY KEY,
       fecha            varchar(11),
       aula             varchar(38),
       tipo             varchar(25),
       borrado		boolean DEFAULT false

);

--XML CON AUTOINCREMENT
CREATE TABLE examenasisten (

       id    		SERIAL PRIMARY KEY,
       examen           integer,
       preinscrito      varchar(11),
       notaobtenida     double precision,
       borrado		boolean DEFAULT false
       
);

--XML CON AUTOINCREMENT
CREATE TABLE examenapoyo (

       id    		SERIAL PRIMARY KEY,
       examen           integer,
       personalapoyo    varchar(11),
       borrado		boolean DEFAULT false
       
);

--XML CON AUTOINCREMENT 
CREATE TABLE clase (

       codigo      SERIAL PRIMARY KEY,
       profesor    varchar(11),
       catedra     varchar(10),
       aula        varchar(38),
       dia	   varchar(10),
       bloque	   varchar(18),
       valida	   varchar(20),
       borrado	   boolean DEFAULT false
);

--XML CON AUTOINCREMENT
CREATE TABLE claseestudiante (

       id    		SERIAL PRIMARY KEY,
       clase            int,
       estudiante       varchar(11),
       borrado		boolean DEFAULT false
       
);

--XML CON AUTOINCREMENT
CREATE TABLE noticia (

       idnoticia      SERIAL PRIMARY KEY,
       titulo	      varchar(26),
       contenido      varchar(140),
       imagen	      varchar(60)
);

ALTER TABLE profesor ADD CONSTRAINT fk_profced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE profesormateria ADD CONSTRAINT fk_profced_profesor FOREIGN KEY (cedula) REFERENCES profesor (cedula);
ALTER TABLE profesormateria ADD CONSTRAINT fk_profmat_catedra FOREIGN KEY (materia) REFERENCES catedra (codigo);
ALTER TABLE personalpio ADD CONSTRAINT fk_perced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE mensaje ADD CONSTRAINT fk_menemi_usuario FOREIGN KEY (emisor) REFERENCES usuario (cedula);
ALTER TABLE proveedoresevento ADD CONSTRAINT fk_prorif_proveedor FOREIGN KEY (rif) REFERENCES proveedor (rif);
ALTER TABLE proveedoresevento ADD CONSTRAINT fk_proeve_evento FOREIGN KEY (idevento) REFERENCES evento (idevento);
ALTER TABLE clase ADD CONSTRAINT fk_clapro_profesor FOREIGN KEY (profesor) REFERENCES profesor (cedula);
ALTER TABLE clase ADD CONSTRAINT fk_clacat_catedra FOREIGN KEY (catedra) REFERENCES catedra (codigo);
ALTER TABLE clase ADD CONSTRAINT fk_claaul_aula FOREIGN KEY (aula) REFERENCES aula (lugar);
ALTER TABLE violenciaplantel ADD CONSTRAINT fk_viopla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE aspirante ADD CONSTRAINT fk_asppla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE aspirante ADD CONSTRAINT fk_aspced_usuario FOREIGN KEY (cedula) REFERENCES usuario (cedula);
ALTER TABLE preinscrito ADD CONSTRAINT fk_preced_aspirante FOREIGN KEY (cedula) REFERENCES aspirante (cedula);
ALTER TABLE estudiante ADD CONSTRAINT fk_estced_preinscrito FOREIGN KEY (cedula) REFERENCES preinscrito (cedula);
ALTER TABLE estudianterepresentante ADD CONSTRAINT fk_estrep_aspirante FOREIGN KEY (representado) REFERENCES aspirante (cedula);
ALTER TABLE estudianterepresentante ADD CONSTRAINT fk_estrep_representante FOREIGN KEY (representante) REFERENCES representante (cedula);
ALTER TABLE preinscritocarrera ADD CONSTRAINT fk_prepre_preinscrito FOREIGN KEY (preinscrito) REFERENCES preinscrito (cedula);
ALTER TABLE preinscritocarrera ADD CONSTRAINT fk_precar_carrera FOREIGN KEY (carrera) REFERENCES carrera (codigo);
ALTER TABLE examen ADD CONSTRAINT fk_exaaul_aula FOREIGN KEY (aula) REFERENCES aula (lugar);
ALTER TABLE examenasisten ADD CONSTRAINT fk_exaexa_examen FOREIGN KEY (examen) REFERENCES examen (codigo);
ALTER TABLE examenasisten ADD CONSTRAINT fk_exapre_preinscrito FOREIGN KEY (preinscrito) REFERENCES preinscrito (cedula);
ALTER TABLE examenapoyo ADD CONSTRAINT fk_exapexa_examen FOREIGN KEY (examen) REFERENCES examen (codigo);
ALTER TABLE examenapoyo ADD CONSTRAINT fk_exapper_presonalapoyo FOREIGN KEY (personalApoyo) REFERENCES personalapoyo (cedula);
ALTER TABLE claseestudiante ADD CONSTRAINT fk_clacla_clase FOREIGN KEY (clase) REFERENCES clase (codigo);
ALTER TABLE claseestudiante ADD CONSTRAINT fk_claest_estudiante FOREIGN KEY (estudiante) REFERENCES estudiante (cedula);
ALTER TABLE charlaplantel ADD CONSTRAINT fk_chapla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);
ALTER TABLE charlaplantel ADD CONSTRAINT fk_chaest_estudiantesc FOREIGN KEY (estudiante) REFERENCES estudiantesc (carnet);
ALTER TABLE embarazoplantel ADD CONSTRAINT fk_embpla_plantel FOREIGN KEY (plantel) REFERENCES plantel (rif);


