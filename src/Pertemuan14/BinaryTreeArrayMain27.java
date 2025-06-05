package Pertemuan14;
public class BinaryTreeArrayMain27 {
    public static void main(String[] args) {
        BinaryTreeArray27 bta = new BinaryTreeArray27();

        Mahasiswa27 mhs1 = new Mahasiswa27("244160121", "Ali", "A", 3.57);
        Mahasiswa27 mhs2 = new Mahasiswa27("244160185", "Candra", "C", 3.41);
        Mahasiswa27 mhs3 = new Mahasiswa27("244160221", "Badar", "B", 3.75);
        Mahasiswa27 mhs4 = new Mahasiswa27("244160220", "Dewi", "B", 3.35);
        Mahasiswa27 mhs5 = new Mahasiswa27("244160131", "Devi", "A", 3.48);
        Mahasiswa27 mhs6 = new Mahasiswa27("244160205", "Ehsan", "D", 3.61);
        Mahasiswa27 mhs7 = new Mahasiswa27("244160170", "Fizi", "B", 3.86);

        Mahasiswa27[] dataPopulate = new Mahasiswa27[10];
        dataPopulate[0] = mhs1; 
        dataPopulate[1] = mhs2; 
        dataPopulate[2] = mhs3; 
        dataPopulate[3] = mhs4; 
        dataPopulate[4] = mhs5;
        dataPopulate[5] = mhs6;
        dataPopulate[6] = mhs7;

        int idxLastForPopulate = 6;

        bta.populateData(dataPopulate, idxLastForPopulate);

        System.out.println("\nInorder Traversal Mahasiswa (setelah populateData): ");
        bta.traverseInOrder(0);
    }
}