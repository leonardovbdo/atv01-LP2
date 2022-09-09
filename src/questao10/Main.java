package questao10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static double valor = 0;
    static double consumo;
    static String bandeira = null;


    public static void main(String args[]) throws IllegalArgumentException {
        final String VD = "Verde", AM = "Amarela", VP1 = "Vermelha de Patamar 1", VP2 = "Vermelha de Patamar 2";
        Scanner entrada = new Scanner(System.in);
        String literal;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$#,##0.00");


        boolean literalValido = false;

        System.out.print("Informe o consumo: ");
        consumo = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Informe o literal: ");
        literal = entrada.nextLine();
        try {
            if (!literal.equals("vd") && !literal.equals("am") && !literal.equals("vp1") && !literal.equals("vp2")) {
                throw new IllegalArgumentException();
            } else {
                literalValido = true;
            }
        } catch (IllegalArgumentException e) {
            System.err.println("O literal informado não é valido!");
        }

        if (literalValido) {
            if (literal.equalsIgnoreCase("vd")) {
                bandeira = VD;
                valor = 0;
            } else if (literal.equalsIgnoreCase("am")) {
                bandeira = AM;
                valor = 2.989;
            } else if (literal.equalsIgnoreCase("vp1")) {
                bandeira = VP1;
                valor = 6.500;
            } else if (literal.equalsIgnoreCase("vp2")) {
                bandeira = VP2;
                valor = 9.759;
            }

            if (consumo >= 100) {
                double custoAdicional = getCustoAdicional(consumo, bandeira);
                System.out.println("* Consumo informado: " + consumo +"kWh"+ "\n* Bandeira Tarifária: " + bandeira
                        + "\n* Custo adicional: " + df.format(custoAdicional));
            } else {
                System.out.println("* Consumo informado:" + consumo +"kWh"+ "\n* Bandeira Tarifária: "
                        + "\n* Não há custos adicionais para o consumo informado");
            }
        }

        entrada.close();
    }

    public static double getCustoAdicional(double consumo, String bandeira) {
        double custoAdicional = 0;
        for (int i = 0; i < (int) consumo / 100; i++) {
            custoAdicional += valor;
        }
        return custoAdicional;
    }
}