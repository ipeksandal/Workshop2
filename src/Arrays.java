
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.

        String[] products = {"product1", "product2", "product3", "product4"};
        double[] price = {200.50, 150.50, 50, 300};
        int[] amount = new int[products.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " satış miktarı : ");
            amount[i] = scanner.nextInt();
        }
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += amount[i] * price[i];
        }
        System.out.println("Elde edilen gelir : " + total);

        //Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.

        String[] meals = {"meal1", "meal2", "meal3", "meal4", "meal5"};
        double[] price1 = {230, 175.90, 185, 198.70, 220};
        Random random = new Random();
        int[] popularity = new int[meals.length];
        for (int i = 0; i < meals.length; i++) {
            popularity[i] = random.nextInt(5) + 1;
        }
        for (int i = 0; i < meals.length; i++) {
            System.out.println(meals[i] + " fiyatı ---> " + price1[i] + " derecesi ---> " + popularity[i]);
        }

        //Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen miktarları bir dizi ile tutan algoritma yazınız.

        String[] products1 = {"prod1", "prod2", "prod3", "prod4"};
        double[] price2 = {25, 52, 78.80, 68.70};
        boolean[] basket = new boolean[products1.length];
        int[] quantities = new int[products1.length];
        System.out.println("Sepete eklemek istediğiniz ürün numarasını girin (Çıkmak için 0'a basın!) : ");
        while (true) {
            int selectIndex = scanner.nextInt(products1.length - 1);
            basket[selectIndex] = true;
            if (selectIndex == 0)
                break;
            System.out.println("Kaç adet ürün eklemek istersiniz : ");
            int quantity = scanner.nextInt();
            basket[selectIndex - 1] = true;
            quantities[selectIndex - 1] += quantity;
            System.out.println(quantity + " adet " + products1[selectIndex - 1] + " ürün sepete eklendi.");
        }
        System.out.println("Sepetiniz :");
        double total1 = 0.0;
        for (int i = 0; i < products1.length; i++) {
            if (basket[i]) {
                double subTotal = price2[i] * quantities[i];
                total1 += subTotal;
                System.out.println(products1[i] + " " + price2[i] + " TL x " + quantities[i] + " adet = " + subTotal + "TL");
            }
        }
        System.out.println("Sepet tutarı : " + total1);


        //Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.
        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        userNames.add("user1");
        emails.add("user1@example.com");
        firstNames.add("firstName1");
        lastNames.add("lastName1");
        passwords.add("password1");
        System.out.println("UserName : ");
        String inputUserName = scanner.next();
        System.out.println("Password : ");
        String inputPassword = scanner.next();
        boolean isLoggedIn = false;
        for (int i = 0; i < userNames.size(); i++) {
            if (userNames.get(i).equals(inputUserName) && passwords.get(i).equals(inputPassword)) {
                isLoggedIn = true;
                System.out.println("Giriş başarılı.");
                break;
            } else
                System.out.println("Tekrar deneyin !");
            break;
        }

        //Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        studentNames.add("name1");
        grades.add(65.00);
        studentNames.add("name2");
        grades.add(27.75);
        studentNames.add("name3");
        grades.add(50.00);
        studentNames.add("name4");
        grades.add(30.25);
        double minGrade = 50.00;
        for (int i = 0; i < studentNames.size(); i++) {
            if (grades.get(i) < minGrade) {
                studentNames.remove(i);
                grades.remove(i);
                i--;
            }
        }
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " = " + grades.get(i));
        }
    }
}
