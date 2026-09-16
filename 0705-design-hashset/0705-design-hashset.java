class MyHashSet {
    ArrayList<Integer> list;
    public MyHashSet() {
        list = new ArrayList<Integer>();
    }

    public void add(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (key == list.get(i))
                return;
        }
        list.add(key);
    }

    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (key == list.get(i))
                list.remove(i);
        }
    }

    public boolean contains(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (key == list.get(i))
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */