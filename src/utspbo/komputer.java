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
public class komputer {
    public CPU cpu;
        public komputer(CPU cpu){
        this.cpu=cpu;
    }
    public void memasang(CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU: "+this.cpu.getCPUData()+" GHz"+" dicabut");
    }
    public void mencabut(CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU: "+this.cpu.getCPUData()+" GHz"+" dipasang");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi: "+"CPU:"+this.cpu.getCPUData()+" GHz");
    }    
}
