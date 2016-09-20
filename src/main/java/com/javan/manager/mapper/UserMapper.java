package com.javan.manager.mapper;

import com.javan.manager.entity.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	/**
	 * �����û�idɾ���û���Ϣ
	 * @param userid
	 * @return
	 * @throws Exception
	 */
    @Delete({"delete from EAUSER where USERID = #{userid}"})
    public int deleteUserByUserid(String userid) throws Exception;

    /**
     * �����Ñ�
     * @param user
     * @return
     * @throws Exception
     */
    @Insert({"insert into EAUSER values (#{userid},#{username},#{password},#{account}, #{sex}, "
    		+ "#{deptid}, #{locked},#{remark}, #{usertype}, #{enabled}, #{mobile}, "
    		+ "#{email}, #{address}, #{personid}, #{cardid}, #{logincount}, "
    		+ "#{logintime}, #{bustype}, #{certtype}, #{certcode}, #{telephone})"})
    public int insertUser(User user) throws Exception;
    /**
     * ����id��ѯ�û���Ϣ
     * @param userid
     * @return user
     * @throws Exception
     */
    @Select({"select * from EAUSER where USERID = #{userid}"})
    @ResultMap("userMap")
    public User selectUserByUserid(String userid) throws Exception;
	/**
	 * �޸��Ñ�
	 * @param user
	 * @return
	 * @throws Exception
	 */
    @Update({
        "update EAUSER",
        "set USERNAME = #{username},",
          "ACCOUNT = #{account},",
          "PASSWORD = #{password},",
          "SEX = #{sex},",
          "DEPTID = #{deptid},",
          "LOCKED = #{locked},",
          "REMARK = #{remark},",
          "USERTYPE = #{usertype},",
          "ENABLED = #{enabled},",
          "MOBILE = #{mobile},",
          "EMAIL = #{email},",
          "ADDRESS = #{address},",
          "PERSONID = #{personid},",
          "CARDID = #{cardid},",
          "LOGINCOUNT = #{logincount},",
          "LOGINTIME = #{logintime},",
          "BUSTYPE = #{bustype},",
          "CERTTYPE = #{certtype},",
          "CERTCODE = #{certcode},",
          "TELEPHONE = #{telephone}",
        "where USERID = #{userid}"
    })
    public int updateUserByUserid(User user) throws Exception;
    
    
    /**
     * ��ѯ���е��û���Ϣ
     * @return
     * @throws Exception
     */
    @Select(" select * from EAUSER")
    @ResultMap("userMap")
    public List<User> selectAllUser() throws Exception;
    
    
    /**
     * ��������
     * @param user
     * @return
     * @throws Exception
     */
   public int batchInsertUser(@Param("users")List<User> user) throws Exception;
   
   /**
    * ����ɾ��
    * @param list
    * @return
    * @throws Exception
    */
   public int batchDeleteUser(@Param("list")List<String> list) throws Exception;
   
   
   /**
    * ��ҳ��ѯ����
    * @param parma
    * @return
    * @throws Exception
    */
   public List<User> pagerUser(Map<String, Object> parmas) throws Exception;
   
   /**
    * 
    * ��ҳͳ������
    * @param parma
    * @return
    * @throws Exception
    */
    public int countUser(Map<String, Object> parmas) throws Exception;
}