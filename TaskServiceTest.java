import org.junit.jupiter.api.*;

public class TaskServiceTest {
    TaskService Testing = new TaskService();
    Task testing = new Task("1234","Hello","Description");
   @Test
    public void TaskSuccess(){
        Testing.AddTask(testing);
        Assertions.assertEquals(Testing.TaskMap.get(testing.GetID()), testing);
        Testing.UpdateTask(testing.GetID(), "hello", "goodbye");
        Assertions.assertEquals(Testing.TaskMap.get(testing.GetID()).GetName(),"hello" );
        Assertions.assertEquals(Testing.TaskMap.get(testing.GetID()).GetDescription(),"goodbye" );
        Testing.DeleteTask(testing.GetID());
        Assertions.assertEquals(Testing.TaskMap.get(testing.GetID()),null);
    }
    @Test
    public void TaskFailure(){
        Testing.AddTask(testing);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Testing.AddTask(testing);
    });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Testing.UpdateTask("", "123","345");
    });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Testing.UpdateTask("123", "","");
    });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Testing.DeleteTask(null);
    });
    }
}
