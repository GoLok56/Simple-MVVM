package io.golok56.github;

import java.util.Scanner;

public class MvvmDemo {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        Scanner scanner = new Scanner(System.in);
        String inputMessage = "";
        System.out.println("Halo kak, ada yang bisa aku bantu?");
        while (!inputMessage.equals("keluar")) {
            inputMessage = scanner.nextLine();
            mainView.onMessageReceived(inputMessage);
            System.out.println("Aku bisa bantu kakak apa lagi nih? Hehehe seneng deh bisa bantu kakak...");
        }
        System.out.println("Selamat jalan, aku akan selalu ada buat menemani kamu belanja ~");
    }
}
