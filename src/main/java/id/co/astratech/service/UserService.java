package id.co.astratech.service;

import id.co.astratech.response.DtoResponse;
import id.co.astratech.vo.UserVo;

public interface UserService
{
    DtoResponse getAllUsers(String prodi);
    DtoResponse getUserById(String username);
    DtoResponse login(String username, String password);
    DtoResponse saveUser(UserVo user);
}
