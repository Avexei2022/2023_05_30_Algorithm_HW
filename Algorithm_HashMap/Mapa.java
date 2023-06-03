package Algorithm_HashMap;

public class Mapa<K, V> {
    Integer capacity = 16;
    Node<K, V>[] nodes_array = new Node[capacity];

    public Object put(K newKey, V newValue) {

        Node<K, V> inputNode = new Node<>(newKey, newValue);
        Integer index = inputNode.key.hashCode() % capacity;

        if (nodes_array[index] == null) {
            nodes_array[index] = inputNode;

            return nodes_array[index].value;
        } else {
            Node<K, V> previousNode = null;
            Node<K, V> currentNode = nodes_array[index];

            while (currentNode != null) {
                if (currentNode.key == newKey) {
                    return null;
                }
                previousNode = currentNode;
                currentNode = currentNode.nextnode;
            }
            previousNode.nextnode = inputNode;
            return previousNode.nextnode.value;
        }
    }

    public Object get(K key) {
        Integer index = key.hashCode() % capacity;
        if (nodes_array[index] == null) {
            return null;
        } else {
            Node<K, V> tempNode = nodes_array[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return tempNode.value;
                }
                tempNode = tempNode.nextnode;
            }
            return null;
        }
    }

    public Object remove(K key) {
        Integer index = key.hashCode() % capacity;
        if (nodes_array[index] == null) {
            return null;
        } else {
            Node<K, V> previousNode = null;
            Node<K, V> currentNode = nodes_array[index];

            while (currentNode != null) {
                if (currentNode.key == key) {
                    if (previousNode == null) {
                        nodes_array[index] = nodes_array[index].nextnode;
                        return currentNode.value;
                    } else {
                        previousNode.nextnode = currentNode.nextnode;
                        return currentNode.value;
                    }
                }
                previousNode = currentNode;
                currentNode = currentNode.nextnode;
            }
            return null;
        }
    }

    public Object replays(K replKey, V replValue) {

        Node<K, V> inputNode = new Node<>(replKey, replValue);
        Integer index = inputNode.key.hashCode() % capacity;

        if (nodes_array[index] == null) {
            return null;
        } else {
            Node<K, V> previousNode = null;
            Node<K, V> currentNode = nodes_array[index];

            while (currentNode != null) {
                if (currentNode.key == replKey) {
                    if (previousNode == null) {
                        inputNode.nextnode = currentNode.nextnode;
                        nodes_array[index] = inputNode;
                        return nodes_array[index].value;
                    } else {
                        inputNode.nextnode = currentNode.nextnode;
                        previousNode.nextnode = inputNode;
                        return inputNode.value;
                    }
                }
                previousNode = currentNode;
                currentNode = currentNode.nextnode;
            }
            return null;
        }
    }

    public int size() {
        int nodes_array_size = 0;
        for (int i = 0; i < capacity; i++) {
            if (nodes_array[i] != null) {
                Node<K, V> currentNode = nodes_array[i];
                while (currentNode != null) {
                    nodes_array_size++;
                    currentNode = currentNode.nextnode;
                }
            }
        }
        return nodes_array_size;
    }

    public boolean containsKey(Integer key) {
        Integer index = key.hashCode() % capacity;
        if (nodes_array[index] == null) {
            return false;
        } else {
            Node<K, V> tempNode = nodes_array[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return true;
                }
                tempNode = tempNode.nextnode;
            }
            return false;
        }
    }

    public boolean containsValue(Integer v) {
        for (int i = 0; i < capacity; i++) {
            if (nodes_array[i] != null) {
                Node<K, V> currentNode = nodes_array[i];
                while (currentNode != null) {
                    if (currentNode.value == v)
                        return true;
                    currentNode = currentNode.nextnode;
                }
            }
        }
        return false;
    }

}
