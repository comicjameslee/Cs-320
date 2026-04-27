// contact service 

import java.util.HashMap;

public class ContactService {
public HashMap<String,Contact> Contacts = new HashMap<>();

public void update(String Id, String FName, String LastN, String Phone, String Address){
if(Id.isBlank()){
    throw new IllegalArgumentException("please enter a valid id ");
}
    if(!FName.isBlank()){
Contacts.get(Id).setFirstN(FName);
} 
if(!LastN.isBlank()){
Contacts.get(Id).setLastN(LastN);
}
if(!Address.isBlank()){
Contacts.get(Id).setAddress(Address);
}
if(!Phone.isBlank()){
    Contacts.get(Id).setPhone(Phone);
}
if((Address+FName+LastN+Phone).isBlank()){
    throw new IllegalArgumentException("please enter a valid update");
}
}

public void addContact(String Id,Contact contact){
    if(Contacts.containsKey(Id)){
        throw new IllegalArgumentException("this key already exist");
    }
    Contacts.put(Id,contact);
}
public void DeleteMap(String Id){
    Contacts.remove(Id);
}
}
