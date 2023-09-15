public class Prop {
    public String name;
    public Integer idade;
    public Integer phoneNumber;
    public String sex;
    
    public Prop() {
    }

    public Prop(String name, Integer idade, Integer phoneNumber, String sex) {
        this.name = name;
        this.idade = idade;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }
    
    public void addMorador(Apto ap){
        ap.availabe = false;
        System.out.println("O "+ap.number+" agora está ocupado");
    }
}
