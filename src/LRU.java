import java.util.HashMap;
import java.util.Map;

public class LRU {
    class Node {
        int key;
        int value;
        Node pre;
        Node next;
    }

    private int capacity;
    private int size;
    private Node head;
    private Node tail;
    private Map<Integer, Node> map;

    public LRU(int capacity) {
        // write code here
        this.capacity = capacity;
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.pre = this.head;
        map = new HashMap<>();
    }

    public int get(int key) {
        // write code here
        if (map.containsKey(key)) {
            Node valNode = map.get(key);
            this.moveToHead(valNode);

            return valNode.value;
        }

        return -1;
    }

    public void set(int key, int value) {
        // write code here
        if (this.map.containsKey(key)) {
            Node valNode = map.get(key);
            valNode.value = value;
            this.moveToHead(valNode);
        } else {
            if (this.size >= this.capacity) {
                this.map.remove(this.tail.pre.key);
                this.tail.pre.pre.next = this.tail;
                this.tail.pre = this.tail.pre.pre;
            }

            Node firstNode = new Node();
            firstNode.key = key;
            firstNode.value = value;
            firstNode.pre = this.head;
            firstNode.next = this.head.next;
            this.head.next.pre = firstNode;
            this.head.next = firstNode;
        }

    }

    private void moveToHead(Node valNode) {
        valNode.pre.next = valNode.next;
        valNode.next.pre = valNode.pre;
        valNode.next = this.head.next;
        valNode.next.pre = valNode;
        this.head.next = valNode;
        valNode.pre = this.head;
    }
}
