import java.util.Scanner;

public class TugasIfElse {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Selamat Datang di Toko Buah Segar Manis");
        System.out.println("=========================");
        System.out.println("Silahkan pilih buah : ");
        System.out.println("1. Kiwi\n2. Mangga\n3. Alpukat\n4. Apel");
        System.out.println("=========================");
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Jenis Buah : ");
        String buah = input.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah kiloan : ");
        int kg = input.nextInt();

        if (buah.equals("kiwi")) {
            System.out.println("Anda memilih buah Kiwi");
            if (kg > 0 && kg > 20) {
                System.out.println("karena kiloan lebih dari 20kg, maka Anda mendapatkan potongan sebesar 7%");
            } else if (kg > 5 && kg <= 20) {
                System.out.println("Karena kiloan lebih dari 5kg, maka Anda mendapatkan potongan sebesar 5%");
            } else if (kg > 0 && kg <= 5) {
                System.out.println("Anda tidak mendapatkan potongan harga, karena kiloan tidak sesuai dengan persyaratan!.");
            }
        } else if (buah.equals("mangga")) {
            System.out.println("Anda memilih buah Mangga");
            if (kg > 0 && kg > 20) {
                System.out.println("karena kiloan lebih dari 20kg, maka Anda mendapatkan potongan sebesar 7%");
            } else if (kg > 5 && kg <= 20) {
                System.out.println("Karena kiloan lebih dari 5kg, maka Anda mendapatkan potongan sebesar 2.5%");
            } else if (kg > 0 && kg <= 5) {
                System.out.println("Anda tidak mendapatkan potongan harga, karena kiloan tidak sesuai dengan persyaratan!.");
            }
        } else if (buah.equals("alpukat")) {
            System.out.println("Anda memilih buah Alpukat");
            if (kg > 0 && kg > 10) {
                System.out.println("Karena kiloan lebih dari 10kg, maka Anda mendapatkan sebuah Payung");
            } else if (kg > 5 && kg <= 10) {
                System.out.println("Karena kiloan lebih dari 5kg, maka Anda mendapatkan potongan sebesar 7%");
            } else if (kg > 0 && kg <= 5) {
                System.out.println("Anda tidak mendapatkan potongan harga, karena kiloan tidak sesuai dengan persyaratan!.");
            }
        } else if (buah.equals("apel")) {
            System.out.println("Anda memilih buah Apel");
            if (kg > 0 && kg > 15) {
                System.out.println("Karena kiloan lebih dari 15kg, maka Anda mendapatkan sebuah Tas");
            } else if (kg > 5 && kg <= 15) {
                System.out.println("Karena kiloan lebih dari 5kg, maka Anda mendapatkan potongan sebesar 10%");
            } else if (kg > 0 && kg <= 5) {
                System.out.println("Anda tidak mendapatkan potongan harga, karena kiloan tidak sesuai dengan persyaratan!.");
            }
        } else {
            System.out.println("Buah yang anda pilih tidak tersedia");
        }
        input.close();
    }
}
