package salim;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {

    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> NIM = new ArrayList<>();
        ArrayList<String> Alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nprogram data mahasiswa");
            System.out.println("========================");
            System.out.println("1.Tambahkan");
            System.out.println("2.Tampilkan");
            System.out.println("3.Cari");
            System.out.println("4.Hapus");
            System.out.println("5.Keluar");
            System.out.print("\npilih menu :");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukan nama :");
                String nm = input.next();
                nama.add(nm);

                System.out.print("Masukan NIM :");
                String nim = input.next();
                NIM.add(nim);

                System.out.print("Masukan Alamat :");
                String alt = input.next();
                Alamat.add(alt);
            } else if (pilihan == 2) {
                System.out.println("Data mahasiswa");
                System.out.println("==============");

                for (int i = 0; i < NIM.size(); i++) {
                    System.out.print(i + 1 + "." + NIM.get(0));
                    {
                        System.out.println("untuk melihat data lengkap, cari data (3)");

                    }

                }
            } else if (pilihan == 3) {
                System.out.print("Masukan data nomor berapa yang anda ingin cari:");
                int cari = input.nextInt();
                if (cari == 1) {
                    System.out.println("Nama: " + nama.get(0));
                    System.out.println("Nim: " + NIM.get(0));
                    System.out.println("Alamat: " + Alamat.get(0));
                }
                System.out.println("============");

                if (cari == 2) {
                    System.out.println("Nama :" + nama.get(1));
                    System.out.println("Nim: " + NIM.get(1));
                    System.out.println("Alamat: " + Alamat.get(1));

                }
            } else if (pilihan == 4) {
                System.out.println("Data mahasiswa");
                System.out.println("============");

                for (int i = 0; i < NIM.size(); i++) {
                    System.out.println(i + 1 + "." + NIM.get(i));
                }
                System.out.print("Masukan nim yang akan di hapus:");
                String nim = input.next();
                NIM.remove(nim);
            }
            else if (pilihan==5){
                System.out.println("selesai");
            }else {
                System.out.println("menu tidak tersedia");
            }
        } while (pilihan != 5);


    }
}