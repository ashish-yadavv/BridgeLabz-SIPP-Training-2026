public class OnlineQuiz {
    static String[] answers = {"A", "B", "C", "D"};
    static String[] studentAnswers = {"A", "B", "X", "D"};

    public static void checkAnswers() {
        int score = 0;
        for (int i = 0; i < studentAnswers.length; i++) {
            try {
                if (studentAnswers[i].equals(answers[i])) {
                    score++;
                    System.out.println("Q" + (i + 1) + ": Correct");
                } else {
                    System.out.println("Q" + (i + 1) + ": Incorrect");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Q" + (i + 1) + ": Error - answer key missing for this question. " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Q" + (i + 1) + ": Error - student answer is null. " + e.getMessage());
            }
        }
        System.out.println("Final score: " + score + "/" + studentAnswers.length);
    }

    public static void main(String[] args) {
        checkAnswers();
    }
}
