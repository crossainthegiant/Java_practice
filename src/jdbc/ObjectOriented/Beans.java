package jdbc.ObjectOriented;

/*
 * @Author: qph
 * @Date: 2019/10/16 17:59
 * @description: 对于数据库里数据的封装
 */
public class Beans {
    public int userid;
    private String userName;
    private String passWord;
    private int departmentId;
    private int Tel;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }
}
