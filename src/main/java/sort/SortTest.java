package sort;

import java.util.Arrays;

/**
 * 排序测试
 * @author nocol 上午11:13:51
 */
public class SortTest {
	public static void main(String[] args) {
		int[] arr={3,7,6,4,1,5,2};
		System.out.println("排序前："+Arrays.toString(arr));
		//BubbleSort.sort(arr);
		//SelectSort.sort(arr);
		//InsertSort.sort(arr);
		//ShellSort.sort(arr);
		//QuickSort.sort(arr, 0, 6);
		MegeSort.sort(arr, 0, 6);
		//HeapSort.sort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
	}
}

