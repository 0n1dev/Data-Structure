import java.util.NoSuchElementException;

public class DS_Queue {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(3);

        q.add(3);
        q.add(2);
        q.add(1);

        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}

class CustomQueue {
    private int[] q;
    private int size;

    public CustomQueue(int size) {
        this.q = new int[size];
        this.size = 0;
    }

    public boolean add(int i) {
        if (this.q.length == this.size) {
            throw new IllegalStateException("Queue 사이즈가 초과되었습니다.");
        }
        this.q[this.size++] = i;
        return true;
    }

    public int remove() {
        if (this.size == 0) {
            throw new NoSuchElementException("Queue 안에 데이터가 없습니다.");
        }

        this.size--;
        int tmp = this.q[0];

        for (int i = 0; i < this.size; i++) {
            this.q[i] = this.q[i + 1];
        }

        return tmp;
    }
    
    public int element() {
        if (this.size == 0) {
            throw new NoSuchElementException("Queue 안에 데이터가 없습니다.");
        }
        
        return this.q[0];
    }

    public boolean offer(int i) {
        if (this.q.length == this.size) {
            return false;
        }
        this.q[this.size++] = i;
        return true;
    }

    public Number poll() {
        if (this.size == 0) {
            return null;
        }

        this.size--;
        int tmp = this.q[0];

        for (int i = 0; i < this.size; i++) {
            this.q[i] = this.q[i + 1];
        }

        return tmp;
    }

    public Number peek() {
        if (this.size == 0) {
            return null;
        }

        return this.q[0];
    }
}