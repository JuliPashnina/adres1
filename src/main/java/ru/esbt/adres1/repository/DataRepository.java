package ru.esbt.adres1.repository;

import java.util.List;
import java.util.Set;
import ru.esbt.adres1.domain.Naspunkt;

/**
 *
 * @author ДНС
 */
public interface DataRepository<V extends Naspunkt> {

    Set<String> getData();

}