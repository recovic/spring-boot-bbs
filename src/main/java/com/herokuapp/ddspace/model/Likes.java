package com.herokuapp.ddspace.model;

public class Likes extends LikesKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.gmt_create
     *
     * @mbg.generated Sat Feb 22 12:36:24 CST 2020
     */
    private Long gmtCreate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.gmt_create
     *
     * @return the value of likes.gmt_create
     *
     * @mbg.generated Sat Feb 22 12:36:24 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.gmt_create
     *
     * @param gmtCreate the value for likes.gmt_create
     *
     * @mbg.generated Sat Feb 22 12:36:24 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}