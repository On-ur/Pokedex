document.querySelector('#search').addEventListener("click", updatePokemon);



const newPokemon = {
    name: 'Ditto',
    type: 'Normal',
    region: 'Kanto'
};
function updatePokemon (e){
fetch(`http://localhost:8080/update/${id}`, {
    method: 'PUT',
    headers: {
        'Content-Type': 'application/json'
},
body: JSON.stringify(newPokemon)
}).then(res => {
    if (res.ok) {
        console.log('Problem');
        return;
    }
    return res();
})
.then(data => {
    console.log('Success');
})
.catch(err => {
    console.log('Error');
});
}