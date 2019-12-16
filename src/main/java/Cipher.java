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

}

