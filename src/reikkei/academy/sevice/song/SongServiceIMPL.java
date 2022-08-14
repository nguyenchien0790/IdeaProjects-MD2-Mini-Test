package reikkei.academy.sevice.song;

import reikkei.academy.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongServiceIMPL implements ISongService{
    private static final List<Song> songList = new ArrayList<>();
    static {
        songList.add(new Song(1,"Con mua ngang qua",2,3));
        songList.add(new Song(2,"Co em day roi",5,20));
        songList.add(new Song(3,"Sau tat ca",100,99));


    }
    @Override
    public List<Song> findAll() {
        return null;
    }

    @Override
    public void save(Song e) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Song findById(int id) {
        return null;
    }

    @Override
    public void sort() {

    }
}
