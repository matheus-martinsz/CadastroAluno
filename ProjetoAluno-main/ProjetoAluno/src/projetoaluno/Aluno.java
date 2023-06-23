package projetoaluno;

public class Aluno {
    private int matricula, id;
    private String nome, turma;
    private byte [] picture;
    
    
    
    

    public Aluno(int matricula, int id, String nome, String turma, byte[]image) {
        this.matricula = matricula;
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.picture = image;
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public byte[] getPicture() {
        return picture;
    }

    public byte[] getImage(){
        return picture;
    }
    
     
    
    
}


