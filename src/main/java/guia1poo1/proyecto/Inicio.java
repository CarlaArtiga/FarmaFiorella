package guia1poo1.proyecto;

public class Inicio {
    
    //Instanciar clase
    static Acceso ac = new Acceso();
    static Menu mn = new Menu();
    static Producto p = new Producto();

    public static void main(String[] args) {
        
        ac.bienvenidad();
        ac.LecturaArchivo();

        //mn.ingresoSistema();
        
    }
}
