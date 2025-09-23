package arraylistobjdemo;

public class TodoItems {

    private String task;
    private int priority;


    public TodoItems(String task, int priority){
        this.task = task;
        this.priority = priority;
    }

    public String getTask(){
        return task;
    }

    public int getPriority(){
        return priority;
    }
}
