/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andika.quis_a_3012;

/**
 *
 * @author andik
 */

// sub class penduduk
public class Dokter_21103012 extends Penduduk_21103012 {

    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;

    public void DataDokter() {
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }

    public double totalPendapatanDokter() {
        return totalPendapatanDokter = (jmlPasien * 50.000) + (jmlObat * 10.000);
    }
}
