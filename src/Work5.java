

public class Work5 {
    /*
     *5、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
     * 2个构造器Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，
     * 创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标
     * */
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        p1.movePoint(3,2);
        System.out.println(p1);
        Point p2 = new Point(-1,1);
        p2.movePoint(4,4);
        System.out.println(p2);
    }
}
