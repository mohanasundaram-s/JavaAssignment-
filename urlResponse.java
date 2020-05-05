import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java. util. Iterator;
//contacts class
class contacts{

        private int id;
        private String name;
        private String phonenumber;
        static ArrayList<contacts> contacts_list = new ArrayList<contacts>();
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phonenumber;
        }

        public void setPhoneNumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }
    
        public ArrayList<contacts> getContactsDetails(){
            return contacts_list;
        }

        public void setContacts_Det(contacts Details){
            contacts_list.add(Details);
        } 

        public void checkResponse (String[] values){
                if(values[0].equalsIgnoreCase("get")){
                    if(values.length == 2){
                        getContacts();
                    }
                    else if(values.length == 3){
                        int id = Integer.parseInt(values[3]);
                        getSpecificContact(id);
                    }
                }
                else if(values[0].equalsIgnoreCase("post")){
                        if(values.length == 2){
                                contactCreate();
                        }
                        else if(values.length == 4){
                            int postID = Integer.parseInt(values[3]);
                            String SpecificMsg = values[4];
                            messageSending(postID,SpecificMsg);
                        }
                }
                else if(values[0].equalsIgnoreCase("update")){
                    
                }
                else if(values[0].equalsIgnoreCase("delete")){
                        if(values[3] ==3 ){
                            int DeleteID = Integer.parseInt(values[3]);
                            contactDelete(DeleteID);
                        }
                        else if(values.length == 4){
                            int conMsgDelete =Integer.parseInt(values[3]);
                            int DeleteMsg = Integer.parseInt(values[4]);
                                messageDeleting(perID,msgPos);
                        }
                }
            
        }
        public void  getContacts() {
            Iterator iterator = contacts_list.iterator(); 
  
            //System.out.println("List elements : "); 
      
            while (iterator.hasNext()){
                System.out.print(iterator.next() + " "); 
            }
            System.out.println(); 
        }

        public void getSpecificContact(int RollID){
            for(int i=0;i<contacts_list.size();i++){
                if(RollID == contacts_list.get(i).id){
                    System.out.println(contacts_list.get(i).id+"\n"+contacts_list.get(i).name+"\n"+contacts_list.get(i).phonenumber);
                }
            }
        }
        public void contactCreate(){
            Scanner userInput=new Scanner(System.in);
            contacts c2=new contacts();
            System.out.print("Enter the name:");
            String name=userInput.next();     
            c2.setName(name);
            int ContactID=contacts_list.length+1;
            c2.setId(ContactID);
            System.out.println("Enter the phone number:");
            String userPh=userInput.nextInt();
            c2.setPhoneNumber(userPh);
            c2.setContacts_Det(c2);
            System.out.println("create successfully");
        }
        public void messageSending(int postId,String chats){
            for(int i=0;i<contacts_list.size();i++){
                if(postId == contacts_list.get(i).id){
                    String chatPerson = contacts_list.get(i).name;
                    ArrayList<String> chatPesron = new ArrayList<String>();
                    String msg = chats;
                    Msg.add(msg);
                }
            }
           
        }
        public void messageDeleting(int personID,int position){
            Iterator itr=custom.iterator();
        }
        public void contactdelete(int id){
            for(int i=0;i<contacts_list.size();i++){
                if(id == contacts_list.get(i).id){
                    contacts_list.remove(contacts_list.get(i).id);
                    contacts_list.remove(contacts_list.get(i).name);
                    contacts_list.remove(contacts_list.get(i).phonenumber);
                }
            }
        }
         

       

    

}
public class urlResponse {
    public static void main(String arg[]){
        //static contact
        contacts c1=new contacts();
        c1.setId(1);
        c1.setName("Dhilip");
        c1.setPhoneNumber("9894471213");
        c1.setContacts_Det(c1);
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the url of whats app : ");
        String url=Input.next();
        String[] splitingUrl = url.split("/");
        //System.out.print(c1.getContactsDetails().get(1));
        for(String i : splitingUrl){
             System.out.print(i +", ");
        }
        c1.checkResponse(splitingUrl);
     
    }

}