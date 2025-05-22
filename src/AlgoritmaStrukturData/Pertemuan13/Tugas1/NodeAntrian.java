package AlgoritmaStrukturData.Pertemuan13.Tugas1;

public class NodeAntrian {
    Penerima data;
    NodeAntrian prev, next;

    NodeAntrian(NodeAntrian prev, Penerima data, NodeAntrian next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
