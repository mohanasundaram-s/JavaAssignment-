import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import sun.nio.cs.ext.Big5;
import javax.swing.*;
class customer{

                String Customer_name,Customer_address,Customer_city;
                long  Customer_ph;
                static ArrayList<customer> customers_list = new ArrayList<customer>();
                //setter details of customers
                public void Customer_Name(String name){
                    this.Customer_name = name;
                }
                public void Customer_ph(long phoneNo){
                    this.Customer_ph = phoneNo;
                }
                public void Customer_add(String address){
                    this.Customer_address = address;
                }
                public void Customer_city(String city){
                    this.Customer_city = city;
                }    
                public void Customer_Det(customer Details){
                    customers_list.add(Details);
                }    
                public String getName(){
                    return Customer_name;
                }
                public long getPhoneNumber(){
                    return Customer_ph;
                }
                public String getAdd(){
                    return Customer_address;
                }
                public String getCity(){
                    return Customer_city;
                }
                public ArrayList<customer> getCustomersDetails(){
                    return customers_list;
                }



}
class items {
        int  Item_Id,Item_Price;
        String Item_Name,Item_Unit;
        String Item="Itm";
        //setter details of Items 
        static  ArrayList<items> Item_list = new ArrayList<items>();
        public void Item_id(int id ){
            this.Item_Id = id;
        }
        public void Item_name(String name){
            this.Item_Name = name;
        }
        public void Item_unit(String unit){
            this.Item_Unit = unit;
        }
        public void Item_price(int price){
            this.Item_Price = price;
        }
        public void Item_Details(items details){
            Item_list.add(details);
        }
        //getter details of Items 
        public int getId(){
            return Item_Id;
        }
        public String getName(){
            return Item_Name;
        }
        public String getUnit(){
            return Item_Unit;
        }
        public int getPrice(){
            return Item_Price;
        }
        public ArrayList<items> getItemsList(){
            return Item_list;
        }
        
}
class invoice {
    int totalcost;
    public int TotalPrice(int item,int quantity){
        return  item*quantity;
        //return totalcost;
    }
    // public int getTotalPrice(){
    //     return totalcost;   
    // }
    
}
class product {
    public static void main(String[] arg){
        System.out.println("                        Invoice                 ");
        Scanner sc = new Scanner(System.in);
        customer custom1 = new customer();
        customer  custom2 = new customer();
        custom1.Customer_Name("mohana sundaram.s");
        custom1.Customer_ph(123456789);
        custom1.Customer_add("127/174 Ramasamy Layout 1St street,Avarampalayam.");
        custom1.Customer_city("Coimbatore");
        custom1.Customer_Det(custom1);
        custom2.Customer_Name("ashwin gopi.s");
        custom2.Customer_ph(123456789);

        custom2.Customer_add("127/174 Ramasamy Layout 1St street,Avarampalayam.");
        custom2.Customer_city("Coimbatore");
        custom2.Customer_Det(custom2);
        items item1 = new items(); 
        items item2 = new items();
        items item3 = new items();
        // System.out.println(custom1.getName());
        // System.out.println(custom1.getPhoneNumber());
        //Item one
        item1.Item_id(0);
        item1.Item_name("labourcharger");
        item1.Item_unit("human");
        item1.Item_price(550);
        item1.Item_Details(item1);   
        //Item two
        item2.Item_id(1);
        item2.Item_name("carbonsteelalloy");
        item2.Item_unit("kg");
        item2.Item_price(40);
        item2.Item_Details(item2);
        //item three
        item3.Item_id(2);
        item3.Item_name("steel");
        item3.Item_unit("kg");
        item3.Item_price(94);
        item3.Item_Details(item3);
        System.out.println("Welcome to Mrs.Mohan");

        //System.out.println(customer.customers_list.size());
        //System.out.println(item1.getItemsList().get(0).Item_Name);
        // System.out.println(item1.getItemsList().get(0).Item_Price);
        // System.out.print("Enter your customer name : ");
        // String customername = sc.nextLine();
        // //System.out.println(customer.customers_list.size());
        //         for(int i=0;i<customer.customers_list.size();i++){
        //     //System.out.println(i);
        //     if(customername.equals(customer.customers_list.get(i).Customer_name)){
        //         System.out.println("success");
        //         break;
        //     }
            
        // }
        System.out.print("Do you want a create  new customer: y/n ");
        String reply = sc.next();
        //System.out.println(reply);
        int objC =customer.customers_list.size();
        //String custom ="custom"+objC;
        //System.out.println(customer);
        if(reply.equals("y")){
            
            //System.out.println(objectCount);
            System.out.print("Enter the new customer name : ");
            String name=sc.next();
            System.out.print("Enter the phone number :");
            long ph_no = sc.nextLong();
            System.out.print("Enter the address :");
            String address = sc.next();
            System.out.print("Enter the city : ");
            String city = sc.next();
            customer custome =new customer();
            custome.Customer_Name(name);
            custome.Customer_ph(ph_no);
            custome.Customer_add(address);
            custome.Customer_city(city);
            custome.Customer_Det(custome);
            System.out.println("This customer is a temporary customer,If you need stored the details,save it us a static details.");


        }
        System.out.println(customer.customers_list.size());
        // else{
        //     System.out.println("error");
        // }
        System.out.println("--------------------------------------------");
        System.out.println("            Material Prize List             ");
        for(int Cl=0;Cl<items.Item_list.size();Cl++){
            System.out.println("Id:"+items.Item_list.get(Cl).Item_Id+"|Name:"+items.Item_list.get(Cl).Item_Name+"|unit:"+items.Item_list.get(Cl).Item_Unit+"|Price:"+items.Item_list.get(Cl).Item_Price+"|");
        }
        System.out.print("Do you want create invoice :  y/n ");
        String enter =sc.next();
        //System.out.println(enter);
        if(enter.equals("y")){
            System.out.print("Enter the items count:");
             int ItemNo =sc.nextInt();
             String[] ArritemList = new String[ItemNo];
             int[] Arritem =new int[ItemNo];
             //String  InputValue;
             //String[] Value;
             
             for(int In=0;In<ItemNo;In++){
                 int e =In+1;
                System.out.print("Enter the Item"+e+" name :");
                 //InputValue = sc.nextLine();
                 //Value = InputValue.split(",");
                 ArritemList[In]=sc.next();
                 //Arritem[In]=Value[1];
             }
              
             for(int Il=0;Il<ItemNo;Il++){
                System.out.print(ArritemList[Il]+" quantity :");
                Arritem[Il]=sc.nextInt();
             }
             int priceI=0;
             int totalPrice,Discount,shippingCharger,count=1;
             int[] priceArrray=new int[items.Item_list.size()];
            for(int inV=0;inV<items.Item_list.size();inV++){
               
                switch(ArritemList[inV]){
                    case "labourcharger":
                        priceI = 550;
                        break;
                    case "steel":
                        priceI = 94;
                        break;
                    case "carbonsteelalloy":
                        priceI = 40;
                        break;
                    
                }
                System.out.println(priceI);
                //priceArrray[count]=priceI;
                count++;
                System.out.println(ArritemList[inV]);
                //totalPrice = invoice.TotalPrice(14,2);
               
            }
            for(int tet:priceArrray){
                System.out.println(tet);
            }
           
         
            

                // for (int x=0;x<ArritemList.length;x++) {
                //     //System.out.println("element:"+ArritemList[1]);
                //     //System.out.println("elements:"+Arritem[x]);
                //     //System.out.println(items.Item_list.get(x).Item_Name);
                //     //System.out.println(item1.getItemsList().get(0).Item_Name);
                //     //if(ArritemList[1].equals(items.Item_list.get(x).Item_Name)){
                //        // System.out.println("done");
                //     //}
                //     //else{
                //         System.out.println("fail");
                //     }

                // }
            // for (int  elemen:Arritem) {
            //     //System.out.println("element:"+elemen);
                
            // }


                           
        }
    }   
}