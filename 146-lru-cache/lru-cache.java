class LRUCache {
    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
     int capacity;
     HashMap<Integer, Node> cache ;
    Deque<Integer> que ;

     Node head;
     Node tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        que = new LinkedList<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        remove(node);
        addToLast(node);
        return node.value;     
        
    }
    
    public void put(int key, int value) {
       
       //If we have that node already present in cache, we have to remove it.
       if(cache.containsKey(key)){
        remove(cache.get(key));
        cache.remove(key);
       }
       
       //create that new node of (KEY, VALUE) and add it to cache and queue to for order usage
       Node newNode = new Node(key, value);
       addToLast(newNode);
       cache.put(key, newNode);

       //if after adding that node to cache, its size increase beyond the capacity, remove it from front
        if(cache.size() > capacity){
            Node lru = head.next;
            remove(head.next);
            cache.remove(lru.key);
        }
        

    }

    public void addToLast(Node node){

        Node prevLast = tail.prev;
        prevLast.next = node;
        node.prev = prevLast;
        node.next = tail;
        tail.prev = node;

    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */