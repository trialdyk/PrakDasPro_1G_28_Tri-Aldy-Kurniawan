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
    public void getData(int index){
        NodeMahasiswa27 temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }
    public int indexOf(String key){
        NodeMahasiswa27 temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data.nama.equalsIgnoreCase(key)){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat dihapus");
        }else {
            head = head.next;
            if(head == null){
                tail = null;
            }
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat dihapus");
        }else {
            NodeMahasiswa27 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String key){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat dihapus");
        }else {
            NodeMahasiswa27 temp = head;
            NodeMahasiswa27 prev = null;
            while(temp != null){
                if(temp.data.nama.equalsIgnoreCase(key)){
                    if(prev == null){
                        head = temp.next;
                    }else {
                        prev.next = temp.next;
                    }
                    if(temp.next == null){
                        tail = prev;
                    }
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else {
            NodeMahasiswa27 temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}
