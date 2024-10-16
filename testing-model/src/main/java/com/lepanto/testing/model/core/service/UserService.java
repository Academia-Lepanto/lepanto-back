package com.lepanto.testing.model.core.service;


import com.lepanto.testing.api.core.service.IUserService;
import com.lepanto.testing.model.core.dao.UserDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Lazy
@Service("UserService")
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void loginQuery(Map<?, ?> key, List<?> attr) {
        // Comment to avoid issue
    }

    //Sample to permission
    //@Secured({ PermissionsProviderSecured.SECURED })
    public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList) {
        return this.daoHelper.query(userDao, keyMap, attrList);
    }

    public EntityResult userInsert(Map<?, ?> attrMap) {
        String passwordRaw = attrMap.get("user_password").toString();
        String passwordHashed = BCrypt.hashpw(passwordRaw, BCrypt.gensalt());
        ((Map<Object, Object>) attrMap).put(passwordRaw, passwordHashed);
        return this.daoHelper.insert(userDao, attrMap);
    }

    public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
        return this.daoHelper.update(userDao, attrMap, keyMap);
    }

    public EntityResult userDelete(Map<String, Object> keyMap) {
        return this.daoHelper.delete(this.userDao, keyMap);
    }

}
