#!/bin/bash
# Ejercicios funciones Bash 2

multiplicar() {
    resultado=$( echo "$1 * $2" | bc -l)
    echo $resultado
}
