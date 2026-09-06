import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> myQueue = new LinkedList<>();

        // Enqueue elements
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);

        // Displaying the front element
        System.out.println("Front element: " + myQueue.peek());

        // Displaying and removing elements
        System.out.print("Queue elements: ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println();

        // Checking if the queue is empty
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
}