package fr.iut.iem.marvelcomics.data.manager;

import java.util.List;

import fr.iut.iem.marvelcomics.data.model.Comics;

/**
 * Created by louis on 05/12/2017.
 */

public class ApiManagerImpl implements ApiManager {

    List<Comics> comicsList;

    public ApiManagerImpl(List<Comics> comicsList) {
        this.comicsList = comicsList;
    }

    @Override
    public List<Comics> getComicsList() {
        return comicsList;
    }
}
