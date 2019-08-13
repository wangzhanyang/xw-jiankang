package com.xw.service.system;

import com.xw.system.SysUser;
import com.xw.system.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 根据条件分页查询用户列表
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectUserList",method = RequestMethod.POST)
    public List<SysUser> selectUserList(SysUser user){
        return sysUserMapper.selectUserList(user);
    }

    /**
     * 根据条件分页查询已分配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectAllocatedList",method = RequestMethod.POST)
    public List<SysUser> selectAllocatedList(SysUser user){
       return sysUserMapper.selectAllocatedList(user);
    }

    /**
     * 根据条件分页查询未分配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @RequestMapping(value = "/selectUnallocatedList",method = RequestMethod.POST)
    public List<SysUser> selectUnallocatedList(SysUser user){
        return sysUserMapper.selectUnallocatedList(user);
    }

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByLoginName",method = RequestMethod.POST)
    public SysUser selectUserByLoginName(String userName){
        return sysUserMapper.selectUserByLoginName(userName);
    }

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByPhoneNumber",method = RequestMethod.POST)
    public SysUser selectUserByPhoneNumber(String phoneNumber){
        return sysUserMapper.selectUserByPhoneNumber(phoneNumber);
    }

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserByEmail",method = RequestMethod.POST)
    public SysUser selectUserByEmail(String email){
        return sysUserMapper.selectUserByEmail(email);
    }

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    @RequestMapping(value = "/selectUserById",method = RequestMethod.POST)
    public SysUser selectUserById(Long userId){
        return sysUserMapper.selectUserById(userId);
    }

    /**
     * 通过用户ID删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    @RequestMapping(value = "/deleteUserById",method = RequestMethod.POST)
    public int deleteUserById(Long userId){
        return sysUserMapper.deleteUserById(userId);
    }

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/deleteUserByIds",method = RequestMethod.POST)
    public int deleteUserByIds(Long [] ids) throws Exception{
        return sysUserMapper.deleteUserByIds(ids);
    }

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int insertUser(SysUser user){
        return sysUserMapper.insertUser(user);
    }

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(SysUser user){
        return sysUserMapper.updateUser(user);
    }

    /**
     * 修改用户详细信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public int updateUserInfo(SysUser user){
        return sysUserMapper.updateUser(user);
    }


}
