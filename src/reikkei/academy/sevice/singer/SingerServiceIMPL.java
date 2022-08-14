package reikkei.academy.sevice.singer;

import reikkei.academy.model.Singer;
import reikkei.academy.sevice.singer.ISingerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    private static final List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "Son Tung MTP",25 ));
        singerList.add(new Singer(2, "Suny Ha Linh",28 ));
        singerList.add(new Singer(3, "Nguyen Chien",18 ));
    }


    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer e) {
        singerList.add(e);
    }

    @Override
    public void deleteById(int id) {
        singerList.remove(id);

    }

    @Override
    public Singer findById(int id) {
        return singerList.get(id);
    }

    public void sort() {
        Collections.sort(singerList);

    }



}
