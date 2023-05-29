package sistemaescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaEscolar {

    public static void main(String[] args) {
    	
    	//Declaração das variaveis
    	int opt;
        int escolher, escolha, quant = 0;
        double not1, not2, not3;
        Turma turma;
        Aluno aluno;
        ArrayList<Turma> turmas = new ArrayList<Turma>();
        Scanner scan = new Scanner(System.in);
        

        // Opções do Sistema escolar 
        do {
            System.out.println("\n\t*** SISTEMA ESCOLAR ***");
            System.out.println("\tOpções\n 1 - Cadastrar Turma\n 2 - Cadastrar Aluno\n 3 - Cadastrar nota do aluno \n 4 - Relatòrio da turma\n 5 - Sair");
            System.out.print("\tInforme a oopção: ");
            opt = scan.nextInt();

            switch (opt) {

            	//Cadastro da turma
                case 1:
                	
                	//Construção do Objeto
                    turma = new Turma();
                    
                    System.out.print("\n\t*** CADASTRO DE TURMA ***\n");
                    System.out.print("\n\tInforme o codigo da turma: ");
                    turma.setId(scan.nextInt());

                    System.out.print("\tInforme o nome da turma: ");
                    turma.setNome(scan.next());
                    turmas.add(turma);
                    break;

                //Cadastro do aluno
                case 2:
                	
                	//Validação da turma
                    if (turmas.size() == 0) {
                        System.out.print("\n\t Turma inesistentes!\n");
                        break;
                    }
                    
                    //Construção do Objeto
                    aluno = new Aluno();

                    System.out.print("\n\t*** CADASTRO DE ALUNO ***\n");
                    System.out.print("\tInforme o matricula do aluno: ");
                    aluno.setId(scan.nextInt());
                    System.out.print("\tInforme o nome do aluno: ");
                    aluno.setNome(scan.next());
                                       
                    System.out.println("\n\t*** TURMAS DISPONIVEIS ***");
                    
                    //Demonstração das Turmas Cadastradas
                    if (turmas.size() != 0) {
                        for (int i = 0; i < turmas.size(); i++) {
                            System.out.println("\t"+(i + 1) + " - " + turmas.get(i).getNome());
                        }
                        
                        //Escolha da Turma do Aluno
                        System.out.print("\tInforme a turma do aluno: ");
                        escolher = scan.nextInt();
                        escolher--; 
                        
                        //Validação de Escolha da Turma
                        if (escolher < 0 || escolher > turmas.size()) {
                            System.out.println(" Turma inválida!");
                            break;
                        }
                        
                        //Atribuição do aluno na turma
                        turmas.get(escolher).setAluno(aluno);
                        
                        //Atribuição da contagem de aluno
                        quant++;
                        turmas.get(escolher).setQtAluno(quant);
                    }                                      
                    break;
                    
                //Cadastro de notas do aluno                  
                case 3:
                	
                	//Validação da turma
                    if (turmas.size() == 0) {
                        System.out.println("Nenhuma turma cadastrada!");
                        break;
                    }

                    //Lista das Turmas Cadastradas
                    System.out.println("\n\t*** TURMAS CADASTRADAS ***");
                    for (int i = 0; i < turmas.size(); i++) {
                        System.out.println("\t" + (i + 1) + " - Turma: " + turmas.get(i).getNome());
                    }
                    
                    //Escolha da turma
                    System.out.print("\tInforme o número da turma: ");
                    escolha = scan.nextInt();
                    escolha--;
                    if (escolha < 0 || escolha > turmas.size()) {
                        System.out.println("Turma inválida!");
                        break;
                    }

                    //Atribuição de referencias a variavel, Classe Turma                   
                    ArrayList<Aluno> alunosDaTurma = turmas.get(escolha).getAluno();
                    
                    System.out.println("\n\t*** ALUNOS CADASTRADOS DA TURMA " + turmas.get(escolha).getNome() + " ***");
                    for (int i = 0; i < alunosDaTurma.size(); i++) {
                        Aluno turmaDoAluno = alunosDaTurma.get(i);
                        System.out.println("\t" + (i + 1) + " - " + turmaDoAluno.getNome());
                    }

                    //Seletor do aluno
                    System.out.print("\tInforme o número do aluno: ");
                    int alunoEscolhido = scan.nextInt();
                    alunoEscolhido--;
                    
                    if (alunoEscolhido < 0 || alunoEscolhido > alunosDaTurma.size()) {
                        System.out.println("\tAluno não cadastrado!");
                        break;
                    }

                    //Atribuição referencias a variavel, Objeto Aluno 
                    aluno = alunosDaTurma.get(alunoEscolhido);

                    //Passando os Parametros ao Metodo, Classe Aluno
                    System.out.print("\tInforme a nota 1: ");
                    not1 = scan.nextDouble();
                    System.out.print("\tInforme a nota 2: ");
                    not2 = scan.nextDouble();
                    System.out.print("\tInforme a nota 3: ");
                    not3 = scan.nextDouble();                    
                    aluno.mediaFinal(not1, not2, not3);                                   
                    break;

                // Relatorio das turmas
                case 4: 
                	
                	//Validação da turma
                	if (turmas.size() == 0) {
                        System.out.println("\n\tNenhuma turma cadastrada!");
                        break;
                    }
                    
                	//Exibição das Turmas
                    System.out.println("\n\t*** RELATÓRIO DA TURMA ***");
                    System.out.println("\n\t*** TURMAS CADASTRADAS ***");
                    for (int i = 0; i < turmas.size(); i++) {
                        System.out.println("\t"+(i + 1) + " - Turma: " + turmas.get(i).getNome());
                    }
                    
                    //Seletor da Turma
                    System.out.print("\tInforme o número da turma: ");
                    escolha = scan.nextInt();
                    escolha--;
                    if (escolha < 0 || escolha >= turmas.size()) {
                        System.out.println("Turma inválida!");
                        break;
                    }
                    
                    //Atribuição de referencias a variavel, Classe Turma   
                    ArrayList<Aluno> exibirAluno = turmas.get(escolha).getAluno();
                    
                    //Exibição da Turma Selecionada
                    System.out.println("\n\t*** ALUNOS DA TURMA " + turmas.get(escolha).getNome() + " ***");
                    System.out.println("\tAluno \t Situação \tMédia final");
                    
                    //Exibição da Lista dos Alunos
                    for (int i = 0; i < exibirAluno.size(); i++) {
                        Aluno infoAluno = exibirAluno.get(i);
                        System.out.println("\t" + infoAluno.getNome() + "\t" + infoAluno.getSituacao() + "\t" + infoAluno.getMedia());
                    }
                    break;

                case 5:
                	
                	//Encerramento do Programa
                	System.out.println("\n\t Saindo...");
                    break;

                default:
                    System.out.println("\n\tOpção inválida!");

            }

        } while (opt != 5);

    }

}
