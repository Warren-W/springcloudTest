package top.wulink.common.admin.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import top.wulink.common.admin.bo.LoginBo;
import top.wulink.common.admin.vo.LoginVo;

@FeignClient("admin-server")
public interface LoginClient {
    @RequestMapping("login")
    LoginVo loginDo(LoginBo bo);
}
