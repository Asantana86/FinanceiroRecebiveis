import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int acao = 0, acao2 = 0;
        boolean continuar = true;

         Aluno aluno1 = new Aluno();

        System.out.println(" ");
        System.out.println("informe a ação desejada:");
        System.out.println("1 ALUNO");
        System.out.println("2 PROFESSOR");
            acao = ler.nextInt();
            switch (acao){

                case 1: {
                    while (continuar) {
                        System.out.println(" ");
                        System.out.println("1 CADASTRO PESSOAL");
                        System.out.println("2 INFORMAÇÔES DE PAGAMENTO");
                        acao2 = ler.nextInt();
                        ler.nextLine();

                        switch (acao2) {
                            case 1: {
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
                                ler.nextLine();// Consumir a nova linha deixada no buffer
                                System.out.println(" ");

                            }break;
                            case 2: {
                                Pagamento boletoAluno1 = new Pagamento(aluno1.getNome(), aluno1.getCpf(), aluno1.getDias());

                                boletoAluno1.dataVencimento();
                                boletoAluno1.valormensal();

                            }break;
                        }
                    }
                }break;
            }
        /*System.out.println(aluno1.getNome());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getEmail());
        System.out.println(aluno1.getData());
        System.out.println(aluno1.getHorario());
        System.out.println(aluno1.getDias());*/
    }
}