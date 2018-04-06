package fr.wildcodeschool.secretsentence;

public class SecretSentence {

    public static String Writesentence(String animal1, String animal2) {
        return animal1 + " s'incline face à " + animal2;
    }


    public static void main(String... args) {
        String animal1 = "Lion";
        String animal2 = "Serpent";

        String sPhraseAdire= Writesentence(animal1, animal2);

        System.out.println(sPhraseAdire);
    }
}
