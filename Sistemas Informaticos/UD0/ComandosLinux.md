## COMANDOS DE LA TERMINAL
#### **ls** - Muestra las carpetas o archivos por debajo de la posición actual  
- **-R**: *también tiene en cuenta los subdirectorios*
- **-l**: *muestra información más completa*)

#### **cd** - Permite moverse entre carpetas

#### **pwd** - Imprime la ruta en la que se encuentra el usuario

#### **cat** - Muestra el contenido del archivo

#### **cp** - Copia un archivo/carpeta
- **-R**: *en el caso de una carpeta, también copia los subdirectorios*

#### **grep** - Busca un archivo

#### **wc** - Cuenta el número de líneas, palabras y caracteres 
- **-l**: *muestra solo el número de líneas que contiene el archivo* |
- **-w**: *muestra solo el número de palabras que contiene el archivo* |
- **-m**: *muestra solo el número de caracteres que contiene el archivo*)

#### **mkdir** - Crea un directorio (carpeta)

#### **touch** - Crea un archivo

#### **nano** - Permite editar un archivo

#### **chmod** - Concede permisos a un programa {chmod u+x archivo.sh}

#### **mv** - Permite mover un archivo (mv [origen] [destino]) (por defecto mueve recursivamente) / Renombra archivos (mv [nombreAntiguo.txt] [nombreNuevo.txt])

#### **find** - Busca y lista archivos y directorios según parámetros
- **type**: Busca un tipo específico de archivo (-d directorio -f archivo)
- **name**: Busca por nombre (se pone entre comillas) / **iname**: Busca por nombre sin distinción entre mayúsculas y minúsculas
- **mtime**: Busca por última modificación. +N para modificados anteriores al número específicado en días. -N para modificados posteriores al número.
- **size**: Busca por tamaño
- **iname**: Busca sin distinción entre mayusuclas y minúsculas

#### **rm** - Elimina archivos. -r para que lo haga también con el directorio

#### **rmdir** - Elimina **directorios vacíos**

#### **head** - Muestra las primeras líneas de un archivo (por defecto 10)
- **-n**: *muestra otro núemro dieferente de líneas, en vez de 10*

#### **tail** - Muestra las últimas líneas de un archivo (por defecto 10)
- **-n**: *muestra otro núemro dieferente de líneas, en vez de 10*
