let imagenClick = document.getElementById("imgClick")
let imagenHover = document.getElementById("imgHover")
let imagenHoverOgSrc = document.getElementById("imgHover").src
let campoTexto = document.getElementById("campoTexto")
let formulario = document.getElementById("formulario")
let nombre
let resultado = document.getElementById("resultado")
let inputNombre = document.getElementById("nombre")
let mensajeEj4 = document.createElement("p")
let mensajeEj5 = document.getElementById("mensaje")
let inputCodigo = document.getElementById("codigo")
// ej1
imagenClick.addEventListener("click", function() {
    alert("¡Siente la Energía de Burn!")
})
// ej2
imagenHover.addEventListener("mouseenter", function() {
    imagenHover.src = "https://picsum.photos/200?random=99"
})
imagenHover.addEventListener("mouseleave", function() {
    imagenHover.src = imagenHoverOgSrc
})
// ej3
campoTexto.addEventListener("keydown", function(event) {
    console.log(event.key)
})
// ej4
formulario.addEventListener("submit", function(event) {
    event.preventDefault() // prevenir que se refresque la pagina
    let nombre = inputNombre.value
    let mensajeEj4 = document.createElement("p")
    mensajeEj4.textContent = "Energía recargada, " + nombre + "!"
    resultado.appendChild(mensaje)
})
// ej5
inputCodigo.addEventListener("focus", function(event) {
    inputCodigo.style.borderColor = "green";
    mensajeEj5.textContent = "Introduce tu código de energía"
})
inputCodigo.addEventListener("blur", function(event) {
    inputCodigo.style.borderColor = ""
    mensajeEj5.textContent = ""
})