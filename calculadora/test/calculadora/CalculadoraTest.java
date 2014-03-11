/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IÑAKI
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setOperador method, of class Calculadora.
     */
    @Test
    public void testSetOperador() {
        System.out.println("setOperador");
        char op = ' ';
        Calculadora instance = new Calculadora();
        instance.setOperador(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperador method, of class Calculadora.
     */
    @Test
    public void testGetOperador() {
        System.out.println("getOperador");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getOperador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simboloOperador method, of class Calculadora.
     */
    @Test
    public void testSimboloOperador() {
        System.out.println("simboloOperador");
        int x = 0;
        Calculadora instance = new Calculadora();
        char expResult = ' ';
        char result = instance.simboloOperador(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperando method, of class Calculadora.
     */
    @Test
    public void testSetOperando() {
        System.out.println("setOperando");
        int pos = 0;
        double valor = 0.0;
        Calculadora instance = new Calculadora();
        instance.setOperando(pos, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of producto method, of class Calculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.producto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operar method, of class Calculadora.
     */
    @Test
    public void testOperar() throws Exception {
        System.out.println("operar");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.operar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Calculadora.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Calculadora instance = new Calculadora();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Calculadora.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Calculadora instance = new Calculadora();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}