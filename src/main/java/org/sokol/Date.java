package org.sokol;

public class Date {

    private int rok;
    private int miesiac;
    private int dzien;

    public Date( int dzien, int miesiac, int rok) {
        this.setDzien(dzien);
        this.setMiesiac(miesiac);
        this.setRok(rok);
    }


    @Override
    public String toString() {
        return "Date{" +
                "rok=" + getRok() +
                ", miesiac=" + getMiesiac() +
                ", dzien=" + getDzien() +
                '}';
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }


    public static Date of(String s, String separator) {
        String[] array = s.split(separator);
        if (array.length != 3) {
            return null;
        }
        int year = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[2]);
        return new Date(year, month, day);
    }

    // public static Date of(String s, String separator) {
    // StringTokenizer tokenizer = new StringTokenizer(separator);
    // int i = 0;
    // String[] array = new String[3];
    // while (tokenizer.hasMoreTokens()) {
    // if (i == 3) {
    // return null;
    // }
    // array[i++] = tokenizer.nextToken();
    // }
    // int year = Integer.parseInt(array[0]);
    // int month = Integer.parseInt(array[1]);
    // int day = Integer.parseInt(array[2]);
    // return new Date(year, month, day);
    // }

    // public static Date of(String s, String separator) {
    // Scanner scanner = new Scanner(s);
    // scanner.useDelimiter(separator);
    // int year = scanner.nextInt();
    // int month = scanner.nextInt();
    // int day = scanner.nextInt();
    // scanner.close();
    // return new Date(year, month, day);
    // }





}
