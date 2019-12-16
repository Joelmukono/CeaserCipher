class Cipher{

    private String textToEncrypt;
    private int keyValue;



    public Cipher(String text,int key){
        this.textToEncrypt = text;
        this.keyValue = key;

    }

    public String getText(){
        return this.textToEncrypt;
    }

    public int getKeyint(){
        return this.keyValue;
    }

    public int setKey(int key){
        return this.keyValue = key;

    }

    public String setString(String strings){
        return this.textToEncrypt = strings;
    }

    public String encryptText(){

        return null;

    }

}

