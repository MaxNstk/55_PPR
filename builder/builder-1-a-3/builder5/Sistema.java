package builder5;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int escolhido  = 1;
        while ((escolhido >= 1) && (escolhido <= 4)) {
            System.out.println("informe um numero de 1 a 4");
            escolhido = s.nextInt();
            switch (escolhido){
                case 1:
                    System.out.println(new BandejaDirector(new BandejaBuilder1()).construir());
                    break;
                case 2:
                    System.out.println(new BandejaDirector(new BandejaBuilder2()).construir());
                    break;
                case 3:
                    System.out.println(new BandejaDirector(new BandejaBuilder3()).construir());
                    break;
                case 4:
                    System.out.println(new BandejaDirector(new BandejaBuilder4()).construir());
                    break;
            }
        }



    }

}
