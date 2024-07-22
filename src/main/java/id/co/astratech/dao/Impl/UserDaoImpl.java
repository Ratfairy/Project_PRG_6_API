package id.co.astratech.dao.Impl;

import id.co.astratech.dao.UserDao;
import id.co.astratech.model.UserModel;
import id.co.astratech.repository.LoginRepository;
import id.co.astratech.repository.UserRepository;
import id.co.astratech.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<UserVo> getAllUsers(String role) {
        if (!role.equals("admin") && !role.equals("user")) {
            throw new IllegalArgumentException("Role must be either 'admin' or 'user'");
        }

        Iterable<UserModel> users = userRepository.findAll();
        List<UserVo> userVos = new ArrayList<>();
        for (UserModel user: users) {
            if (user.getRoleUser().equals(role)) {
                UserVo userVo = new UserVo(user);
                userVos.add(userVo);
            }
        }
        return userVos;
    }

    @Override
    public UserVo getUserById(String username) {
        try {
            UserModel user = userRepository.findById(username).orElseThrow();
            if (user != null) {
                UserVo userVo = new UserVo(user);
                return userVo;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public UserVo login(String username, String password) {
        UserModel user = loginRepository.findBylogin(username, password);
        if (user != null) {
            return new UserVo(user);  // Kembalikan UserVo
        }
        return null;  // Kembalikan null jika tidak ditemukan
    }
}
