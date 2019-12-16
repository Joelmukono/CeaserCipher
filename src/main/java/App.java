import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        Cipher cipher = new Cipher();
        ;

        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence to encrypt");
        try{
            String enteredTextToEncrypt = bufferedReader.readLine();
            cipher.setString(enteredTextToEncrypt);
            System.out.println("Enter key to decrypt sentence");
            String enteredInteger = bufferedReader.readLine();
            int keyInt = Integer.parseInt(enteredInteger);
            cipher.setKey(keyInt);
            System.out.println("Your Encrypted text is :"+cipher.encryptText());
            System.out.println("Your Decrypted text is :"+cipher.decryptText());







        }catch (IOException ex){
            ex.printStackTrace();

        }
        ;




    }
}
