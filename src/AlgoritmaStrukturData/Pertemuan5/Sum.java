package AlgoritmaStrukturData.Pertemuan5;
public class Sum {
    double keuntungan[];
    Sum(int el){
        this.keuntungan = new double[el];
    }
    double totalBF(){
        double total = 0;
        for(int i = 0; i < this.keuntungan.length; i++){
            total = total + this.keuntungan[i];
        }
        return total;
    }
    double totalDC(double arr[],int l , int r){
        if(l == r){
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}
