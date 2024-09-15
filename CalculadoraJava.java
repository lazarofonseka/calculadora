import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
//Criação da classe CalculadoraJava:
public class CalculadoraJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Criar uma variavel para guardar os valores ;
        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        try {
            do {
                //Pedindo ao usuario que digite o 1 valor desejado;
                System.out.println("Digite o valor Um");
                valorUm = scanner.nextDouble();
//Pedir que informe a operação desejada
                System.out.println("Digite a Operção (+,-,/,*)");
                operacao = scanner.next();
//Pedir o segundo valor desejado
                System.out.println("Digite o valor Dois");
                valorDois = scanner.nextDouble();

                System.out.println("Resultado : " + realizarCalculo(valorUm, valorDois, operacao));


                continuar = verificarNovaOperacao();
            } while (continuar);
        }catch (InputMismatchException ex){
            System.out.println("Os valores para calculos devem ser NUMERICOS!");
        }

        }


            public static boolean verificarNovaOperacao () {
                Scanner sc = new Scanner(System.in);
                System.out.println("Deseja realizar uma nova operação (S ou N)");
                return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

            }


            public static Double realizarCalculo (Double valorUm, Double valorDois, String operacao){
                Double respostaCalculo = 0.0;

                switch (operacao) {
                    case "+":
                        respostaCalculo = valorUm + valorDois;
                        break;
                    case "-":
                        respostaCalculo = valorUm - valorDois;
                        break;
                    case "*":
                        respostaCalculo = valorUm * valorDois;
                        break;
                    case "/":
                        respostaCalculo = valorUm / valorDois;

                    default:
                        System.out.println("Operação Invalida = C");

                }
                return respostaCalculo;
            }

        }

