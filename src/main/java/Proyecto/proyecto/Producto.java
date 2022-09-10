/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto.proyecto;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Producto {

    //Atributos privados con tamaño de 10 elementos cada uno
    private String[] Productos = new String[10];
    private int[] IdProducto = new int[10];

    private int[] Cantidad = new int[10];

    //Atributo para lectura de variables
    Scanner lector = new Scanner(System.in);
    
    //Atributos para busqueda
    private int idprod;
    private String prod;
    private boolean encontrado = false;

//Constructor sin parametros que sirve para instanciar la clase e inicializar los arrays
    public Producto() {
        //Iniciar valores para el array IdProducto        
        IdProducto[0] = 1;
        IdProducto[1] = 2;
        IdProducto[2] = 3;
        IdProducto[3] = 4;
        IdProducto[4] = 5;
        IdProducto[5] = 6;
        IdProducto[6] = 7;
        IdProducto[7] = 8;
        IdProducto[8] = 9;
        IdProducto[9] = 10;

        ///Valores iniciales para el array Productos
        Productos[0] = "Enjuague Bucal";
        Productos[1] = "Anti inflamatorio";
        Productos[2] = "Anestesico";
        Productos[3] = "Antibiotico";
        Productos[4] = "Anticoagulante";
        Productos[5] = "Insulina";
        Productos[6] = "Esteroides";
        Productos[7] = "Probiotico";
        Productos[8] = "Jarabe";
        Productos[9] = "Antihipertensivo";



        //Valores iniciales para array cantidad
        Cantidad[0] = 30;
        Cantidad[1] = 5;
        Cantidad[2] = 60;
        Cantidad[3] = 100;
        Cantidad[4] = 500;
        Cantidad[5] = 20;
        Cantidad[6] = 25;
        Cantidad[7] = 30;
        Cantidad[8] = 180;
        Cantidad[9] = 50;

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

    public int[] getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int[] Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }



    //Metodo que muestra lo que contienen los 3 arrays
    public void MostrarInventario() {
        String formato = String.format("%-4s", "");

        System.out.println("Codigo " + "Producto y Cantidad");
        //Cada Array se recorre por medio de un for
        for (int i = 0; i < IdProducto.length; i++) {

            System.out.print(IdProducto[i] + formato);
            System.out.print(Productos[i]);
            System.out.print(" ----> ");
            System.out.print(Cantidad[i]);
            System.out.println("");
        }
    }

    public void BuscarID() {
        
        System.out.println("Digite el codigo del producto: ");
        idprod = lector.nextInt();

        if (idprod < 0 || idprod > 10) {
            System.out.println("Error, elemento no existe en la lista");
        } else {
            for (int i = 0; i < IdProducto.length; i++) {
                if(idprod == i){
                    System.out.println(IdProducto[(i-1)]+ " " + Productos[(i-1)] + " " + Cantidad[(i-1)]);
                    encontrado = true;
                }
            }
            if(!encontrado){
                System.out.println("Producto no encontrado");
            }
        }
        
    }
    
    public void BuscarProd(){ 
        System.out.print("Ingrese el producto a buscar: ");
        prod = lector.nextLine();
        
        for(int i = 0; i<IdProducto.length;i++){
            if(prod.equalsIgnoreCase(Productos[i])){
                encontrado = true;
                System.out.print(IdProducto[i] + " " + Productos[i] + " " + Cantidad[i]);
            }
        }
        if(!encontrado){
            System.out.println("Producto no encontrado");
        }
    }

    public void menuInventario(){
        
        String opc;
<<<<<<< HEAD

=======
        Scanner lector = new Scanner(System.in);
        
>>>>>>> f40d846e78deaa8077f4ad38e84762ff25e41a46
        do {
            System.out.println("");
            System.out.println("Elija si desea ver TODO el inventario o solo UNO");
            System.out.println("TODOS");
            System.out.println("UNO");
            System.out.println("SALIR");
            System.out.print("Escriba la opcion: ");
            opc = lector.nextLine();
            switch (opc) {
                case "TODOS":
                MostrarInventario();
                    break;
                case "UNO":
                
                    break;
                case "SALIR":
<<<<<<< HEAD


                    System.out.println("Saliendo de inventario...");

=======
                    System.out.println("Saliendo del sistema...");
>>>>>>> f40d846e78deaa8077f4ad38e84762ff25e41a46
                    Menu m = new Menu();
                    m.ingresoSistema();
                    break;      
                default:
                    System.out.println("Opcion no definida");
                    break;
            }
        } while (opc != "TODOS" && (opc != "UNO") && (opc != "SALIR"));
    }
    
}
