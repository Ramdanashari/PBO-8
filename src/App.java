public class App {
    public static void main(String[] args) throws Exception {
        String helo = "mangcoding nih boss";
        String stringOri = "Welcome to Mangcoding";
        String stringLower = stringOri.toLowerCase();
        String stringUpper = stringOri.toUpperCase();
        String string1 = "Helo How Are You";
        String GantiKarakter = string1.replace("H", "M");
        String GantiKalimat = string1.replace("Helo", "hei dude");
        String nama = "Selamat Datang Di NusaPutra";
        String string4 = "hello";
        String string5 = "hello";
        String string6 = "Hello";

        //java lenght
        System.out.println("hasilnya adalah : " + helo.length());

        //java substring
        System.out.println("hasilnya adalah : " + helo.substring(2, 11));

        //java chartArt
        System.out.println("hasilnya adalah : " + helo.charAt(7));

        //java to lowercase
        System.out.println("sebelum digunakan method tolowercase : " + stringOri);
        System.out.println("sesudah digunakan method tolowercase  : " + stringLower);

        //java to uppercase
        System.out.println("sebelum digunakan method touppercase : " + stringOri);
        System.out.println("sesudah digunakan method touppercase : " + stringUpper);

        //java Replace
        System.out.println("untuk mengganti karakter : " + GantiKarakter);
        System.out.println("untuk mengganti kalimat : " + GantiKalimat);

        //java contains
        System.out.println("Hasilnya :" + nama.contains("NusaPutra"));
        System.out.println("Hasilnya :" + nama.contains("Selamat"));
        System.out.println("Hasilnya :" + nama.contains("wellcome"));

        //java equals
        System.out.println("Hasilnya :" + string4.equals(string5));
        System.out.println("Hasilnya :" + string4.equals(string6));

        //java equals ignorecase
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string5));
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string6));
        System.out.println("Hasilnya :" + string4.equalsIgnoreCase(string6));

        //java ends with
        System.out.println("Hasilnya :" + string1.endsWith("how"));
        System.out.println("Hasilnya :" + string1.endsWith("you"));
        System.out.println("Hasilnya :" + string1.endsWith("o"));
        System.out.println("Hasilnya :" + string1.endsWith("y"));
    }
}

