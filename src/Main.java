import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int acao;
        boolean continuar = true;

         Aluno aluno1 = new Aluno();
         Administrador professor1 = new Administrador();

        while (continuar) {
            System.out.println(" ");
            System.out.println("OLÁ ESCOLHA UMA OPÇÃO");
            System.out.println(" ");
            System.out.println("1 ALUNO");
            System.out.println("2 PROFESSOR");
            System.out.println("3 SAIR");
            acao = ler.nextInt();
            switch (acao) {

                case 1: {

                    System.out.println(" ");
                    System.out.println("CADASTRO PESSOAL");
                    ler.nextLine();
                    Pagamento boletoAluno1 = new Pagamento(aluno1.getNome(), aluno1.getCpf());

                            System.out.println(" ");
                            System.out.println("PREENCHA COM SUAS INFORMAÇÕES PESSOAIS");
                            System.out.println(" ");

                            System.out.print("Nome: ");
                            aluno1.setNome(ler.nextLine());

                            System.out.print("E-mail: ");
                            aluno1.setEmail(ler.nextLine());

                            System.out.print("CPF: ");
                            aluno1.setCpf(ler.nextLine());

                            System.out.print("Data de nascimento: ");
                            aluno1.setData(ler.nextLine());

                            System.out.print("Melhor horario para o treino: ");
                            aluno1.setHorario(ler.nextInt());

                            System.out.print("Quantidade de treinos semanais: ");
                            aluno1.setDias(ler.nextInt());
                            //ler.nextLine();// Consumir a nova linha deixada no buffer

                            System.out.println(" ");
                            System.out.println("Informações cadastradas com sucesso");

                            boletoAluno1.dataVencimento();
                            boletoAluno1.valormensal();

                }break;
                case 2: {

                    System.out.println(" ");
                    System.out.println("Informe o nome do Professor: ");
                    ler.nextLine();
                    professor1.setProfessorNome(ler.nextLine());

                    professor1.quantidadeAlunos();
                    professor1.valorRecebido();
                }break;
                case 3: {
                    continuar = false;
                }break;

            }

        }
    }
}
