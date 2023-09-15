import java.util.Scanner;

public class Prop {
    Scanner scan = new Scanner(System.in);

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
        System.out.println("O "+ap.number+" agora está ocupado");
        ap.availabe = false;
    }
}
