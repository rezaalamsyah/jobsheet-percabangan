
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santuy
 */
public class ProgramPembayaranTagihanListrik {
    public static void main(String[] args) {
       int kwh,biaya,totalbiaya;
       double total;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("--Program Pembayaran Tagihan Listrik--");
       System.out.println("jumlah kwh perbulan: ");
       kwh = scanner.nextInt();
       
       System.out.println("\n-Golongan-");
       if(kwh <= 450) {
           System.out.println("Anda termasuk golongan C (menengah ke bawah)");
           biaya = 20000 + (1000 + kwh);
           System.out.println("biaya" + "Rp." + biaya);
           System.out.println("\nTotal biaya: " );
           totalbiaya = (biaya + (biaya * 15/100));
           System.out.println("total biaya: " + totalbiaya);
           
       }else if (kwh <= 900) {
           System.out.println("Anda termasuk golongan B (Standar)");
           biaya = 35000 + (2500 * kwh);
           System.out.println("biaya " + "Rp." +biaya);
       }else if (kwh <=1200) {
           System.out.println("Anda termasuk golongan A (tinggi)");
           biaya = 5000 + (3000 * kwh);
           System.out.println("biaya" + "Rp." +biaya);
       }else {
           System.out.println("Maaf Anda memasukkan angka yang tidak sesuai");
       }
       
    }
}
