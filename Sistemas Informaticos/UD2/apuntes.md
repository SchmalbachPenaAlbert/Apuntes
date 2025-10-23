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