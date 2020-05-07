package com.lzf.controller;

import com.lzf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * @Author: Saber污妖王
 * TODO: 转账 Controller
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.controller
 * @Version: 0.0.1
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    //如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；
    //如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配；
    @Resource
    private AccountService accountService;

    @RequestMapping("/transfer")
    public ModelAndView transfer(@RequestParam("outAccount") String outAccount,
                                 @RequestParam("inAccount") String inAccount,
                                 @RequestParam("money") Double money){
        //get请求转码，post请求已经经过编码过滤器过滤了，一定不要在转码了！！
//        try {
//            outAccount = new String(outAccount.getBytes("ISO8859-1"), "UTF-8");
//            inAccount = new String(inAccount.getBytes("ISO8859-1"), "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        //调用业务类 执行转账操作
        accountService.transfer(outAccount, inAccount, money);
        String str = "outAccount="+outAccount+",inAccount="+inAccount+",money="+money;
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("msg","转账成功!"+str);
        return mv;
    }
}
