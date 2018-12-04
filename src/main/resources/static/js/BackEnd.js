//var host = 'http://localhost:8080/convertidor/';
var host = 'https://parcialfinalarswdavid.herokuapp.com/convertidor/'

async function celsius(numero){
    console.log(numero);
    await Promise.resolve(axios.get(host+"celsius?grado="+numero)
    .then(async function(response){
        Convertidor.setNumero(response.data);
    }));
}


async function fahrenheit(numero){
    console.log(numero);
    await Promise.resolve(axios.get(host+"fahrenheit?grado="+numero)
    .then(async function(response){
        console.log(response.data)
        Convertidor.setNumero(response.data);
    }));
}