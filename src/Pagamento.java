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
            double mensal = 500.00;
        if (getDias() == 2){
            mensal = valor - 150.00;

            System.out.printf("Mensalidade R$ %.2f\n", mensal);
            System.out.println(" ");

        } else if (getDias() == 3) {

            System.out.printf("Mensalidade R$ %.2f\n", mensal);
            System.out.println(" ");

        }else if (getDias() > 3) {
                mensal = valor + 300.00;
            System.out.printf("Mensalidade R$ %.2f\n", mensal );
            System.out.println(" ");
        }



    }
}
