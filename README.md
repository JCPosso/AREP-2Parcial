# Parcial AREP 02
## Descripcion
Diseñe, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

0. log
1. ln
2. sin
3. cos
4. tan
5. acos
6. asin
7. atan
8. sqrt
9. exp (el número de eauler elevado ala potendia del parámetro)


Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".


Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592


Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

"operation": "cos",

"input":  3.141592,

"output":  -0.999999

}

## Instalacion
 Clone el proyecto  del repositiorio principal  siguiendo el siguiente comando en consola de comandos o GIT
```
https://github.com/JCPosso/AREP-2Parcial.git
```

## Compilar

Usando mvn de Maven ,  nos debemos dirigir a la ruta donde está almacenado la raiz del proyecto y  ejecutamos el siguiente comando:

```
mvn install
mvn package
```
## Ejecucion

## Despliegue Localhost
Para poder realizar el despliegue en localhost debemos desplegar tanto los contenedores y las imagenes Docker ,
por lo que primero  nos ubucamis en la raiz del directorio y  ejecutamos el siguiente comando:
```
docker-compose up -d
```

Con esto nuestras imagenes y contenedores ya han sido creados y ejecutados correctamente , para comprobarlo
ejecutamos los siguientes comandos y obtendremos los siguientes resultados:

```
docker images
```
```
docker ps
```

![docker-ps](/img/dockerps.png)

### Pruebas
Si está corriendo la imagen correctamente con Docker,ingresamos en la url por el puerto 5000 
e ingresamos las siguientes operaciones
#### ln
Debemos ingresar en el navegador  la operacion ln  seguido de la query , en este caso se llama
value  y su valor va ser de 5,como se puede ver ,  nos ha retornado el JSON con 
la informacion de la operacion y su resultado.
![docker-ps](/img/pruebalocal1.png)

#### exp
Debemos ingresar en el navegador  la operacion exp seguido de la query , en este caso se llama
value  y su valor va ser de 88,como se puede ver ,  nos ha retornado el JSON con
la informacion de la operacion y su resultado.

![docker-ps](/img/pruebalocal2.png)

## AWS

### EC2 
En aws necesitamos crear una nueva instancia de ec2 
para ello nos dirigimos  A ec2 , creamos una maquina linux y descargamos las claves,
una vez esté lista  nos conectamos a traves de ssh y nos debe aparecer lo siguiente

![conexionaws](/img/conexionaws.png)

## pruebas


#### ln
Debemos ingresar en el navegador  la operacion ln  seguido de la query , en este caso se llama
value  y su valor va ser de 5,como se puede ver ,  nos ha retornado el JSON con
la informacion de la operacion y su resultado.
![aws1](/img/pruebaaws1.png)

#### exp
Debemos ingresar en el navegador  la operacion exp seguido de la query , en este caso se llama
value  y su valor va ser de 88,como se puede ver ,  nos ha retornado el JSON con
la informacion de la operacion y su resultado.

![aws2](/img/pruebaaws2.png)

### (VIDEO EN FORMATO MKV)

## Autor
[Juan Camilo Posso Guevara](https://github.com/JCPosso)
## Derechos de Autor
**©** _Juan Camilo Posso G., Escuela Colombiana de Ingeniería Julio Garavito._
## Licencia
Licencia bajo  [GNU General Public License](https://github.com/JCPosso/AREP-2Parcial/blob/master/LICENSE).





