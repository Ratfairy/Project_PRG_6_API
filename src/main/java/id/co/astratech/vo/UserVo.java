package id.co.astratech.vo;

import id.co.astratech.model.UserModel;

public class UserVo
{
    private int id;
    private String nama;
    private String username;
    private String password;
    private String noHp;
    private String role;
    private String status;

    public UserVo() {
    }

    public UserVo(UserModel user) {
        this.username = user.getUsernameUser();
        this.password = user.getPasswordUser();
        this.nama = user.getNameUser();
        this.noHp = user.getNohpUser();
        this.role = user.getRoleUser();
        this.status = user.getStatusUser();
    }

    public UserVo(int id, String nama, String username, String password, String noHp, String role, String status) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.noHp = noHp;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
