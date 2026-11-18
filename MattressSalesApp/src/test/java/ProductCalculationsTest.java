/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.mattresssalesapp.ProductCalculations;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductCalculationsTest {

    @Test
    public void GetVat_ValidData_ReturnsCorrectValue() {
        double price = 3500.0;
        ProductCalculations calc = new ProductCalculations(price);
        double expectedVat = 3500.0 * 0.15; // 525.0
        assertEquals(expectedVat, calc.GetVat(), 0.001);
    }

    @Test
    public void GetTotal_ValidData_ReturnsCorrectValue() {
        double price = 3500.0;
        ProductCalculations calc = new ProductCalculations(price);
        double expectedTotal = 3500.0 + (3500.0 * 0.15) + (3500.0 * 0.05); // 4200.0
        assertEquals(expectedTotal, calc.GetTotal(), 0.001);
    }
}
