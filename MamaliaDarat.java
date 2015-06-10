/**
 * Created by TOSHIBA on 4/27/2015.
 */
public class MamaliaDarat {
    public static void main(String[] args) {

        String suaraHewan = "";
        
        System.out.println("\nDEMO KELAS, METHOD, DAN DATA");
        System.out.println("-----------------------------\n");

        Kucing pussy = new Kucing();
        suaraHewan = pussy.mengeong();
        System.out.println("Pussy : " + suaraHewan);

        Anjing doggy = new Anjing();
        suaraHewan = doggy.menggonggong();
        System.out.println("Doggy : " + suaraHewan);

        Macan siKumbang = new Macan();
        suaraHewan = siKumbang.mengaum();
        System.out.println("Si Kumbang : " + suaraHewan);

    }
}

class Kucing {
    public String mengeong() {
        String suara = new String("Meoong...");
        return suara;
    }
}

class Anjing{
    public String menggonggong(){
        String suara = new String("Guk..Guk...");
        return suara;
    }
}

class Macan{
    public String mengaum(){
        String suara = new String("Auummm...");
        return suara;
    }
}