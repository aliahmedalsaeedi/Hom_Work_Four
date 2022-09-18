public class Q_3 {
    public static void main(String[] args) {

        String text="Mississippi";
        System.out.println("Replacetester program...\n the text is :" + text + "Now i will encrypt it ...");
        System.out.println("The old text is : "+text);

        text = text.replace("i","!");
        text = text.replace("ss","$$");

        System.out.println("the name text is : "+ text);
    }

}
