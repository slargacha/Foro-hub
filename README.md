# 💬 Foro-hub

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

## 📝 Explicacion de las funcionalidades

A continuacion vamos a sumergirnos en este sistema y vamos a detallar un poco cada funcionalidad que este brinda:

### 🔐 Autenticacion

Este sistema cuenta con una capa de segurdad con la ayuda de Spring Security, por lo cual para autenticarse existe un endpoint "/login" a el cual se le puede enviar informaciones mediante el metodo POST en el cuerpo de la solicitud HTTP en formato JSON con el email y password, si no te encuentras registrado en la base de datos no te generara el token necesario para utilizar las demas funcionalidades del programa:

![image](https://github.com/user-attachments/assets/2f1fb447-d565-4542-acdd-ca6d546f71c7)

### 📋 Listar topicos

Esta caracteristica del sistema funciona mediante el endpoint "/topicos" enviando una solicitud HTTP con el metodo GET sin informacion en el cuerpo de la solicitud, aqui el sistema responde con una solicitud HTTP y en el cuerpo el listado de todos los topicos creados en el sistema en formato JSON, como se muestra en la imagen:

![image](https://github.com/user-attachments/assets/a0ecce07-55b2-471c-b2ec-1340350690a1)

### 🔍 Listar topico por Id

