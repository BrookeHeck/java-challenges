# Linked List

A singly linked list is a link of nodes that holds a reference to the next node in the list.
Every node is instantiated with a value and inserted at the front or appended to the end.
Every node is instantiated with a next reference. On instantiation, the next reference is null.
When instantiating the linked list, a null head field is created. The head is a reference to the first node in the list
When the list is empty, append and insert both make the head of the list the new node.


## API
- Instantiating a new linked list
```java
LinkedList ll = new LinkedList();
// creates an empty list with a head property
// currently ll.head is null
```

### insert 
  - the insert method will always add the new node to the front of the list
  - this means the head will be the new node
  - if the list is not empty, the new head will have a next reference the previous head
  - A string must be provided as an argument so the new node will have a value
```java
ll.insert("Node 1");
ll.insert("Node 2");
ll.insert("Node 3");

// "Node 3" -> "Node 2" -> "Node 1" -> NULL
```

### append
    - the append method adds a node to the end of the linked list
    - if the list is empty, the head will become the newly created node
    - the next reference for the tail of the list link is always null
    - a string must be provided as an argument so the new node will have a value

```java
ll.append("Node 1");
ll.append("Node 2");
ll.append("Node 3");
    
// "Node 1" -> "Node 2" -> "Node 3" -> NULL     
```

### includes
    - the includes method will indicate if a value is in the list
    - pass a string to the method as an argument
    - the method will return true if a Node in the list has that string as a value and false if it doesn't

```java
Boolean includes1 = ll.includes("Node 1");
// this will return true

Boolean includes5 = ll.includes("Node 5");
// this will return false
```

### toString
    - the to string method traverses the list and print the values in the following format
    - "Node 1" -> "Node 2" -> "Node 3" -> NULL 
    - The order is from the head to the tail of the list
    - invoking toString on an empty list returns the string "NULL"
