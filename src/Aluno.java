public class Aluno {

    private static String nome;
    private static String cpf;
    private String email;
    private String data;
    private int horario;
    private int dias;

    public Aluno(){

    }

    public Aluno (String nome, String cpf, int dias){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}
