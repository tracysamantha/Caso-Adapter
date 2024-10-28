/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter;

/**
 *
 * @author tracy
 */
public class Client {
    private Adapter adapter;

    public Client(Adapter adapter) {
        this.adapter = adapter;
    }
    public void cargarCelular(){
      adapter.cargar();
    }    
}
