/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron.adapter;

/**
 *
 * @author tracy
 */
public class PatronAdapter {
    public static void main(String[] args) {
    Adaptee adaptee=new Adaptee();
    Adapter adapter= new ConcreteAdapter(adaptee);
    Client client=new Client(adapter);
    client.cargarCelular();
    }
    
}
