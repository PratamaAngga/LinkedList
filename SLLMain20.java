import java.util.Scanner;
public class SLLMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList20 sll = new SingleLinkedList20();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);

            sll.addLast(mhs);

            System.out.println("Data setelah penambahan:");
            sll.print();
        }

        sc.close();

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("Bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

// // Menambahkan data dan mencetak setelah setiap penambahan
// System.out.println("=== Menambahkan mhs1 di awal ===");
// list.addFirst(mhs1);
// list.print();

// System.out.println("\n=== Menambahkan mhs2 di akhir ===");
// list.addLast(mhs2);
// list.print();

// System.out.println("\n=== Menambahkan mhs3 setelah Budi ===");
// list.insertAfter("Budi", mhs3);
// list.print();

// System.out.println("\n=== Menambahkan mhs4 di indeks ke-2 ===");
// list.insertAt(2, mhs4);
// list.print();