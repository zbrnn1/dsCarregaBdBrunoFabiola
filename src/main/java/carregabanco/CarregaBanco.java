package carregabanco;

import java.util.Scanner;

import carregabanco.model.AlunoModel;
import carregabanco.repository.AlunoDao;
import carregabanco.view.CarregaBancoView;

public class CarregaBanco {
	public static void main(String[] args) {
		new CarregaBancoView();
		//AlunoModel alunoModel = AlunoDao.getInstance().getById(1);
  
		 
			 int opcao = 0;
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.println("Menu:");
				System.out.println("1 - Para Cadastrar Aluno");
				System.out.println("2 - Para Buscar Aluno");
				System.out.println("3 - Para Editar Aluno");
				System.out.println("4 - Para Excluir Aluno");
				System.out.println("0 - Para sair");
		
				
				opcao = Integer.parseInt( scanner.nextLine() );
				
				switch(opcao) {
					case 1:
						cadastrarAluno(scanner);
						break;
					case 2:
						buscarAluno(scanner);
						break;
					case 3:
						editarAluno(scanner);
						break;
					case 4:
						excluirAluno(scanner);
						break;
					case 0:
						break;
					default:
						System.out.println("Opcaoo Inv�lida.");
						break;
				}
				//AlunoModel alunoModel = AlunoDao.getInstance().getById(1);
				
			}while(opcao!=0);
	}
		
		
			private static void excluirAluno(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


			private static void editarAluno(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


			private static void buscarAluno(Scanner scanner) {
				//TODO Auto-generated method stub
				System.out.println("# Buscar Aluno #");
				System.out.print("Digite o id do Aluno: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				
				
	}


			private static void cadastrarAluno(Scanner scanner) {
				// TODO Auto-generated method stub
				System.out.println("========CADASTRO DE ALUNO=====\n");
				//AlunoModel aluno= new AlunoModel();
				
				System.out.println("-----Informe o Campus----- = ");
				String campus= scanner.nextLine();
				
				System.out.println("-----Informe o polo----- = ");
				String polo= scanner.nextLine();
				
				System.out.println("-----Informe o email institucional----- = ");
				String email_institucional= scanner.nextLine();
				
				
				System.out.println("-----Informe a idade----- = ");
				String idade= scanner.nextLine();
				
				System.out.println("-----Informe o sexo ----- = ");
				String sexo= scanner.nextLine();
				
				System.out.println("-----Informe o nome do aluno----- = ");
				String nome_estudante= scanner.nextLine();
				
	
				
				System.out.println("----Informe a coordenacao----");
				String coordenacao= scanner.nextLine();
				
				System.out.println("-----Informe o curso----- ");
				String curso= scanner.nextLine();
				
				System.out.println("----Informe sobre a situacao(Ex.: Em curso, pendente)-----");
				String  situacao= scanner.nextLine();
				
				System.out.println("----Informe a data de entrada(Ex.:01/2023)-----:");
				String periodo_entrada= scanner.nextLine();
				
				AlunoDao alunoDao = AlunoDao.getInstance();
				AlunoModel aluno = new AlunoModel();//campus,polo,email_institucional,idade,sexo,nome_estudante,coordenacao,curso,situacao,periodo_entrada);
				alunoDao.persist(aluno);
				
		
			
				System.out.println(aluno.toString());
				
			}
}
