import java.io.Console;

public class App{
    public static void main(String[] args){
        Console myConsole = System.console();

        System.out.println("Enter the message you want encrypted:");
        StringBuilder userInputMessage = new StringBuilder(myConsole.readLine().toLowerCase());

        System.out.println("Enter the Key to for encrypting your message:");
        int key = Integer.parseInt(myConsole.readLine());

        CaesarCipher cCipher = new CaesarCipher();

        String encryptedMessage = cCipher.encrypt(userInputMessage, key);
        System.out.println(encryptedMessage);

        System.out.println(cCipher.decrypt(new StringBuilder(encryptedMessage),key));

        cCipher.crackingThecode(new StringBuilder(encryptedMessage));
    }
}