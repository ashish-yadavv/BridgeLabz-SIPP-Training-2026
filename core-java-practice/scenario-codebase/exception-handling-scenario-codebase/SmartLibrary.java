public class SmartLibrary {
    static String[] books = {"Java", "Python", null, "C++"};

    public static int getBookLength(int index) {
        try {
            return books[index].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Library Error: Index " + index + " is invalid. Valid range: 0 to " + (books.length - 1));
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Library Error: Book at index " + index + " is null (entry missing).");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Book length at index 1: " + getBookLength(1));
        System.out.println("Book length at index 2: " + getBookLength(2));
        System.out.println("Book length at index 10: " + getBookLength(10));
    }
}
