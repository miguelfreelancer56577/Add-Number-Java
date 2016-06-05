/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_1;

/**
 *
 * @author matr
 */
public class Numeros {
    private int num1;
    private int num2;
    private int min;
    private int max;
    private int suma;
    public Numeros(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    public int sumar(){
        for (int i = min+1; i < max; i++) {
            if(i%2 == 0){
                suma += i;
            }
        }
        return suma;
    }
}
