public class Main {


    public static void main(String[] args) {
        System.out.println("Tolgahan Bora İş Takip Projesi demosu");
        System.out.println("-------------------------------------");

        Product product = new Product();

        product.description = "Asus laptop 16 inch i7 7800K CPU artx 2060 GPU bir laptop. bla bla";
        product.price = 5999;
        product.name = "ASUS LAPTOP";
        product.stok = 10;
        product.color = "Mavi";
        product.setId(3);



        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürünün Serial kodu ise:" + product.getSerial());

        System.out.println("----------------------------------------------");

        Customer customer = new Customer();
        Employee employee = new Employee();



        customer.age = 25;
        customer.Firstname = "İlk adınız:";
        customer.Lastname = "Soyadınız:";
        customer.mail = "Mail adresiniz:";
        customer.Username = "Kullanıcı adınız:";




        System.out.println("--------------------------");

        System.out.println("Employee Information:");
        employee.age = 26;
        employee.Firstname = "İlk adınız:";
        employee.Lastname = "Soyadınız:";
        employee.mail = "Mail adresiniz:";
        employee.Username = "Kullanıcı adınız:";
        System.out.println("Satıcı ID'niz:" + employee.getId());



        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();


        employeeManager.add(employee);
        employeeManager.BestEmployee();
        System.out.println("*-----------------------------------*");
        customerManager.add(customer);

        System.out.println("-----------------------------------------");


       EmployeeSalary employeeSalary = new EmployeeSalary();
       CustomerTax customerTax = new CustomerTax();

       System.out.println("Satıcı maaşınız sattığınız ürün ile 1,7 katsayısı kadardır:" + employeeSalary.hesapla(100,1.7));
       System.out.println("Müşteri olarak ürüne ödediğiniz vergi kdv oranı ile komisyonumuzun çarpımıdır:" + customerTax.hesapla(20,1.4));


       customerTax.kargo();

       System.out.println("*-----------------------------------------------------*");

       Veritabanı veritabanı = new Mysql();
       Veritabanı veritabanı1 = new Oracle();

       veritabanı.add();
       System.out.println("-------");
       veritabanı1.add();














    }
}
