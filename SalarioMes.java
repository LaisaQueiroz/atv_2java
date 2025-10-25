import java.util.Scanner;

public class SalarioMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do seu salário:");
        double salarioBruto = scanner.nextDouble();

        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.8;
        double sindicato = salarioBruto * 0.5;
        double salarioLiquido = salarioBruto - inss - impostoRenda - sindicato;

        System.out.println("Salário bruto:" + salarioBruto);
        System.out.println("Imposto de renda:" + impostoRenda);
        System.out.println("INSS:" + inss);
        System.out.println("Sindicato:" + sindicato);
        System.out.println("Salário líquido:" + salarioLiquido);

        scanner.close();



    }
}