import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Informe sua altura em metros: ");
        double altura= scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("O seu IMC é de " + Math.round(imc));
        
        String categoria;
        
        if (imc < 18.5) {
            categoria = "Abaixo do peso ideal";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else if (imc < 34.9) {
        	categoria = "Obesidade Grau I";
        } else if (imc < 39.9) {
        	categoria = "Obesidade Grau II";
        } else {
            categoria = "Obesidade Grau III";
        }
        
        System.out.println("De acordo com a classficação da OMS, você está na categoria " + categoria.toUpperCase());
        
        scanner.close();
	}

}
