public class NodeVeiculo {
    Veiculo data;
    NodeVeiculo next, prev;

    public NodeVeiculo(Veiculo data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
