public class Encrypt {

    public String encode(String word, int key) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        word = word.toUpperCase();
        word = word.trim();
        String encrypted = "";
        for(int i = 0; i < word.length(); i++){
            int index = alphabet.indexOf(word.charAt(i));
            char ch = word.charAt(i);
            int cipherPosition = (key + index) % 26;
            char replaceChar = alphabet.charAt(cipherPosition);
            encrypted += replaceChar;
        }
        return encrypted;
    }
}
