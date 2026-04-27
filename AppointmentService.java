import java.util.HashMap;

public class AppointmentService {
     private HashMap<String, Appointment> AppointmentMap = new HashMap<>();
     
     public void DeleteAppointment(String ID){
        if(!AppointmentMap.containsKey(ID)){
            throw new IllegalArgumentException(ID+" Does not exist ");
        } else{
            AppointmentMap.remove(ID);
        }
     }
     public Appointment GetMap(String Id){
        return AppointmentMap.get(Id);
     }

     public void AddAppotiment( Appointment apt){
        if(AppointmentMap.containsKey(apt.GetID())){
            throw new IllegalArgumentException("Sorry this key already exist");
        }
        AppointmentMap.put(apt.GetID(), apt);
     }
}
