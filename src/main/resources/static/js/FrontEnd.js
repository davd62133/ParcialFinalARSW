var Convertidor = (function (){
    var numero;
    return{
        setNumero : function (num){
            numero = num;
        },
        getNumero : function (){
            return numero;
        }
    }
})();

async function setResultado(){
    var grado = document.getElementById("selectGrado").options[document.getElementById("selectGrado").selectedIndex].value
    if(grado === "celsius"){
        await celsius(document.getElementById("numeroSelect").value)
    }else{
        await fahrenheit(document.getElementById("numeroSelect").value)
    }
    document.getElementById("numeroPoner").innerHTML="Numero Ingresado: " + Convertidor.getNumero()["numViejo"] + "<br> Numero Convertido: " + Convertidor.getNumero()["numNuevo"]
}