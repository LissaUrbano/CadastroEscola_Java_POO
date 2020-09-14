
public class Aluno extends Pessoa {
    
    //atributos
    private Boolean matriculaAtiva;
    private String curso;

    //construtor
    public Aluno( String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matriculaAtiva = true;
        this.curso = curso;
    }

    //metodos criados
    public void cancelarMatricula(){
        this.matriculaAtiva = false;
    }

    //metodos especiais
    public Boolean getMatricula() {
        return matriculaAtiva;
    }

    public void setMatricula(Boolean matricula) {
        this.matriculaAtiva = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matriculaAtiva=" + matriculaAtiva + "]" + super.toString();
    }

}
