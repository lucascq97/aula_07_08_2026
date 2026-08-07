import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        System.out.println("Digite o nome:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade:");
        idade = sc.nextInt();
        sc.nextLine();
        Pessoa p = new Pessoa(nome, idade);
        if(p.getIdade() == 0){
            System.out.println("A idade realmente é 0? " + " Sim "  + " Nao ");
            String a = sc.nextLine();
            a = a.toUpperCase();
            System.out.println(a);
            if(a == "SIM"){
                System.out.println("O nome digitado foi: " + p.getNome() + " e a idade digitada foi: " + p.getIdade());
            }
            else
            if(a == "NAO"){
                System.out.println("O nome digitado foi: \" + p.getNome() + \" e a idade digitada foi: 0" );
            }
        }
        System.out.println("O nome digitado foi: " + p.getNome() + " e a idade digitada foi: " + p.getIdade());
        sc.close();
    }

}