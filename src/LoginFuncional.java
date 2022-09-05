import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose4
 */
public class LoginFuncional{

    // ATRIBUTOS O VARIABLES
    String usuario;
    String clave;
    String linea = null;
    Scanner lector = new Scanner(System.in);
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String[] acceso = new String[3];
    boolean existe = false; //para comprobar si el usuario y contraseña no coincide con ninnguna linea
// CONSTRUCTOR
    public LoginFuncional() {
    }

    // METODOS SET Y GET
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

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    //CONSULTA DATOS A USUARIO
    public void IngresoClave() {
        System.out.println("Por favor, ingrese usuario y clave: ");
        usuario = lector.next();
        clave = lector.next();
    }

    public void LecturaArchivo() {

        try {
            archivo = new File("C:\\Users\\javy\\Documents\\PRC4\\FarmaFiorella\\Miembros.txt");
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
                    System.out.println("Bienvenido");
                    existe = true;
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