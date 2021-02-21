package com.zty.xiaomiadmin.server.Service.User;

import com.zty.xiaomiadmin.server.Vo.User.UserResult;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public interface UserService {
    SqlSession getSqlSession() throws IOException;
    UserResult getUsers() throws IOException;
}
