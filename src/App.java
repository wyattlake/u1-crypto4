public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] list = { 1, 2, 5, 7, 9, 12, 32 };

        System.out.println(Search.linearSearch(5, list));
        System.out.println(Search.binarySearch(12, list));
    }
}
