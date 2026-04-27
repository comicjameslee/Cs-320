import java.util.Date;

import  org.junit.jupiter.api.*;


public class AppointmentServiceTest {
    
    AppointmentService Test = new AppointmentService();
    Appointment Test1 = new Appointment("245", "rolling", new Date(2026,5,21));
    
    @Test
    public void TestGetmethod(){
        Test.AddAppotiment(Test1);
        Assertions.assertEquals(Test.GetMap("245").GetDescription(),Test1.GetDescription());
        Assertions.assertEquals(Test.GetMap("245").GetDate(),Test1.GetDate());
        Test.DeleteAppointment(Test1.GetID());
        Assertions.assertEquals(Test.GetMap("245"),null);
    }
    @Test
    public void FailureTest(){
        Test.AddAppotiment(Test1);
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
         Test.AddAppotiment(Test1);;});
         Test.DeleteAppointment(Test1.GetID());
          Assertions.assertThrows(IllegalArgumentException.class, () -> {
         Test.DeleteAppointment(Test1.GetID());;});
    }
}
