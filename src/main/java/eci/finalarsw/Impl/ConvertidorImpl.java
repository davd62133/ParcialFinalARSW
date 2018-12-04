package eci.finalarsw.Impl;

import eci.finalarsw.Servicios.Convertidor;
import org.springframework.stereotype.Service;

@Service
public class ConvertidorImpl implements Convertidor{
    @Override
    public double CelsiusAFahrenheit(double celsius) {
        double res = ((celsius * 9/5) + 32);
        return res;
    }

    @Override
    public double FahrenheitACelsius(double fahrenheit) {
        double res = (fahrenheit -32)* 5/9;
        return res;
    }
}
