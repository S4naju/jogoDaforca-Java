import java.util.Scanner;
import java.util.concurrent.TimeUnit;
// import java.io.IOException;
public class Main {
    public static void espera() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    public static void espera2() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ex) {
        }
    }

    // static void limpaTela() throws IOException, InterruptedException {
    //     if (System.getProperty("os.name").contains("Windows"))
    //         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    //     else
    //         Runtime.getRuntime().exec("clear");
    // }

    static void avaliacao() {
        Scanner entrada = new Scanner(System.in);
        espera();
        System.out.print("\n");
        System.out.println("████████████████████████████████████████\n" +
"████████████████████████████████████████\n" +
"██████▀░░░░░░░░▀████████▀▀░░░░░░░▀██████\n" +
"████▀░░░░░░░░░░░░▀████▀░░░░░░░░░░░░▀████\n" +
"██▀░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░▀██\n" +
"██░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░██\n" +
"██░░░░░░░░░░░░░░░░░░█░█░░░░░░░░░░░░░░░██\n" +
"██░░░░░░░░░░░░░░░░░▄▀░█░░░░░░░░░░░░░░░██\n" +
"██░░░░░░░░░░████▄▄▄▀░░▀▀▀▀▄░░░░░░░░░░░██\n" +
"██▄░░░░░░░░░████░░░░░░░░░░█░░░░░░░░░░▄██\n" +
"████▄░░░░░░░████░░░░░░░░░░█░░░░░░░░▄████\n" +
"██████▄░░░░░████▄▄▄░░░░░░░█░░░░░░▄██████\n" +
"████████▄░░░▀▀▀▀░░░▀▀▀▀▀▀▀░░░░░▄████████\n" +
"██████████▄░░░░░░░░░░░░░░░░░░▄██████████\n" +
"████████████▄░░░░░░░░░░░░░░▄████████████\n" +
"██████████████▄░░░░░░░░░░▄██████████████\n" +
"████████████████▄░░░░░░▄████████████████\n" +
"██████████████████▄▄▄▄██████████████████\n" +
"████████████████████████████████████████\n" +
"████████████████████████████████████████");
        System.out.println("             ");
        espera();
        System.out.println(">>AVALIE NOSSO JOGO<<");
        System.out.println("1 - ⭐");  
        System.out.println("2 - ⭐⭐");
        System.out.println("3 - ⭐⭐⭐");
        System.out.println("4 - ⭐⭐⭐⭐");
        System.out.println("5 - ⭐⭐⭐⭐⭐");
        System.out.print("DIGITE SUA NOTA PARA O JOGO: ");
        int nota = entrada.nextInt();  
        switch (nota) {
            case 1:
                System.out.println("★✰✰✰✰");
                break;
            case 2:
                System.out.println("★★✰✰✰");
                break;
            case 3:
                System.out.println("★★★✰✰");
                break;
            case 4:
                System.out.println("★★★★✰");
                break;
            case 5:
                System.out.println("★★★★★");
                break;
        }
        espera();
    }

    static void creditos() {
        System.out.print("\n");
        String texto = ("DESENVOLVIDO POR ANA JULIA SAMPAIO E ISABELA VIANA!\n");

        for(int i=0;i<texto.length();i++){
            System.out.print(texto.charAt(i)); //charAt - pegar um caractere específico na string
            espera2();
        }
    }

    static void sobre() {
        System.out.print("\n");
        String texto = ("FUNCIONAMENTO DO JOGO: \n"+
        "DESCUBRA A PALAVRA SECRETA PARA GANHAR O JOGO\n"+
        "LEMBRANDO QUE VOCÊ TEM APENAS 12 TENTATIVAS PARA ACERTAR\n"+
        "BOA SORTE!\n");

        for(int i=0;i<texto.length();i++){
            System.out.print(texto.charAt(i));
            espera2();
        }
    }



    static String palavrasecreta=" ";
    static void jogar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n");
        System.out.println(">>>>>BEM-VINDO AO JOGO DA FORCA DA NAJU E ISINHA<<<<<");
        System.out.println("       >>>>>VULGO, ALGORITHMIC RIDDLES<<<<<");
        System.out.println("    __________\n" +
"     |/      |\n" +
"     |      (_)\n" +
"     |      \\|/\n" +
"     |       |\n" +
"     |      / \\\n" +
"     |\n" +
"    _|___");
        espera();
        System.out.println("ADIVINHE A PALAVRA SECRETA: " +palavrasecreta);
        System.out.println("                                   ");
        System.out.print("ESCOLHA UM NUMERO DE 1 A 6: ");
        int palavra = entrada.nextInt();
        entrada.nextLine();

        String palavraSecreta = " ";

        switch (palavra) {
            case 1:
                palavraSecreta = "chines";
                break;
            case 2:
                palavraSecreta = "programacao";
                break;
            case 3:
                palavraSecreta = "python";
                break;
            case 4:
                palavraSecreta = "string";
                break;
            case 5:
                palavraSecreta = "carlos augusto";
                break;
            case 6:
                palavraSecreta = "motherboard";
                break;
        }
        System.out.print("\n");
    
            if (palavra == 1) {
                System.out.println("DICA: MÉTODO DE PROVA REAL DA PROGRAMACAO");
            } else if (palavra == 2) {
                System.out.println("DICA: INFORMÁTICA");
            } else if (palavra == 3) {
                System.out.println("DICA: LINGUAGEM DE PROGRAMAÇÃO");
            } else if (palavra == 4) {
                System.out.println("DICA: TIPO DE VARIÁVEL EM JAVA");
            } else if (palavra == 5) {
                System.out.println("DICA: PROFESSOR DO IFRJ");
            }  else if (palavra == 6) {
                System.out.println("DICA: PEÇA DO COMPUTADOR");
            }
    
            espera();

    
            int tentativas = 12;
            char[] palavrasecreta = new char[palavraSecreta.length()];
        
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i)==' '){
                    palavrasecreta[i] = ' ';
                }else{
                    palavrasecreta[i] = '*';
                }
            }


            do  {
                System.out.print("\n");
                System.out.print("DIGITE UMA LETRA: ");
                char letra = entrada.nextLine().charAt(0);
                boolean certo = false;
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        palavrasecreta[i] = letra;
                        certo = true;
                    }
                }
                espera();

                if (certo) {
                    System.out.println("PARABENS! VOCE ADIVINHOU UMA LETRA!\n");
                } else {
                    System.out.println("zLETRA INCORRETA! TENTE NOVAMENTE!\n");
                }
                espera();

                tentativas = tentativas - 1;
                System.out.println("PALAVRA: " + new String(palavrasecreta));
                System.out.println("TENTATIVAS RESTANTES: "+tentativas);
            } while (tentativas > 0 && new String(palavrasecreta).contains("*"));

            if (tentativas == 0) {
                System.out.print("\n");
                System.out.println("GAME OVER!");
                System.out.println("A PALAVRA SECRETA ERA: "+palavraSecreta);
            } else {
                System.out.print("\n");
                System.out.println("WINNER! CONGRATULATIONS!");
            }
        espera();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        espera();
        System.out.print("           _                  _ _   _               _        _____  _     _     _ _          \n" +
"     /\\   | |                (_| | | |             (_)      |  __ \\(_)   | |   | | |         \n" +
"    /  \\  | | __ _  ___  _ __ _| |_| |__  _ __ ___  _  ___  | |__) |_  __| | __| | | ___ ___ \n" +
"   / /\\ \\ | |/ _` |/ _ \\| '__| | __| '_ \\| '_ ` _ \\| |/ __| |  _  /| |/ _` |/ _` | |/ _ / __|\n" +
"  / ____ \\| | (_| | (_) | |  | | |_| | | | | | | | | | (__  | | \\ \\| | (_| | (_| | |  __\\__ \\\n" +
" /_/    \\_|_|\\__, |\\___/|_|  |_|\\__|_| |_|_| |_| |_|_|\\___| |_|  \\_|_|\\__,_|\\__,_|_|\\___|___/\n" +
"              __/ |                                                                          \n" +
"             |___/                                                                           \n");
            espera();
        do {

            System.out.print("\n");
            System.out.println("1 - SOBRE O JOGO");
            System.out.println("2 - JOGAR");
            System.out.println("3 - CREDITOS");
            System.out.println("4 - AVALIACAO");
            System.out.println("5 - SAIR");
            System.out.print("ESCOLHA UMA OPCAO: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Consumir a nova linha pendente
            espera();
            switch (opcao) {
                case 1:
                    sobre();
                    break;
                case 2:
                    jogar();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    avaliacao();
                    break;
            }
    
            if(opcao>5 || opcao<1){
                System.out.print("OPCAO INVALIDA! DIGITE UM NUMERO ENTRE 1 E 4!");
                System.out.print("\n");
            }
        } while (opcao>5 ||opcao<5);
    
    }
}