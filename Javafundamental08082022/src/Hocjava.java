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
            //System.out.print(" M???i b???n nh???p c??n n???ng: ");

            //Input
            //String weight = scanner.nextLine();
            //System.out.print(" M???i b???n nh???p chi???u cao: ");

            //Input
            //String height = scanner.nextLine();

            //float weightf = Float.parseFloat(weight);
            //float heightf = Float.parseFloat(height);

            //float BMI = (weightf/(heightf * heightf));
            //System.out.print("BMI c???a b???n l?? " + BMI);

            //String message = "";
            //if (BMI < 18.5 ) {
            //     message = (" |G???y" + "| Nguy c?? b???nh Th???p");
            // } else if (BMI <= 24.9){
            //    message = (" |B??nh th?????ng" + "| Nguy c?? b???nh Trung B??nh");
            // } else if (BMI <= 29.9){
            //     message = (" |H??i b??o" + "| Nguy c?? b???nh Cao");
            //  } else if (BMI <= 34.9){
            //      message = (" |B??o ph?? c???p ????? 1" + "| Nguy c?? b???nh Cao");
            //  } else if (BMI <= 39.9){
            //     message = (" |B??o ph?? c???p ????? 2" + "| Nguy c?? b???nh R???t Cao");
            //  } else
            //     message = (" |B??o ph?? c???p ????? 3" + "| Nguy c?? b???nh Nguy Hi???m");
            //  System.out.println(message);

//            Scanner scanner = new Scanner(System.in);
//            System.out.print("M???i b???n nh???p m?? kh??ch h??ng: ");
//            String codeUser = scanner.nextLine();
//            System.out.print("M???i b???n t???ng ti???n: ");
//            int totalPayment = scanner.nextInt();
//            int discountPercent = 0;
//            String categoryCodeUser = "";

//            switch (codeUser) {
//                case "M":
//                case "m":
//                    discountPercent = 5;
//                    categoryCodeUser = "Member";
//                    break;
//                case "V":
//                case "v":
//                    discountPercent = 7;
//                    categoryCodeUser = "Vip";
//                    break;
//                case "D":
//                case "d":
//                    discountPercent = 15;
//                    categoryCodeUser = "Diamond";
//                    break;
//                default:
//                    System.out.print("Kh??ng ????ng m?? kh??ch h??ng");
//                    return;
//            }
//            totalPayment = (int) (totalPayment * ((float) (100 - discountPercent) / 100 ));
//            System.out.println("Th??nh vi??n thu???c lo???i " + categoryCodeUser);
//            System.out.println("???????c ??u ????i gi???m " + discountPercent + "%");
//            System.out.println("S??? ti???n c???n ph???i thanh to??n l?? " + totalPayment + " VN??");

//          5. M???ng
//           Array => t???t c??? ?????u l??u 1 n??i, kh??ng th??m, xo?? ph???n t??? ???????c
//           C??ch t???o v?? truy???n c??c ph???n t??? cho m???ng
//             String [] arrNames = {"T??o", "T??", "T???n", "Hoa", "Lan"};

             //L???y k??ch th?????c c???a m???ng
            //System.out.println("K??ch th?????c c???a m???ng l?? " + arrNames.length);

            //L???y gi?? tr??? ph???n t??? theo index
            //V??? tr?? ?????u ti??n s??? c?? index = 0, v??? tr?? cu???i c??ng s??? l?? length -1
            //System.out.println(arrNames[1]);
            //arrNames[1] = "T?? update";
            //System.out.println(arrNames[1]);

            // C??ch 2: t???o ra m???ng nh??ng ch??? bi???t s??? l?????ng
            //String[] arrNames = new String[10];

            //6. V??ng l???p for
            // Bi???t qui tr??nh, c??ch ?????m tr?????c, i++ ch???y h???t 1 v??ng m???i t??ng l??n 1
            //for (int i = 0; i < 10; i++) {
            //    System.out.println(i);
            //for (int i = 10; (i >=0); i--){
            //    System.out.println(i);
            //}
            // Kiem so chan tu 1-100
            //for (int i = 1; i <= 100; i++) {
            //    if(i % 2 == 0){
            //        System.out.println(i);
            //}
            // Uoc la chia cho nh??ng so nho hon no, chia het,
            // tim so nguyen to
            //Scanner sc = new Scanner(System.in);
            //System.out.println ("M???i b???n nh???p m???t s??? b???t k???: ");
            //int a = sc.nextInt();
            //if (a < 2) {
            //    System.out.println("Kh??ng ph???i l?? s??? nguy??n t???");
            //    return;
            //}
            //for (int i = 2; i < a ; i++) {
            //    if (a % i == 0) {
            //        System.out.println(a + " Kh??ng ph???i l?? s??? nguy??n t???");
            //        return;
            //    }
            //    }
            //System.out.println(a + " L?? s??? nguy??n t???");

            int [] arrNumber = {1,2,3,4,5,6,10,20,30,15,16,17,18,21,22,23};

            //Ki???m s??? l???n nh???t
            //Ki???m s??? nh??? nh???t l?? s??? l???
            int Max = 0;
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < 16; i++ ){
                if (arrNumber[i+1] >= arrNumber[i]){
                    temp1 = arrNumber[i+1];
                }else
                    temp1 = arrNumber[i];
                Max = temp1;

                System.out.println("S??? l???n nh???t l??: " + Max);


                // tao pull request va code tren branch
            }

            }
        }
