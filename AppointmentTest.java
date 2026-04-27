import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.*;
public class AppointmentTest {
    Appointment test1 = new Appointment("1234", "Hello", new Date(2026,07,12));
    @Test
    public void TestGetmethod(){
        Assert.assertEquals(test1.GetID(), "1234");
        Assert.assertEquals(test1.GetDescription(),"Hello");
        Assert.assertEquals(test1.GetDate(), new Date(2026,7,12));
    }
    @Test
    public void TestSetmethod(){
        test1.SetDescription("goodbye");
        Assert.assertEquals(test1.GetDescription(),"goodbye");
        test1.SetDate(new Date(2026, 8, 12));
        Assert.assertEquals(test1.GetDate(), new Date(2026,8,12));
    }
    @Test
    public void FailuresConstructor(){
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Appointment("", "1111 E Road", new Date(2026,4,20));});
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Appointment("01234567890", "1111 E Road", new Date(2026,4,20));});
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Appointment("1234", "", new Date(2026,4,20));});
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Appointment("1234", "orem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,", new Date(2026,04,20));});
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Appointment("1234", "1555", new Date(2026,3,20));});
    }
    @Test
    public void FailuresSet(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        test1.SetDescription("");;});
          Assertions.assertThrows(IllegalArgumentException.class, () -> {
        test1.SetDescription("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate\r\n" + //
                        "\r\n" + //
                        "");;});
         Assertions.assertThrows(IllegalArgumentException.class, () -> {
        test1.SetDate(new Date(2025,4,13));;;});
    }
}
