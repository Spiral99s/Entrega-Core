let botonEliminar = document.querySelector('.btn-eliminar');

botonEliminar.addEventListener('click', (e) => {
	let nombreCancion = botonEliminar.getAttribute('data-nombre');
    let confirmacion = window.confirm(`¿Estás seguro de que deseas eliminar la canción "${nombreCancion}"?`)
    if (!confirmacion) {
        e.preventDefault(); 
    }
});