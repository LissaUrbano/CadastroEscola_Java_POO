
public class Programa {
    public static void main(String[] args) {
        
        Aluno p1 = new Aluno("Eng. Civil", "Bruna", 26, "Fem");
        Professor p2 = new Professor("Ciencias", 2500.90, "João Marcelo", 41, "Masc.");
        Funcionario p3 = new Funcionario("Limpeza", true, "Maria", 30, "Fem.");

        p1.setCurso("Eng da Computação");
        p2.receberAumento(500.00);
        p3.mudarTrabalho();
                
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
