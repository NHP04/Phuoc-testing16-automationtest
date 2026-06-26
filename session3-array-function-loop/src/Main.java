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
//        int target = scan.nextInt();
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
        String str = "Cybersoft";
        String result = "";
//        String la tap hop cac ky tu (character), mang cac ky tu (char)
//        String <=> char[]
        for(int i = 0; i < str.length(); i++) {
//            chuyen cac ky tu ve viet thuong
            char c = str.charAt(i); // lay ky tu thu i trong mang ky tu
            char lowerC = Character.toLowerCase(c);

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
            if ("ueoai".indexOf(Character.toString(lowerC)) == -1) {
                result += c;
            }

//            cach khac: viet theo kieu Collection trong java
        }
        System.out.println(result);

    }




    }
