/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.proyecto;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Menu {
    
    //Impresion de mensajes
    private String saludo  = "Bienvenido (nombre: )";
    private String mensaje = "¿Que desea hacer?";
    private String opcion1 = "1- Venta nueva";
    private String opcion2 = "2- Consultar inventarios";
    private String opcion3 = "3- Cambiar contraseña";
    private String opcion4 = "4- Salir del sistema";
    private int opc;
    private Scanner lector = new Scanner(System.in);

    public Menu() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    //Procedimiento o Funcion
    public void ingresoSistema() {
        do {
            System.out.println(" ");
            System.out.println(saludo);
            System.out.println(mensaje);
            System.out.println(opcion1);
            System.out.println(opcion2);
            System.out.println(opcion3);
            System.out.println(opcion4);
            System.out.print("Digite la opcion: ");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Opcion no disponible aun");
                    break;
                case 2:
                    Producto p = new Producto();
                    p.MostrarInventario();
                    break;
                case 3:
                    System.out.println("Opcion no disponible aun");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no definida");
                    break;
            }
        } while (opc != 4);
    }
}
