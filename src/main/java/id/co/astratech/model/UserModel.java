package id.co.astratech.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "oto_msuser")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private int idUser;

    @Column(name = "usr_nama")
    private String nameUser;

    @Column(name = "usr_username")
    private String usernameUser;

    @Column(name = "usr_password")
    private String passwordUser;

    @Column(name = "usr_noHp")
    private String nohpUser;

    @Column(name = "usr_role")
    private String roleUser;

    @Column(name = "usr_status")
    private String statusUser;


    public UserModel() {
    }


    public UserModel(int idUser, String nameUser, String usernameUser, String passwordUser, String nohpUser, String roleUser, String statusUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.usernameUser = usernameUser;
        this.passwordUser = passwordUser;
        this.nohpUser = nohpUser;
        this.roleUser = roleUser;
        this.statusUser = statusUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getNohpUser() {
        return nohpUser;
    }

    public void setNohpUser(String nohpUser) {
        this.nohpUser = nohpUser;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }
}
