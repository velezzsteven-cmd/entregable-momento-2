public class Cajaregistradora {
    public static void main (String[] args
        Scanner scanner = new Scanner(System.in);

        /* precios fijos para los 3mproductos  */
        double PRECIO_PRODUCTO_BASICO = 8000.0;
        double PRECIO_PRODUCTO_MEDIO = 25000.0;
        double PRECIO_PRODUCTO_PREMIUM = 65000.0;

        /* IVA Y DESCUENTO */

        double Tasa_IVA = 0.19;
        double Tasa_Descuento = 0.10; 
        double umbral_descuento = 100000.0;

        /* Acumular y contador */
        double totalBruto = 0.0;
        int contadorTotalProductos = 0;
        int contadorProductosPremium = 0;
        int opcionMenu = 0;

        System.out.println("Caja registradora");

        /* Ciclo del menu */
        do {
            System.out.println("MenuDeCajaRegistradora:");
            System.out.println("1.  producto básico");
            System.out.println("2.  producto medio");
            System.out.println("3.  producto premium");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");

            opcionMenu = scanner.nextInt();
            
            if (opcionMenu ==1) {
                totalBruto += PRECIO_PRODUCTO_BASICO;
                contadorTotalProductos++;
                System.out.println("Producto básico agregado.");
            } else if (opcionMenu == 2) {
                totalBruto += PRECIO_PRODUCTO_MEDIO;
                contadorTotalProductos++;
                System.out.println("Producto medio agregado.");
            } else if (opcionMenu == 3) {
                totalBruto += PRECIO_PRODUCTO_PREMIUM;
                contadorTotalProductos++;
                contadorProductosPremium++;
                System.out.println("Producto premium agregado.");
            } else if (opcionMenu == 4) {
                System.out.println("Finalizando compra...");
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
            while (opcionMenu != 4);
        } 
    )
    
}
