package SetUp;

import io.cucumber.java.DataTableType;
import models.DatosUsuarioModel;

import java.util.Map;

public class Datatables {

    @DataTableType
    public DatosUsuarioModel infoUserEntry(Map<String, String> entry){
        DatosUsuarioModel obj = new DatosUsuarioModel();
        obj.setId(entry.get("id") == null ? "" : entry.get("id"));
        obj.setUsername(entry.get("userName") == null ? "" : entry.get("userName"));
        obj.setFirstName(entry.get("firstName") == null ? "" : entry.get("firstName"));
        obj.setLastName(entry.get("lastName") == null ? "" : entry.get("lastName"));
        obj.setEmail(entry.get("email") == null ? "" : entry.get("email"));
        obj.setPassword(entry.get("password") == null ? "" : entry.get("password"));
        obj.setPhone(entry.get("phone") == null ? "" : entry.get("phone"));
        obj.setUserStatus(entry.get("userStatus") == null ? "" : entry.get("userStatus"));
        return obj;
    }
}
