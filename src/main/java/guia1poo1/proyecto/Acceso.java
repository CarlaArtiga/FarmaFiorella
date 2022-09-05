package guia1poo1.proyecto;
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

    //Función
    public String getClave() {
        return clave;
    }

    //Procedimiento
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }
    
    //Nombre del sistema
    public void setNombreSistema(String nombreSistema){
    this.nombreSistema = nombreSistema;    
    }
    
    //Devolcuion de bienvenida
    public String getBienvenida(){
        return bienvenida;
    }
    
    //Retorno de bienvenida
    public void setBienvenida(String Bienvenida){
        this.bienvenida = bienvenida;
    }
    
    //Retorno mensaje
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

    //Procedimiento o Funcion para imprimir el menu
    public void bienvenidad() {
        System.out.println(bienvenida + nombreSistema);
        System.out.println(mensaje);
    }

    public void LecturaArchivo() {
    
        //String usu;
        String clave;
        String linea = null;
        Scanner lector = new Scanner(System.in);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String[] acceso = new String[3];
        boolean existe = false;

        try {
            archivo = new File("C:\\Users\\javy\\Documents\\PRC4\\FarmaFiorella\\FarmaFiorella\\Miembros.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            System.out.println("Usuario: ");
            usuario = lector.nextLine();
            System.out.println("Clave: ");
            clave = lector.nextLine();

            //String linea;
            int i = 0;
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
}
