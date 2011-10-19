INSERT INTO edificio (nombre,direccion) VALUES
('MEM', 'Boulevard al frente de meu y al lado de bonsai'),
('MEU', 'Al lado de ENE y frente al estacionamiento de profesores'),
('ENE', 'Al lado de la proveeduria y detras de EGE, a mitad del boulevard'),('MYS', 'Al lado de basico 1 y diagonal a basico 2 frente a la parada del autobus');

INSERT INTO aula VALUES
('MEM - 016',36,''),
('MYS - Sala A',48,'Videobeam,Computadoras'),
('MEU - 106',36,''),
('ENE - 016',40,''),
('MEM - Auditorio',60,'Videobeam,Pizarra,Proyector');

INSERT INTO representante VALUES
('Roberto José','Perez Perez','V-4741582','MINFRA','04167891354,02123835698','Esq. El Guayabito frente a la panaderia el pan ta blando, Altagracia, Caracas','Bachiller'),
('José Antonio','Mendez Casas','V-4748582','Empresas Polar','04147891354,02124835698','Av. Principal Los Dos caminos, frente a locatel, Edificio Altagracia, Municipio Sucre, Caracas','TSU'),
('Marta Colomina','Bolivar Sucre','V-3741582','Globovision','04247891354,02123435698','Av. Azucar, Edificio Bolivar, Apartamento C-5, Sebucan, Caracas','Licenciatura'),
('Simón José','Bolivar Trinidad','V-1234234','Alcaldia Libertador','04167891334,02123843698','Casa del Libertador Frente a la Plaza Bolivar, Caracas','Primaria');

INSERT INTO proveedor VALUES
('J-12345678-0','Sillas los Tequeteques','Mobiliario','tequeteste@gmail.com','Alguna avenida, Alguna transversal frente a algun punto de referencia','02122845397');

INSERT INTO evento (nombre,descripcion,fechainicio,fechafin,lugar) VALUES
('El juego de las sillitas','Jugaremos a la sillita hasta que salga el sol','20111029','20111130','Sambil La Candelaria');

INSERT INTO proveedoresevento (rif,idevento) VALUES
('J-12345678-0',1);

INSERT INTO carrera VALUES 
('0800','Ingenieria en Computacion',''),
('0400','Licenciatura Quimica','');

INSERT INTO catedra VALUES 
('LA123','Habilidad Verbal','Habilidad Verbal'),
('MA123','Habilidad Numerica','');

INSERT INTO estudiantesc VALUES
('Jose Alberto','Goncalves Perez','08-10105','jalberto@gmail.com','02125897465',10),
('Pedro Walberto','Goncalves Pereira','08-11105','jalbertox@gmail.com','02125897463',11);

INSERT INTO personalapoyo VALUES
('V-13245876','Carlos','Huga','carlos@gmail.com','02123432312'),
('V-13245866','Juan','Lopez','juan@hotmail.com','02126432312');

INSERT INTO plantel VALUES
('J-12345682-1','U.E.P. Carlos A. Perez','zona 1','publico','02123832211',
'Av A, transversal 3, Edif. J','CarlosAP@edu.gob.ve','Carlos','Tarazona','02125467893',
'Ctara@gmail.com','E-8765456','Juan','Perez','04263451232','jp@gmail.com','V-12435687','Administracion,Ciencias','Matematica 5to Ano','','Paredes sucias',300,true,true,true);

INSERT INTO charlaplantel (plantel,estudiante,fecha)VALUES
('J-12345682-1','08-10105','20111212');

INSERT INTO embarazoplantel (plantel,tipo,grupo,cantidad) VALUES
('J-12345682-1','edad','15',1),
('J-12345682-1','edad','16',2),
('J-12345682-1','edad','17',5),
('J-12345682-1','nivel','7mo',1),
('J-12345682-1','edad','8vo',3),
('J-12345682-1','edad','5to',4);


INSERT INTO charlaplantel (plantel,estudiante,fecha) VALUES
('J-12345682-1','08-11105','20111010'),
('J-12345682-1','08-11105','20111020'),
('J-12345682-1','08-10105','20111010');

INSERT INTO usuario (nombres,apellidos,email,clave,cedula,esadmin,fecharegistro,telefonos) VALUES
('Luis Jose','Perez Perez','ljpp@gmail.com','ljppljpp','V-19000123',false,'20110123','04123451232,04163104565'),
('Luis Jesus','Perez Pereira','lupp@gmail.com','ljppljpp','V-19001234',false,'20110123','04123551232,04163504565'),
('Luis Juan','Perez Poleo','ljpe@gmail.com','ljppljpp','V-19012345',false,'20110125','04123454232,04164104565'),
('Luis Josefo','Perez Pinzer','ljop@gmail.com','ljppljpp','V-19123456',false,'20100123','04123451032,04163004565'),
('Luis Jaime','Perez Padron','ljap@gmail.com','ljppljpp','V-19234567',false,'20111123','04123451212,04163101565');

INSERT INTO personalpio (cedula,cargo) VALUES
('V-19000123','Coordinador Eventos');

INSERT INTO profesor (cedula,fechaingreso,cargo) VALUES
('V-19001234','20091010','Titular');

INSERT INTO profesormateria (cedula,materia) VALUES
('V-19001234','LA123'),
('V-19001234','MA123');

INSERT INTO mensaje (fecha,emisor,contenido,procesado,asunto) VALUES
('20111019','V-19000123','Estamos llenando la base de datos con cosas divertidas',false,'A quien pueda interesar');

INSERT INTO aspirante (cedula,plantel,nivelingreso,horastrabajo,beca,hermanosuniv,servicios,actividadextr,materiasfalla,dependenciaeco,habitosestudio,promedio,sexo) VALUES
('V-19012345','J-12345682-1','1000-2000',0,'Fundayacucho,700',0,'luz,telefono,agua,internet,tv-cable','','','total','',17.5,'M');

INSERT INTO preinscrito (cedula,numeropreins,fechapreins) VALUES
('V-19012345','K2000','20111010');

INSERT INTO estudiante (cedula,numeroins,fechains) VALUES
('V-19012345','K2000','20111014');

INSERT INTO estudianterepresentante (representado,representante)VALUES
('V-19012345','V-4741582');

INSERT INTO preinscritocarrera (preinscrito,carrera) VALUES
('V-19012345','0800');

INSERT INTO examen (fecha,aula,tipo) VALUES
('20110912','MEM - 016','Test Raven');

INSERT INTO examenasisten (examen,preinscrito,notaobtenida) VALUES
(1,'V-19012345',90.9);

INSERT INTO examenapoyo (examen,personalapoyo) VALUES
(1,'V-13245876'),
(1,'V-13245866');

INSERT INTO clase (profesor,catedra,aula,dia,bloque,valida) VALUES
('V-19001234','LA123','MEM - 016','Lunes','7-8','20110120 - 20110320');

INSERT INTO claseestudiante (clase,estudiante) VALUES
(1,'V-19012345');

INSERT INTO noticia (titulo,contenido) VALUES
('Justin Bieber en la Simon','El hico mas lindo de todos en la simon!!! Wujuuuuu!');

