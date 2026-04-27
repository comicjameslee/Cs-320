import java.util.Date;
public class Appointment {
    private final String  Id;
    private String Description;
    private Date APTdate = new Date();
    Appointment(String ID,String DESCRIPTION, Date DATE){
        if(ID.length() > 10 || ID.isEmpty()){
            throw new IllegalArgumentException("Please enter a valid ID");
        }
        if(DESCRIPTION.isEmpty() || DESCRIPTION.length() >50){
                        throw new IllegalArgumentException("Please enter a valid Description");
        }
        if(DATE.before(new Date(2026, 4, 6))){
            throw new IllegalArgumentException("Please enter a valid date");
        }
        this.Id = ID;
        this.APTdate = DATE;
        this.Description= DESCRIPTION;
    }
    // Getter and setters 
    public String GetID(){return this.Id;}
    
    public void SetDescription(String desc){
        if(desc.isEmpty() ||desc.length() >50){
                        throw new IllegalArgumentException("Please enter a valid Description");
        }
        this.Description=desc;
    }

    public String GetDescription(){return this.Description;}

    public Date GetDate(){return this.APTdate;}

    public void SetDate(Date date){
        if(date.before(new Date(2026, 4, 6))){
            throw new IllegalArgumentException("Please enter a valid date");
        }
        this.APTdate = date;
    }
}
