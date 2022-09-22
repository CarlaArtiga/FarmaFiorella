/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto.proyecto;

/**
 *
 * @author LENOVO
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ventas {

    //Atributos privados: 
    //Las listas nos sirven para guardar valores dinamicamente.
    private ArrayList Precio = new ArrayList();
    //Variables que nos permiten calcular el total de compra
    private float SubTotal = 0;
    private float Descuento = (float) 0.03;
    private float Total = 0;
    //Instancia de la clase producto
    Producto p = new Producto();
    //Variable Scanner
    Scanner lector = new Scanner(System.in);
    //Variable prod para buscar el id producto, respuesta para terminar bucles, cont para contar la cantidad
    //productos adquiridos.
    private int prod = 0;
    private int respuesta = 0;
    private int cont = 0;
    //Array para guardar las cantidades que desea comprar el usuario 
    private int[] cantidad = new int[10];
    //Lista para para guardar dinamicamente las cantidades otorgadas por el usuario
    private ArrayList cant = new ArrayList();
    //Lista para guardar los productos que el usuario desee adquirir
    private ArrayList CarritoComp = new ArrayList();

    //Variable bandera: 0 = cantidad ingresada, 1 = existencia de inventario
    private int CantidadVenta;

    //atributos para escritura de archivo: general el ticket
    FileWriter Archivo = null;
    PrintWriter pw = null;

    //Atributos para el ticket
    private float SubTotalTicket = 0;
    private float TotalTicket = 0;
    private float DescuentoTicket = (float) 0.03;

    //Constructor para iniciarlizar valores
    public Ventas() {

        //Valores iniciales para la lista ventas
        Precio.add(0.10);
        Precio.add(5);
        Precio.add(3);
        Precio.add(0.50);
        Precio.add(0.80);
        Precio.add(0.30);
        Precio.add(2.25);
        Precio.add(2.75);
        Precio.add(1.80);
        Precio.add(3.25);

    }

    //Getter y setter para cada uno de los atributos
    public int[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList getCarritoComp() {
        return CarritoComp;
    }

    public void setCarritoComp(ArrayList CarritoComp) {
        this.CarritoComp = CarritoComp;
    }

    public int getCantidadVenta() {
        return CantidadVenta;
    }

    public void setCantidadVenta(int CantidadVenta) {
        this.CantidadVenta = CantidadVenta;
    }

    public float getSubTotalTicket() {
        return SubTotalTicket;
    }

    public void setSubTotalTicket(float SubTotalTicket) {
        this.SubTotalTicket = SubTotalTicket;
    }

    public float getTotalTicket() {
        return TotalTicket;
    }

    public void setTotalTicket(float TotalTicket) {
        this.TotalTicket = TotalTicket;
    }

    public float getDescuentoTicket() {
        return DescuentoTicket;
    }

    public void setDescuentoTicket(float DescuentoTicket) {
        this.DescuentoTicket = DescuentoTicket;
    }

    public ArrayList getPrecio() {
        return Precio;
    }

    public void setPrecio(ArrayList Precio) {
        this.Precio = Precio;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public float getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(float SubTotal) {
        this.SubTotal = SubTotal;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public int getProd() {
        return prod;
    }

    public void setProd(int prod) {
        this.prod = prod;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public ArrayList getCant() {
        return cant;
    }

    public void setCant(ArrayList cant) {
        this.cant = cant;
    }

    //metodo que muestra los productos: id, nombre y precio
    void MostrarProducto() {
        System.out.println("");
        System.out.println("Bienvenido, a FarmaFiorella, catalogo de productos: ");
        System.out.println("");
        for (int i = 0; i < p.getIdProducto().length; i++) {
            System.out.print(p.getIdProducto()[i] + " ");
            System.out.print(p.getProductos()[i] + ", $");
            System.out.println(Precio.get(i));
        }
    }

    //Metodo para agregar productos 
    void AgregarProducto() {
        //Preguntarle al cliente que productos de la lista desea adquirir

        do {
            System.out.println("Bienvenido a FarmaFiorella, ¿Que productos desea adquirir?");
            prod = lector.nextInt();
            //Si prod que equivale a digitar el id producto es menor o mayor que 10 entonces no se ha encontrado
            if (prod < 0 || prod > 10) {
                System.out.println("Producto no encontrado");
            } else {
                cont++;
                //Recorrer el array de Id Producto
                for (int i = 0; i < p.getIdProducto().length; i++) {
                    //Si prod equivale a la posicion del array IdProducto, quiere decir que el producto se encontro
                    if (prod == i) {
                        System.out.println(" ");
                        //Pedirle al usuario que ingrese una cantidad 
                        System.out.println("¿Cual es la cantidad que desea adquirir de " + p.getProductos()[(i - 1)] + " ?");
                        //Guardar la cantidad en un array
                        cantidad[i] = lector.nextInt();
                        //Pasar el producto vendido a una lista de Carrito de Compras
                        CarritoComp.add(p.getProductos()[(i - 1)]);
                        //Si la cantidad es mayor que el stock entonces se venden las existencias
                        if (cantidad[i] > p.getCantidad()[(i - 1)]) {
                            System.out.println("Lo sentimos, Solo tenemos: " + p.getCantidad()[(i - 1)]);
                            System.out.println("Pero, le vendemos las existencias");
                            //El stock se pasa a una variable
                            CantidadVenta = p.getCantidad()[(i - 1)];
                            //Se disminuye el stock a 0
                            p.Disminuir(prod, p.getCantidad()[i - 1]);
                            //Y la cantidad vendida la pasamos a una lista
                            cant.add(CantidadVenta);

                        } else {
                            //Sino la cantidad otorgada por el usuario se pasa a CantidadVenta  
                            CantidadVenta = cantidad[i];
                            //Se disminuye el stock
                            p.Disminuir(prod, cantidad[i]);
                            //Se pasa a una lista
                            cant.add(CantidadVenta);
                        }
                        if (p.getCantidad()[i - 1] == 0) {
                            System.out.println("Lo sentimos, producto agotado");
                            cont--;
                        }

                    }
                }
                //Se le pregunta al usuario si quiere ingresar mas productos
                //mientras la respuesta sea 1, se seguira con el bucle
                System.out.println("");
                System.out.println("¿Desea agregar mas productos? Digite <<Si = 1, No = 0>>");
                respuesta = lector.nextInt();
            }
            //Se imprime la cantidad de productos adquiridos
            System.out.println("Contador de productos: " + cont);
        } while (respuesta == 1);

    }
//Metodo que recorre hasta la cantidad de productos adquiridos y muestra los detalles de compra

    void MostrarCompras() {

        System.out.println("");
        System.out.println("***Resumen de articulos***");
        //Si el contador es diferente de 0, quiere decir que hay articulos
        if (cont != 0) {
            for (int i = 0; i < cont; i++) {
                System.out.print(CarritoComp.get(i) + " ");
                System.out.print("Cantidad: " + cant.get(i) + " ");
                System.out.print("Precio:  $");
                System.out.println(Precio.get(i));
            }
        } else {
            System.out.println("No ha ingresado ningun producto, gracias por visitarnos");
        }

    }
//Metodo facturar

    void Factura() {
        int i = 0;
        //Si el contador es 0, que no imprima la factura
        if (cont != 0) {
            System.out.println("");
            System.out.println("****Factura de Compra****");
            System.out.println("Farmacia FarmaFiorella");
            System.out.println("");
            //Se recorre hasta la cantidad de productos adquiridos
            for (i = 0; i < cont; i++) {
                //Se calcula el subtotal: cantidad por precio
                SubTotal = Integer.parseInt(cant.get(i).toString()) * Float.parseFloat(Precio.get(i).toString());
                System.out.println(CarritoComp.get(i) + "---- " + cant.get(i) + " x " + Precio.get(i) + " = " + SubTotal);
                //Se calcula la suma del subtotal
                Total = Total + SubTotal;
            }
            //Si el total de compra es mayor que 20 entonces se calcula el descuento
            if (Total > 20) {
                Total = Total - (Total * Descuento);
                System.out.println("Total de compra: " + Total);

            } else {
                System.out.println("Total de compra: " + Total);
            }
        }

    }
//Metodo de escritura de archivo para generar ticket
//Se difiere del anterior con el cambio de System a print writer

    void Ticket() {
        //Si el contador es 0 que no genere el ticket
        if (cont != 0) {
            try {
                Archivo = new FileWriter("Factura.txt", true);
                pw = new PrintWriter(Archivo);
                pw.println("");
                pw.println("****Factura de Compra****");
                pw.println("Farmacia FarmaFiorella");
                pw.println("");
                int i = 0;

                for (i = 0; i < cont; i++) {
                    SubTotalTicket = Integer.parseInt(cant.get(i).toString()) * Float.parseFloat(Precio.get(i).toString());

                    pw.println(CarritoComp.get(i) + "---- " + cant.get(i) + " x " + Precio.get(i) + " = " + SubTotalTicket);
                    TotalTicket = TotalTicket + SubTotalTicket;
                }
                if (TotalTicket > 20) {
                    TotalTicket = TotalTicket - (TotalTicket * DescuentoTicket);
                    pw.println("Total de compra: " + TotalTicket);
                    pw.println("----------------------------------------------------");
                    pw.println("");
                } else {
                    pw.println("Total de compra: " + TotalTicket);
                    pw.println("----------------------------------------------------");
                    pw.println("");

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != Archivo) {
                        Archivo.close();
                        System.out.println("Gracias por comprar en FarmaFiorella, ticket generado");
                        System.out.println("Lo esperamos nuevamente");
                        //Limpiamos las listas y valores, para evitar que se sobreescriban
                        CarritoComp.clear();
                        cant.clear();
                        SubTotal = 0;
                        Total = 0;
                        SubTotalTicket = 0;
                        TotalTicket = 0;
                        cont = 0;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        }

    }

}
