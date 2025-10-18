public class FilaVeiculo {
    NodeVeiculo head, tail;
    int amount;
    
    FilaVeiculo() {
        this.head = null;
        this.tail = null;
        this.amount = 0;
    }
    
    public void addVeiculo(Veiculo data) {
        NodeVeiculo newNode = new NodeVeiculo(data);

        if(tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        amount++;
    }

    public void remove() {
        if(amount < 1) {
            System.out.println("A fila nao possui elementos para serem retirados");
        }
        else {
            if(head == null) {
                return;
            }
            if(head == tail) {
                head = null;
                tail = null;
                amount--;
                return;

            }

            NodeVeiculo temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            amount--;
        }
    }

    public void peek() {
        if(head == null) {
            System.out.println("Nao existe elemento na fila");
        }
        else {
            System.out.println(this.head.data + "\n");
        }
    }

    public void isEmpty() {
        if(head == null) {
            System.out.println("A fila esta vazia");
        }
        else {
            System.out.println("A fila nao esta vazia");
        }
    }

    public void size() {
        System.out.println(amount);
    }

    public void traverseForward() {
        NodeVeiculo current = head;

        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackwards() {
        NodeVeiculo current = tail;

        while(current != null) {
            System.out.println(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

}
