package ru.esbt.adres1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.esbt.adres1.domain.Naspunkt;
/**
 *
 * @author ДНС
 */
public class NaspunktRepository {

interface DemoRepository extends JpaRepository<Naspunkt, Long> {
}
}
