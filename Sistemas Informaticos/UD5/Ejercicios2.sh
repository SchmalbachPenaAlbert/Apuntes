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

verificar_par() {
    if [[ $(($1 % 2)) == 0 ]]
    then
        echo "$1 es par"
    else
        echo "$1 es impar"
    fi
}

mayor_de_tres() {
    if [[ $1 -gt $2 && $1 -gt $3 ]]
    then
        echo $1
    elif [[ $2 -gt $1 && $2 -gt $3 ]]
    then
        echo $2
    else
        echo $3
    fi
}

factorial() {
    i=2
    resultado=1
    while [ $i -le $1 ]
    do
        resultado=$((resultado * $i))
        ((i++))
    done
    echo $resultado
}

es_primo() {
    divisor_encontrado=0
    i=2
    while [ $i -lt $1 ]
    do
        if [[ $(($1 % $i)) == 0 ]]
        then
            divisor_encontrado=1
        fi
        ((i++))
    done
    if [[ divisor_encontrado -eq 0 ]]
    then
        echo "$1 es primo"
    else
        echo "$1 no es primo"
    fi
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
verificar_par $1
echo "Ej 10:"
mayor_de_tres $1 $2 $3
echo "Ej 11:"
factorial $1
echo "Ej 12:"
es_primo $1
echo "Ej 13:"
fibonacci $1