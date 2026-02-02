class Candidate {
    static String code="CSE";
    String name;
    int roll;

    Candidate(String n,int r){
        name=n; roll=r;
    }

    void show(){
        System.out.println(name+" "+code+roll);
    }

    public static void main(String[] args){
        new Candidate("Roshni",161).show();
    }
}

