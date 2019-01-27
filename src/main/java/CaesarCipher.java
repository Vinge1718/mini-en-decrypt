public class CaesarCipher{
    public CaesarCipher(){}

    public String encrypt(StringBuilder messageToEncrypt, int key){
        for (int i=0; i<messageToEncrypt.length();i++){
            char currentChar = messageToEncrypt.charAt(i);
            if(currentChar >= 97 && currentChar <= 122){
                char newChar = (char) (currentChar + key);
                if (newChar > 122){
                    newChar = (char) (97 + (newChar - 123));
                }
                messageToEncrypt.setCharAt(i, newChar);
            }
        }
        return messageToEncrypt.toString();
    }

    public String decrypt(StringBuilder messageToDecrypt, int key){
        for (int i = 0; i < messageToDecrypt.length(); i++){
            char currentChar = messageToDecrypt.charAt(i);
            if(currentChar >= 97 && currentChar <=122){
                char newChar = (char) (currentChar - key);
                if(newChar < 97){
                    newChar = (char) (123 - (97-newChar));
                }
                messageToDecrypt.setCharAt(i, newChar);
            }
        }
        return messageToDecrypt.toString();
    }

    public void crackingThecode(StringBuilder messageToDecrypt){
        StringBuilder tempOriginalString = new StringBuilder(messageToDecrypt);
        for (int i = 1; i <= 25; i++){
            System.out.println("This line shows how the key entered encrypts and decrypts strings, so for - Key: "+ i +" tries decrypts " + decrypt(messageToDecrypt,i));
            messageToDecrypt = new StringBuilder(tempOriginalString);
        }
    }
}