package programacion.ud5.pt5;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> coleccion;

    // constructor para si el zoo YA EXISTE
    Zoologico(ArrayList<Animal> coleccion) {

    }
    // constructor para si el constructor NO EXISTE (crea un nuevo ArrayList)
    public Zoologico() {
        this.coleccion = new ArrayList<>();
    }

    public ArrayList<Animal> getColeccion() {
        return coleccion;
    }
    public void setColeccion(ArrayList<Animal> coleccion) {
        this.coleccion = coleccion;
    }

    // metodos
    public String mostraColeccion() {
        String mensaje = "";
        for (Animal animal : coleccion) {
            mensaje += animal + "\n";
        }
        return mensaje;
    }

    public Animal buscarAnimal(String codigo) {
        Animal animalBuscar = null; // inicializar para que no de error
        for (Animal animal : coleccion) {
            if (animal.getCodigo().equals(codigo)) {
                animalBuscar = animal;
            }
        }
        return animalBuscar;
    }

    public Animal agregarEjemplares(String codigo, int numeroAnimales) {
        Animal animalSumar = buscarAnimal(codigo);
        if (numeroAnimales > 0) {
            if (animalSumar != null) {
                animalSumar.setCantidadEjemplares(animalSumar.getCantidadEjemplares() + numeroAnimales);
            }
        } else {
            // System.out.println("Se ha introducido una cantidad negativa o nula!");
        }
        return animalSumar;
    }
    public Animal eliminarEjemplares(String codigo, int numeroAnimales) {
        Animal animalEliminar = buscarAnimal(codigo);
        if (numeroAnimales > 0) {
            if (animalEliminar != null) {
                if (animalEliminar.getCantidadEjemplares() - numeroAnimales >= 0) {
                    animalEliminar.setCantidadEjemplares(animalEliminar.getCantidadEjemplares() - numeroAnimales);
                } else {
                    // System.out.println("No quedan suficientes animales para quitar esa cantidad de animales")
                }
            } else {
                // System.out.prinyln("No se ha encontrado eal animal")
            }
        } else {
            // System.out.println("Se ha introducido una cantidad negativa o nula!");
        }
        return animalEliminar;
    }

    public Animal eliminarEspecie(String codigo) {
        Animal animal = buscarAnimal(codigo);
        if (animal != null) {
            coleccion.remove(coleccion.get(coleccion.indexOf(animal)));
        }
        return animal;
    }
}
