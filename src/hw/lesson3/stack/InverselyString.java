package hw.lesson3.stack;

public class InverselyString {

    public static void main(String[] args) {
        new InverselyString(TEXT).inverse();
    }

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, velit!";

    private final String textToInverse;

    public InverselyString(String textToInverse) {
        this.textToInverse = textToInverse;
    }

    // Program that reads from right to left:
    public void inverse (){

        System.out.println(textToInverse);

        StackImpl inverselyString = new StackImpl(textToInverse.length());

        for (int i = 0; i < textToInverse.length(); i++) {
            inverselyString.push(textToInverse.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        int stringLength = inverselyString.size();

        for (int i = 0; i < stringLength; i++) {
            sb.append(inverselyString.pop());
        }

        System.out.println(sb);
    }

}
