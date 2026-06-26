//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NguoiDung user1 = new NguoiDung();
        user1.manguoiDung = "001";
        user1.hoTen = "Nguyen Duc Huy";
        user1.ngaySinh = "11/10/2004";
        System.out.println(user1.hoTen);

        NguoiDung user2 = new NguoiDung();
        user2.manguoiDung = "001";
        user2.hoTen = "Nguyen Duc Huy";
        user2.ngaySinh = "23/05/2007";

//        LƯU Ý: Class cha không nên tạo đối tượng

//        Dog() => hàm khởi tạo đối tượng
//        2 loại hàm khởi tạo
//        -hàm khởi tạo không có tham số. VD: Dog()
//        lấy giá trị mặc định
//        int => 0
//        float => 0.0
//        String =>
//                -hàm khởi tạo có tham số
//        mac dinh: nếu ko khởi tạo hàm khởi tạo
       Dog dog1 = new Dog();
       dog1.name = "Chihuahua";
       dog1.eat();
       dog1.bark();


//       Dog dog2 = new Dog(name: "Rex", type: "begie");
//       dog2.bark();







    }
}