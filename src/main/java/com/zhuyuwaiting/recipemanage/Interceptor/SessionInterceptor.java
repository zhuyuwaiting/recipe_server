package com.zhuyuwaiting.recipemanage.Interceptor;

import com.alibaba.fastjson.JSON;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.model.UserInfo;
import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfoVO userInfo = (UserInfoVO) request.getSession().getAttribute("user");
        if(userInfo==null){
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter writer = response.getWriter();
            Map<String, String> map = new HashMap<>();
            map.put("success", "false");
            map.put("code", CommonResultEnum.NO_SESSION.getCode());
            map.put("code", CommonResultEnum.NO_SESSION.getDesc());
            response.setStatus(401);
            writer.write(JSON.toJSONString(map));
            return false;
        }
        return true;
    }
}
