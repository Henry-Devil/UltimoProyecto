package OperacionesArrays;

import javax.swing.JOptionPane;

public final class Array {

    Persona persona1[] = new Persona[5];
    private Object J0ptionPane;
//Constructor

    public Array() {
        this.arreglo();
    }

    //Menu
    public void menu() {

        System.out.println("Bienvenido");

    }

    public void arreglo() {
        //Array

        //Cinco empleados
        for (int i = 0; i < 5; i = i + 1) {

            //Parametros
            String nombre = JOptionPane.showInputDialog("Escriba  Nombre");
            String apellido = JOptionPane.showInputDialog("Escriba  Apellido");
            String telefono = JOptionPane.showInputDialog("Digite telefono");
            String direccion = JOptionPane.showInputDialog("Direccion");
            String edad = JOptionPane.showInputDialog("Fecha de Nacimiento");

            for (int j = 0; i < 5; i++) {
        
                System.out.println("Nombre: ");
                System.out.println("" + nombre);
                System.out.println(" ");
                
                
                System.out.println("Apellido: ");
                System.out.println("" + apellido);
                System.out.println(" ");
                
                System.out.println("Telefono: ");
                System.out.println("" + telefono);
                System.out.println(" ");
                
                System.out.println("Direccion");
                System.out.println("" + direccion);
                System.out.println(" ");
                
                System.out.println("Fecha de nacimiento: ");
                System.out.println("" + edad);
                
                System.out.println("-------------------");
                
                JOptionPane.showMessageDialog(null, "¿Quieres agregar los datos restantes?");
            }
        }

    }

    public void leerArreglo() {                  
        
    }

}
