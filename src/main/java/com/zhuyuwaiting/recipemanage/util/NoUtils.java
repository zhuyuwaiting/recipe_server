package com.zhuyuwaiting.recipemanage.util;

import com.zhuyuwaiting.recipemanage.enums.SceneNoEnum;

public class NoUtils  {

    /**
     * no 生成
     * 13位毫秒数 + 2位业务标志 + 4位随机数 + 3位 000 填充字段 =22位
     * @param scene
     * @return
     */
    public static String genNO(SceneNoEnum scene){
        return System.currentTimeMillis() + scene.getNum() + (int)((Math.random()*9+1)*10000) +"000";
    }

}
