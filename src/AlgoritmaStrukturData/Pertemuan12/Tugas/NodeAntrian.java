package AlgoritmaStrukturData.Pertemuan12.Tugas;

class NodeAntrian {
    MahasiswaAntrian data;
    NodeAntrian next;
    public NodeAntrian(MahasiswaAntrian data) {
        this.data = data;
        this.next = null;
    }
}
