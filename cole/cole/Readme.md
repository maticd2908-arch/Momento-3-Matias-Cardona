# README.md – Documento de Integración

## 1. Descripción del proyecto

El proyecto Cole está hecho en Java con Spring Boot. Su función es manejar información de los profesores de un colegio.

La clase principal es `Profesor` y tiene los siguientes datos:
- ID
- Nombre
- Apellido
- Materia

También tiene un método llamado `darclase()`.

## 2. Configuración de la base de datos

El proyecto utiliza H2 para guardar la información.

La configuración se encuentra en `application.properties`.

```properties
spring.datasource.url=jdbc:h2:mem:cole
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

Con esta configuración se puede conectar el proyecto a la base de datos H2.

## 3. Conexión con el Frontend

El Frontend se puede conectar con el Backend usando Spring Boot y una API REST.

Para esto se pueden utilizar estas clases:

- `Profesor`: contiene los datos del profesor.
- `ProfesorRepository`: permite guardar y buscar profesores.
- `ProfesorService`: maneja las operaciones del sistema.
- `ProfesorController`: recibe las solicitudes de la página web.

Desde el Frontend se podrían registrar, consultar, editar y eliminar profesores.

## 4. Análisis de datos

El análisis de datos permite conocer mejor la información de los profesores.

**¿Qué preguntas responde?**

- ¿Cuántos profesores hay?
- ¿Qué materias enseñan?
- ¿Qué materia tiene más profesores?
- ¿Cuántos profesores hay por materia?

**¿Qué aporta al proyecto?**

Ayuda a organizar la información, sacar estadísticas y comparar la cantidad de profesores que enseñan cada materia.

### Relación entre Frontend y Backend

El Frontend permite ingresar y consultar los profesores. El Backend recibe esa información y la guarda en la base de datos.

Después, los datos se pueden analizar para mostrar estadísticas y resultados en la página web.

## 5. Conclusión

Este proyecto permite guardar y consultar información de los profesores. Además, mediante el análisis de datos se pueden obtener estadísticas que ayudan a entender mejor la información del colegio.