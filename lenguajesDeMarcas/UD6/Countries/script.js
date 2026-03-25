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
    let capitales = ""
    let idiomas = ""
    let monedas = ""
    let poblacion = ""

    for (let capital of dato.capital) {
        capitales += capital + "\n"
    }

    for (let idioma of Object.values(dato.languages)) {
        idiomas += idioma + "\n"
    }

    for (let moneda of Object.values(dato.currencies)) {
        monedas += moneda.name + " (" + moneda.symbol + ")" + "\n"
    }

    if (dato.population > 1000000) {
        poblacion = (dato.population / 1000000).toFixed(2) + " milliones de habitantes"
    } else if (dato.population > 100000) {
        poblacion = (dato.population / 100000).toFixed(2) + " mil habitantes"
    } else {
        poblacion = dato.population + " habitantes"
    }

    const nombreComunNativo = Object.values(dato.name.nativeName)[0].common

    const nombreOficialNativo = Object.values(dato.name.nativeName)[0].official

    contenedor.innerHTML = `
        <p>${dato.flag}</p>
        <p><strong>Nombre común:</strong></p>
        <p>${dato.name.common} (${nombreComunNativo})</p>
        <p><strong>Nombre oficial:</strong></p>
        <p>${dato.name.official} (${nombreOficialNativo})</p>
        <p><strong>Capital:</strong></p>
        <p>${capitales}</p>
        <p><strong>Región:</strong></p>
        <p>${dato.region}</p>
        <p><strong>Subregión:</strong></p>
        <p>${dato.subregion}</p>
        <p><strong>Población:</strong></p>
        <p>${poblacion}</p>
        <p><strong>Idiomas:</strong></p>
        <p>${idiomas}</p>
        <p><strong>Monedas:</strong></p>
        <p>${monedas}</p>
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