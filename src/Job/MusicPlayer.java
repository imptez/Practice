package Job;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    public static PlayList playList;

    public static void main(String[] args) {
        List<String> bollywoodSongs= buildPlayList();
        for (int i = 0; i < 10; i++) {
            System.out.println("Play a random bollywood song from playlist ===" + playList.playRandom());
        }
        System.out.println("================================================================================================================");
        System.out.println("================================================================================================================");
        System.out.println("================================================================================================================");
        Random rnd = new Random();
        for (int j = 0; j < 10; j++) {
            System.out.println("Play my choice Song from the playlist ==="+ playList.playSongIfAvailable(bollywoodSongs.get(rnd.nextInt(50))));
        }
        System.out.println("================================================================================================================");
        System.out.println("================================================================================================================");
        System.out.println("================================================================================================================");

        System.out.println("Play most played TrackList ==="+playList.playMostFrequentlyPlayedSong());
    }

    private static List<String> buildPlayList() {
        List<String> bollywoodSongs = Arrays.asList(
                "Tum Hi Ho", "Kal Ho Naa Ho", "Chaiyya Chaiyya", "Jai Ho", "Tujh Mein Rab Dikhta Hai",
                "Tera Ban Jaunga", "Raabta", "Agar Tum Saath Ho", "Bekhayali", "Kabira",
                "Tum Se Hi", "Galliyan", "Tera Yaar Hoon Main", "Zehnaseeb", "Sun Saathiya",
                "Gerua", "Pee Loon", "Jeene Laga Hoon", "Kun Faya Kun", "Soch Na Sake",
                "Dil Diyan Gallan", "Humko Humise Chura Lo", "Tum Mile", "Dil Se Re", "Keh Do Ke Tum",
                "Apna Bana Le", "Bulleya", "Shayad", "Kesariya", "Tujhe Kitna Chahne Lage",
                "Raatan Lambiyan", "Thodi Jagah", "Mai Agar Kahoon", "Phir Le Aaya Dil", "Laung Da Lashkara",
                "Iktara", "Kya Mujhe Pyar Hai", "Zinda", "Aashiqui Aa Gayi", "Khairiyat",
                "Kaise Hua", "Channa Mereya", "Mast Magan", "Janam Janam", "Pee Loon",
                "Saudagar Sauda Kar", "Ae Dil Hai Mushkil", "Tere Bina", "Desi Girl", "Subhanallah"
        );
        playList = new PlayList(bollywoodSongs);
        return bollywoodSongs;
    }
}
