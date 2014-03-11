/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Joseja
 */
public class Calculadora {
    private double operando1, operando2;
    private int operador;
    /**
     * @param args the command line arguments
     */
    Calculadora(){
        operando1 = 0;
        operando2 = 0;
        operador = -1;
    }
    
    Calculadora(double x) {
        operando1 = x;
        operando2 = x;
        operador = -1;
    }
    
    void setOperador(char op) {
        switch (op) {
                  case '+': operador = 1; break;
                  case '-': operador = 2; break;
                  case '*': operador = 3; break;
                  case '/': operador = 4; break;
                  default:  operador = 0; break;
        }
    }
    
    int getOperador(){
        return operador;
    }
    
    char simboloOperador(int x) {
        char simbolo;
        
        switch (x) {
            case 1: simbolo = '+'; break;
            case 2: simbolo = '-'; break;
            case 3: simbolo = '*'; break;
            case 4: simbolo = '/'; break;       
            default: simbolo = '!';break;
        }
        return simbolo;
    }
    
    void setOperando(int pos, double valor) {
        if (pos ==1) operando1 = valor;
        else if (pos ==2) operando2 = valor;
    }
    
    private double getOperando(int pos) throws Exception{
        double res;
          
        if (pos ==1) res = operando1;
        else if (pos ==2) res = operando2;
        else throw new Exception();
        
        return res;
    }
    
    double suma() {
        return (operando1 + operando2);
    }
    
    double resta() {
        return (operando1 - operando2);
    }
    
    double producto() {
        return (operando1 * operando2);
    }
    
    double division() {
        return (operando1 / operando2);
    }
    
    double operar() throws Exception{
        double resultado;
        
        if (operador<0) throw new Exception();
        else switch (operador) {
            case 1: resultado = suma(); break;
            case 2: resultado = resta(); break;
            case 3: resultado = producto(); break;
            case 4: resultado = division(); break;
            default: resultado = 0; break;
        }
        
        return(resultado);
    }
    
    void clear(){
        
        operando1 = 0;
        operando2 = 0;
        operador = -1;
    }
    
    void display() {
        try {
            System.out.println(""+getOperando(1)+ +getOperando(2)+" = "+operar()+"\n");
        } catch (Exception e) {          
            System.err.println("Error en la operación\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
