public class RandomWord {
    static String randWord="";
    public static String rand(String word){
        for (int i = 1; i<=5; i++) {
            int charNum = 65 + (int) (Math.random() * 26);
            char addedChar = (char) charNum;
            word += addedChar;
        }
        return word;
    }
    public static void main(String[] args){
        System.out.print("Your random word is: ");
        System.out.print(rand(randWord));
    }
}
