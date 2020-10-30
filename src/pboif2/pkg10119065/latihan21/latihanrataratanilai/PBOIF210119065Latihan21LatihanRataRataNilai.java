package pboif2.pkg10119065.latihan21.latihanrataratanilai;

import java.util.Scanner;

 /*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program rata-rata nilai 
 */
public class PBOIF210119065Latihan21LatihanRataRataNilai {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int totalMhs,i;
       float NMhs,rataRataNilai,totalNilai;
       System.out.print("Masukkan banyaknya mahasiswa : ");
       totalMhs = sc.nextInt(); 
       totalNilai = 0;
       
       for(i = 0; i < totalMhs; i++ ){
          System.out.print("Nilai mahasiswa ke-"+ (i+1) +" : ");
          NMhs = sc.nextFloat();
          totalNilai += NMhs;
       }
       rataRataNilai = totalNilai / totalMhs;
       System.out.println("\nMaka, rata-rata nilainya adalah " + rataRataNilai);        
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
