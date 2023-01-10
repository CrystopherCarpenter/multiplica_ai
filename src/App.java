public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número: ");

        int num = Integer.parseInt(System.console().readLine());

        System.out.println("Tabela de multiplicação de " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
