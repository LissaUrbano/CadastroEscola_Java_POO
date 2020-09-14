
public class Funcionario extends Pessoa{
    
    //atributos
    private String setor;
    private boolean trabalhando;

    //construtor
    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    //metodos criados
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    //metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario [setor=" + setor + ", trabalhando=" + trabalhando + "]"  + super.toString();
    }
    
}
