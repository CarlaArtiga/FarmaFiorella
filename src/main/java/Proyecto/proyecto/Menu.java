package Proyecto.proyecto;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Menu {
    //Instancia de la clase acceso
    static Acceso ac = new Acceso();
    static Producto pr = new Producto();
    
    //Atributos para estructurar el menu
    private String mensaje = "¿Que desea hacer?";
    private String opcion1 = "1- Venta nueva";
    private String opcion2 = "2- Consultar inventarios";
    private String opcion3 = "3- Cambiar contraseña";
    private String opcion4 = "4- Salir del sistema";
    private int opc;
    private Scanner lector = new Scanner(System.in);

    //constructor
    public Menu() {
    }

    //getter y setter
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

    //Metodo para para menu
    public void ingresoSistema() {
        do {
            System.out.println("");
            System.out.println(mensaje);
            System.out.println(opcion1);
            System.out.println(opcion2);
            System.out.println(opcion3);
            System.out.println(opcion4);
            System.out.print("Digite la opcion: ");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    //venta nueva
                    System.out.println("Opcion no disponible aun");
                    break;
                case 2:
                    //Mostrar inventario
                    pr.menuInventario();
                    break;
                case 3:
                    //cambio de contraseña
                    ac.CambioContra();
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
