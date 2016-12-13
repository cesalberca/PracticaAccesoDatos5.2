# Práctica 5.2

1. Consultas contra la base de datos xe de oracle
En esta práctica ya tenemos la base de datos XE creada en Oracle y accedemos a ella
mediante el usuario HR y su password.

    El objetivo es desarrollar un programa en java que llegue a la base de datos y solicite
    por pantalla que queremos hacer consultar, insertar o borra.

2. Pasos para crear una conectar con la BD.

    a) Configurar el acceso a la SGDB Oracle con el driver asociado.
    
    b) Conectarse a la Base de Datos utilizando la clase Connection.
    
    c) Crear sentencias SQL, utilizando objetos de tipo Statement.
    
    d) Ejecutar las sentencias SQL a través de los objetos de tipo Statement.

3. Realizar:

    a) Realizar una consulta de todos los registros de la tabla employees.
    
    b) Crear un empleado nuevo en la tabla employees.
    
    c) Borrar todos los registros insertados en la tabla employees en el año 2016 devolviendo el número de elementos borrados.