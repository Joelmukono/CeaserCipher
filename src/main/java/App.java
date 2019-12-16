public class App {

    public static void main(String[] args){
        Cipher cipher = new Cipher("Joel Mukono",3);
        System.out.println(cipher.encryptText());
        System.out.println(cipher.decryptText());



    }
}
