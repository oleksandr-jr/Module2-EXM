package L5.E1;

public class Cell<T> {
    T data;

    public Cell(T data) {
        this.data = data;
    }

    public Cell() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void showType(){
        System.out.println("Type is : " + data.getClass().getName());
    }
}
