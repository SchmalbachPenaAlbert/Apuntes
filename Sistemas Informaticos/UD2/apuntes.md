# Permisos de grupos y usuarios

* **lectura**(read; r)
* **escritura** (write; w)
* **ejecución** (execution; x)

```bash
drwxr-x--- 2 comercialJefe comercial 4096 feb 21 12:40 Gestion
```

* En este ejemplo, *comercialJefe* tiene permiso de **lectura**(read; r), **escritura** (write; w) y **ejecución** (execution; x).
* Los del grupo *comercial* tienen permisos de **lectura** (read; r) y **ejecución** (execution; x), pero **NO** tienen de escritura.
* Todos los usuarios que NO son ni el propietario (comercialJefe) ni miembros del grupo comercial, **no tienen permisos**. POr tanto, **no puede acceder al directorio** nadie más que los anteriormente mencionados.

* **2** (HARD LINKS) - Este número representa la cantidad de enlaces duros (hard links) que apuntan al inodo de este archivo o directorio.

**4096** (TAMAÑO) - Indica el tamaño del directorio en bytes. Este es el tamaño típico para un directorio en sistemas de archivos Linux.

**feb 21 12:40** (DATE) - Muestra la fecha y hora de la última modificación realizada en el directorio (por ejemplo, al añadir o eliminar un archivo dentro de él).

**Gestion** (NAME) - Este es el nombre del archivo o directorio en cuestión