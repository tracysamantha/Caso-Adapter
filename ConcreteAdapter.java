/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter;

/**
 *
 * @author tracy
 */
public class ConcreteAdapter implements Adapter {
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void cargar() {
        adaptee.CargadorDeIPhone4sA36Plus();
    }
}
