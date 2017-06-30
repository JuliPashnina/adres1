package ru.esbt.adres1.repository;

/**
 *
 * @author ДНС
 */
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jboss.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import ru.esbt.adres1.domain.Naspunkt;

/**
 *
 * @author Y.Pashnina
 */
@org.springframework.stereotype.Repository("dataRespitory")
public class DataRepositoryImpl implements DataRepository<Naspunkt> {

    private static final Logger LOG = Logger.getLogger(DataRepositoryImpl.class);
    
    @Autowired
    protected JdbcOperations jdbcOperations;

    

    @Override
    public Set<String> getData() {
        
        //List<Naspunkt> list = new ArrayList<Naspunkt>();
        Set<String> result = new HashSet<>();
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT cm_socr||' '||cm_ctext data_description FROM cm_naspunkt");//concat(cm_socr,' ',cm_ctext)
        //SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT cm_okato FROM cm_naspunkt ;");
        while (rowSet.next()) {
            //LOG.info(rowSet.getString("data_description"));
            result.add(rowSet.getString("data_description"));
           /* Naspunkt np = new Naspunkt();
            np.setId(rowSet.getInt("CM_OKATO"));
            list.add(np);*/
                    
        }
        return result;
    }

    

}