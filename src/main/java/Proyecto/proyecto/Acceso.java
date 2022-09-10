package Proyecto.proyecto;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Acceso {
    
    //Atributos acceso
    private String usuario        = "";
    private String clave          = "";
    private String nombreSistema  = "FarmaFiorella";
    private String bienvenida     = "Bienvenido al sistema de ";
    private String mensaje        = "Por favor ingrese con sus credenciales";
    private String ingreseUsuario = "Ingresar usuario: ";
    private String ingreseclave   = "Ingresar contraseña: ";
    
    //Atributos que serviran para metodos de lectura y busqueda de usuario y clave
    private String linea = null;
    private Scanner lector = new Scanner(System.in);
    private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    private String[] acceso = new String[3];
    private boolean existe = false;
    String nuevaContra = null;
    
    //Constructor
    public Acceso() {
    }

    //Método get y set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getClave() {
        return clave;
    }

    
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }
    
   
    public void setNombreSistema(String nombreSistema){
    this.nombreSistema = nombreSistema;    
    }
    
    
    public String getBienvenida(){
        return bienvenida;
    }
    
    
    public void setBienvenida(String Bienvenida){
        this.bienvenida = Bienvenida;
    }
    
    
    public String getMensaje(){
        return mensaje;
    }
    
    public String getIngreseUsuario() {
        return ingreseUsuario;
    }
    
    public void setIngreseUsuario(String ingreseUsuario) {
        this.ingreseUsuario = ingreseUsuario;
    }

    public String getIngreseclave() {
        return ingreseclave;
    }

    public void setIngreseclave(String ingreseclave) {
        this.ingreseclave = ingreseclave;
    }

    //Procedimiento psts imprimir la bienvenida al usuario
    public void bienvenidad() {
        System.out.println(bienvenida + nombreSistema);
        System.out.println(mensaje);
    }

    //Metodo para leer el archivo y verificar el usuario y clave
    public void InicioSesion() {
    
        try {
            archivo = new File("FarmaFiorella\\Miembros.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            System.out.print("Usuario: ");
            usuario = lector.nextLine();
            System.out.print("Clave: ");
            clave = lector.nextLine();


            while ((linea = br.readLine()) != null) {
                String[] usuarioclave = linea.split(",");
                if (usuarioclave[0].equals(usuario) && usuarioclave[1].equals(clave)) {
                    System.out.println("\nBienvenido " + usuario);
                    existe = true;
                    Menu m = new Menu();
                    m.ingresoSistema();
                }

                }
                if (!existe) {
                    System.out.println("Usuario o clave incorrectos");
            }
        } catch (IOException e) {
            e.getCause();
        }
    }
    
    //Metodo para cambiar contraseña
    public void CambioContra(){
        try {

            archivo = new File("Miembros.txt");


            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            System.out.print("Usuario: ");
            usuario = lector.nextLine();
            System.out.print("Clave: ");
            clave = lector.nextLine();

            
            
            while ((linea = br.readLine()) != null) {
                String[] usuarioclave = linea.split(",");
                if (usuarioclave[0].equals(usuario) && usuarioclave[1].equals(clave)) {
                    existe = true;
                    System.out.print("Digite nueva contraseña: ");
                    usuarioclave[1] = lector.nextLine();

                }

                }
                if (!existe) {
                    System.out.println("Usuario o clave no encontrados");
            }
        } catch (IOException e) {
            e.getCause();
        }
    }
}
