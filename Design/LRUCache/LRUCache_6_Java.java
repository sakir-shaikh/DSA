class LRUCache {
    static class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }
    private int capacity;
    private Map<Integer, Node> map;
    private Node tail;
    private Node head;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        moveToHead(node);
        return node.value;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToHead(node);
            node.value = value;
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            addToHead(node);
            if (map.size() > capacity) {
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
        }

    }
    public void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    public void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
    public Node removeTail() {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }
    public void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}