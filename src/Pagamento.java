public class Pagamento extends Aluno {

    public double valor;
    public String vencimento = "Vencimento todo dia 10";


    public Pagamento (String nome, String cpf, int dias) {
            super(nome, cpf, dias);
            this.valor = 500.00;

    }
    public void dataVencimento(){
        System.out.println(" ");
        System.out.println("Nome do Aluno: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println(vencimento);

    }
    public void valormensal(){

        if (getDias() <= 2){
            double preco = valor - 150.00;

            System.out.printf("Mensalidade R$ %.2f\n", preco);
            System.out.println(" ");
        } else if (getDias() == 3) {
            System.out.printf("Mensalidade R$ %.2f\n", valor);
            System.out.println(" ");
        }else {
            System.out.printf("Mensalidade R$ %.2f\n", valor == 800.00);
            System.out.println(" ");
        }



    }
}
