/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan nemampilkan gaji karyawan
 */
public class PBOIF210119044Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(input.nextInt());
        
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK     : "+manager.getNik());
        System.out.println("NAMA    : "+manager.getNama());
        System.out.println("GOLONGAN: "+manager.getGolongan());
        System.out.println("JABATAN : "+manager.getJabatan()+"\n");
        
        System.out.println("TUNJANGAN GOLONGAN      : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println();
        System.out.println("GAJI TOTAL : "+manager.gajiTotal());
    }
}
