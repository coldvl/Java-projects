package ua.lviv.iot.algo.part1.lab5;

public class lab5 {

    // create a method to change the order of words in question sentences in the text to the reverse one

    public static String reverseQuestionSentences(String text) {
        StringBuilder result = new StringBuilder();
        String[] sentences = text.split("\\.");
    
        for (String sentence : sentences) {
            if (sentence.trim().endsWith("?")) {
                String[] words = sentence.trim().split(" ");
                for (int i = words.length - 1; i >= 0; i--) {
                    result.append(words[i]).append(" ");
                }
                result.append("? ");
            } else {
                result.append(sentence).append(". ");
            }
        }
    
        return result.toString().trim();
    }
    
    

    // main method

    public static void main(String[] args) {
        // String input = "Hello, my name is John. I am 20 years old. I am a student of Lviv Polytechnic National University." + 
        // " I study at the Faculty of Computer Science. I am a third year student. Why am I here? I am here to learn Java. " +
        // "So should I learn Java? Yes, you should. Why? Because Java is a very popular programming language. ";
        String input = "So should I learn Java? Yes, you should. Why? Because Java is a very popular programming language.";
        String output = reverseQuestionSentences(input);
        System.out.println(output);
    }

    
}
