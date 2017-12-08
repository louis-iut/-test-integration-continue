package fr.iut.iem.marvelcomics.data.manager;

import java.util.List;

import fr.iut.iem.marvelcomics.data.model.Comics;

/**
 * Created by louis on 05/12/2017.
 */

public interface ApiManager {

    List<Comics> getComicsList();

}
