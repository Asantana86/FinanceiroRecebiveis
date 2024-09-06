public class Pagamento extends Aluno {

    public final double valor = 500.00;
    public final String vencimento = "Dia 10";
    public String formaPagamento;

    public Pagamento (String nome, float cpf) {
            super(nome, cpf);
            this.formaPagamento = formaPagamento;

    }
    public void dataVencimento(){
        System.out.println(vencimento);
    }
    public void valormensal(){
        System.out.println(valor);
    }

    public String tipoPagamento(String formaPagamento){
            return formaPagamento;
    }


}
