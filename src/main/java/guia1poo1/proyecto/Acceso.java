/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.proyecto;

/**
 *
 * @author LENOVO
 */
public class Acceso {
    
    //Atributos acceso
    private String usuario        = "admin";
    private String clave          = "admin";
    private String nombreSistema  = "FarmaFiorella";
    private String bienvenida     = "Bienvenido al sistema de FaramaFiorella";
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
        this.bienvenida = Bienvenida;
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
        System.out.println(ingreseUsuario);
        System.out.println(ingreseclave);
    }
    
    
    

}
