public class Administrador extends Aluno {

    private String professorNome;


    public Administrador (String professorNome, String nome, String cpf, int horario, int dias){
        super (nome, cpf, horario, dias);

    }

    public Administrador(){

    }

    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }
    public void quantidadeAlunos(){
        System.out.println(" ");
        System.out.println("Professor:. " + getProfessorNome());
        System.out.println("Aluno: " + getNome());
        System.out.println("Hoario das " + getHorario() +"h.");
        System.out.println(getDias() + " dias por semana.");
    }
    public void valorRecebido(){

        if (getDias() == 2){

            System.out.printf("Mensalidade R$ 350,00");
            System.out.println(" ");
        } else if (getDias() == 3) {
            System.out.println("Mensalidade R$ 500,00");
            System.out.println(" ");
        }else if (getDias() > 3) {
            System.out.printf("Mensalidade R$ 800,00");
            System.out.println(" ");
        }

    }
}
