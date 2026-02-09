const boton = document.getElementById("resaltarAnimales")
const animales = document.getElementsByClassName("animal")
boton.addEventListener("click", function() {
    for (let animal of animales) {
        animal.style.color = "green"
    }
})
