package id.co.astratech.constant;

public class UserConstant {

    public static final String mLoginSuccess = "Berhasil Login";
    public static final String mLoginFailed = "Login Salah, Akun Tidak Ditemukan";
    public static final String mCreateSuccess = "User Created Successfully";

    public static final String mEmptyData = "No data available";
    public static final String mCreateFailed = "Failed to Create User";
    public static final String qGetLogin = "SELECT * FROM oto_msuser WHERE usr_username = :username AND usr_password = :password";
}
