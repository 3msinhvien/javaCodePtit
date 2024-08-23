import java.util.Scanner;

public class J02013 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        // Thực hiện thuật toán sắp xếp nổi bọt và in ra các bước
        for (int i = 0; i < n - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Hoán đổi nếu phần tử hiện tại lớn hơn phần tử kế tiếp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có sự hoán đổi nào, dừng vòng lặp
            if (!swapped) break;

            // In ra mảng sau mỗi bước sắp xếp
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++)
            {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
