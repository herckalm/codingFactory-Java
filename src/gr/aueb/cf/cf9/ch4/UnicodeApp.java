package gr.aueb.cf.cf9.ch4;

public class UnicodeApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
