package template;

import javax.security.auth.callback.Callback;
import java.sql.PreparedStatement;

/**
 * @author xxbb
 */
public interface DaoCallback extends Callback {
    default Object doQuery(PreparedStatement preparedStatement){
        return null;
    }

    default Object doUpdate(PreparedStatement preparedStatement){
        return null;
    }

    default boolean isUpdate(){
        return false;
    }

}
