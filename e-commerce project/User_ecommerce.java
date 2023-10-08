//Özgül BAYTEKİN - 220315005
package com.mycompany.e_commerce;



public class User_ecommerce {
    private Order transaction;
    private Product product;
    private String username;
    private String name;
    private String surname;
    private String birthday;
    private int password;
    private String email;
    private String home_adress;
    private String work_adress;
    private Product [] ordered_products;
    private int ordered_product_number;
    private Product [] fav_products;
    private int fav_product_number;
    private User_ecommerce [] users;
    private int user_number;
    
    
    public User_ecommerce(String username,String name,String surname,int password,String email,String birthday,String home_adress,String work_adress){
           this.product=product;
           this.username=username;
           this.name=name;
           this.surname=surname;
           this.password=password;
           this.email=email;
           this.birthday=birthday;
           this.home_adress=home_adress;
           this.work_adress=work_adress;
           this.ordered_product_number=0;
           this.ordered_products = new Product[10];
           this.fav_product_number=0;
           this.fav_products = new Product[10];
           this.user_number=0;
           this.users = new User_ecommerce[10];
           this.transaction=transaction;
           }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

    public User_ecommerce[] getUsers() {
        return users;
    }

    public void setUsers(User_ecommerce[] users) {
        this.users = users;
    }

    public int getUser_number() {
        return user_number;
    }

    public void setUser_number(int user_number) {
        this.user_number = user_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHome_adress() {
        return home_adress;
    }

    public void setHome_adress(String home_adress) {
        this.home_adress = home_adress;
    }

    public String getWork_adress() {
        return work_adress;
    }

    public void setWork_adress(String work_adress) {
        this.work_adress = work_adress;
    }

    public Product[] getFav_products() {
        return fav_products;
    }

    public void setFav_products(Product[] fav_products) {
        this.fav_products = fav_products;
    }

    public int getFav_product_number() {
        return fav_product_number;
    }

    public void setFav_product_number(int fav_product_number) {
        this.fav_product_number = fav_product_number;
    }
    

    public Product[] getOrdered_products() {
        return ordered_products;
    }

    public void setOrdered_products(Product[] ordered_products) {
        this.ordered_products = ordered_products;
    }

    public int getOrdered_product_number() {
        return ordered_product_number;
    }

    public void setOrdered_product_number(int ordered_product_number) {
        this.ordered_product_number = ordered_product_number;
    }
    
    
    public void add_product(Product p1){
        if(ordered_products.length>0){
            
            Product temp5[]=ordered_products;
            ordered_products=new Product[ordered_products.length+1];
            for(int i=0;i<temp5.length;i++){
                 ordered_products[i]=temp5[i];
            }
            this.ordered_products[ordered_product_number]=p1;
            this.ordered_product_number++;
            for(int i=0;i<temp5.length;i++){
                 ordered_products[i]=temp5[i];
            }
            
        }
       else{
            ordered_products[0]=p1;
       }
        System.out.println("New product is added to the products.");
    }
    
    public void order_product(Product p1,int count){
       if(ordered_products.length>0){
            //ArrayList<Product> temp = new ArrayList<Product>();
            Product temp[]=ordered_products;
            ordered_products=new Product[ordered_products.length+1];
            for(int i=0;i<temp.length;i++){
                 ordered_products[i]=temp[i];
            }
            this.ordered_products[ordered_product_number]=p1;
            this.ordered_product_number+=count;
            
            
        }
       else{
            ordered_products[0]=p1;
       }
       p1.reduceStocks(p1,count);
       System.out.println(count+" of the product is ordered.");
       
       
       
    }
    
    public void fav_product(Product p2){
        if(fav_products.length>0){
            
            Product temp2[]=fav_products;
            fav_products=new Product[fav_products.length+1];
            for(int i=0;i<temp2.length;i++){
                 fav_products[i]=temp2[i];
            }
            this.fav_products[fav_product_number]=p2;
            this.fav_product_number++;
            
        }
       else{
            fav_products[0]=p2;
       }
       System.out.println("Product added to the favorite products.");
    }
    public void add_user(User_ecommerce u1){
        if(users.length>0){
            
            User_ecommerce temp3[]=users;
            users=new User_ecommerce[users.length+1];
            for(int i=0;i<temp3.length;i++){
                 users[i]=temp3[i];
            }
            this.users[user_number]=u1;
            this.user_number++;
            
        }
       else{
            users[0]=u1;
       }
        System.out.println("New user added to the users.");
    }
    
   
}
