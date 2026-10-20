/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosstatic;

/**
 *
 * @author Usuario
 */
public class Venta {
    
    
    //Atributos 
    private String nombreCliente, tipoProducto;
    private double precioProducto;
    private int cantidadProductos;

    public Venta() {
    }
    
    public Venta(String nombreCliente, String tipoProducto, double precioProducto, int cantidadProductos) {
        this.nombreCliente = nombreCliente;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
        this.cantidadProductos = cantidadProductos;
    }
    //  getter and setter
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
    
    
    
    
    
    //Metodos
    
    public double calcularTotalVenta(){
        return precioProducto * cantidadProductos ;
    }
    
    public static double calcularDescuento (double totalVenta){
        if (totalVenta >= 100) {
            return totalVenta *0.2;
        }else if (totalVenta >= 50) {
            return totalVenta * 0.1;
        }else if (totalVenta > 1) {
            return totalVenta * 0.05;
        }else {
            return 0 ;
        }
    }
    
    
    public void mostrarDetalle () {
        double total = calcularTotalVenta();
        double descuento = Venta.calcularDescuento(total);
        double totalPagar = total - descuento ;
        
        System.out.println("==========DETALLE DE LA VENTA ==========");
        System.out.println("Cliente " +nombreCliente);
        System.out.println("Tipo de producto;  "+tipoProducto);
        System.out.println("Precio unitario; " +precioProducto);
        System.out.println("Cantidad: " +cantidadProductos);
        System.out.println("Subtotal de la venta: $"+total);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total de la venta: $"+totalPagar);
        
    }
    
}
