package br.com.dio.controle.fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);

        }catch (ParametroInvalidosException e){
            System.out.println("O segundo parametro deve ser maior do que o primeiro");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalidosException{
        if(primeiroParametro > segundoParametro){
            throw new ParametroInvalidosException();
        }else{
            int contagem = primeiroParametro - segundoParametro;
            for(int i = primeiroParametro; i <= segundoParametro; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }


}
