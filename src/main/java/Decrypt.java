public class Decrypt {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public String decode(String word, int key) {
        word = word.toLowerCase();
        String decrypted = "";
        for(int i = 0; i < word.length(); i++){
            int index = alphabet.indexOf(word.charAt(i));
            int cipherPosition = (index - key) % 26;
            char replaceChar = alphabet.charAt(cipherPosition);
            decrypted += replaceChar;
        }
        return decrypted;
    }
}
