import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
class contact{
    
    static  int contact_Id=0;
    private String Name;
    private String Number;
    static HashMap<Integer,contact> Contacts_List = new HashMap<Integer,contact>();
    
    public contact(){
        contact_Id++;
    }
    // public void SetID(int Id){
    //     this.contact_Id=Id;
    // }
    public void SetName(String name){
        this.Name=name;
    }
    public void SetPhNumber(String number){
        this.Number=number;
    }
    public void SetContactObject(contact Details){
        Contacts_List.put(getContactID(),Details);
    } 
    public int  getContactID() {
        return contact_Id;
    }
    public String  getName() {
        return Name;
    }
    public String  getPhNumber() {
        return Number;
    }
    public HashMap getContactDetails(){
        return Contacts_List;
    }

    
}

class chats{
    
    static int chat_id = 0;
    static HashMap<Integer,chats> chats_List = new HashMap<Integer,chats>();
    static ArrayList<String> messages_List =new ArrayList<String>();
    String attend;
    
    public chats(){
        chat_id++;
    }
    public void setAttend(String attendance){
         this.attend = attendance;
    }
    public void SetChatsObject(chats Details){
        chats_List.put(getContact_id(null), Details);
    } 
    public int getChatId(){
        return chat_id;
    }
    public int getContact_id(contact con){
        return con.getContactID();
    }
    public String getAttend(){
        return attend;
    }
    public HashMap getChatsObject(){
        return chats_List;
    }
    


}
class messages{
    static int msg_id = 0;
    static String messages;
    String comingStatus;

    public messages() {
        msg_id++;
    }

    public void setMessage(String mssg) {
        this.messages = mssg;
    }

    public void setComingStatus(String status) {

        this.comingStatus = status;
    }

    // public void setMsgObject(messages status){
    //     chats.messages_List.(status);
    // }
    public int getMsgId() {
        return msg_id;
    }

    public static String getMessage() {
        return messages;
    }

    public String getComingStatus() {

        return comingStatus;
    }

}
class status{
        static int status_id=1;
        String text;
        static HashMap<Integer,status> statusObj= new HashMap<>();
        static HashMap status_list;
        
        public status(){
            status_id++;
        }
        public void setText(String text){
            this.text=text;
        }
        public String getText() {
            return text;
        }
        public int geStatusID(){
            return status_id;
        }

}

public class urlResponse extends contact {

    // get method for all contacts.
    public static void getContacts() {
        Set contactsSet = Contacts_List.keySet();
        Iterator iterator = contactsSet.iterator();
        //System.out.println("enter");
        while (iterator.hasNext()) {
            int total = (int) iterator.next();
            contact c = Contacts_List.get(total);
            System.out.println("contactId :"+total+"\n name"+c.getName());
        }
    }

    // get method for particular contacts.
    public static void getParticularContact(int contact_Id) {
        System.out.println("the contact details :" + Contacts_List.get(contact_Id));
    }

    // post method for create a new contacts.   
    public static void contactCreate(String[] Details) {
        String name = Details[0];
        String phonenumber = Details[1];
        contact contacts = new contact();
        contacts.SetName(name);
        contacts.SetPhNumber(phonenumber);
        contacts.SetContactObject(contacts);
        System.out.println("contacts is created.");
    }

    // post method for contact properties updates.
    public static void editContact(String[] property, String id) {
        int editId = Integer.parseInt(id);
        contact contacts = Contacts_List.get(editId);
        if (property.length == 2) {
            String[] name = property[0].split("=");
            String[] number = property[1].split("=");
            contacts.SetName(name[1]);
            contacts.SetPhNumber(number[1]);
            contacts.SetContactObject(contacts);
        } else {
            if (property[0].equalsIgnoreCase("name")) {
                String[] nameOnlyStrings = property[0].split("=");
                contacts.SetName(nameOnlyStrings[1]);
                contacts.SetContactObject(contacts);
            } else if (property[0].equalsIgnoreCase("number")) {
                String[] numberOnlyStrings = property[0].split("=");
                contacts.SetPhNumber(numberOnlyStrings[1]);
                contacts.SetContactObject(contacts);
            }
        }
    }

    // delete method for contact delete.
    public static void deleteContact(int Id) {
        Contacts_List.remove(Id);
        System.out.println("contact is deleted.");
    }

    // get method for chats.
    public static void getChats() {
        Set chatsSet = chats.chats_List.keySet();
        Iterator iterator = chatsSet.iterator();
        while (iterator.hasNext()) {
            int total = (int) iterator.next();
            int chatsID = chats.chats_List.get(total).getChatId();
            contact con = Contacts_List.get(chatsID);
            System.out.println(con.getName());
        }
    }

    // get method for particular chat.
    public static void getParticularChat(int cId) {
        System.out.println("The Chat Details :" + chats.chats_List.get(cId));
    }

    // post method for particular send messages.
    public static void sendMessages(int conId, String msg) {
        if (chats.chats_List.containsKey(conId)) {

        } else {
            messages message = new messages();
            message.setMessage(msg);
            chats.messages_List.add(messages.getMessage());
            //chats.messages_List.put(conId,incoming);
            System.out.println("send messages is successfully.");
         }

    } 
    
    //delete method for particular chat.
    public static void  deleteChat(int cid) {
        chats.chats_List.remove(cid);
        System.out.println("remove chats");
        
    }

    //post method for mystatus..
    public static  void addStatus(String text){
        status myStatus=new status();
        myStatus.setText(text);

    }
    
    //post method for another person status.
    public static void addAnotherStatus(String text){
        status per1=new status();
        per1.setText(text);

    }

    // get method for all status.
    public static void getstatus(String subResource) {
        Set statusSet = status.status_list.keySet();
        Iterator iterator = statusSet.iterator();
        System.out.println("enter");
        while (iterator.hasNext()) {
            int total = (int) iterator.next();
            Object sObject= status.status_list.get(total);
            System.out.println("status details:"+sObject);
        }
    }

    //get method for specific status.
    public static void getSpecificStatus(int key){
        if (status.status_list.containsKey(key)) { 
            Object perosnDetails = status.status_list.get(key); 
            System.out.println(perosnDetails);
        }
    }

    //delete method for other status.
    public static void deleteStatus(int status_id){
        status.status_list.remove(status_id);
        System.out.println("status is deleted.");
    }

    

        


    

    public static void urlRequest(){
        
        contact  con1= new contact();
        con1.SetName("Dilip");
        con1.SetPhNumber("8883889686");
        con1.SetContactObject(con1);
        chats chat1 = new chats();
        chat1.setAttend("active");
        messages msg = new messages();
        msg.setMessage("Hi da");
        ArrayList<String> messages_List =new ArrayList<String>();
        messages_List.add(msg.getMessage());
        boolean flag = true;
        while (flag != false) {
            

            Scanner Input = new Scanner(System.in);
            System.out.println("Enter the method and url ");
            String url = Input.nextLine();
            String[] splitArray= url.split(" ");
            String type = splitArray[0];
            String resource = splitArray[1];
            String[] subResource = (resource.split("/"));
            //System.out.println(type);
            //System.out.println(subResource.length);
            
            int length = subResource.length;

            if(type.equalsIgnoreCase("get")){
                //System.out.println("hi");
                if (subResource[0].equalsIgnoreCase("contacts") && length == 1) {
                    System.out.println("show the contacts");
                        getContacts();
                }
                else if(subResource[0].equalsIgnoreCase("contacts") && length == 2){
                    System.out.println("show specific contact");
                    getParticularContact(Integer.parseInt(subResource[1]));
                }
                else if (subResource[0].equalsIgnoreCase("chats") && length == 1 ) {
                        System.out.println("show the chats");
                        getChats();
                }
                else if(subResource[0].equalsIgnoreCase("chats") && length == 2 ){
                        System.out.println("show specific chat");
                        getParticularChat(Integer.parseInt(subResource[1]));

                }
                else if(subResource[0].equalsIgnoreCase("status") && length == 2 ){
                        System.out.println("show mystatus");
                        getstatus(subResource[1]);
                }
                else if(subResource[0].equals("status") && length == 2 ){
                        System.out.println("show specific status");
                        getSpecificStatus(Integer.parseInt(subResource[1]));
                }
                
            }
            else if(type.equalsIgnoreCase("post")){
                    if(subResource[0].equalsIgnoreCase("contacts") && length == 2){
                        System.out.println("new contact is creating");
                        String[] splitProperties =subResource[1].split(",");
                        contactCreate(splitProperties);
                    }
                    else if(subResource[0].equalsIgnoreCase("chats") && length == 3){
                        System.out.println("post message to someone");
                        sendMessages(Integer.parseInt(subResource[1]),subResource[2]);
                    }
                    else if(subResource[0].equalsIgnoreCase("status") && length == 2 ){
                        System.out.println("add status in my status");
                        addStatus(subResource[1]);
                    }
                    else if(subResource[0].equalsIgnoreCase("status") && length ==3){
                        System.out.println("add status into another person account");
                        addAnotherStatus(subResource[2]);
                    }
            }
            else if(type.equalsIgnoreCase("put")){
                    if(subResource[0].equalsIgnoreCase("contacts") &&  subResource.length == 3){
                        System.out.println("edit the contacts");
                        String[] pass=subResource[2].split("&");
                        editContact(pass, subResource[1]);
                    }
                
            }
            else if(type.equalsIgnoreCase("delete")){
                    if(subResource[0].equalsIgnoreCase("contacts") && length == 2){
                        System.out.println("delete the particular  contact");
                        deleteContact(Integer.parseInt(subResource[1]));
                    }
                    else if(subResource[0].equalsIgnoreCase("chats") && length == 2){
                        System.out.println("delete the particular  chat");
                        deleteStatus(Integer.parseInt(subResource[1]));
                    }


            }
            else{
                System.out.println("Wrong url pattern");
            }
            System.out.println("Do you want to enter URL true or false");
            flag = Input.nextBoolean();
        }
        
    }
    public static void main(String arg[]){
        urlRequest();
    }
}
