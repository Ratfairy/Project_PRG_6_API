package id.co.astratech.service.Impl;

import id.co.astratech.dao.UserDao;
import id.co.astratech.model.UserModel;
import id.co.astratech.repository.UserRepository;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.UserService;
import id.co.astratech.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.astratech.constant.UserConstant.*;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoResponse getAllUsers(String role) {
        if (userDao.getAllUsers(role) != null) {
            return new DtoResponse(200, userDao.getAllUsers(role));
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse getUserById(String username) {
        if (userDao.getUserById(username) != null) {
            return new DtoResponse(200, userDao.getUserById(username));
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse login(String username, String password) {
        UserVo user = userDao.login(username, password);  // Mendapatkan UserVo
        if (user != null) {
            return new DtoResponse(200, user, "Login Sukses");  // Kembalikan DtoResponse dengan UserVo
        } else {
            return new DtoResponse(404, null, "Data User tidak ditemukan");
        }
    }



    @Override
    public DtoResponse saveUser(UserVo user) {
        try {
            UserModel newUser = new UserModel();
            newUser.setNameUser(user.getNama());
            newUser.setUsernameUser(user.getUsername());
            newUser.setPasswordUser(user.getPassword());
            newUser.setNohpUser(user.getNoHp());
            newUser.setStatusUser("Aktif");
            newUser.setRoleUser("Customer");

            userRepository.save(newUser);
            return new DtoResponse(201, user, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(400, user, mCreateFailed);
        }
    }
}
