class Cipher{

    private String textToEncrypt;
    private int keyValue;
    private String encryptText = "";



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

        for(int i=0;i < textToEncrypt.length();i++){ // loop through text input to process for encryption
            char character = textToEncrypt.charAt(i);//find each characters index position

            if(Character.isLetter(character)){ //check if the character at index is a letter.

                if(Character.isLowerCase(character)){ //check if character at index is in lowercase
                    char newChar = (char)(character+this.keyValue); // use type casting to convert to char and move character in alphabet
                     if(newChar > 'z'){
                         encryptText += (char)(character - (26-this.keyValue)); //move character forward based on key value

                     }else {
                         encryptText += newChar;
                     }


                }else if(Character.isUpperCase(character)){
                    char newChar = (char)(character+this.keyValue);
                    if(newChar > 'Z'){
                        encryptText += (char)( character -(26-this.keyValue));

                    }else {
                        encryptText += newChar;
                    }

                }

            }else {
                encryptText += character;
            }
        }
        return encryptText;

    }



    public String decryptText(){
        String decryptText = ""; //empty string to store the encrypted text
        for(int i=0;i < encryptText.length();i++){ // loop through text input to process for encryption
            char character = encryptText.charAt(i);//find each characters index position

            if(Character.isLetter(character)){ //check if the character at index is a letter.

                if(Character.isLowerCase(character)){ //check if character at index is in lowercase
                    char newChar = (char)(character-this.keyValue); // use type casting to convert to char and move character in alphabet
                    if(newChar < 'a'){
                        decryptText += (char)(character + (26-this.keyValue)); //move character forward based on key value

                    }else {
                        decryptText += newChar;
                    }


                }else if(Character.isUpperCase(character)){
                    char newChar = (char)(character-this.keyValue);
                    if(newChar < 'A'){
                        decryptText += (char)( character + (26-this.keyValue));

                    }else {
                        decryptText += newChar;
                    }

                }

            }else {
                decryptText += character;
            }
        }
        return decryptText;

    }




}

