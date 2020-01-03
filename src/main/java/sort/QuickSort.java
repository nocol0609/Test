package sort;

/**
 * 快速排序
 *
 * @author nocol 上午11:33:57
 */
public class QuickSort {
	public static void sort(int[] arr, int l, int r) {
		// 如果左边索引小于右边，则排序还未完成
		if (l < r) {

			int i = l;
			int j = r;
			int key = arr[l];

			while (i < j) {

				while (i < j && arr[j] >= key) {
					j--;
				}
				arr[i] = arr[j];

				while (i < j && arr[i] <= key) {
					i++;
				}
				arr[j] = arr[i];
			}
			arr[i] = key;

			//左子序列
			sort(arr, l, i - 1);
			//右子序列
			sort(arr, i + 1, r);

		}
	}
}