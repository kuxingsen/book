package OS.Proceducer_consumer2;


public class ProductList {
    private String[] productQueue;

    private int max;
    private int count;
    private int index;
    private int last;
    private int size;

    public ProductList(int max) {
        productQueue = new String[max];
        this.max = max;
        this.count = 0;
        this.index = 0;
        this.last = 0;
        this.size = 0;
    }

    public synchronized int size(){
        return size;
    }
    public synchronized void add()
    {
        ++count;
        productQueue[last] = count+"";
        last++;
        if(last == max){
            last = 0;
        }
        size++;
    }
    public synchronized String remove()
    {
        String remove = productQueue[index];
        index++;
        if(index == max) {
            index = 0;
        }
        size--;
        return remove;
    }

    public synchronized int getCount() {
        return count;
    }
    public int getMax() {
        return max;
    }
}
