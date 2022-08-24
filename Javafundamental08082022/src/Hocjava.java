    import java.util.Scanner;

    public class Hocjava {
        public static void main(String[] args) {
            //comment
            //1: Kieu du lieu
            //Nhom 1 (nguyen thuy - primitives): char, int, long double, float, boolean
            //Nhom 2 (doi tuong - Object): String,Integer, Long, Double, Float, Boolean

            //2:khai bao bien tuan thu thep camelCase
            //char a = 'a'; // char - kieu ky tu chua trong ''
            //int age = 28; // int, long - kieu so nguyen (so khong co phan thap phan), long lon hon
            //float height = 1.75f; //float, double  - kieu so co phan thap phan
            //boolean isMale = true; // boolean - kieu luan ly
            //String name = "Pham Tan Phat"; // String - kieu chuoi
            //3: Toan tu
            //int a = 5;
            //a = a + 1 <=> a += 1;
            //int b = a++;

            //Toan tu ++

            //Truong hop 1: a++
            //1-Truyen gia tri a vao vi tri a++
            //2-Tang a len 1 don vi

            //Truong hop 2: ++a
            //1 - tang a len 1 don vi
            //1 - Truyen gia tri a vao vi tri ++a

            //System.out.println("Gia tri cua a: " +a);
            //System.out.println("Gia tri cua b: " +b);

            //int a = 5;
            //int b = 3;

            //int result = a++ - --b + --a + a-- + b++ - b-- + a++ + --a;

            //System.out.println("Gia tri cua a: " +a);
            //System.out.println("Gia tri cua b: " +b);
            //System.out.println("Gia tri cua ket qua: " + result);

            //int c = -5;
            //int d = 5;

            //int result1 = --c + c++ - d-- + ++c + c-- - d++ + c++ - d--;

            //System.out.println("Gia tri cua a: " +c);
            //System.out.println("Gia tri cua b: " +d);
            //System.out.println("Gia tri cua ket qua: " + result1);
            // do uu tien ++ -- roi */ roi +-
            //int a = 5;
            // How to convert int to float, stackoverflow.com
            //int b = a / 3; // Chia lay phan nguyen
            // int b = a % 3 chia lay phan du
            //System.out.println(b);

            // Toan tu so sanh : >, <, ==
            // 4: Cau dieu kien

            //int a = 5;
            //int b = 10;

            // truong hop xay ra thi phai lam gi

            //if (a > b) {
            //  System.out.print("A lon hon B");
            //} else if (a < b) {
            //  System.out.print("A be hon B");
            //} else {
            //  System.out.print("A bang B");
            // }
            //"a" + value => value: phep noi chuoi
            // () chua valua, {} chua doan lenh: dung cho scope khi su dung nhieu hon mot doan lenh
            // Scanner scanner = new Scanner(System.in);
            // System.out.print(" Moi ban nhap ten: ");
            // String name = scanner.nextLine();
            // System.out.print(" Moi ban nhap tuoi: ");
            //  String tuoi = scanner.nextLine();
            //  System.out.print("Ten ban la " + name);
            //  System.out.print("Tuoi ban la " + tuoi);
            // Output: In ra phan loai va nguy co benh

            //Scanner scanner = new Scanner(System.in);
            //System.out.print(" Mời bạn nhập cân nặng: ");

            //Input
            //String weight = scanner.nextLine();
            //System.out.print(" Mời bạn nhập chiều cao: ");

            //Input
            //String height = scanner.nextLine();

            //float weightf = Float.parseFloat(weight);
            //float heightf = Float.parseFloat(height);

            //float BMI = (weightf/(heightf * heightf));
            //System.out.print("BMI của bạn là " + BMI);

            //String message = "";
            //if (BMI < 18.5 ) {
            //     message = (" |Gầy" + "| Nguy cơ bệnh Thấp");
            // } else if (BMI <= 24.9){
            //    message = (" |Bình thường" + "| Nguy cơ bệnh Trung Bình");
            // } else if (BMI <= 29.9){
            //     message = (" |Hơi béo" + "| Nguy cơ bệnh Cao");
            //  } else if (BMI <= 34.9){
            //      message = (" |Béo phì cấp độ 1" + "| Nguy cơ bệnh Cao");
            //  } else if (BMI <= 39.9){
            //     message = (" |Béo phì cấp độ 2" + "| Nguy cơ bệnh Rất Cao");
            //  } else
            //     message = (" |Béo phì cấp độ 3" + "| Nguy cơ bệnh Nguy Hiểm");
            //  System.out.println(message);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Mời bạn nhập mã khách hàng: ");
            String codeUser = scanner.nextLine();
            System.out.print("Mời bạn tổng tiền: ");
            int totalPayment = scanner.nextInt();
            int discountPercent = 0;
            String categoryCodeUser = "";

            switch (codeUser) {
                case "M":
                case "m":
                    discountPercent = 5;
                    categoryCodeUser = "Member";
                    break;
                case "V":
                case "v":
                    discountPercent = 7;
                    categoryCodeUser = "Vip";
                    break;
                case "D":
                case "d":
                    discountPercent = 15;
                    categoryCodeUser = "Diamond";
                    break;
                default:
                    System.out.print("Không đúng mã khách hàng");
                    return;
            }
            totalPayment = (int) (totalPayment * ((float) (100 - discountPercent) / 100 ));
            System.out.println("Thành viên thuộc loại " + categoryCodeUser);
            System.out.println("Được ưu đãi giảm " + discountPercent + "%");
            System.out.println("Số tiền cần phải thanh toán là " + totalPayment + " VNĐ");
        }
    }
