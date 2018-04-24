package top.wulink.web.action;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.wulink.web.bo.GreatingBo;
import top.wulink.common.admin.api.LoginClient;
import top.wulink.common.admin.bo.LoginBo;
import top.wulink.common.admin.vo.LoginVo;
import top.wulink.web.vo.GreetingVo;


@RestController
public class HelloWord {


    @Autowired
    LoginClient loginClient;

    @RequestMapping("greeting")
    public GreetingVo sayHello(GreatingBo bo){
        GreetingVo vo=new GreetingVo();
        if(!StringUtils.isNotBlank(bo.getWords())){
            vo.setContent("Hello words");
        }else{
            vo.setContent("Hello "+bo.getWords());
        }
        return  vo;
    }

    @RequestMapping("loginDo")
    public LoginVo loginDo(LoginBo bo){
        LoginVo vo= loginClient.loginDo(bo);
        return vo;
    }
}
