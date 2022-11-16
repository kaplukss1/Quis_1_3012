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
public class Nelayan_21103012 extends Penduduk_21103012 {

    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public double totalPendapatanNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar + 10.000);
    }

    public void DataNelayan() {
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }
}
