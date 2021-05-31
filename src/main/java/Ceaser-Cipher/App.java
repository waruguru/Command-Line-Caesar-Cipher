
/* This Java source file was generated by the Gradle 'init' task.
        */
//package Ceaser-Cipher;

//import java.util.Scanner;

//import static Ceaser-Cipher.Ceaser-Cipher.cipher;

import java.io.Console;

public class App {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        String password;
//        int key;
        Console console =System.console();//import console for users input

        System.out.print("Please enter the message to encrypt: ");
        String text = console.readLine();//takes users input
        if (text.getClass()!==String){
            System.out.println("Please make sure your text is in string formart");

        }
        else{
            System.out.println("You have entered the correct format");
        }



        System.out.println("Kindly enter the encrypting key you would love to use between1-25:");
        String encryptingKey = console.readLine() ;
        Integer integerEncryptingKey = Integer.parseInt(encryptingKey);

        //if statement to handle key errors
        if (integerEncryptingKey<1&&integerEncryptingKey>25){
            System.out.println("Please choose a key that ranges between 1 and 25");
        }
        else if(integerEncryptingKey>=1||integerEncryptingKey<=25) {
            System.out.println("You have entered a correct key formart");
        }
        else{
            System.out.println("Please check the formart of your inputs");
        }







        do {
            System.out.print("Please enter a key to encrpt the text 1 to 25: ");
            key = keyboard.nextInt();

            //here we handle key errors
            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);


        System.out.println("Password:\t" + password);
        CeaserCipher ceaserCipher = new CeaserCipher(password,key);
        String encryption = ceaserCipher.cipher();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        CeaserCipher ceaserCipherDec = new CeaserCipher(encryption,-key);
        System.out.println("Decrypted:\t" + ceaserCipherDec.cipher());

    }
}
