import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
