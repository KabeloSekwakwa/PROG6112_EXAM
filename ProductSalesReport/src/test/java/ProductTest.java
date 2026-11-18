/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.productsalesreport.IProduct;
import com.mycompany.productsalesreport.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] mockProducts = {"Product A", "Product B", "Product C"};
        int[][] mockSales = {
            {25, 18, 20}, // Total: 63
            {15, 10, 12}, // Total: 37
            {18, 15, 20}  // Total: 53
        }; // Overall Total = 153
        
        IProduct product = new Product(mockProducts, mockSales);

        // Act
        int actualTotal = product.GetTotalProductsSold();

        // Assert
        assertEquals(153, actualTotal);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] mockProducts = {"Product A", "Product B", "Product C"};
        int[][] mockSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        }; // Total = 153, Entries = 9. Average = 17.0
        
        IProduct product = new Product(mockProducts, mockSales);

        // Act
        double actualAverage = product.GetAverageProductSold();

        // Assert
        assertEquals(17.0, actualAverage, 0.001);
    }
}
