public class Pagamento extends Aluno {

    public double valor;
    public String vencimento = "Vencimento todo dia 10";


    public Pagamento (String nome, String cpf) {
            super(nome, cpf);
            this.valor = 500.00;

    }
    public void dataVencimento(){
        System.out.println(" ");
        System.out.println("Nome do Aluno: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println(vencimento);

    }
    public void valormensal(){

        if (getDias() == 2){

            System.out.println("Mensalidade. R$ 350,00");
            System.out.println(" ");

        } else if (getDias() == 3) {

            System.out.println("Mensalidade.. R$ 500,00");
            System.out.println(" ");

        }else if (getDias() > 3) {

            System.out.println("Mensalidade... R$ 800,00");
            System.out.println(" ");
        }



    }
}
