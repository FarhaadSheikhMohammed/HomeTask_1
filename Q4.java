public class Q4 {
    public static void main(String[] args) {
        // Input text
        String inputText = "To be or not to be, that is the question;"
            + "Whether `tis nobler in the mind to suffer"
            + " the slings and arrows of outrageous fortune,"
            + " or to take arms against a sea of troubles,"
            + " and by opposing end them?";
        String[] words = inputText.split(" ");
        int wordCount = words.length;
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}