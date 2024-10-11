public class student{
    int number;

    public student(){};
    public student (int number){
        this.number=number;
    }
    static student add(student std,student std1){
        student std2 =new student();
        std2.number=std.number+std1.number;
        return std2;
    }

}













