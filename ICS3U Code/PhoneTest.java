import java.util.Random;
 class PhoneTest {
    public static void main(String[] args){
        Random random = new Random();
        Phone[] phones = new Phone[10];
        System.out.printf("%-15s%-16s%-15s%-15s%-10s%-14s%n","Owner","Number","Valid","Usage","Plan","Cost");
        for (int i = 0; i<phones.length; i++){
            phones[i] = new Phone();
            String owner = "owner";
            owner += random.nextInt(1000);
            phones[i].owner = owner;
            phones[i].number = random.nextLong(1000000000);
            phones[i].valid = random.nextBoolean();
            phones[i].usage = (Math.round(random.nextFloat(1000)*100)) / 100.0f;
            phones[i].plan = (Math.round(random.nextFloat()*100)) / 100.0f;
            phones[i].cost = (Math.round(phones[i].plan*phones[i].usage*100)) / 100.0f;
            System.out.printf("%-15s%-16d%-15s%-15.2f%-10.2f%-14.2f%n", phones[i].owner,phones[i].number, phones[i].valid ? "true" : "false", phones[i].usage, phones[i].plan, phones[i].cost);
        }
    }
}
class Phone{
    String owner;
    long number;
    boolean valid;
    float usage;
    float plan;
    float cost;
        }
