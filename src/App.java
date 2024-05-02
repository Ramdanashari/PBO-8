public class App {
    public static void main(String[] args) throws Exception {
        String helo = "mangcoding nih boss";
        String name = "mangcoding nih boss";
        String hai = "mangcoding nih boss";
        String stringOri = "Welcome to Mangcoding";
        String stringLower = stringOri.toLowerCase();
        String stringAsli = "Welcome to Mangcoding";
        String stringAtas = stringOri.toUpperCase();
        String string1 = "Helo How Are You";
        String GantiKarakter = string1.replace("H", "M");
        String GantiKalimat = string1.replace("Helo", "hei dude");
        String nama = "Selamat Datang Di NusaPutra";
        String string4 = "hello";
        String string5 = "hello";
        String string6 = "Hello";


        System.out.println("hasilnya adalah : " + helo.substring(2, 11));
        System.out.println("hasilnya adalah : " + name.length());
        System.out.println("hasilnya adalah : " + hai.charAt(7));
        System.out.println("sebelum digunakan method tolowercase : " + stringOri);
        System.out.println("sesudah digunakan method tolowercase  : " + stringLower);
        System.out.println("sebelum digunakan method tolowercase : " + stringAsli);
        System.out.println("sesudah digunakan method tolowercase  : " + stringAtas);
        System.out.println("untuk mengganti karakter : " + GantiKarakter);
        System.out.println("untuk mengganti kalimat : " + GantiKalimat);
        System.out.println("Hasilnya :" + nama.contains("NusaPutra"));
        System.out.println("Hasilnya :" + nama.contains("Selamat"));
        System.out.println("Hasilnya :" + nama.contains("wellcome"));
        System.out.println("Hasilnya :" + string4.equals(string5));
        System.out.println("Hasilnya :" + string4.equals(string6));
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string5));
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string6));
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string6));
        System.out.println("Hasilnya :" + string1.endsWith("how"));
        System.out.println("Hasilnya :" + string1.endsWith("you"));
        System.out.println("Hasilnya :" + string1.endsWith("o"));
        System.out.println("Hasilnya :" + string1.endsWith("y"));

    }
}

