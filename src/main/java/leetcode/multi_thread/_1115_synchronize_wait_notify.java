package leetcode.multi_thread;

/**
 * @author £ºliuxp
 * @date £ºCreated in 2020/4/20 16:09
 * @description £º
 */
public class _1115_synchronize_wait_notify {

    private int n;

    public _1115_synchronize_wait_notify(int n) {
        this.n = n;
    }

    private volatile boolean flag=false;

    public void foo() throws InterruptedException {
        for(int i = 0; i < n; i++){
            synchronized (this){
                if(flag){
                    this.wait();
                }
                System.out.println("foo");
                flag=true;
                this.notifyAll();
            }
        }
    }

    public void bar() throws InterruptedException {
        for(int i = 0; i < n; i++){
            synchronized (this){
                if(!flag){
                    //ÈÃ³öËø£¬Ïß³Ì×èÈû
                    this.wait();
                }
                System.out.println("bar");
                flag=false;
                this.notifyAll();
            }
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
