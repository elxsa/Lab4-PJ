package pb1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Enum pentru stările echipamentului
enum Stare {
    ACHIZITIONAT, EXPUS, VANDUT
}

// Enum pentru modul de tipărire al imprimantelor
enum ModTiparire {
    COLOR, ALB_NEGRU
}

// Enum pentru sistemele de operare disponibile
enum SistemOperare {
    WINDOWS, LINUX
}

// Clasa de bază pentru toate tipurile de echipamente
class Echipament {
    private String denumire;
    private int nr_inv;
    private double pret;
    private String zona_mag;
    private Stare stare;

    // Constructor
    public Echipament(String denumire, int nr_inv, double pret, String zona_mag) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stare = Stare.ACHIZITIONAT; // Starea implicită este ACHIZITIONAT
    }

    // Gettere și settere
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    // Metoda pentru afișarea informațiilor despre echipament
    @Override
    public String toString() {
        return "Echipament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}

// Clasa Imprimanta extinde clasa Echipament și adaugă atribute specifice
class Imprimanta extends Echipament {
    private int ppm;
    private int dpiX;
    private int dpiY;
    private int p_car;
    private ModTiparire modTiparire;

    // Constructor
    public Imprimanta(String denumire, int nr_inv, double pret, String zona_mag, int ppm, int dpiX, int dpiY, int p_car, ModTiparire modTiparire) {
        super(denumire, nr_inv, pret, zona_mag);
        this.ppm = ppm;
        this.dpiX = dpiX;
        this.dpiY = dpiY;
        this.p_car = p_car;
        this.modTiparire = modTiparire;
    }

    // Gettere și settere
    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getDpiX() {
        return dpiX;
    }

    public void setDpiX(int dpiX) {
        this.dpiX = dpiX;
    }

    public int getDpiY() {
        return dpiY;
    }

    public void setDpiY(int dpiY) {
        this.dpiY = dpiY;
    }

    public int getP_car() {
        return p_car;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public ModTiparire getModTiparire() {
        return modTiparire;
    }

    public void setModTiparire(ModTiparire modTiparire) {
        this.modTiparire = modTiparire;
    }

    // Metode specifice pentru imprimanta
    public void setModTiparireColor() {
        this.modTiparire = ModTiparire.COLOR;
    }

    public void setModTiparireAlbNegru() {
        this.modTiparire = ModTiparire.ALB_NEGRU;
    }
}

// Clasa SistemCalcul extinde clasa Echipament și adaugă atribute specifice
class SistemCalcul extends Echipament {
    private String tipMon;
    private double vitProc;
    private int c_hdd;
    private SistemOperare sistemOperare;

    // Constructor
    public SistemCalcul(String denumire, int nr_inv, double pret, String zona_mag, String tipMon, double vitProc, int c_hdd, SistemOperare sistemOperare) {

        super(denumire, nr_inv, pret, zona_mag);
        this.tipMon = tipMon;
        this.vitProc = vitProc;
        this.c_hdd = c_hdd;
        this.sistemOperare = sistemOperare;
    }

    // Gettere și settere
    public String getTipMon() {
        return tipMon;
    }

    public void setTipMon(String tipMon) {
        this.tipMon = tipMon;
    }

    public double getVitProc() {
        return vitProc;
    }

    public void setVitProc(double vitProc) {
        this.vitProc = vitProc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    public SistemOperare getSistemOperare() {
        return sistemOperare;
    }

    public void setSistemOperare(SistemOperare sistemOperare) {
        this.sistemOperare = sistemOperare;
    }
}

// Clasa Main pentru a testa funcționalitatea
// Clasa Main pentru a testa funcționalitatea
public class MainPb1 {
    public static void main(String[] args) {
        List<Echipament> echipamente = new ArrayList<>();

        try {
            File file = new File("echipamente.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(";");

                String denumire = tokens[0];
                int nr_inv = Integer.parseInt(tokens[1]);
                double pret = Double.parseDouble(tokens[2]);
                String zona_mag = tokens[3];
                String situatie = tokens[4];
                String tipEchipament = tokens[5];

                if (tipEchipament.equals("imprimanta")) {
                    int ppm = Integer.parseInt(tokens[6]);

                    // Extragem rezoluția DPI folosind o expresie regulată
                    Pattern pattern = Pattern.compile("(\\d+)\\s*x\\s*(\\d+)\\s*dpi");
                    Matcher matcher = pattern.matcher(tokens[7]);
                    int dpiX = 0, dpiY = 0;
                    if (matcher.find()) {
                        dpiX = Integer.parseInt(matcher.group(1));
                        dpiY = Integer.parseInt(matcher.group(2));
                    }

                    int p_car = Integer.parseInt(tokens[8]);
                    ModTiparire modTiparire = ModTiparire.valueOf(tokens[9].toUpperCase()); // Convertim la enum

                    Imprimanta imprimanta = new Imprimanta(denumire, nr_inv, pret, zona_mag, ppm, dpiX, dpiY, p_car, modTiparire);
                    echipamente.add(imprimanta);
                } else if (tipEchipament.equals("copiator")) {
                    // Implementare pentru copiator
                } else if (tipEchipament.equals("sistem de calcul")) {
                    // Implementare pentru sistem de calcul
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit.");
        }

        // Afișarea echipamentelor
        for (Echipament echipament : echipamente) {
            System.out.println(echipament);
        }
    }
}