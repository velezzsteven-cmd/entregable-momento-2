import java.util.Scanner;

public class Cajaregistradora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        final double PRECIO_PRODUCTO_BASICO = 8000.0;
        final double PRECIO_PRODUCTO_MEDIO = 25000.0;
        final double PRECIO_PRODUCTO_PREMIUM = 65000.0;
        final double TASA_IVA = 0.19;
        final double TASA_DESCUENTO = 0.10;
        final double UMBRAL_DESCUENTO = 100000.0;

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
            switch (opcionMenu) {
                case 1 -> {
                    totalBruto += PRECIO_PRODUCTO_BASICO;
                    contadorTotalProductos++;
                    System.out.println("Producto básico agregado.");
                }
                case 2 -> {
                    totalBruto += PRECIO_PRODUCTO_MEDIO;
                    contadorTotalProductos++;
                    System.out.println("Producto medio agregado.");
                }
                case 3 -> {
                    totalBruto += PRECIO_PRODUCTO_PREMIUM;
                    contadorTotalProductos++;
                    contadorProductosPremium++;
                    System.out.println("Producto premium agregado.");
                }
                case 4 -> {
                    System.out.println("Finalizando compra...");
                }
                default -> {
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
        } while (opcionMenu != 4);

        System.out.println("Resumen de la compra:");
        System.out.println("Total de productos comprados: " + contadorTotalProductos);
        System.out.println("Total de productos premium comprados: " + contadorProductosPremium);
        System.out.println("Total bruto acumulado: " + totalBruto);

        double montoDescuento = 0.0;
        if (totalBruto > UMBRAL_DESCUENTO) {
            montoDescuento = totalBruto * TASA_DESCUENTO;
        }
        double subtotalConDescuento = totalBruto - montoDescuento;
        double montoIVA = subtotalConDescuento * TASA_IVA;
        double totalPagar = subtotalConDescuento + montoIVA;

        if (montoDescuento > 0) {
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

        }
    }
}
