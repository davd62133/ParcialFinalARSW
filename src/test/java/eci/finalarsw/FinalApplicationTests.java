package eci.finalarsw;

import eci.finalarsw.Servicios.Convertidor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FinalApplicationTests {

	@Autowired
	Convertidor convertidor;

	@Test
	public void testCelsiusAFahrenheit() {
		for(int i  = 0; i<500; i++){
			double numero = Math.random()*100;
			Assert.assertEquals(((numero * 9/5) + 32),convertidor.CelsiusAFahrenheit(numero), 0.0001);
		}
	}

	@Test
	public void testFahreheit() {
		for(int i  = 0; i<500; i++){
			double numero = Math.random()*100;
			Assert.assertEquals((numero -32)* 5/9, convertidor.FahrenheitACelsius(numero), 0.0001);
		}
	}

}
