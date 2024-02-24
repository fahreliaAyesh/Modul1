import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String Name;
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        String nama, jenisKelamin, tanggalLahir;

        // untuk memasukkan data
        System.out.printf("Nama :");
        nama = objInput.nextLine();
        System.out.print("Jenis Kelamin (P/L) : ");
        jenisKelamin = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd) :");
        tanggalLahir = objInput.nextLine();

        //Menghitung Umur
        LocalDate lahir = LocalDate.parse(tanggalLahir);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(lahir, sekarang);

        System.out.println("--Output--");
        System.out.println("Nama :" + nama);
        System.out.print("Jenis Kelamin : ");
        if(jenisKelamin.equalsIgnoreCase("P")){
            System.out.println("Perempuan");
        }else{
            System.out.println("Laki-laki");
        }
        System.out.println("Umur Anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan ");
    }
}