import java.util.Scanner;

public class TiendaInformatica {
    static String[] productos = {"Ordenador", "Teclado", "Software"};
    static double[] precios = {800.0, 50.0, 120.0};
    static int[] stock = {10, 30, 20};
    
    static String[] clientes = {"Juan Perez", "Maria Lopez"};
    static String[] emails = {"juan@mail.com", "maria@mail.com"};
    static String[] telefonos = {"123456789", "987654321"};
    
    static String[] empleados = {"Carlos Sanchez", "Ana Torres"};
    static String[] puestos = {"Vendedor", "Soporte"};
    
    static String[] proveedores = {"Proveedor1", "Proveedor2"};
    static String[] contactoProv = {"prov1@mail.com", "prov2@mail.com"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Tienda de Informática ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Ver clientes");
            System.out.println("3. Ver empleados");
            System.out.println("4. Ver proveedores");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: mostrarProductos(); break;
                case 2: mostrarClientes(); break;
                case 3: mostrarEmpleados(); break;
                case 4: mostrarProveedores(); break;
                case 5: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
    
    static void mostrarProductos() {
        System.out.println("\nProductos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - Precio: $" + precios[i] + " - Stock: " + stock[i]);
        }
    }
    
    static void mostrarClientes() {
        System.out.println("\nClientes registrados:");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i] + " - Email: " + emails[i] + " - Teléfono: " + telefonos[i]);
        }
    }
    
    static void mostrarEmpleados() {
        System.out.println("\nEmpleados de la tienda:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i] + " - Puesto: " + puestos[i]);
        }
    }
    
    static void mostrarProveedores() {
        System.out.println("\nProveedores:");
        for (int i = 0; i < proveedores.length; i++) {
            System.out.println(proveedores[i] + " - Contacto: " + contactoProv[i]);
        }
    }
}
