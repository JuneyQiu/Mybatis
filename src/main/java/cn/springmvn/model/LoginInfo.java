package cn.springmvn.model;

public class LoginInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.id
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.username
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.password
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.id
     *
     * @return the value of logininfo.id
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.id
     *
     * @param id the value for logininfo.id
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.username
     *
     * @return the value of logininfo.username
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.username
     *
     * @param username the value for logininfo.username
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.password
     *
     * @return the value of logininfo.password
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.password
     *
     * @param password the value for logininfo.password
     *
     * @mbggenerated Sun Jun 11 13:21:12 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }
}