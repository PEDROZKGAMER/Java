import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Informe qual questão queira exemplo '1, 2, 3, 4, 5... 22': ");
        int questao = input.nextInt();

        if(questao < 1 || questao > 22){
        System.out.print("Erro, questão inválida! programa encerrado.");
        input.close();
    }else if(questao == 1){
        System.out.println("1 - Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. A seguir troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.\r");
        System.out.println("Em manuteção!");
    }else if(questao == 2){
            System.out.println("2 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.");
            System.out.print("Informe o valor de A: ");
            int valor_a = input.nextInt();

            System.out.print("Informe o valor de B: ");
            int valor_b = input.nextInt();

            System.out.print("Informe o valor de C: ");
            int valor_c = input.nextInt();

            int resultado = valor_a + valor_b;

            if(resultado >= valor_c){
                System.out.print("O resultado é maior que o valor c, pois resultado = "+resultado+", Valor c = "+valor_c);
            }else{
                System.out.print("O resultado é menor que o valor c, pois resultado = "+resultado+", Valor c = "+valor_c);
            }
        }else if(questao == 3){
            System.out.println("3 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.");
            System.out.print("Informe o valor: ");
            int numero = input.nextInt();

            if(numero % 2 == 0){
                System.out.print("O valor é par");
            }else{
                System.out.print("O valor é impar");
            }
        
            if(numero >= 0){
                System.out.print(" e positivo");
            }else{
                System.out.print(" e negativo");
            }
        }else if(questao == 4){
            System.out.println("4 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.");
            System.out.print("informe o valor de a: ");
            int numero1 = input.nextInt();

            System.out.print("informe o valor de a: ");
            int numero2 = input.nextInt();

            if(numero1 == numero2 && numero2 == numero1){
                System.out.print("O resultado de c é: "+(numero1 + numero2));
            }else{
                System.out.print("O resultado de c é: "+numero1 * numero2);
            }
        }else if(questao == 5){
            System.out.println("5 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor");
            System.out.print("Informe o numero: ");
            int numero = input.nextInt();

            int antecessor = numero - 1;
            int sucessor = numero + 1;

            System.out.print(antecessor +" <==> "+numero+" <==> "+sucessor);
        }else if(questao == 6){
            System.out.println("6 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$1.293,20).");
            System.out.print("Olá, informe seu nome: ");
            String nome_usuario = input.next();

            System.out.print("Informe o salario mínimo: ");
            double salario_minino = input.nextDouble();

            System.out.print("Informe o seu salario "+ nome_usuario +": ");
            double salario_usuario = input.nextDouble();

            double salario = salario_usuario / salario_minino ;

            System.out.printf(nome_usuario+ ", o seu salario é R$ %.3f: ",salario);
        }else if(questao == 7){
            System.out.println("7 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.");
            System.out.print("Informe o numero: ");
            double numero = input.nextDouble();

            double reajuste = numero * 0.05;

            System.out.print(reajuste);
        }else if(questao == 8){
            System.out.println("8 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.");
            System.out.print("Informe o 1° valor: ");
            boolean numero_1 = input.hasNextBoolean();

            System.out.print("Informe o 1° valor: ");
            boolean numero_2 = input.hasNextBoolean();

            if(numero_1 == numero_2 && numero_2 == numero_1){
                System.out.print("Verdadeiro");
            }else{
                System.out.print("Falso");
            }
        }else if(questao == 9){
            System.out.println("9 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.");
            System.out.print("Informe o 1° valor: ");
            int valor_1 = input.nextInt();

            System.out.print("Informe o 2° valor: ");
            int valor_2 = input.nextInt();

            System.out.print("Informe o 3° valor: ");
            int valor_3 = input.nextInt();

            if (valor_1 >= valor_2 && valor_1 >= valor_3) {
                if (valor_2 >= valor_3) {
                    System.out.println(valor_1 + " " + valor_2 + " " + valor_3);
                } else {
                    System.out.println(valor_1 + " " + valor_3 + " " + valor_2);
                }
            } else if (valor_2 >= valor_1 && valor_2 >= valor_3) {
                if (valor_1 >= valor_3) {
                    System.out.println(valor_2 + " " + valor_1 + " " + valor_3);
                } else {
                    System.out.println(valor_2 + " " + valor_3 + " " + valor_1);
                }
            } else {
                if (valor_1 >= valor_2) {
                    System.out.println(valor_3 + " " + valor_1 + " " + valor_2);
                } else {
                    System.out.println(valor_3 + " " + valor_2 + " " + valor_1);
                }
            }
        }else if(questao == 10){
            System.out.println("10 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo: Fórmula do IMC = peso / (altura) ²\n\nTabela Condições IMC\nAbaixo de 18,5 | Abaixo do peso\nEntre 18,6 e 24,9 | Peso ideal (parabéns)\nEntre 25,0 e 29,9 | Levemente acima do peso\nEntre 30,0 e 34,9 | Obesidade grau I\nEntre 35,0 e 39,9 | Obesidade grau II (severa)\nMaior ou igual a 40 | Obesidade grau III (mórbida)");
            System.out.print("Informe seu peso: ");
            double peso = input.nextDouble();

            System.out.print("Informe sua altura: ");
            double altura = input.nextDouble();

            double imc = peso / (altura * altura);

            if(imc < 18.5){
                System.out.print("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 25){
            System.out.print(" Peso ideal (parabéns)");
        }else if(imc >= 25 && imc < 30){
            System.out.print("Levemente acima do peso");
        }else if(imc >= 30 && imc < 35){
            System.out.print("Obesidade grau 1");
        }else if(imc >= 35 && imc < 40){
            System.out.print("Obesidade grau 2");
        }else{
            System.out.print("Obesidade grau 3");
        }
        }else if(questao == 11){
            System.out.println("\n-Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.\n-Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.\r");

        System.out.print("Informe seu nome: ");
        String nome = input.next();

        System.out.print("Informe quantas notas: ");
        int quantidade = input.nextInt();

        if(quantidade == 3){
            System.out.print("Informe a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.printf(nome+" você foi aprovado, pois a média foi: %.2f",media);
        }else if(media >= 5 && media < 7){
            System.out.printf(nome+" você ficou em recuperação, pois a média foi: %.2f",media);
        }else{
            System.out.printf(nome+" você foi reprovado, pois a média foi: %.2f",media);
        }
    }else if(quantidade == 4){
        System.out.print("Informe a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.print("Informe a quarta nota: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.printf(nome+" você foi aprovado, pois a média foi: %.2f",media);
        }else if(media >= 5 && media < 7){
            System.out.printf(nome+" você ficou em recuperação, pois a média foi: %.2f",media);
        }else{
            System.out.printf(nome+" você foi reprovado, pois a média foi: %.2f",media);
        }
    }else{
        System.out.print("Erro, quantidade de notas inválida!");
    }
    }else if(questao == 12){
        System.out.println("12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.");
        System.out.print("Informe o preço do produto: ");
        double preco = input.nextDouble();

        System.out.print("Informe a opção abaixo:\n1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n2 - À Vista no cartão de crédito, recebe 10% de desconto\n3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%\n==> ");
        int opcao = input.nextInt();

        if(opcao == 1){
            double desconto = preco * 0.15;
            double preco_final = preco - desconto;
            System.out.printf("O preço final é: %.2f",preco_final);
        }else if(opcao == 2){
            double desconto = preco * 0.10;
            double preco_final = preco - desconto;
            System.out.printf("O preço final é: %.2f",preco_final);
        }else if(opcao == 3){
            System.out.printf("O preço final é: %.2f",preco);
        }else if(opcao == 4){
            double juros = preco * 0.10;
            double preco_final = preco + juros;
            System.out.printf("O preço final é: %.2f",preco_final);
        }else{
            System.out.print("Erro, opção inválida!");
        }
    }else if(questao == 13){
        System.out.println("13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.");
        System.out.print("Informe seu nome: ");
        String nome = input.next();

        System.out.print("informe a sua idade: ");
        int idade = input.nextInt();

        if(idade >= 18){
            System.out.print(nome+" você é maior de idade");
        }else{
            System.out.print(nome+" você é menor de idade");
        }
    }else if(questao == 14){
        System.out.println("14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.");
        System.out.print("Informe o valor de A: ");
        int valor_a = input.nextInt();

        System.out.print("Informe o valor de B: ");
        int valor_b = input.nextInt();

        int temporaria = valor_a;
        valor_a = valor_b;
        valor_b = temporaria;

        System.out.println("Após a troca!");
        System.out.println("Valor de A: " + valor_a);
        System.out.println("Valor de B: " + valor_b);
    }else if(questao == 15){
        System.out.println("15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.\r");
        System.out.print("Informe o ano em que você nasceu: ");
        int ano_nascimento = input.nextInt();

        int ano_atual = 2025;
        int idade_ano = ano_atual - ano_nascimento;
        int idade_meses = idade_ano * 12;
        int idade_dias = idade_ano * 365;

        System.out.print("Você tem "+idade_ano+" anos, "+idade_meses+" meses e "+idade_dias+" dias.");
    }else if(questao == 16){
        System.out.println("16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.");
        System.out.print("Informe o 1° lado do triangulo: ");
        double lado1 = input.nextDouble();

        System.out.print("Informe o 2° lado do triangulo: ");
        double lado2 = input.nextDouble();

        System.out.print("Informe o 3° lado do triangulo: ");
        double lado3 = input.nextDouble();

        if(lado1 == lado2 && lado2 == lado3){
            System.out.print("Triangulo equilátero");
        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.print("Triangulo isósceles");
        }else{
            System.out.print("Triangulo escaleno");
        }
    }else if(questao == 17){
        System.out.println("17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.");
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Informe qual temperatura para a conversão:\n1 - Celsius\n2 - Kelvin: ");
        int opcao = input.nextInt();

        if(opcao == 1){
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("A temperatura em Celsius é: %.2f",celsius);
        }else if(opcao == 2){
            double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
            System.out.printf("A temperatura em Kelvin é: %.2f",kelvin);
        }else{
            System.out.print("Erro, opção inválida!");
        }
    }else if(questao == 18){
        System.out.println("18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.");
        System.out.print("Em manunteção...");
    }else if(questao == 19){
        System.out.println("As questões 19 e 20 estão juntas!");
        System.out.println("19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.\n20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.");
        System.out.print("Informe o numero para a tabuada: ");
        int numero = input.nextInt();

        System.out.print("Informe a operação abaixo:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n==> ");
        int operacao = input.nextInt();

        if(operacao == 1){
            System.out.println(numero+" + 1 = "+ (numero + 1));
            System.out.println(numero+" + 2 = "+ (numero + 2));
            System.out.println(numero+" + 3 = "+ (numero + 3));
            System.out.println(numero+" + 4 = "+ (numero + 4));
            System.out.println(numero+" + 5 = "+ (numero + 5));
            System.out.println(numero+" + 6 = "+ (numero + 6));
            System.out.println(numero+" + 7 = "+ (numero + 7));
            System.out.println(numero+" + 8 = "+ (numero + 8));
            System.out.println(numero+" + 9 = "+ (numero + 9));
            System.out.println(numero+" + 10 = "+ (numero + 10));
        }else if(operacao == 2){
            System.out.println(numero+" - 1 = "+ (numero - 1));
            System.out.println(numero+" - 2 = "+ (numero - 2));
            System.out.println(numero+" - 3 = "+ (numero - 3));
            System.out.println(numero+" - 4 = "+ (numero - 4));
            System.out.println(numero+" - 5 = "+ (numero - 5));
            System.out.println(numero+" - 6 = "+ (numero - 6));
            System.out.println(numero+" - 7 = "+ (numero - 7));
            System.out.println(numero+" - 8 = "+ (numero - 8));
            System.out.println(numero+" - 9 = "+ (numero - 9));
            System.out.println(numero+" - 10 = "+ (numero - 10));
        }else if(operacao == 3){
            System.out.println(numero+" * 1 = "+ (numero * 1));
            System.out.println(numero+" * 2 = "+ (numero * 2));
            System.out.println(numero+" * 3 = "+ (numero * 3));
            System.out.println(numero+" * 4 = "+ (numero * 4));
            System.out.println(numero+" * 5 = "+ (numero * 5));
            System.out.println(numero+" * 6 = "+ (numero * 6));
            System.out.println(numero+" * 7 = "+ (numero * 7));
            System.out.println(numero+" * 8 = "+ (numero * 8));
            System.out.println(numero+" * 9 = "+ (numero * 9));
            System.out.println(numero+" * 10 = "+ (numero * 10));
        }else if(operacao == 4){
            System.out.println(numero+" / 1 = "+ (numero / 1));
            System.out.println(numero+" / 2 = "+ (numero / 2));
            System.out.println(numero+" / 3 = "+ (numero / 3));
            System.out.println(numero+" / 4 = "+ (numero / 4));
            System.out.println(numero+" / 5 = "+ (numero / 5));
            System.out.println(numero+" / 6 = "+ (numero / 6));
            System.out.println(numero+" / 7 = "+ (numero / 7));
            System.out.println(numero+" / 8 = "+ (numero / 8));
            System.out.println(numero+" / 9 = "+ (numero / 9));
            System.out.println(numero+" / 10 = "+ (numero / 10));
        }
    }else if(questao == 20){
        System.out.println("21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.");
        System.out.println("Em manunteção!");
    }else if(questao == 21){
        System.out.print("Informe o valor de A: ");
        int valor_a = input.nextInt();

        System.out.print("Informe o valor de B: ");
        int valor_b = input.nextInt();

        int quociente = valor_a / valor_b;
        int resto = valor_a % valor_b;

        System.out.println("Quociente da divisão de A por B: " + quociente);
        System.out.println("Resto de divisão de A por B: " + resto);
    }else if(questao == 21){
        System.out.println("21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.");
        System.out.print("Em manunteção...");
    }else if(questao == 22){
        System.out.println("22 - Faça um algoritmo que calcule a quantidade de litros de combustível gasto em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer a usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem Fórmula: distância = tempo x velocidade.");
        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        double tempo = input.nextDouble();

        System.out.print("Informe a velocidade média durante a viagem (em km/h): ");
        double velocidade = input.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUtilizados = distancia / 12;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizados: " + litrosUtilizados + " litros");
    }
}catch(java.util.InputMismatchException e){
    System.out.print("Erro, entrada inválida!");
}
    input.close();
    }
}