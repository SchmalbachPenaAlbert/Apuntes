# Documentación Git

## Introducción

### ¿Qué es Git?

**Git** es un **sistema de control de versiones** (**Version Control System** o VCS) que permite a los desarrolladores **gestionar y realizar un seguimiento de los cambios del código a lo largo del tiempo**.

### ¿Cómo configurar Git?

Git **no puede funcionar sin esta configuración**, ya que **necesita asociar cada commit que realices con tu identidad**. Se deberá configurar el **nombre** y el **correo electrónico**. Para configurar estos parámetros, debemos introducir en la terminal:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```

### Estados ficheros en Git

En Git, los ficheros pueden tener 4 estados principales:
* **Untracked** - Archivos nuevos sobre los que el historial de versiones no tiene el conocimiento de la existencia
* **Modified** - Cambios no registrados ni preparados para un commit
* **Staged** - Cambios preparados para el próximo commit
* **Commited** - Cambios que forman ya parte del historial de versiones del projecto

<p align="center">
  <img src="https://reproducibility.rocks/materials/day2/01-git/images/file_cycle2.png" alt="Diagrama de los estados de Git" width="500"/>
  <br>
  <em>Diagrama de los estados de Git</em>
</p>

### ¿Cómo relaciona Git los repositorios?
Así relaciona Git los **repositorios locales y remotos**, mediante **plataformas web** como **GitHub**:
<p align="center">
  <img src="https://www.dougmahugh.com/content/images/2019/01/GitCommands-1.png" alt="Relaciones repositorios Git" width="500"/>
  <br>
  <em>Diagrama relaciones repositorios Git</em>
</p>

## Utilidades

### Recursos web

Una página muy útil para aprender los comandos de Git y otros lenguajes es **w3 schools**. La web incluye tutoriales paso a paso y explicaciones de algunos comandos que ahora veremos. Echale un vistazo pulsando [este enlace](https://www.w3schools.com/git/default.asp).

### Comandos generales

#### Git Staging

* **git add <file>** - Stagear un archivo
* **git add --all** - Stagear TODOS los cambios
* **git status** - Ver que está en el estado staged
* **git restore --staged <file>** - Hacer que un archivo deje de estar staged

#### Git Commit

* **git commit -m "message** - Hacer commit de los cambios, introduciendo un mensaje
* **git log** - Ver el historial de commits

Para guardar los cambios que hayamos hecho, necesitaremos también un mensaje que describa lo que hemos cambiado.

### Git Branch

* **git branch <name>** - Crea una nueva rama
* **git branch** - Muestra la lista de todas las ramas

Las ramas te permiten **trabajar en el código por tu cuenta, sin interferir en la rama principal (main)**.

### Git Checkout

* **git checkout <name>** - Permite desplazarse entre ramas

#### Git Merge

* **git merge <name>** - Combinar una rama en la rama principal

Ten en cuenta: Para hacer un merge porimero necesitamos situarnos en la rama principal (main).