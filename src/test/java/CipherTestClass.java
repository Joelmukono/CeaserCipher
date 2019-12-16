import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTestClass {

    @Test
    public void instance_getInstance_returnTrue(){
        Cipher newCipher = new Cipher("L",3);
        assertEquals(true, newCipher instanceof Cipher);
    }

    @Test
    public void stringTest_getStringTest_returnText(){
        Cipher newCipher = new Cipher("text",2);
        assertEquals("text",newCipher.getText());
    }

    @Test
    public void intText_getNumber_returnInt(){
        Cipher newCipher = new Cipher("hello",3);
        assertEquals(3,newCipher.getKeyint());
    }

    @Test
    public void keySetter_setKey_returnInt(){
        Cipher newCipher = new Cipher("hello",8);
        assertEquals(8,newCipher.setKey(8));

    }

    @Test
    public void textSetter_setText_returnText(){
        Cipher newCipher = new Cipher("hello",9);
        assertEquals("hello",newCipher.setString("hello"));
    }

    @Test
    public void encrypt_encryptText_textEncrypted(){
        Cipher newCipher = new Cipher("CDE",2);
        assertEquals("EFG",newCipher.encryptText());
    }


}