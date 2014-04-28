/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_user_tracking*/
package com.esofthead.mycollab.module.user.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@com.esofthead.mycollab.core.db.metadata.Table("s_user_tracking")
public class UserTracking extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_tracking.id
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_tracking.username
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("username")
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_tracking.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_tracking.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_tracking.userAgent
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("userAgent")
    private String useragent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_tracking.id
     *
     * @return the value of s_user_tracking.id
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_tracking.id
     *
     * @param id the value for s_user_tracking.id
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_tracking.username
     *
     * @return the value of s_user_tracking.username
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_tracking.username
     *
     * @param username the value for s_user_tracking.username
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_tracking.createdTime
     *
     * @return the value of s_user_tracking.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_tracking.createdTime
     *
     * @param createdtime the value for s_user_tracking.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_tracking.sAccountId
     *
     * @return the value of s_user_tracking.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_tracking.sAccountId
     *
     * @param saccountid the value for s_user_tracking.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_tracking.userAgent
     *
     * @return the value of s_user_tracking.userAgent
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_tracking.userAgent
     *
     * @param useragent the value for s_user_tracking.userAgent
     *
     * @mbggenerated Thu Apr 03 11:05:04 ICT 2014
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }
}