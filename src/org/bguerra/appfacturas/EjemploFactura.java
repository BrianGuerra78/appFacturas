package org.bguerra.appfacturas;

import org.bguerra.appfacturas.modelo.*;


import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Brian");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        //String desc = s.nextLine();
        //Factura factura = new Factura(desc, cliente);
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        /*String nombre;
        float precio;
        int cantidad;*/

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            /*nombre = s.nextLine();
            producto.setNombre(nombre);*/
            producto.setNombre(s.nextLine());
            System.out.print("Ingrese el precio: ");
           /* precio = s.nextFloat();
            producto.setPrecio(precio);*/
            producto.setPrecio(s.nextFloat());
            System.out.print("Ingrese la cantidad: ");
            //cantidad = s.nextInt();
            //ItemFactura item = new ItemFactura(cantidad, producto);
            /*ItemFactura item = new ItemFactura(s.nextInt(), producto);
            factura.addItemFactura(item);*/
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
            System.out.println();
            s.nextLine();
        }
        //System.out.println(factura.generarDetalle());
        System.out.println(factura);
    }
}
