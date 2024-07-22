package id.co.astratech.dao;

import id.co.astratech.vo.UserVo;

import java.util.List;

public interface UserDao
{
    List<UserVo> getAllUsers(String prodi);
    UserVo getUserById(String username);
    UserVo login(String username, String password);
}
