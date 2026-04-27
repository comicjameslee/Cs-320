public class Contact{
    // creation of the string necessary for this project.
    private final String id;
    private String fName;
    private String lName;
    private String phone;
    private String address;
// basic constructor for the Contact class 

    public Contact(String Id,String FName, String LName, String Phone, String Address){
       // throws errors if any of the required lengths are not met
        int Max = 10;
        if(Id.length() > Max || Id.isBlank()){
            throw new IllegalArgumentException("Please enter a valid ID");
        }
        if(FName.length() > Max || FName.isBlank()){
            throw new IllegalArgumentException("Please enter a valid First Name");
        }
        if(LName.length() > Max || LName.isBlank()){
            throw new IllegalArgumentException("Please enter a valid Last Name");
            
        }
        if(Phone.length() > Max || Phone.isBlank()){
            throw new IllegalArgumentException("Please enter a valid Phone Number");
        }
        if(Address.length() > 30 || Address.isEmpty()){
            throw new IllegalArgumentException("Please enter a valid Phone Number");
        }
            this.id = Id;
            this.fName = FName;
            this.lName = LName;
            this.phone = Phone;
            this.address = Address;
    }
    // setters and getter in order to access the data in a secure way   
    public String getId(){
        return this.id;
    }
    public String getFirstN(){
        return this.fName;
    }
     public void setFirstN(String Name){
        if(Name.isBlank() || Name.length() > 10){
            throw new IllegalArgumentException("please choose a valid input");
        }
        this.fName = Name;
    }
    public String getlastN(){
        return this.lName;
    }
     public void setLastN(String Name){
          if(Name.isBlank() || Name.length() > 10){
            throw new IllegalArgumentException("please choose a valid input");
        }
        this.lName = Name;
    }
    public String getPhone(){
        return this.phone;
    }

     public void setPhone(String phone){
         if(phone.isBlank() || phone.length() > 10){
            throw new IllegalArgumentException("please choose a valid input");
        }
        this.phone = phone;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
          if(address.isBlank() ||address.length() > 30){
            throw new IllegalArgumentException("please choose a valid input");
        }
        this.address = address;
    }

}