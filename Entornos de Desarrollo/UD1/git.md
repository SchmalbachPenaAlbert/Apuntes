# Documentación Git

## Introducción

### ¿Qué es Git?

**Git** es un **sistema de control de versiones** (**Version Control System** o VCS) que permite a los desarrolladores **gestionar y realizar un seguimiento de los cambios del código a lo largo del tiempo**.
Git, al ser **descentralizado**, permite que **cada desarrollador mantenga una copia completa del repositorio**.
Por ejemplo, un desarrollador puede trabajar por su cuenta en una nueva funcionalidad y realizar una serie de commits antes de compartir su trabajo con el equipo.

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