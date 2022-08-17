document.querySelector('#search').addEventListener("click", deletePokemon);

function deletePokemon(e){
    const id = document.querySelector("#pokemonId").value;
    fetch(`http://localhost:8080/delete/${id}`, {
        method: "DELETE",
    })
    .then(res => {
        if (!res.ok){
            console.log('Problem');
            return;
        }
        return res.json();
    })
    .then((data) => {
console.log("Deleted Successfully")
    }).catch((err) => {
        console.log('Pokémon not deleted', err);
    });
    e.preventDefault();
}
