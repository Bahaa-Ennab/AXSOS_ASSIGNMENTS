class node:
    def __init__(self,data):
        self.data=data
        self.next=None
class queue:
    def __init__(self):
        self.front= None
        self.rear=None
    def enqueue(self,data):
        new_node =node(data)
        if self.rear is None:
            self.front = self.rear = new_node
        else:
            self.rear.next = new_node
            self.rear = new_node
    def dequeue(self):
        if self.front is None:
            return None
        else:
            removed = self.front
            self.front = self.front.next
        if self.front is None:
            self.rear = None
        return removed.data
    def peek(self):
        return self.front.data if self.front else None
    def display(self):
        current=self.front
        while current:
            print(current.data, end=" <- ")
            current=current.next
        print("None")
q = queue()
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.display()

print("Dequeued:", q.dequeue())
q.display()

print(q.peek)