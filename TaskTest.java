
import org.junit.jupiter.api.*;

public class TaskTest {
   @Test 
   public void TestWork(){
    Task test= new Task("123", "134", "hello") ;
    Assertions.assertEquals(test.GetID(), "123");
    Assertions.assertEquals(test.GetName(), "134");
    Assertions.assertEquals(test.GetDescription(), "hello");
   } 
   @Test
   public void TEstFail(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("", "test", "123456");
 });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("12345678901", "what", "123456");
    });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("12", "", "123456");
 });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("123", "11111111111111111111111111111111111111111111111111111111111111111", "123456");
 });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("1234567890", "test", "");
 });
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        new Task("1234567890", "1111 E Road", "szggbdxkxvxdrhteagbtvujhsfbprtbtkkxnepyflvmgyuuiynbjwvqkcungvzopsqtbucppemcfwrdasiirrnwmhallrirqhfgwcvxwdbbknyrnemzwaiqtbeddsvvpdytbrhxgghihgdfzxwgceukjocreejedjcoldkwrdsumznbsxliaipthlvmwwmkihdngerozimuxibzztzwuolrqygxftwhmrebqefdpnggnecguqobkjptjgr");
 });
     }
}
