import java.util.Scanner;

public class TugasSwitch {
    public static void main(String[] args) {
        int inputJenis, bahanBakar, totalHarga, inputLiter;
        Scanner input = new Scanner(System.in);

        System.out.println("======= Daftar Harga Bahan Bakar =====");
        System.out.println("1. Harga Bensin : Rp.4500/L");
        System.out.println("2. Harga Solar : Rp.5000/L");
        System.out.println("3. Harga Pertamax : Rp.7500/L");
        System.out.print("Silahkan Pilih Nomor Bahan Bakar : ");
        inputJenis = input.nextInt();

        System.out.print("Masukkan jumlah liter yang dibeli: ");
        inputLiter = input.nextInt();

        switch (inputJenis) {
            case 1:
                System.out.println("Anda memilih buah Bensin");
                bahanBakar = 4500;
                totalHarga = bahanBakar * inputLiter;
                System.out.println("Maka, Total Harga Rp. 4500/" + inputLiter + " adalah : " + totalHarga);
                break;
                case 2:
                System.out.println("Anda memilih buah Solar");
                bahanBakar = 5000;
                totalHarga = bahanBakar * inputLiter;
                System.out.println("Maka, Total Harga Rp. 5000/" + inputLiter + " adalah : " + totalHarga);
                break;
                case 3:
                System.out.println("Anda memilih buah Pertamax");
                bahanBakar = 7500;
                totalHarga = bahanBakar * inputLiter;
                System.out.println("Maka, Total Harga Rp. 7500/" + inputLiter + " adalah : " + totalHarga);
                break;
            default:
                System.out.println("Nomor bahan bakar yang Anda masukkan tidak valid.");
        }
        input.close();
    }
}
