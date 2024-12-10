

public class Person {

    private byte age;
    private String name;
    private String email;
    public static int count = 0;
    private int pNumber = 0; 

    public Person(){
        count++;
        pNumber = count;
    };

    public void setInfo(String name, byte age,String email){

        if (age < 0 || age > 120)
            System.out.println("Возраст введен некорректно!");
        else
            this.age = age; 
        
        this.name = name;
        if (checkEmail(email))
            this.email = email;
        else
            System.out.println("Email введен некорректно!");
    }

    public void printInfo(){
        System.out.println("Персона №" + pNumber);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Email: " + email + "\n");
    }

    private boolean checkEmail(String email){

        boolean ok = false;
        char ch;

        for (int i = 0; i < email.length(); i++){

            ch = email.charAt(i);

            if (ch == '@'){
                ok = true;
                break;
            }
        }

        return ok;

    }

}
