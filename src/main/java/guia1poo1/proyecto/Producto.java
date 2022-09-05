/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.proyecto;

/**
 *
 * @author LENOVO
 */
public class Producto {
    
   //Atributos privados con tamaño de 10 elementos cada uno
    private String[] Productos = new String[10];
    private int[] IdProducto = new int[10];
    private float[] Precio = new float[10];
    
    
//Constructor sin parametros que sirve para instanciar la clase e inicializar los arrays

    public Producto() {
    //Iniciar valores para el array IdProducto        
        IdProducto[0] = 101;
        IdProducto[1] = 102;
        IdProducto[2] = 103;
        IdProducto[3] = 104;
        IdProducto[4] = 105;
        IdProducto[5] = 106;
        IdProducto[6] = 107;
        IdProducto[7] = 108;
        IdProducto[8] = 109;
        IdProducto[9] = 110;

        ///Valores iniciales para el array Productos
        Productos[0] = "Enjuague Buscal";
        Productos[1] = "Anti inflamatorio";
        Productos[2] = "Anestesico";
        Productos[3] = "Antibiotico";
        Productos[4] = "Anticoagulante";
        Productos[5] = "Insulina";
        Productos[6] = "Esteroides";
        Productos[7] = "Probiotico";
        Productos[8] = "Jarabe";
        Productos[9] = "Antihipertensivo";

        //Valores iniciales para el array precio
        Precio[0] = (float) 61.99;
        Precio[1] = (float) 2.75;
        Precio[2] = (float) 13.14;
        Precio[3] = (float) 19.26;
        Precio[4] = (float) 20.80;
        Precio[5] = (float) 73.80;
        Precio[6] = (float) 14.22;
        Precio[7] = (float) 17.02;
        Precio[8] = (float) 10.12;
        Precio[9] = (float) 27.01;
        
       

    }
    //Metodos getter y setter para cada atributo
    public String[] getProductos() {
        return Productos;
    }

    public void setProductos(String[] Productos) {
        this.Productos = Productos;
    }

    public int[] getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int[] IdProducto) {
        this.IdProducto = IdProducto;
    }

    public float[] getPrecio() {
        return Precio;
    }

    public void setPrecio(float[] Precio) {
        this.Precio = Precio;
    }
     
    //Metodo que muestra lo que contienen los 3 arrays
    public void MostrarInventario() {
       System.out.println("Codigo  "+"Producto y precio");
       //Cada Array se recorre por medio de un for
        for (int i = 0; i < IdProducto.length; i++) {
            System.out.print(IdProducto[i] + "     ");
            System.out.print(Productos[i]);
            System.out.print(" ------> $");
            System.out.print(Precio[i]);
            System.out.println("");
        }
    }
}
