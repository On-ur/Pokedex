const newPokemon = {
    name: 'Ditto',
    type: 'Normal',
    region: 'Kanto'
};

fetch(`http://localhost:8080/save`, {
    method: 'POST',
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