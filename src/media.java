import java.util.Scanner;
public class media {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a nota 1: ");
    double nota1= sc.nextDouble();
    System.out.print("Digite a nota 2: ");
    double nota2= sc.nextDouble();
    double media = (nota1 + nota2) / 2;

    if(media >= 7){
        System.out.println("ALUNO APROVADO COM MÉDIA: " + media);
    }
    else{
        System.out.println("ALUNO REPROVADO COM MÉDIA: " + media);
    }
    sc.close();
}
    
}
