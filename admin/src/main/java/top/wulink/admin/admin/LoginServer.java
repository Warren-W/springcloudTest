package top.wulink.admin.admin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.wulink.common.admin.api.LoginClient;
import top.wulink.common.admin.bo.LoginBo;
import top.wulink.common.admin.vo.LoginVo;


@RestController
public class LoginServer implements LoginClient{

    @Override
    public LoginVo loginDo(@RequestBody LoginBo bo) {
        LoginVo vo = new LoginVo();
        vo.setId(1);
        vo.setUserName(bo.getUserName());
        return vo;
    }
}
