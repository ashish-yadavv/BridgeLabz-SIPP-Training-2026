class SamAverageMarks {
    public static void main(String[] args) {
        String name = "Sam";
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;
        double maxMarks = 100;
        double totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double totalSubjects = 3;
        double averageMarks = totalMarks / totalSubjects;

        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}
