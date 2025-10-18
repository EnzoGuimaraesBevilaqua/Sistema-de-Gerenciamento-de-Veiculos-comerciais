import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        FilaVeiculo veiculos = new FilaVeiculo();
        PilhaChecklist testes = new PilhaChecklist(3);
        testes.push(4);
        testes.push(4);
        testes.push(5);
        Controle controle = new Controle(testes, veiculos);
        int escolha = 0;
        String descricao;
        String nomePassageiro;
        int rodas;
        int portas;
        String lixo;

        while(true) {
            if(veiculos.head == null) {
                System.out.println("\nSem Veiculos na fila");
            }
            else {
                System.out.println("\nVeiculos na fila: " + veiculos.amount);
            }
            
            System.out.println("\n1- Inserir veiculo a fila");
            System.out.println("2- Fazer verificacao do veiculo");
            System.out.println("3- Mostrar veiculos na fila");
            System.out.println("0- Encerrar\n");
            escolha = input.nextInt();
            lixo = input.nextLine();
            
            if(escolha == 1) {
                System.out.println("\nAbrindo terminal de cadastro\n");
                System.out.println("Descrição do veículo:");
                descricao = input.nextLine();
                System.out.println("\nNúmero de rodas: ");
                rodas = input.nextInt();
                System.out.println("\nNúmero de portas: ");
                portas = input.nextInt();
                lixo = input.nextLine();
                FilaPassageiro passageiros = new FilaPassageiro();
                while(true) {
                    System.out.println("\nNome do passageiro:");
                    nomePassageiro = input.nextLine();
                    passageiros.addPassageiro(nomePassageiro);
                    System.out.println("\nAdicionar outro passageiro? (1- sim 2- não)");
                    escolha = input.nextInt();
                    lixo = input.nextLine();
                    if(escolha == 1) {
                    
                    }
                    else if(escolha == 2) {
                        veiculos.addVeiculo(new Veiculo(descricao, passageiros, rodas, portas));
                        break;
                    }
                } 
            }
            else if(escolha == 2) {
                System.out.println("\nIniciando verificação");
                
                while(true){

                    if(controle.chamarProximoVeiculo()){

                    }else{
                        break;
                    }
                    System.out.println("\nChamar próximo veículo? (1- sim 2- não)");
                    escolha = input.nextInt();
                    if(escolha == 1) {

                    }
                    else if(escolha == 2) {
                        break;
                    }
                }
            }
            else if(escolha == 3) {
                if(veiculos.head == null) {
                    System.out.println("\nNão existem veículos na fila no momento");
                }
                else {
                    controle.exibirVeiculos();
                }
            }
            else if(escolha == 0) {
                System.out.println("\nEncerrando...\n");
                break;
            }
        }
        input.close();
    }
}
