public class Controle {
    private PilhaChecklist checklist;
    private FilaVeiculo ordemChegada;

    Controle(PilhaChecklist checklist, FilaVeiculo ordemChegada) {
        this.checklist = checklist;
        this.ordemChegada = ordemChegada;
    }

    public void verificacao() {
        NodeChecklist current = checklist.head;
        
        if(ordemChegada.head.data.getPassageiros().amount <= current.data) {
            System.out.println("\nParametro de passageiros: Aprovado");
        }
        else {
            System.out.println("\nParametro de passageiros: Reprovado");
        }
        current = current.next;

        if(ordemChegada.head.data.getPortas() <= current.data && ordemChegada.head.data.getPortas() > 0){
            System.out.println("Parametro de portas: Aprovado");
        }
        else {
            System.out.println("Parametro de portas: Reprovado");
        }

        current = current.next;

        if(ordemChegada.head.data.getRodas() == current.data || ordemChegada.head.data.getRodas() == current.data - 1){
            System.out.println("Parametro de rodas: Aprovado");
        } 
        else {
            System.out.println("Parametro de rodas: Reprovado");
        }
        ordemChegada.remove();
    }

    public boolean chamarProximoVeiculo() {
        if(ordemChegada.head != null){
            verificacao();
            return true;
        } else {
            System.out.println("\nA fila de veículos está vazia");
            return false;
        }

    }

    public void exibirVeiculos() {
        NodeVeiculo current1 = ordemChegada.head;
        NodePassageiro current2 = current1.data.getPassageiros().head;
        int i = 1;
        int j = 1;

        while(current1 != null) {
            System.out.println("\nVeiculo " + i);
            System.out.println("Descricao: " + current1.data.getDescricao());
            System.out.println("Numero de portas: " + current1.data.getPortas());
            System.out.println("Numero de rodas: " + current1.data.getRodas());

            while(current2 != null) {
                System.out.println("\nPassageiro " + j + ": " + current2.data);
                current2 = current2.next;
                j++;
            }
            j = 1;
            current1 = current1.next;
            if(current1 == null) {
                break;
            }
            current2 = current1.data.getPassageiros().head;
            i++;
        }
    }
}
