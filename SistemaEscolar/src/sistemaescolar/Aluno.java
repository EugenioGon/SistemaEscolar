package sistemaescolar;

public class Aluno {

	//Atributos da Classe 
	
    private int id;
    private String nome;
    private Turma turma;
    private double not1;
    private double not2;
    private double not3;
    private double media = 0;
    private String situacao;

    //Metodo Construtor
    
    public Aluno() {
    }

    public Aluno(int id, String nome,double not1, double not2, double not3,double media , Turma turma) {
        this.id = id;
        this.nome = nome;       
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
        this.media = media;
        this.turma = turma;
    }

    //Metodos Getters e Setters
    
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNot1() {
        return not1;
    }

    public void setNot1(double not1) {
        this.not1 = not1;
    }

    public double getNot2() {
        return not2;
    }

    public void setNot2(double not2) {
        this.not2 = not2;
    }

    public double getNot3() {
        return not3;
    }

    public void setNot3(double not3) {
        this.not3 = not3;
    }

    public void setMedia(double media) {
    	this.media = media;
    	
    }
    
    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
    //Metodos da Classe
    
    public void mediaFinal(double not1, double not2, double not3) {
    	
        if (not1 < 0 || not1 > 10 || not2 < 0 || not2 > 10 || not3 < 0 || not3 > 10) {
            System.out.println("\n\tNotas inválidas!");
            return;
        }

        double media = (not1 + not2 + not3) / 3;
        setMedia(media);

        if (media >= 7) {
            setSituacao("Aprovado!");
        } else {
            setSituacao("Reprovado");
        }
    	
    }
}
