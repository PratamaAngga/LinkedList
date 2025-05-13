public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20();

        Mahasiswa20 mhs1 = new Mahasiswa20("20001", "Alya", "TI-1A", 3.75);
        Mahasiswa20 mhs2 = new Mahasiswa20("20002", "Budi", "TI-1B", 3.50);
        Mahasiswa20 mhs3 = new Mahasiswa20("20003", "Citra", "TI-1A", 3.90);
        Mahasiswa20 mhs4 = new Mahasiswa20("20004", "Doni", "TI-1C", 3.30);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Doni", mhs3);
        sll.insertAt(2, mhs2);
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