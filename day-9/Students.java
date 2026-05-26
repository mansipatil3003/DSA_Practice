class Students {
    private String name;
    private int rollno;
    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name = name;

        }
        else{
            System.out.println("Invalid Name");
        }
    }
    public void setrollno(int rollno){
        if(rollno> 0){
            this.rollno = rollno;
        }
        else{
            System.out.println("Roll no. must be positive");
        }
    }

    public String getName(){
        return name;

    }
    public int getrollno(){
        return rollno;

    }   
}
class Main1{
    public static void main(String[] args) {
        Students s = new Students();
        s.setName("Mansi");
        s.setrollno(101);
        System.out.println("Name: " +s.getName() );
        System.out.println("Roll no. :" +s.getrollno());
    }
}
