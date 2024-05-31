public class ToDoList {
	    private Node head;

	    public ToDoList() {
	        this.head = null;
	    }

	    public void addToDo(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.getNext() != null) {
	                current = current.getNext();
	            }
	            current.setNext(newNode);
	        }
	    }

	    public void markToDoAsCompleted(String title) {
	        Node current = head;
	        while (current != null) {
	            if (current.getTask().getTitle().equals(title)) {
	                current.getTask().markCompleted();
	                return;
	            }
	            current = current.getNext();
	        }
	        System.out.println("Task with title \"" + title + "\" not found.");
	    }

	    public void viewToDoList() {
	        if (head == null) {
	            System.out.println("To-Do List is empty.");
	        } else {
	            Node current = head;
	            while (current != null) {
	                Task task = current.getTask();
	                System.out.println("Title: " + task.getTitle());
	                System.out.println("Description: " + task.getDescription());
	                System.out.println("Completed: " + (task.isCompleted() ? "Yes" : "No"));
	                System.out.println("------------------------");
	                current = current.getNext();
	            }
	        }
	    }
}


class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }
}


class Node {
    private Task task;
    private Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }

    public Task getTask() {
        return task;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}











public class Main {
    public static void main(String[] args) {
        // Create a ToDoList object
        ToDoList toDoList = new ToDoList();

        // Add some tasks
        toDoList.addToDo(new Task("Task 1", "Description for Task 1"));
        toDoList.addToDo(new Task("Task 2", "Description for Task 2"));
        toDoList.addToDo(new Task("Task 3", "Description for Task 3"));

        // View the initial to-do list
        System.out.println("Initial To-Do List:");
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Task 2");

        // View the updated to-do list
        System.out.println("\nUpdated To-Do List:");
        toDoList.viewToDoList();
    }
}





















