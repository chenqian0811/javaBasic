public class zuoye7 {
    public static void main(String[] args) {
        int jishuhe=0;
        int oushuhe=0;
        for(int a=1;a<=100;a++){
            if (a%2==1){
                jishuhe +=a;
            }else {
                oushuhe +=a;
            }

        }
        System.out.println("奇数和："+jishuhe);
        System.out.println("偶数和："+oushuhe);
    }
}
