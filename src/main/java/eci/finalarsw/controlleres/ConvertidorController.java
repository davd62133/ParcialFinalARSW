package eci.finalarsw.controlleres;

import eci.finalarsw.Servicios.Convertidor;
import eci.finalarsw.model.Grado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/convertidor")
public class ConvertidorController {
    @Autowired
    Convertidor convertidor;

    @RequestMapping(value ="/celsius", method = RequestMethod.GET)
    public ResponseEntity<?> getCelsius(@RequestParam Double grado){
        try{
            return new ResponseEntity<>(new Grado(convertidor.CelsiusAFahrenheit(grado), grado),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(ConvertidorController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value ="/fahrenheit", method = RequestMethod.GET)
    public ResponseEntity<?> getFahrenheit(@RequestParam Double grado){
        try{
            System.out.println(convertidor.FahrenheitACelsius(grado));
            return new ResponseEntity<>(new Grado(convertidor.FahrenheitACelsius(grado), grado),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(ConvertidorController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

