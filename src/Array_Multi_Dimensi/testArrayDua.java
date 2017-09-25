/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Multi_Dimensi;

/**
 *
 * @author ChaVaZaSRL
 */
public class testArrayDua {
    int nis [][] = {{210651},{210651},{210652}};
    String nama [][] = {{"Rizvan Dimas"},{"Nur Azmi"},{"Devita Fahma"}};
 
    public void tampil(){
        System.out.println("Identitas Siswa Angkatan 24");
    }

    public void namanis (){
        for (int i = 0; i< 1; i++){
            for (int j = 0; j < 1; j++){
                System.out.println(nama[1][j]+":"+nis[1][j]);
                System.out.println(nama[2][j]+":"+nis[2][j]);
            }
        }
    }

    public static void main (String[]args){
        testArrayDua siswa = new testArrayDua();
        siswa.tampil();
        siswa.namanis();
    }

}
