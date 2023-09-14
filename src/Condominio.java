import java.util.*;

public class Condominio {
    public String name;
    public String address;
    public List<Apto> apartamentos;
    
    public Condominio(String name, String address) {
        this.apartamentos = new ArrayList<>();
    }

    public Condominio(String name, String address, List<Apto> apartamentos) {
        this.name = name;
        this.address = address;
        this.apartamentos = new ArrayList<>();
    }

    public void addApto(Apto apartamento){
        apartamentos.add(apartamento);
    }

    public void aptos(){
        System.out.println("Todos os apartamentos: ");
        for(Apto i : apartamentos){
            System.out.println(i.number+"°: "+i.name);
            System.out.println("Disponibilidade: "+(i.availabe == true ? "Vazio" : "Ocupado" ) );
        }
    }

    public void availabeAptos(){
        System.out.println("Todos os apartamentos disponiveis: ");
        for(Apto i : apartamentos){
            if(i.availabe == true){
                System.out.println(i.number+"°: "+i.name);
                System.out.println("andar: "+i.floor);
            } else{
                continue;
            }
        }
    }

    public void occupiedAptos(){
        System.out.println("Todos os apartamentos ocupados: ");
        for(Apto i : apartamentos){
            if(i.availabe == false){
                System.out.println(i.number+"°: "+i.name);
            } else{
                continue;
            }
        }
    }

    
}