package AlgoritmaStrukturData.Pertemuan5;

public class Pangkat {
    int nilai,pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil = hasil*this.nilai;
        }
        return hasil;
    }

    int pangkatDC(int a,int n) {
        if(n == 1){
            return a;
        }else{
            if(n%2 == 1){
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            }else{
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}
