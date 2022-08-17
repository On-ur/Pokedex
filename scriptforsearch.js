
document.querySelector('#search').addEventListener("click", getPokemonById);

function getPokemonById(e){
    const id = document.querySelector("#pokemonId").value;
    fetch(`http://localhost:8080/getPokemon/${id}`)
    .then(res => res.json())
    .then((data) => {
        document.querySelector(".pokemonBox").innerHTML = `
<div class="pokemonInfo">
    <h1>${data.name}</h1>
    <p>Type: ${data.type}</p>
    <p>Region: ${data.region}</p>
    </div>
    `;
    }).catch((err) => {
        console.log('Pokémon not found', err);
    });
    e.preventDefault();
}
