public class PersonManager {

    public void List(){
        System.out.println("Listelendi");

    }
    public void add(Employee employee){
       System.out.println(employee.age);
        System.out.println(employee.mail);
        System.out.println(employee.Firstname);
        System.out.println(employee.Lastname);
        System.out.println(employee.Username);


    }
    public void add(Customer customer){
        System.out.println("Customer Information:");
        System.out.println("Kullanıcı ID'niz: " + customer.getId() );
        System.out.println(customer.age);
        System.out.println(customer.mail);
        System.out.println(customer.Firstname);
        System.out.println(customer.Lastname);
        System.out.println(customer.Username);


    }


    public void delete(){

        System.out.println("Silindi");
    }

}
