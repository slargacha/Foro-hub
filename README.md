# 💬 Foro-hub

<br>
## 🚀 Que es?

Para esta ocacion les traigo una divertida aplicacion, en la cual puedes guardar informacion de un topico de un foro. Aqui puedes guardar datos de topicos como, el titulo, el mensaje, etc y esto no es todo tambien tiene una capa de seguridad donde tendras que autenticarte antes de utilizar las otras funcionalidades del sistema.

## 📢 Como funciona?

Es una aplicacion desarrollada java con ayuda del framework Spring, es una API Rest donde se expone el endpoint "/topicos" al cual podras enviarle informacion para crear un topico, consultar los topicos, consultar un topico por Id, eliminar un topico y actualizar un topico

## ⚙️ Funciones de la aplicacion 

- Autenticacion
- Listar topicos
- Listar topico por Id
- Registrar topico
- Actualizar topico
- Eliminar topico

<br>

## 📝 Explicacion de las funcionalidades

A continuacion vamos a sumergirnos en este sistema y vamos a detallar un poco cada funcionalidad que este brinda:

### 🔐 Autenticacion

Este sistema cuenta con una capa de segurdad con la ayuda de Spring Security, por lo cual para autenticarse existe un endpoint "/login" a el cual se le puede enviar informaciones mediante el metodo POST en el cuerpo de la solicitud HTTP en formato JSON con los campos email y password, si no te encuentras registrado en la base de datos no te generara el token necesario para utilizar las demas funcionalidades del programa:

![image](https://github.com/user-attachments/assets/2f1fb447-d565-4542-acdd-ca6d546f71c7)

### 📋 Listar topicos

Esta caracteristica del sistema funciona mediante el endpoint "/topicos" enviando una solicitud HTTP con el metodo GET sin informacion en el cuerpo de la solicitud, aqui el sistema responde con una solicitud HTTP y en el cuerpo el listado de todos los topicos creados en el sistema en formato JSON, como se muestra en la imagen:

![image](https://github.com/user-attachments/assets/a0ecce07-55b2-471c-b2ec-1340350690a1)

### 🔍 Listar topico por Id

Esta caracteristica funciona igual que la anterior pero opera mediante el endpoint "/topicos/{id}" en donde puede {id} es el codigo del topico que quieres solicitar, en resumen aqui puedes consultar un topico especifico por el id, como se muestra en la siguiente imagen:

![image](https://github.com/user-attachments/assets/3d1f917d-eb2d-457d-94ae-86db45d9fb6d)

### ✏️ Registrar topico

Esta caracteristica tiene como objetivo guardar la informacion de un topico en el sistema, funciona mediante el endpoint "/topicos" enviando una solicitud HTTP utilizando el metodo POST y enviando en el cuerpo la informacion del topico que deseas registrar, los campos que se deben enviar en el JSON son: id, titulo, mensaje. El sistema respondera con una mensaje HTTP en donde el body de la respuesta tendra los campos ingresados en formato JSON tal como los envia el cliente indicando que la operacion fue realizada correctamente:

![image](https://github.com/user-attachments/assets/6a45828f-3960-41b9-a965-bd29f924b779)

### 🔄 Actualizar topico

Aqui podemos actualizar un topico, el endpoint es el "/topicos" enviando una solicitud HTTP utilizando el metodo PUT y en cuerpo de la solicitud, lo mismos campos que se envian para Registrar un topico, el sistema tomara el Id que se envia y lo busca en la base de datos de los topicos, si lo encuentra actualiza los valores, puedes enviar el titulo solamente o el mensaje solamente, el sistema lo tomara y actulizara el valor de los campos enviados:

![image](https://github.com/user-attachments/assets/cbecbe55-015c-43a3-b42e-3b1f07ad70f0)

El sistema envia una respuesta HTTP, en donde el cuerpo del mensaje va los campos enviandos por el cliente en formato JSON

### 🗑️ Eliminar topico

Es aqui donde podemos eliminar un topico, esta funcion opera en el endpoint "/topicos/{id}" tal cual lo hicimos en la funcionalidad de listar topicos por id pero utilizando el metodo DELETE en la solicitud HTTP, el "id" es el codigo que representa un topico, enviando este codigo por la URL puedes eliminar un topico tal como se muestra en pantalla:

![image](https://github.com/user-attachments/assets/a45d2b81-de75-499e-8cba-ace445a68ead)

El sistema no retorna ninguna informacion.

## 📝 Nota:

Para utilizar las funcionalidades del sistema primeramente se debe autenticar, el sistema responde con un token que debera ser enviando en la cabecera de las solicitudes HTTP que se envien a la API, este token tiene 2 hora de duracion, de lo contrario el sistema respondera con un error 403 No autorizado.

## 📧 Autor 

- Sebastian Largacha
