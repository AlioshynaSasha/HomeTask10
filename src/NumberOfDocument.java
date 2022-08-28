import java.util.Locale;

public class NumberOfDocument {
    private String number;

    public NumberOfDocument(String number) {
        this.number = number;
    }

    public void displayFirstNumbers() {
        System.out.println(this.number.substring(0, 4) + this.number.substring(9, 13));
    }

    public void displayModifiedNumber() {
        System.out.println(this.number.replace("a", "*"));
    }

    public void displayLetters() {
        System.out.println("Letters:" + this.number.replaceAll("[0-9-]", ""));
    }

    public void displayHasSubstring() {
        System.out.println(this.number.toLowerCase().contains("abc"));
    }

    public void displayStart() {
        System.out.println(this.number.startsWith("5555"));
    }

    public void displayEnds() {
        System.out.println(this.number.endsWith("1a2b"));
    }

    public void displayReverse() {
        System.out.println(new StringBuilder(this.number).reverse());
    }
}
