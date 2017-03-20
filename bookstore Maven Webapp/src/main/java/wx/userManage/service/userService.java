package wx.userManage.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wx.userManage.entity.user;

@Service("userService")  
public class userService implements IuserService {  
   @Resource  
   private wx.userManage.dao.userDao userDao;  
   @Override  
   public user getUserById(int userId) {  
       // TODO Auto-generated method stub  
       return this.userDao.selectByPrimaryKey(userId);  
   }  
 
}  
