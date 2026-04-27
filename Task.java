public class Task{
 private final String ID;
    private String Name;
    private String Description;
    public Task(String id, String name, String description){
        if(id.isBlank() || id.length()> 10){
            throw new IllegalArgumentException("I'm sorry your Id is too long");
        } 
         if(name.isBlank() || name.length()> 20){
            throw new IllegalArgumentException("I'm sorry your Name is too long");
        }
         if(description.isBlank() || description.length()> 50){
            throw new IllegalArgumentException("I'm sorry your description is too long");
        }
        this.ID = id;
        this.Name = name;
        this.Description = description;
    }
    public String GetID(){
        return this.ID;
    }
    public void Setname(String name){
        if(name.isBlank() || name.length()> 20){
            throw new IllegalArgumentException("I'm sorry your Name is too long");
        }

        this.Name= name;
    }
    public String GetName(){
        return this.Name;
    }
    public void SetDescription(String description){
        if(description.isBlank() || description.length()> 50){
            throw new IllegalArgumentException("I'm sorry your description is too long");
        }
    this.Description=description;
    }
    public String GetDescription(){
        return this.Description;
    }
}
