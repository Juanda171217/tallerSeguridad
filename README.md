# Titulo

Taller Seguridad

## Descripción

El objetivo es construir una aplicación web segura usando certificados digitales

[![awsAr.png](https://i.postimg.cc/HxtWWKbJ/awsAr.png)](https://postimg.cc/9RrHJL8V)

### Prerrequisitos

Para correr este se debe tener instalado:

- Maven
- Java

### Procedimientos AWS

* Lo que se hizo en AWS fue crear las instancias y modificar los grupos de seguridad para poder usarlas

[![awsp.png](https://i.postimg.cc/JnL5Jyvy/awsp.png)](https://postimg.cc/JypXCh1m)

* Con la ayuda del protocolo sftp se trajo a la maquina virtual la carpeta target comprimida y luego se puso a correr en la maquina virtual el programa

[![awso.png](https://i.postimg.cc/yNPkQkW3/awso.png)](https://postimg.cc/yJD1W6m7)

* Para poner a correr el programa se uso el siguiente comando en linux

```
java -cp target/classes:target/dependency/* edu.escuelaing.arep.HelloWorld
```

* Recurde que si corre en una maquina windows, debe cambiar el comando anterior por:
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.HelloWorld
```


## Tree 
  
├───.vscode
│       settings.json
│
├───certificados
│       awskeystore.p12
│       awskeystore2.p12
│       ecikeystore.p12
│       myTrustStore.p12
│
├───src
│   ├───main
│   │   └───java
│   │       └───edu
│   │           └───escuelaing
│   │               └───arep
│   │                       HelloWorld.java
│   │                       URLReader.java
│   │
│   └───test
│       └───java
│           └───edu
│               └───escuelaing
│                   └───arep
│                           AppTest.java



## Documentación

Para visualizar la documentación se debe ejecutar el siguiente comando:

```
mvn javadoc:javadoc
```

Una vez se realice este comando, se debe buscar en la siguiente ruta "target\site\apidocs\index.html"


## Autor

- **Juan David Martinez** 

## Fecha

Marzo 2023