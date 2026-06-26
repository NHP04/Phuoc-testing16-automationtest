import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    static int demChuSo(long number) {

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }


    public static void main(String[] args) {

//        mảng số nguyên
//        cách 1: tạo mạng số nguyên
//        gán giá trị sẵn

        int[]  arrNum = {1, 2, 3, 4, 5, 6, 7};
//                       0  1  2  3  4  5  6
//        System.out.println(arrNum[0]);
//        in các phần tử của mảng => loop
//        khi duyet mang
//        gia tri khoi dau: phan tu dau tien cua mang
//        dieu kien ket thuc: duyet toi chi so cuoi cung cua mang
//        buoc nhay: tuy vao de bai


//       2. nhap tung phan tu cua mang
//        phan 1: khai bao so luong phan tu cua mang
//        phan 2: nhap tung phan tu cua mang

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong phan tu cua mang:");
        n = scan.nextInt();
//        cap phat vung nho gồm n ô nhớ lien ke nhau
        int[] arrNum1 = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("phan tu thu " + (i+1));
//            gán giá trị từ bàn phím vào phần tử thứ i của mảng
            arrNum1[i] = scan.nextInt();
        }
//        System.out.println("cac gia tri trong arrNum1 la:");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arrNum1[i]);
//        }





//        bai1: tinh tong cac phan tu trong mang

//        int sum = 0;
//        for (int i = 0; i < arrNum1.length; i++) {
//            sum += arrNum1[i];
//        }
//        System.out.println("tổng các số trong mảng:" + sum);



//        bai 2: tim phan tu min. max co trong mang

//        int max = arrNum1[0];
//        int min = arrNum1[0];
//
//        for (int i = 0; i < arrNum1.length; i++){
//            if( arrNum1[i] > max){
//                max = arrNum1[i];
//            }
//            if (arrNum1[i] < min) {
//                min = arrNum1 [i];
//            }
//        }
//
//        System.out.println("số lớn nhất là: " + max);
//        System.out.println("số nhỏ nhất là: " + min);


        //    bai 3: nhap so can tim. In ra vi tri cua so can tim, neu khong tim thay thi in ra -1
//    VD1: [1, 2, 3, 4, 5], target =3
//    output: 2
//    VD2: [1, 2, 3, 4, 5], target = 6
//    output: -1

//        int[] arrNum2 = {1, 2, 3, 4, 5};


//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Nhap so can tim: ");
//        int target = scan1.nextInt();
//
//        int location = -1;
//
//        for(int i = 0; i < arrNum2.length; i++){
//            if(target == arrNum2[i]){
//                location = i;
//                break;
//            }
//        }
//
//        System.out.println("Vi tri so can tim la: " + location);



        //    bai 4: tim so lon thu hai trong mang
//    VD: [1, 2, 3, 4, 5]
//    output: 4

//        Vì không biết min max là bao nhiêu nên chúng ta sẽ gán cho nó số cực nhỏ để gán giá trị default

        int firstMax  = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i< arrNum1.length; i++){
            if (arrNum1[i] > firstMax){
                secondMax = firstMax;
                firstMax = arrNum1[i];
            } else if (arrNum1[i] < firstMax && arrNum1[i] > secondMax ) {
                secondMax = arrNum1[i];
            }
        }
        System.out.println("so lon thu hai la: " + secondMax);





//        bai 5: xoa nguyen am (u,e,o,a,i)
//        input: Cybersoft
//        output: Cbrsft
//        String str = "Cybersoft";
//        String result = "";
//        String la tap hop cac ky tu (character), mang cac ky tu (char)
//        String <=> char[]
//        for(int i = 0; i < str.length(); i++) {

//            chuyen cac ky tu ve viet thuong

//            char c = str.charAt(i); // lay ky tu thu i trong mang ky tu
//            char lowerC = Character.toLowerCase(c);

//            if(lowerC != 'u' && lowerC != 'e' && lowerC != 'o' && lowerC != 'a' && lowerC != 'i') {
//                result += c;
//            }

//            cach 2:
//            if ("ueoai".contains(String.valueOf(lowerC)) == false) {
//                result += c;
//            }

//            cach 3: indexOf cua String
//            khong tim thay => -1
//            tim thay => index
//            if ("ueoai".indexOf(Character.toString(lowerC)) == -1) {
//                result += c;
//            }

//            cach khac: viet theo kieu Collection trong java
//        }
//        System.out.println(result);





//        BTVN
//        Bài 3: Tính Tổng Các Số Chẵn
//        Ví dụ:
//        Input: 10
//        Output: 30
//        Input: 5
//        Output: 6

        int tongChan = 0;
        System.out.println("Nhap so tinh tong chan: ");
        int n3 = scan.nextInt();
        for(int i = 1; i <= n3; i++){
            if (i % 2 == 0 ){
                tongChan += i;
            }
        }
        System.out.println("tong cac so chan la: " + tongChan);



//        Bài 4: Đếm số từ trong một chuỗi
//        Input: "Xin chào các bạn"
//        Output: 4
//        Input: "Hello World"
//        Output: 2


        System.out.println("Nhap tu can dem: ");
        scan.nextLine();
        String n4 = scan.nextLine();
        int count = 0;

        for (int i = 0; i < n4.length(); i++){
            char c = n4.charAt(i);

            if (c != ' '){
                if(i == 0 || n4.charAt(i - 1) == ' '){
                    count++;
                }
            }
        }
        System.out.println("So tu la: " + count);


//        Bài 5: In Chữ Cái Đầu Của Mỗi Từ
//        Input: "Xin chào các bạn"
//        Output: "X C C B"
//        Input: "Hello World"
//        Output: "H W"

        String result5 = "";
        for (int i = 0; i < n4.length(); i++) {
            char c = n4.charAt(i);
            char upperC = Character.toUpperCase(c);

            if (c != ' '){
                if(i == 0 || n4.charAt(i - 1) == ' '){
                 result5 = result5 + upperC + " ";
                }
            }
        }
        System.out.println("ky tu dau tien la: " + result5);



//        Cấp độ 2
//        Bài 1: Viết một chương trình Java tính thuế thu nhập cá nhân
//        1.Thu nhập từ 0 đến 5 triệu đồng: 5%
//                2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
//                3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
//                4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
//                5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
//                6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
//                7.Thu nhập trên 80 triệu đồng: 35%

        System.out.println("Nhap so thu nhap cua ban: ");
        int TN = scan.nextInt();
        double thue = 0;
        if (TN >= 0 && TN <= 5000000) {
            thue = TN * 0.05;
        }
        else if (TN <= 10000000) {
            thue = TN * 0.10;
        }
        else if (TN <= 18000000) {
            thue = TN * 0.15;
        }
        else if (TN <= 32000000) {
            thue = TN * 0.20;
        }
        else if (TN <= 52000000) {
            thue = TN * 0.25;
        }
        else if (TN <= 80000000) {
            thue = TN * 0.30;
        }
        else {
            thue = TN * 0.35;
        }

        System.out.println("Số thuế phải trả là: " + thue);



//        Bài 2: Kiểm Tra Chuỗi Đối Xứng
//        Input: "madam"
//        Output: true
//        Input: "hello"
//        Output: false

        scan.nextLine();
        System.out.println("Nhap chuoi kiem tra doi xung:");
        String sc6 = scan.nextLine();

        String word2 = "";

        for (int j = sc6.length() - 1; j >= 0 ; j--){
            word2 += sc6.charAt(j);
        }


        if ( sc6.equals(word2)){
            System.out.println("Đay la chuoi doi xung");
        }
        else{
            System.out.println("Đay la khong phai chuoi doi xung");
        }



}

    }
