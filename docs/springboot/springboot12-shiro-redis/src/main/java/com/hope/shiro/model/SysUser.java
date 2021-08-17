package com.hope.shiro.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**用户数据对象类
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-16 10:58
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUser  implements Serializable{

    private static final long serialVersionUID = -5672714506813731474L;

    /**装逼的id**/
    private String userUuid;
    /**用户名**/
    private String username;
    /**密码**/
    private String password;
    /**盐**/
    private String salt;
    /**邮箱**/
    private String email;
    /**联系方式**/
    private String phone;
    /**性别：1男2女3未知**/
    private Integer sex;
    /**年龄**/
    private Integer age;
    /**用户状态：1有效2删除**/
    private Integer status;
    /**最后登陆时间**/
    private Date lastLoginTime;

    /**
     *
     * 重写获取盐值方法，自定义realm使用
     * Gets credentials salt.
     *
     * @return the credentials salt
     */
    public String getCredentialsSalt() {
        return username + "nbclass.com" + salt;
    }
}