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
        String encryptText = ""; //empty string to store the encrypted text
        for(int i=0;i<textToEncrypt.length();i++){ // loop through text input to process for encryption
            char character = textToEncrypt.charAt(i);//find each characters index position

            if(Character.isLetter(character)){ //check if the character at index is a letter.

                if(Character.isLowerCase(character)){ //check if character at index is in lowercase
                    char newChar = (char)(character+keyValue); //
                     if( newChar<'z'){
                         encryptText += (char)( character -(26-keyValue));

                     }else {
                         encryptText+=character;
                     }


                }else if(Character.isUpperCase(character)){
                    char newChar = (char)(character+keyValue);
                    if( newChar<'Z'){
                        encryptText += (char)( character -(26-keyValue));

                    }else {
                        encryptText+=character;
                    }

                }

            }else {
                encryptText+=character;
            }
        }

        return encryptText;

    }

}

