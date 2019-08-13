package com.xw.client.system;

import com.xw.config.DmConfiguration;
import com.xw.fallback.system.SysUserClientFallBack;
import com.xw.system.SysUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "xw-permissinos-provider", configuration = DmConfiguration.class, fallback = SysUserClientFallBack.class)
public interface SysUserClient {

    /**
     * 根据条件分页查询用户列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectUserList",method = RequestMethod.POST)
    public List<SysUser> selectUserList(SysUser user);

    /**
     * 根据条件分页查询已分配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectAllocatedList",method = RequestMethod.POST)
    public List<SysUser> selectAllocatedList(SysUser user);

    /**
     * 根据条件分页查询未分配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectUnallocatedList",method = RequestMethod.POST)
    public List<SysUser> selectUnallocatedList(SysUser user);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByLoginName",method = RequestMethod.POST)
    public SysUser selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByPhoneNumber",method = RequestMethod.POST)
    public SysUser selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByEmail",method = RequestMethod.POST)
    public SysUser selectUserByEmail(String email);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserById",method = RequestMethod.POST)
    public SysUser selectUserById(Long userId);

    /**
     * 通过用户ID删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    @RequestMapping(value = "/deleteUserById",method = RequestMethod.POST)
    public int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/deleteUserByIds",method = RequestMethod.POST)
    public int deleteUserByIds(String ids) throws Exception;

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int insertUser(SysUser user);

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(SysUser user);

    /**
     * 修改用户详细信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public int updateUserInfo(SysUser user);
}
