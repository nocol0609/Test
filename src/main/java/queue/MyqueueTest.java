package queue;
/**
 * 测试自定义队列
 *	
 * @author Nocol 下午3:34:06
 */
public class MyqueueTest {
	public static void main(String[] args) {
		Myqueue queue=new Myqueue(5);
		
		queue.insert(7);
		queue.insert(1);
		queue.insert(4);
		queue.insert(2);
		queue.insert(8);
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		System.out.println(queue.peek());
		System.out.println("--------------");
		
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}
}
