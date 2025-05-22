package AlgoritmaStrukturData.Pertemuan13.Tugas2;
public class NodeFilm {
    Film data;
    NodeFilm prev, next;
    NodeFilm(NodeFilm prev, Film data, NodeFilm next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}