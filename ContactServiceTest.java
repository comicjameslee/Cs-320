import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;
public class ContactServiceTest {

    ContactService test = new ContactService();
    @Test
    public void Test(){
    Contact test1= new Contact("123","hello","goodbye","5555555555","742 Evergreen Terrace");
    Contact test2= new Contact("12300000","hello","goodbye","5555555555","741 Evergreen Terrace");
        test.addContact(test1.getId(), test1);
        test.addContact(test2.getId(), test2);
        Assert.assertEquals(test.Contacts.get(test1.getId()),test1);
        test.update(test2.getId(),"hello", ":", "458", "gelp");
        Assert.assertEquals(test.Contacts.get(test2.getId()).getAddress(),"gelp");
        Assert.assertEquals(test.Contacts.get(test2.getId()).getPhone(),"458");
        Assert.assertEquals(test.Contacts.get(test2.getId()).getlastN(),":");
        Assert.assertEquals(test.Contacts.get(test2.getId()).getFirstN(),"hello");


        test.DeleteMap(test2.getId());
        test.DeleteMap(test2.getId());
        Assert.assertFalse(test.Contacts.containsKey(test2.getId()));

    }
    @Test 
    public void Failure(){
          Contact test1= new Contact("123","hello","goodbye","5555555555","742 Evergreen Terrace");

        test.addContact(test1.getId(), test1);
         Assert.assertThrows(IllegalArgumentException.class, () -> {
       test.addContact(test1.getId(),test1);});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
       test.update("","hello", "good","324","");});
       Assert.assertThrows(IllegalArgumentException.class, () -> {
       test.update("123","", "","","");});
         }
}
