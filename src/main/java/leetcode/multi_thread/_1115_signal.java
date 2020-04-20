package leetcode.multi_thread;

/**
 * @author ：liuxp
 * @date ：Created in 2020/4/20 14:41
 * @description ：
 *  我们提供一个类：
 *
 * class FooBar {
 *   public void foo() {
 *     for (int i = 0; i < n; i++) {
 *       print("foo");
 *     }
 *   }
 *
 *   public void bar() {
 *     for (int i = 0; i < n; i++) {
 *       print("bar");
 *     }
 *   }
 * }
 * 两个不同的线程将会共用一个 FooBar 实例。其中一个线程将会调用 foo() 方法，另一个线程将会调用 bar() 方法。
 *
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 *
 *
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: "foobar"
 * 解释: 这里有两个线程被异步启动。其中一个调用 foo() 方法, 另一个调用 bar() 方法，"foobar" 将被输出一次。
 * 示例 2:
 *
 * 输入: n = 2
 * 输出: "foobarfoobar"
 * 解释: "foobar" 将被输出两次。
 *
 */
class _1115_signal {

    private int n;

    /**
     * 全局信号（signal）
     */
    private volatile boolean flag=false;

    public _1115_signal(int n) {
        this.n = n;
    }

    public void foo() throws InterruptedException {
        //为true时 线程自旋，为false才打印
        for(int i = 0; i < n; i++){
            while (flag){
                //不加这个会超时，调用改方法暂停当前线程，执行其他线程，不释放锁
                Thread.yield();
            }
            System.out.println("foo");
            flag=true;
        }
    }

    public void bar() throws InterruptedException {
        for(int i = 0; i < n; i++){
            while (!flag){
                //不加这个会超时，调用改方法暂停当前线程，执行其他线程，不释放锁
                Thread.yield();
            }
            System.out.println("bar");
            flag=false;
        }
    }

    public static void main(String[] args) throws Exception {
        _1115_signal test=new _1115_signal(10);
        Thread thread=new Thread(()->{
            try {
                test.foo();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread thread2=new Thread(()->{
            try {
                test.bar();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        thread.start();
        thread2.start();
    }
}
