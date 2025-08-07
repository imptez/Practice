package Job;

import java.util.*;

public class PlayList {
    List<String> songNameList;
    HashMap<String, Integer> favoriteSong ;

    public PlayList(List<String> songNameList) {
        this.songNameList = songNameList;
        this.favoriteSong= new HashMap<>();
    }

    public String playRandom(){
        Random random= new Random();
        String song=songNameList.get(random.nextInt(songNameList.size()-1));
        addToFavorite(song);
        return song;
    }

    private void addToFavorite(String song) {
        if(favoriteSong.containsKey(song)){
            favoriteSong.put(song,favoriteSong.get(song)+1);
        }else{
            favoriteSong.put(song,1);
        }
    }

    public String playSongIfAvailable(String song){
        Optional<String> optionalSong= songNameList.stream()
                .filter(s -> s.equalsIgnoreCase(song))
                .findFirst();
        optionalSong.ifPresent(this::addToFavorite);
        return optionalSong.orElse(null);
    }

    public List<String> playMostFrequentlyPlayedSong(){
        List<String> favSongList = new ArrayList<>(favoriteSong.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .toList());
        if(favSongList.isEmpty()){
            return songNameList.stream().limit(10).toList();
        }
        if(favSongList.size()<10){
            favSongList.addAll(songNameList.stream().limit(10-favSongList.size()).toList());
        }
        return favSongList;
    }
}
