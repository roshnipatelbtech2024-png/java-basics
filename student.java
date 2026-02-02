class Student {
    String name, div;
    int roll;

    Student(String n,int r,String d){
        name=n; roll=r; div=d;
    }

    public static void main(String[] args){
        Student s=new Student("Roshni",161,"A");
        System.out.println(s.name+" "+s.roll+" "+s.div);
    }
}
