
public class Professor extends Pessoa {

    //atributos
    private String especialidade;
    private double salario;

    //construtor
    public Professor(String especialidade, double salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //metodos criados
    public void receberAumento(double aumento){
        this.salario += aumento;
    }

    //metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]"  + super.toString();
    }
    
}



