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
package com.esofthead.mycollab.module.project.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.project.domain.ProjectRole;
import com.esofthead.mycollab.module.project.domain.ProjectRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProjectRoleMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int countByExample(ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int deleteByExample(ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int insert(ProjectRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int insertSelective(ProjectRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    List<ProjectRole> selectByExampleWithBLOBs(ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    List<ProjectRole> selectByExample(ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    ProjectRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByExampleSelective(@Param("record") ProjectRole record, @Param("example") ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectRole record, @Param("example") ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByExample(@Param("record") ProjectRole record, @Param("example") ProjectRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByPrimaryKeySelective(ProjectRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByPrimaryKeyWithBLOBs(ProjectRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    int updateByPrimaryKey(ProjectRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    Integer insertAndReturnKey(ProjectRole value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    void massUpdateWithSession(@Param("record") ProjectRole record, @Param("primaryKeys") List primaryKeys);
}