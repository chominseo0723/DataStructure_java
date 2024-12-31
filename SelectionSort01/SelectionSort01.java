//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class SelectionSort {
    public void sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int min = i;
            for (int k = i + 1; k < A.length; k++) {
                if (A[min] > A[k]) {
                    min = k;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort check = new SelectionSort();
        int[] input = {10, 4, 5, 2, 1, 8, 3, 6};
        check.sort(input);
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
    }
}
// Ctrl + Alt + L 예브게 줄맞춤
