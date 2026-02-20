#!/bin/bash
# Ejercicios funciones Bash 2

crear_directorio() {
    if [ -e $1 ]
    then
        echo "Directorio '$1' ya existe"
    else
        mkdir -p $1
        echo "Directorio '$1' creado"
    fi
}

buscar_archivos_grandes() {
    resultado=$(find "$1" -size +${2}M)
    if [ -z "$resultado" ]
    then
        echo "No se encontraron resultados que tengan un tamaño mayor a $2 MB"
    else
        echo "$resultado"
    fi
}

buscar_por_extension() {
    resultado=$(find $1 -type f -name "*.${2}")
    echo "$resultado"
}

cambiar_permisos() {
    if [ ! -e $2 ] # si no existe...
    then
        echo "El directorio no existe!"
    else
        if [[ $1 =~ ^[0-7]{3,4}$ ]] # el doble corchete en la condición es para que bash no se lie con los corchetes del regex ([0-7])
        then
            chmod $1 $2
            echo "Permisos concedidos al archivo."
        else
            echo "Formato no válido."
        fi
    fi
}

obtener_propietario() {
    
}

echo "Ej 1:"
crear_directorio $1
echo "Ej 2:"
buscar_archivos_grandes $1 $2
echo "Ej 3:"
buscar_por_extension $1 $2
echo "Ej 4:"
cambiar_permisos $1 $2
echo "Ej 5:"
obtener_propietario $1
echo "Ej 6:"
respaldo $1
echo "Ej 7:"
tamaño_directorio $1
echo "Ej 8:"
puerto_abierto $1
echo "Ej 9:"
verificar_conectividad $1