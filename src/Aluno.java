public class Aluno {

    private String nome;
    private float cpf;
    private String email;
    private String data;
    private int horario;
    private String dias;

    public Aluno(){

    }

    public Aluno (String nome, float cpf){
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

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
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

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

}
