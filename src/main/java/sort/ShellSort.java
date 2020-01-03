package sort;

/**
 * 希尔排序
 *
 * @author nocol 上午11:23:22
 */
public class ShellSort {
	public static void sort(int[] arr) {
		//增量gap，并逐步缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			//从第gap元素开始对其所在组进行插入排序
			for (int i = gap; i < arr.length; i++) {
				for (int j = i; (j - gap>=0)  && (arr[j] < arr[j - gap]); j-=gap) {
					int temp = arr[j];
					arr[j] = arr[j - gap];
					arr[j - gap] = temp;
				}
			}
		}
	}
}
