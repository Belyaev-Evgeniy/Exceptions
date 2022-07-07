import org.orbis.lesson7.exception.EndOfStackException;

public class Stack <E>{

    private Object[] values;
    private final int defaultCapacity = 10;
    private int index = 0;

    public Stack() {
        values = new Object[defaultCapacity];
    }

    public Stack(int capacity){
        values = new Object[capacity];
    }

    public void push(E value) {
        Integer j = 0;
        while (this.values.length == index + 1) {
            values[index] = j;
            j++;
            index++;
            if (this.values.length > index + 1){
                Object[] arrayDestination = new Object[values.length * 2];
                System.arraycopy(values, 0, arrayDestination, 0, values.length * 2);
            }
        }
    }

    public E pop() throws EndOfStackException {
        if (index == 0){
            throw new EndOfStackException();
        }
        return (E) values[index];
    }

}

