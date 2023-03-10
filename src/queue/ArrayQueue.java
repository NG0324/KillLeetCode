package queue;/*
 * @Date:2023/2/8-21:18
 * @Description:
 * @Param:
 */

public class ArrayQueue {
    private int maxSize;
    private int[] Queue;
    private int font;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        Queue= new int[maxSize];
        rear = -1;
        font = -1;
    }
    // 判断队列是否空
//    public Boolean isNull(){
//        if (font == rear){
//            return true;
//        }
//        return false;
//    }
    //优化后
    public Boolean isNull(){
        return font == rear;
    }

    // 判断队列是否满
    public Boolean isFull(){
        return rear == maxSize-1;
    }

    // 入队操作
    public void addQueue(int insert){
        if (isFull()){
            System.out.println("队列已满，无法入队");
            return;
        }
        rear++;
        Queue[rear] = insert;
    }
    //出队操作
    public void getQueue(){
        if (isNull()){
            System.out.println("队列为空，无法出队");
            return;
        }
        font++;
        System.out.println("取出元素为"+Queue[font]);
        Queue[font] = 0;
    }
    // 上述可改进为
//    public int getQueue() {
//        // 判断队列是否空
//        if (isNull()) {
//            // 通过抛出异常
//            throw new RuntimeException("队列空，不能取数据");
//        }
//        front++; // front后移
//        return Queue[front];
//
//    }

    //显示当前队列数据
    public void ls(){
        if (isNull()) {
            System.out.println("队列空的，没有数据~~");
            return;
        }
        for (int i = 0; i < maxSize; i++) {
            System.out.println("Queue["+i+"]="+Queue[i]);
        }
    }
    //获取队头元素，不取出
    public void headQueue(){
        if (isNull()){
            System.out.println("队列为空，无法取出");
            return;
        }
        System.out.println("队头元素为"+Queue[font+1]);
    }

    enum Sign{
        little("(",")"),
        middle("[","]"),
        big("{","}");

        private final String first;
        private final String last;

        Sign(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }
    }

}
