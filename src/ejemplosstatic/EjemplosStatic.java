/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosstatic;



/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class EjemplosStatic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean cantidadV = false;
        int n = 0;

        // Validar la cantidad de ventas
        while (!cantidadV) {
            try {
                System.out.print("Cuantas ventas desea realizar?: ");
                n = sc.nextInt();
                sc.nextLine();

                if (n < 0) {
                    System.out.println("Solo ingrese numeros positivos.");
                } else {
                    cantidadV = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo ingrese numeros enteros.");
                sc.nextLine();
            }
        }

        // Registrar las ventas
        for (int i = 0; i < n; i++) {

            System.out.println("\n========== REGISTRO DE VENTA " + (i + 1) + " ==========");

            System.out.print("Ingrese nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Tipo de producto: ");
            String tipo = sc.nextLine();

            // Validar el precio unitario
            double precio = 0;
            boolean precioValido = false;

            while (!precioValido) {
                try {
                    System.out.print("Precio unitario: ");
                    precio = sc.nextDouble();
                    sc.nextLine();

                    if (precio < 0) {
                        System.out.println("No ingrese precios negativos.");
                    } else {
                        precioValido = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: ingrese un precio numerico valido.");
                    sc.nextLine();
                }
            }

            // Validar la cantidad de productos
            int cantidad = 0;
            boolean cantidadValida = false;

            while (!cantidadValida) {
                try {
                    System.out.print("Cantidad de productos: ");
                    cantidad = sc.nextInt();
                    sc.nextLine();

                    if (cantidad < 0) {
                        System.out.println("No ingrese cantidades negativas.");
                    } else {
                        cantidadValida = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Ingrese una cantidad entera.");
                    sc.nextLine();
                }
            }

            // Crear el objeto Venta con los datos ingresados
            Venta venta = new Venta(nombre, tipo, precio, cantidad);

            // Mostrar el detalle de la venta
            venta.mostrarDetalle();
        }

        
        sc.close();
    }
}
    
    
    

