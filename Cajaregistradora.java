public class Cajaregistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioProductoBasico = 8000.0;
        double precioProductoMedio = 25000.0;
        double precioProductoPremium = 65000.0;
        double tasaIVA = 0.19;
        double tasaDescuento = 0.10;
        double umbralDescuento = 100000.0;

        double totalBruto = 0.0;
        int contadorTotalProductos = 0;
        int contadorProductosPremium = 0;
        int opcionMenu;

        System.out.println("Caja registradora");

        do {
            System.out.println("Menu de caja registradora:");
            System.out.println("1. Producto básico");
            System.out.println("2. Producto medio");
            System.out.println("3. Producto premium");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");

            opcionMenu = scanner.nextInt();

            if (opcionMenu == 1) {
                totalBruto += precioProductoBasico;
                contadorTotalProductos++;
                System.out.println("Producto básico agregado.");
            } else if (opcionMenu == 2) {
                totalBruto += precioProductoMedio;
                contadorTotalProductos++;
                System.out.println("Producto medio agregado.");
            } else if (opcionMenu == 3) {
                totalBruto += precioProductoPremium;
                contadorTotalProductos++;
                contadorProductosPremium++;
                System.out.println("Producto premium agregado.");
            } else if (opcionMenu == 4) {
                System.out.println("Finalizando compra...");
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcionMenu != 4);

        System.out.println("Resumen de la compra:");
        System.out.println("Total de productos comprados: " + contadorTotalProductos);
        System.out.println("Total de productos premium comprados: " + contadorProductosPremium);

        double montoDescuento = 0.0;
        if (totalBruto > umbralDescuento) {
            montoDescuento = totalBruto * tasaDescuento;
        }

        double subtotalConDescuento = totalBruto - montoDescuento;
        double montoIVA = subtotalConDescuento * tasaIVA;
        double totalPagar = subtotalConDescuento + montoIVA;

        System.out.println("Total bruto acumulado: " + totalBruto);
        if (montoDescuento > 0.0) {
            System.out.println("Monto de descuento aplicado (10%): " + montoDescuento);
        } else {
            System.out.println("No se aplicó descuento.");
        }
        System.out.println("Subtotal con descuento: " + subtotalConDescuento);
        System.out.println("Monto de IVA (19%): " + montoIVA);
        System.out.println("Total a pagar: " + totalPagar);

        if (contadorTotalProductos > 0) {
            double porcentajePremium = (double) contadorProductosPremium / contadorTotalProductos * 100;
            System.out.println("Porcentaje de productos premium comprados: " + porcentajePremium + "%");
        } else {
            System.out.println("No se registran productos premium.");
        }

        scanner.close();
    }
}
