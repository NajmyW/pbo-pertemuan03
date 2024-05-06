
public class OperasiPercabangan {
    public static void main(String[] args){
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet< totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        } else if (uangDiDompet > totalBelanja){
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uang cukup, angsul : "+angsul);
        } else {            System.out.println("Uang pass... UwU...");

        }
    } 
}
