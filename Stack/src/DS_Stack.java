import java.util.NoSuchElementException;

public class DS_Stack {
    public static void main(String[] args) {
        CustomStack s = new CustomStack(4);

        System.out.println(s.push(1));
        System.out.println(s.push(2));
        System.out.println(s.push(3));
        System.out.println(s.push(4));
        System.out.println(s.push(5));

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

class CustomStack {
    private int[] s;
    private int cursor;

    public CustomStack(int size) {
        this.s = new int[size];
        this.cursor = -1;
    }

    public boolean push(int item) {
        if (this.cursor + 1 < this.s.length) {
            this.s[++this.cursor] = item;
            return true;
        }
        return false;
    }

    public int pop() {
        if (this.cursor == -1) {
            throw new NoSuchElementException("스택에 데이터가 없습니다.");
        }
        return this.s[this.cursor--];
    }

    public int peek() {
        if (this.cursor == -1) {
            throw new NoSuchElementException("스택에 데이터가 없습니다.");
        }

        return this.s[this.cursor];
    }
}
