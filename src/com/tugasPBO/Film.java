package com.tugasPBO;
/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1
* Deskripsi : menampilkan daftar film
* */

public class Film {
    public

    void nowPlaying(){
        System.out.println("-------Daftar Film Sedang Tayang-------");
        for(int i = 0; i< filmName.length; i++){
            System.out.println("Judul Film :" +filmName[i]);
            System.out.println("Genre Film :" +filmGenre[i]);
            System.out.println("Rating Film :" +filmRating[i]);
            System.out.println("Durasi Film :" +filmDuration[i] + " menit");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Film obj = new Film();
        obj.nowPlaying();
    }
}
