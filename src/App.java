public class App {
    public static void main(String[] args) throws Exception {
        boolean correcto = false;
        int numIntroducido = 0;
        while (!correcto) {
            try {
                numIntroducido = Integer
                        .parseInt(System.console().readLine("Por favor, introduzca un número entero: "));
                if (numIntroducido < 0) {
                    System.out.println("Introduzca un número positivo.");
                } else
                    correcto = true;
            } catch (NumberFormatException ex) {
                System.out.println("Introduzca un número entero.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado.");
            }
        }
        double n = numIntroducido;
        double n2 = numIntroducido - 1;
        n = n * n2;
        while (n2 > 1) {
            n2--;
            n *= n2;
        }
        if (numIntroducido == 0)
            n = 1;
        else if (numIntroducido == 1)
            n = 1;
        System.out.println(numIntroducido + "! = " + n);
    }
}
