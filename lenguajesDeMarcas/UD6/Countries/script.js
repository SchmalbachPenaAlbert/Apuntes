const apiUrl = "https://restcountries.com/v3.1/";
const endpointNombre = "name/"
const endpointRegion = "region/"
const endpointCapital = "capital/"

// Función para obtener datos de un pais por un valor de busqueda
async function obtenerPais(valorBusqueda, filtrarPor) {
    let endpoint = ""
    if (filtrarPor == "nombre") {
        endpoint = endpointNombre
    } else if (filtrarPor == "region") {
        endpoint = endpointRegion
    } else if (filtrarPor == "capital") {
        endpoint = endpointCapital
    } else {
        console.log("Error: El filtro seleccionado no está definido. Arregla el código.")
    }
    if (filtrarPor === "region") {
        document.getElementById("resultado-region").innerHTML = "";
    }
    try {
        const respuesta = await fetch(`${apiUrl}${endpoint}${valorBusqueda}`);
        if (!respuesta.ok) {
            throw new Error("No se encontró el pais");
        }
        let datos = await respuesta.json();
        for (let dato of datos) {
            mostrarPais(dato, filtrarPor);
        }
    } catch (error) {
        console.error("Error al obtener el pais:", error);
    }
}

// Función para mostrar los datos del pais en la página
function mostrarPais(dato, tipoFiltro) {
    const contenedorNombre = document.getElementById("resultado-nombre");
    const contenedorRegion = document.getElementById("resultado-region");
    const contenedorCapital = document.getElementById("resultado-capital");
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

    // formatear la población según la cantidad
    if (dato.population > 1000000) {
        poblacion = (dato.population / 1000000).toFixed(2) + " milliones de habitantes"
    } else if (dato.population > 1000) {
        poblacion = (dato.population / 1000).toFixed(1) + " mil habitantes"
    } else {
        poblacion = dato.population + " habitantes"
    }

    const nombreComunNativo = Object.values(dato.name.nativeName)[0].common

    const nombreOficialNativo = Object.values(dato.name.nativeName)[0].official

    if (tipoFiltro == "nombre") {
        contenedorNombre.innerHTML = `
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
    } else if (tipoFiltro == "region") {
        const tarjeta = document.createElement("div")
        tarjeta.innerHTML = `
            <p>${dato.flag}</p>
            <h3>${dato.name.common}</h3>
            <p><strong>Capital:</strong></p>
            <p>${capitales}</p>
            <p><strong>Población:</strong></p>
            <p>${poblacion}</p>
        `
        tarjeta.style.marginBottom = "20px";
        contenedorRegion.appendChild(tarjeta);
    } else if (tipoFiltro == "capital") {
        contenedorCapital.innerHTML = `
            <p>hola</p>
        `
    } else {
        console.log("Error: El filtro seleccionado no está definido. Arregla el código.")
    }
}

//* Manejo del formulario de búsqueda

// por nombre
document.getElementById("form-nombre").addEventListener("submit", function (event) {
    event.preventDefault();
    const input = document.getElementById("input-nombre").value.trim().toLowerCase();
    if (input) {
        obtenerPais(input, "nombre");
    }
});

// por region
document.querySelectorAll(".btn-region").forEach(btn => {
    btn.addEventListener("click", function () {
        const region = this.dataset.region;
        obtenerPais(region, "region");
    });
});

// por capital
document.getElementById("form-capital").addEventListener("submit", function (event) {
    
    event.preventDefault();
    const input = document.getElementById("input-capital").value.trim().toLowerCase();
    if (input) {
        obtenerPais(input, "capital");
    }
});