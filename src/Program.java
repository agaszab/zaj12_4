import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Map<Integer, Customer> klienci= new HashMap<>();

        Customer cu1=new Customer(22, "Jan","Kowalski", 234567555 );
        Customer cu2=new Customer(36, "Maciek","Nowak", 34534543 );
        Customer cu3=new Customer(2, "Ola","Jakaś", 25444355 );
        Customer cu4=new Customer(52, "Ala","Karol", 545467555 );
        Customer cu5=new Customer(22, "Jan","Kowalski", 234567555 );

        klienci.put(cu1.getId(), cu1);
        klienci.put(cu2.getId(), cu2);
        klienci.put(cu3.getId(), cu3);
        klienci.put(cu4.getId(), cu4);
        klienci.put(cu5.getId(), cu5);

        System.out.println(klienci.keySet());


        Set<Map.Entry<Integer, Customer>> entries = klienci.entrySet();  //tworzy zbior klucz-wartość 

        for (Map.Entry <Integer, Customer> element: entries) {

            System.out.println(element.getValue());
        }

    }
}
