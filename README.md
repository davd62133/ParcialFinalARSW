# ParcialFinalARSW
# Arquitectura
La arquitectura principalmente tiene dos componentes, la primera es el servidor y el segundo en spring, no se conecta con servidores externos.
El cliente solo le puede hacer peticiones GET al servidor, estas peticiones se hacen a travéz de los PATH "/celsius" y "/fahrenhiet",
cada uno corresponde a lo que se quiere convertidor. Cuando el servidor recibe la peticion, dentro de la petcion se coloca el
parametro del numero que se desea convertir. Este entiende el numero, lo convierte con las clases que corresponde cada uno,
y devuelve una respuesta "Accepted" en conjunto con un objeto JSON que tiene el numero convertido y el numero a convertir.
# Atributos de calidad
No tiene seguridad, pero es simple y se puede extender para convertir diferentes cosas y de paso guardarlo en una base de 
datos si es necesario. Actualmente tiene la capacidad para soportar todas las peticiones del usuario, si el usuario ingresa una cadena
y no un numero, lanza un error pero el javascript no lo captura. en cualquier caso, cualquier peticion no daña al sistema.
Se hace el uso minimo de memoria para mejorar el "perfomance"
# Limitaciones
El usuario o sabrá si ingresó algo mal a no ser que mire la consola de desarollador en el browser (algo que no es usual)
El sistema maneja maximo hasta donde la memoria "double" deje 
