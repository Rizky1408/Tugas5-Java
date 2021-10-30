package com.bab5;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BufferedReader word = new BufferedReader(new InputStreamReader(System.in));
        int pilihan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Menggunakan BufferedReader\n2.Menggunakan JOptionPane");
        System.out.print("Masukan Pilihan :");
        pilihan = scanner.nextInt();
        switch (pilihan){
            case 1 :
                String kalimat1 = "";
                String kalimat2 = "";
                String kalimat3 = "";
                System.out.println("Masukan kalimat secara berurutan :");


                try{
                    kalimat1 = word.readLine();
                    kalimat2 = word.readLine();
                    kalimat3 = word.readLine();
                }catch (IOException e){
                    System.out.println("Error");
                }
                System.out.println("Ouput Menggunakan BufferedReader :" + kalimat1 + " " +kalimat2 + " " + kalimat3 );
                break;

            case 2 :
                String word1 ="";
                String word2 ="";
                String word3 ="";

                word1 = JOptionPane.showInputDialog("Please enter word 1");
                word2 = JOptionPane.showInputDialog("Please enter word 2");
                word3 = JOptionPane.showInputDialog("Please enter word 3");

                String message = word1 + " " + word2 + " " + word3;

                JOptionPane.showMessageDialog(null,message);
                break;

            default:
                System.out.print("Inputan invalid");
        }
    }
}
