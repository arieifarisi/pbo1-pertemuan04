package Perulangan;

public class Perulangan {
    public static void main(String[] args) {

            int ukuranArr = 10;
            int hasil = 0;
            int[] bilangan = new int[ukuranArr];

            for (int i = 0; i < ukuranArr; i++) {
                bilangan[i] = (i + 1) * 10;
            }
            for (int i = 0; i < ukuranArr; i++) {
                System.out.println("bilangan[" + i + "] =  " + bilangan[i]);
                hasil += bilangan[i];
            }

            System.out.println("Hasil penjumlahan =  " + hasil);

        }
    }
