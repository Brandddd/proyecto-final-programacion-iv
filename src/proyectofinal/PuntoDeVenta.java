package proyectofinal;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class PuntoDeVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        int opcioncaja = 0;
        double balancea = 0;
        double balancec = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Factura> facturas = new ArrayList<>();
        String afiliado = "afiliado";
        String comun = "comun";
        Caja r = new Caja();

        while (opcioncaja != 2) {

            System.out.printf("                        ¿DESEA ABRIR LA CAJA? \n");
            System.out.printf(
                    "_______________________________________________________________________________________________________\n");
            System.out.printf("\n1. SI. \n");
            System.out.printf("2. NO (ESTA OPCION CIERRA EL PROGRAMA). \n");
            System.out.printf("SELECCIONE UNA OPCION: ");

            opcioncaja = entrada.nextInt();

            if (opcioncaja == 1) {

                while (opcion != 4) {

                    System.out.printf("                                    MENU PRINCIPAL PUNTO DE VENTA: \n");
                    System.out.printf(
                            "_______________________________________________________________________________________________________\n");
                    System.out.printf("1. Agregar cliente. \n");
                    System.out.printf("2. Agregar producto. \n");
                    System.out.printf("3. Realizar una venta y generar factura. \n");
                    System.out.printf("4. Cerrar caja. \n\n");
                    System.out.printf("SELECCIONE UNA OPCION: ");

                    opcion = entrada.nextInt();

                    switch (opcion) {

                        case 1:
                            int opcion2 = 0;
                            String aux;
                            while (opcion2 != 4) {

                                System.out.printf("                                     MENU CREACION DE CLIENTES: \n");
                                System.out.printf(
                                        "_______________________________________________________________________________________________________\n");
                                System.out.printf("\n1. Crear cliente afiliado. \n");
                                System.out.printf("2. Crear cliente común. \n");
                                System.out.printf("3. Mostrar Todos los clientes añadidos. \n");
                                System.out.printf("4. Volver al menu principal. \n\n");
                                System.out.printf("SELECCIONE UNA OPCION: ");

                                opcion2 = entrada.nextInt();

                                switch (opcion2) {
                                    case 1: {
                                        Cliente c = new Cliente();
                                        Scanner ingresoc = new Scanner(System.in);
                                        System.out.printf("\n Por favor, ingrese los siguientes datos: \n");
                                        c.setTipocliente("Afiliado");
                                        System.out.printf("Nombre: ");
                                        c.setNombre(ingresoc.nextLine());
                                        System.out.printf("Apellido: ");
                                        c.setApellido(ingresoc.nextLine());
                                        System.out.printf("Identificacion: ");
                                        c.setId(ingresoc.nextLine());
                                        c.imprimirCliente();
                                        System.out.printf("\n\nEnvíe un caracter para continuar...");
                                        aux = entrada.next();
                                        clientes.add(c);
                                        break;
                                    }
                                    case 2: {
                                        Cliente c = new Cliente();
                                        Scanner ingresoc = new Scanner(System.in);
                                        System.out.printf("\n Por favor, ingrese los siguientes datos: \n");
                                        c.setTipocliente("Comun");
                                        System.out.printf("Nombre: ");
                                        c.setNombre(ingresoc.nextLine());
                                        System.out.printf("Apellido: ");
                                        c.setApellido(ingresoc.nextLine());
                                        System.out.printf("Identificacion: ");
                                        c.setId(ingresoc.nextLine());
                                        c.imprimirCliente();
                                        System.out.printf("\n\nEnvíe un caracter para continuar...");
                                        aux = entrada.next();
                                        clientes.add(c);
                                        break;
                                    }
                                    case 3:
                                        for (int k = 0; k < clientes.size(); k++) {

                                            System.out.printf("\nCliente agregado numero %d \n", +k + 1);
                                            System.out.printf("Tipo cliente: ");
                                            System.out.println(clientes.get(k).getTipocliente());
                                            System.out.printf("Nombre cliente: ");
                                            System.out.println(clientes.get(k).getNombre());
                                            System.out.printf("Apellido cliente: ");
                                            System.out.println(clientes.get(k).getApellido());
                                            System.out.printf("Codigo cliente: ");
                                            System.out.println(clientes.get(k).getId());

                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;

                        case 2:
                            int opcion3 = 0;
                            String aux2;

                            while (opcion3 != 3) {

                                System.out
                                        .printf("                                     MENU CREACION DE PRODUCTOS: \n");
                                System.out.printf(
                                        "_______________________________________________________________________________________________________\n");
                                System.out.printf("\n1. Crear un producto. \n");
                                System.out.printf("2. Imprimir inventario. \n");
                                System.out.printf("3. Volver al menu principal. \n");
                                System.out.printf("SELECCIONE UNA OPCION: ");

                                opcion3 = entrada.nextInt();

                                switch (opcion3) {

                                    case 1: {
                                        String codigo, nombre;
                                        int cantidad;
                                        double precio;

                                        Scanner ingresop = new Scanner(System.in);
                                        System.out.printf("\n Por favor, ingrese los siguientes datos: \n");
                                        System.out.printf("Ingrese el codigo del producto: ");
                                        codigo = ingresop.nextLine();
                                        System.out.printf("Ingrese el nombre del producto: ");
                                        nombre = ingresop.nextLine();
                                        System.out.printf("Cantidad: ");
                                        cantidad = ingresop.nextInt();
                                        System.out.printf("Precio: ");
                                        precio = ingresop.nextDouble();

                                        Producto p = new Producto(codigo, nombre, cantidad, precio);
                                        productos.add(p);
                                    }
                                        break;

                                    case 2: {
                                        for (int k = 0; k < productos.size(); k++) {

                                            System.out.printf("\nProducto agregado numero %d \n", +k + 1);
                                            System.out.printf("ID Producto: ");
                                            System.out.println(productos.get(k).getIdproducto());
                                            System.out.printf("Nombre Producto: ");
                                            System.out.println(productos.get(k).getNombreproducto());
                                            System.out.printf("Cantidad en el inventario: ");
                                            System.out.println(productos.get(k).getStock());
                                            System.out.printf("Precio normal SIN IVA: ");
                                            System.out.println(productos.get(k).getPrecionormal());
                                            System.out.printf("Precio cliente Afiliado SIN IVA: ");
                                            System.out.println(productos.get(k).getPrecioafiliado());

                                        }
                                    }
                                        break;
                                }
                            }
                            break;

                        case 3:

                            String busqueda;

                            String productoid;
                            Scanner ingresofac = new Scanner(System.in);

                            Scanner ingresof = new Scanner(System.in);
                            System.out.printf("\n Por favor, ingrese cedula para verificar cliente: ");
                            busqueda = ingresof.nextLine();

                            for (int i = 0; i < clientes.size(); i++) {
                                if (busqueda.equals(clientes.get(i).getId())) {
                                    if (afiliado.equalsIgnoreCase(clientes.get(i).getTipocliente())) {
                                        System.out.printf("Bienvenido %s", clientes.get(i).getNombre());
                                        System.out.printf(" Usted se encuentra afiliado a nuestra organizacion. \n\n");

                                        System.out.printf(
                                                "-------------------------FACTURACION:--------------------------\n");
                                        System.out.printf(
                                                "Por favor ingrese el código del producto para añadirlo a la factura: ");
                                        productoid = ingresofac.nextLine();

                                        for (int j = 0; j < productos.size(); j++) {
                                            if (productoid.equalsIgnoreCase(productos.get(j).getIdproducto())) {

                                                Factura f = new Factura(productos.get(j).getIdproducto(),
                                                        productos.get(j).getNombreproducto(),
                                                        (int) productos.get(j).getPrecioafiliado());
                                                facturas.add(f);

                                                System.out.printf(
                                                        "---------------------------FACTURA:------------------------------\n\n");
                                                System.out.printf("Cliente: %s     \n", clientes.get(i).getNombre());
                                                System.out.printf("ID Producto: %s     ",
                                                        productos.get(j).getIdproducto());
                                                System.out.printf("Nombre producto: %s     ",
                                                        productos.get(j).getNombreproducto());
                                                System.out.printf("Precio producto afiliado: %f     \n",
                                                        productos.get(j).getPrecioafiliado());
                                                System.out.printf("TOTAL MAS IVA: %s     \n",
                                                        productos.get(j).getPrecioafiliado()
                                                                + (productos.get(j).getPrecioafiliado() * 0.19));
                                                System.out.printf(
                                                        "\n--------------------Gracias por su compra...---------------------\n\n");

                                            }
                                        }

                                    } else if (comun.equalsIgnoreCase(clientes.get(i).getTipocliente())) {
                                        System.out.printf("Bienvenido %s", clientes.get(i).getNombre());
                                        System.out.printf(
                                                " Usted NO se encuentra afiliado a nuestra organizacion, por ende no tiene descuento en la compra. \n\n");

                                        System.out.printf(
                                                "-------------------------FACTURACION:--------------------------\n");
                                        System.out.printf(
                                                "Por favor ingrese el código del producto para añadirlo a la factura: ");
                                        productoid = ingresofac.nextLine();

                                        for (int j = 0; j < productos.size(); j++) {
                                            if (productoid.equalsIgnoreCase(productos.get(j).getIdproducto())) {

                                                Factura f = new Factura(productos.get(j).getIdproducto(),
                                                        productos.get(j).getNombreproducto(),
                                                        (int) productos.get(j).getPrecionormal());
                                                facturas.add(f);

                                                System.out.printf(
                                                        "---------------------------FACTURA:------------------------------\n\n");
                                                System.out.printf("Cliente: %s     \n", clientes.get(i).getNombre());
                                                System.out.printf("ID Producto: %s     ",
                                                        productos.get(j).getIdproducto());
                                                System.out.printf("Nombre producto: %s     ",
                                                        productos.get(j).getNombreproducto());
                                                System.out.printf("Precio producto: %f     \n",
                                                        productos.get(j).getPrecionormal());
                                                System.out.printf("TOTAL MAS IVA: %s     \n",
                                                        productos.get(j).getPrecionormal()
                                                                + (productos.get(j).getPrecionormal() * 0.19));
                                                System.out.printf(
                                                        "\n--------------------Gracias por su compra...---------------------\n\n");

                                            }
                                        }
                                    }
                                } else if (i == clientes.size()) {
                                    System.out.printf(
                                            "Cliente inexistente, por favor cree el cliente en la seccion de creacion de clientes");
                                }
                            }
                            break;

                        case 4:

                            double balance;
                            System.out.printf("\n\n\n----BALANCE GENERAL DE LA CAJA EL DIA DE HOY FUE DE: ----\n");

                            for (int k = 0; k < facturas.size(); k++) {

                                if (afiliado.equalsIgnoreCase(clientes.get(k).getTipocliente())) {

                                    balancea = balancea + facturas.get(k).getPrecioafiliado();

                                } else

                                    balancec = balancec + facturas.get(k).getPrecionormal();
                            }

                            balance = balancea + balancec;
                            System.out.printf(" %f \n", balance * 0.19);

                            break;
                        default:
                            break;
                    }
                }
            } else if (opcioncaja == 2) {
                System.out.printf("Gracias y hasta pronto...");
            }
        }
        // --------------------------------------------------------------------------------------------------------------------------------------------
    }
}
