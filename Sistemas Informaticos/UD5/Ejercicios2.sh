#!/bin/bash
# Ejercicios funciones Bash 2

multiplicar() {
    resultado=$( echo "$1 * $2" | bc -l)
    echo $resultado
}

potencia() {
    base=$1
    exponente=$2
    i=0
    while [ $i -lt $exponente ]
    do
        resultado=$( echo "$resultado * $base" | bc -l)
        ((i++))
    done
    echo $resultado
}

volumen_cubo() {
    resultado=$( echo "$1 * $1 * $1" | bc -l)
    echo $resultado
}

modulo() {
    resultado=$(($1 % $2))
    echo $resultado
}

echo "Ej 4:"
multiplicar $1 $2
echo "Ej 5:"
potencia $1 $2
echo "Ej 7:"
volumen_cubo $1
echo "Ej 8:"
modulo $1 $2
echo "Ej 9:"

echo "Ej 10:"

echo "Ej 11:"

echo "Ej 12:"

echo "Ej 13:"
