public class RandomWord {
    public static String randWord(){
        String word = "";
        for (int i = 1; i<=5; i++) {
            int charNum = 65 + (int) (Math.random() * 26);
            char addedChar = (char) charNum;
            word += addedChar;
        }
        System.out.print("Your random word is: ");
        return word;
    }
    public static void main(String[] args){
        System.out.print(randWord());
    }
}