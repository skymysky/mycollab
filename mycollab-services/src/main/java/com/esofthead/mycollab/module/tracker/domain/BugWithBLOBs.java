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
package com.esofthead.mycollab.module.tracker.domain;

public class BugWithBLOBs extends Bug {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug.detail
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("detail")
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug.environment
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("environment")
    private String environment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug.description
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("description")
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug.detail
     *
     * @return the value of m_tracker_bug.detail
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug.detail
     *
     * @param detail the value for m_tracker_bug.detail
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug.environment
     *
     * @return the value of m_tracker_bug.environment
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug.environment
     *
     * @param environment the value for m_tracker_bug.environment
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug.description
     *
     * @return the value of m_tracker_bug.description
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug.description
     *
     * @param description the value for m_tracker_bug.description
     *
     * @mbggenerated Thu Apr 03 11:05:07 ICT 2014
     */
    public void setDescription(String description) {
        this.description = description;
    }
}