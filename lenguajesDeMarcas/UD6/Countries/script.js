const apiUrl = "https://restcountries.com/v3.1/";
const endpointValorNombre = "name/"

// Función para obtener datos de un pais por un valor de busqueda
async function obtenerPais(valorBusqueda) {
    try {
        const respuesta = await fetch(`${apiUrl}${endpointValorNombre}${valorBusqueda}`);
        if (!respuesta.ok) {
            throw new Error("No se encontró el pais");
        }
        let datos = await respuesta.json();
        for (let dato of datos) {
            mostrarPais(dato);
        }
    } catch (error) {
        console.error("Error al obtener el pais:", error);
    }
}

// Función para mostrar los datos del pais en la página
function mostrarPais(dato) {
    const contenedor = document.getElementById("pais-nombre");

    contenedor.innerHTML = `
        <p>${dato.flag}</p>
    `
}

// Manejo del formulario de búsqueda
document.getElementById("form-nombre").addEventListener("submit", function (event) {
    event.preventDefault();
    const input = document.getElementById("input-nombre").value.trim().toLowerCase();
    if (input) {
        obtenerPais(input);
    }
});