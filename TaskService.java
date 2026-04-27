import java.util.HashMap;

public class TaskService {
public HashMap<String,Task> TaskMap = new HashMap<>();
public void AddTask(Task task){
if(TaskMap.containsKey(task.GetID())){
    throw new IllegalArgumentException("This key is already in use ");
} else {
    TaskMap.put(task.GetID(), task);
}
}
public void DeleteTask(String id){
    if(TaskMap.containsKey(id)){
        TaskMap.remove(id);
    } else {
        throw new IllegalArgumentException("Sorry this ID does not exist");
    }
}
public void UpdateTask(String ID, String Name, String Description){
if(ID.isEmpty()){
throw new IllegalArgumentException("ID cannot be empty");
} 
if(!Name.isEmpty()){
TaskMap.get(ID).Setname(Name);
}
if(!Description.isEmpty()){
    TaskMap.get(ID).SetDescription(Description);
} if(Description.isEmpty() && Name.isEmpty()){
    throw new IllegalArgumentException("Sorry please enter either a name or description");
}
}
}
