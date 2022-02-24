package quickSort;

public class MainClass {
	public static int pertition(int arry[], int low, int high) {
		int privot = arry[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arry[j]<privot) {
				i++;
				int temp = arry[i];
				arry[i] = arry[j];
				arry[j] = temp;
			}
		}
		i++;
		int temp = arry[i];
		arry[i] = privot;
		arry[high] = temp;
		return i;
	}
	public static void quick_sort(int arry[], int low, int high) {
		if(low<high) {
			int privotIdx = pertition(arry, low, high);
			quick_sort(arry, low, privotIdx-1);
			quick_sort(arry, privotIdx+1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {5,8,1,6,4,3};
		System.out.println("Before Quick Sort ");
		for(int i = 0; i<arry.length;i++) {
			System.out.print(arry[i]+" ");
		}
		int n = arry.length;
		quick_sort(arry, 0, n-1);
		System.out.println();
		System.out.println("After Quick Sort ");
		for(int i = 0; i<arry.length;i++) {
			System.out.print(arry[i]+" ");
		}
		//worst case complexity O(n^2)
		//Average case complexity O(nlogn)
		//when we need O(nlogn) time complexity space complexity matter that time we use this sort algorithm
	}

}
