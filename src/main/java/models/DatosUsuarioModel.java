package models;


import lombok.Data;

@Data
public class DatosUsuarioModel {

        public int id;
        public String username;
        public String firstName;
        public String lastName;
        public String email;
        public String password;
        public String phone;
        public int userStatus;

}
