package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;


public class FileKezelesOOP {

    public static void main(String[] args) throws IOException {
        //Beolvasás
        InputStream is = FileKezelesOOP.class.getResourceAsStream("res/emberek.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        ArrayList<String> sorok = new ArrayList<>();
        ArrayList<Ember> emberek = new ArrayList<>();
        
        String sor;
        System.out.println("beolvasott fájl tartalma: ");
        while ((sor = br.readLine()) != null){
            System.out.println(sor);
            String[] s = sor.split(";");
            String nev = "";
            String cim = "";
            Ember ember = new Ember(nev,cim);
            emberek.add(ember);
        }
        
        
        //Kiírás
        System.out.println("Ki lakik Bp-en: ");
        //kiválasztás tétele
        int i = 0;
        while(!(emberek.get(i).getCim().equals("Bp"))){
            i++;
        }
        System.out.println(emberek.get(i).getNev());
    }

    
}
