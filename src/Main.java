import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.println("Nome: ");
        aluno1.setNome(ler.nextLine());
        System.out.println("CPF: ");
        aluno1.setCpf(ler.nextFloat());
        System.out.println("e-mail: ");
        aluno1.setEmail(ler.nextLine());
        System.out.println("Data de inicio: ");
        aluno1.setData(ler.nextLine());
        System.out.println("Qual horario do treino: ");
        aluno1.setHorario(ler.nextInt());
        System.out.println("Dias do treino: ");
        aluno1.setDias(ler.nextLine());

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getEmail());
        System.out.println(aluno1.getData());
        System.out.println(aluno1.getHorario());
        System.out.println(aluno1.getDias());


    }
}