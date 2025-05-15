package AlgoritmaStrukturData.Pertemuan12;
public class SingleLinkedList27 {
    NodeMahasiswa27 head;
    NodeMahasiswa27 tail;
    public boolean isEmpty() {
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            NodeMahasiswa27 temp = head;
            System.out.println("Isi Linked List :");
            while(temp != null){
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }else {
            System.out.println("List kosong");
        }
    }
    public void addFirst(Mahasiswa27 data){
        NodeMahasiswa27 newNode = new NodeMahasiswa27(data, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa27 data){
        NodeMahasiswa27 newNode = new NodeMahasiswa27(data, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertAfter(String key, Mahasiswa27 input){
        NodeMahasiswa27 newNode = new NodeMahasiswa27(input, null);
        NodeMahasiswa27 temp = head;
        do {
            if(temp.data.nama.equalsIgnoreCase(key)){
                newNode.next = temp.next;
                temp.next = newNode;
                if(newNode.next == null){
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    public void insertAt(int index, Mahasiswa27 input){
        if(index < 0){
            System.out.println("Invalid Index");
            return;
        }else if(index == 0){
            addFirst(input);
        }else {
            NodeMahasiswa27 temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa27(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
