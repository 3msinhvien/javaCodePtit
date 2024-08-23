import java.util.Scanner;

public class J02011 {
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

        // Thực hiện thuật toán sắp xếp chọn và in ra các bước
        for (int i = 0; i < n - 1; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minIdx])
                {
                    minIdx = j;
                }
            }
            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên của dãy chưa sắp xếp
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

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
