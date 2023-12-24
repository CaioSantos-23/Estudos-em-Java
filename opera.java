import java.util.Scanner;
    public class opera {
        public static void main(String[]args) {
            Scanner ler = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numb1 = ler.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numb2 = ler.nextDouble();

            System.out.print("Escolha a opreção (+, -, *, /): ");
            char opera = ler.next().charAt(0);

            double resultado = 0;

            switch(opera){
                case '+':
                    resultado = numb1 + numb2;
                    break;

                case '-':
                    resultado = numb1 - numb2;
                    break;

                case '*':
                    resultado = numb1 * numb2;
                    break;

                case '/':
                    if(numb2 !=0) {
                        resultado = numb1 / numb2;
                    }else {
                        System.out.println("Divisão por 0 não é permitida");
                        ler.close();
                        return;
                    }
                    break;

                default:
                    System.out.println("Operação invalida");
                    ler.close();
                    return;

            }

            System.out.println("O resultado da operação é: " + resultado);

            ler.close();
        }
    }
