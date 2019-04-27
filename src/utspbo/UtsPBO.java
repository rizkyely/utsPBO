/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Rizky Ely
 */
public class UtsPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        intel i = new intel(2);
        amd a = new amd(3);
        komputer k = new komputer(i);
        k.cetakInfo();
        k.memasang(i);
        k.mencabut(a);
        k.cetakInfo();        
    }
    
}
