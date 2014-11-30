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
package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.Contract;
import com.esofthead.mycollab.module.crm.domain.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ContractMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int countByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int deleteByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int insert(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int insertSelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    List<Contract> selectByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    Contract selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int updateByPrimaryKeySelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    int updateByPrimaryKey(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    Integer insertAndReturnKey(Contract value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_contract
     *
     * @mbggenerated Sun Nov 30 15:08:33 ICT 2014
     */
    void massUpdateWithSession(@Param("record") Contract record, @Param("primaryKeys") List primaryKeys);
}