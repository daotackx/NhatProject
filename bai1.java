package baiTapMang;

public class bai1 {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,8,9,12,11,13,34,35,65};
        // 1. tao 1 mang co phan tu{1,2,4,56,4,22,235,2,2,2,5,7,2,5,3}, đếm só phân tử trong mảng 
        // 2. tao 1 mang bat ki cho nguoi dung nhap vao kiem tra so do co trong mang hay khong.
        // 3. tao 1 mang r sap xep tang dan and giam dan
        // 4. cho nguoi dung nhap vao n, in ra cac so fibonaci nho hon n la so nguyen to
        // 5. tim so lon nhat va so lon nhi
        for(int i=0; i<a.length;i++){
            boolean flag = true;
            if(a[i]==1 || a[i]== 0){
                flag= false;
            }else{
                for(int j=2;j<a[i];j++){
                    if(a[i]%j==0){
                        flag= false;
                    }
                }
                if(flag){
                    System.out.print(a[i]+" ");
                }
            }
            
        }
    }
}
