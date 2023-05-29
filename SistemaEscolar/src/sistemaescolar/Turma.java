package sistemaescolar;

import java.util.ArrayList;

public class Turma {

	//Atributos da Classe
	
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private int id;
    private String nome;
    private int qtAluno;
    
    //Metodo Construtor
    
    public Turma() {
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

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(Aluno alunos) {
        this.alunos.add(alunos);
    }

    public int getQtAluno() {
        return qtAluno;
    }

    public void setQtAluno(int qtAluno) {
        this.qtAluno = qtAluno;
    }
    
   

}
