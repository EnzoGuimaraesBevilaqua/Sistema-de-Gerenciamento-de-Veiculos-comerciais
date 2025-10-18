public class PilhaChecklist {
    NodeChecklist head;
    int size, amount;
    
    PilhaChecklist(int size) {
        this.head = null;
        this.size = size;
    }

    public void push(int data) {
        if(amount >= size) {
            System.out.println("Nao se pode adicionar mais elementos, a pilha esta cheia");
        }
        else {
            NodeChecklist newNode = new NodeChecklist(data);

            if(head == null) {
                head = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
            amount++;
        }
    }

    public void pop() {
        if(amount < 1) {
            System.out.println("A pilha nao possui elementos para serem retirados");
        }
        else {
            if(head == null) {
                return;
            }

            NodeChecklist temp = head;
            head = head.next;
            temp.next = null;
            amount--;
        }
    }

    public void peek() {
        if(head == null) {
            System.out.println("Nao existe elemento na pilha");
        }
        else {
            System.out.println(this.head.data + "\n");
        }
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(amount == size) {
            return true;
        }
        else {
            return false;
        }
    }

    public void traverseForward() {
        NodeChecklist current = head;

        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
