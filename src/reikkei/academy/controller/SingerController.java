package reikkei.academy.controller;

import reikkei.academy.model.Singer;
import reikkei.academy.sevice.singer.ISingerService;
import reikkei.academy.sevice.singer.SingerServiceIMPL;

import java.util.List;

public class SingerController {
    private final ISingerService singerService = new SingerServiceIMPL();
    public List<Singer> getSingers() {
        return singerService.findAll();
    }
    public void addSinger(Singer singer) {
        singerService.save(singer);
    }
    public void deleteSinger(int id) {
        singerService.deleteById(id);
    }
    public Singer findSingerById(int id) {
        return singerService.findById(id);
    }
    public void sortSingerList() {
        singerService.sort();
    }

}
