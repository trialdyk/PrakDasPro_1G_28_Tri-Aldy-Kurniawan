package AlgoritmaStrukturData.Pertemuan13.Tugas2;
public class Film {
    int id;
    String judul;
    double rating;
    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
    public String toString() {
        return "ID: " + id + "\nJudul Film: " + judul + "\nRating Film: " + String.format("%.1f", rating);
    }
}
