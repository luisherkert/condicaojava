import java.util.Scanner;

public class condiçõesjava2 {

    //Quero adicionar um desconto gradativo
    //valor maior que 1000 - 10%
    //valor maior que 2000  - 20%
    //valor maior que 3000 - 30%
    //valor menor igual a 1000 - 0%

    public static void main(String[] args) {

        double valorbruto = 3000;
        double desconto = 0d;

            // opereadores logicos
        // && e
        //|| ou

        Scanner scanner = new Scanner( System.in);
        System.out.println("informe o valor bruto");
        valorbruto = scanner.nextDouble();

        if (valorbruto > 1000 && valorbruto <= 2000){
             desconto  = valorbruto * 0.10;
        } else if(valorbruto > 2000 && valorbruto < 3000){
             desconto  = valorbruto * (20/100);
        } else if(valorbruto >= 3000){
             desconto  = valorbruto * (30./100);
        }
        System.out.println("Valor Bruto é " + valorbruto);
        System.out.println("Valor do desconto é " + desconto);
        System.out.println("Valor liquido é " + (valorbruto - desconto)  );

    }


}
