import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;
public class ContactTest {
    

    @Test
  
    public void TestInputs(){
        Contact test1= new Contact("123","hello","goodbye","5555555555","742 Evergreen Terrace");
    Assert.assertEquals(test1.getId(), "123");
    Assert.assertEquals(test1.getFirstN(), "hello");
    Contact test2= new Contact("12300000","hello","goodbye","5555555555","741 Evergreen Terrace");
    Assert.assertEquals(test2.getlastN(), "goodbye");
    Assert.assertEquals(test2.getPhone(), "5555555555");
    Assert.assertEquals(test2.getAddress(),"741 Evergreen Terrace");
    test1.setFirstN("none");
    test1.setLastN("body");
    test1.setPhone("6125552422");
    test1.setAddress("14 North Moore Stree");
    Assert.assertEquals(test1.getFirstN(), "none");
    Assert.assertEquals(test1.getlastN(),"body");
    Assert.assertEquals(test1.getPhone(),"6125552422");
    Assert.assertEquals(test1.getAddress(),"14 North Moore Stree");
    }
    @Test
    public void Failures(){
              Contact test1= new Contact("123","hello","goodbye","5555555555","742 Evergreen Terrace");

          Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("","hello","goodbye","5555555555","742 Evergreen Terrace");});
           Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("123456789012","goodbye","goodbye","5555555555","742 Evergreen Terrace");});
       Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("123","","goodbye","5555555555","742 Evergreen Terrace");});
            Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","123456789011","goodbye","5555555555","742 Evergreen Terrace");});
            Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","","5555555555","742 Evergreen Terrace");});
           Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","123456789011","5555555555","742 Evergreen Terrace");});
           Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","1234","","742 Evergreen Terrace");});
         Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","1234","111111111111111111111","742 Evergreen Terrace");});
         Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","1234","5555555555","");});
         Assert.assertThrows(IllegalArgumentException.class, () -> {
         new Contact("1234","hello","1234","5555555555","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies");});
         Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setAddress("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setFirstN("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies");});
         Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setLastN("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setPhone("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setFirstN(" ");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setLastN(" ");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setPhone(" ");});
        Assert.assertThrows(IllegalArgumentException.class, () -> {
        test1.setAddress(" ");});
        }
    
    
}
