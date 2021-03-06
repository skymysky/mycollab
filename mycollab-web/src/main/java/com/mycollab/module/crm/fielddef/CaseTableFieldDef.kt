/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.crm.fielddef

import com.mycollab.common.TableViewField
import com.mycollab.common.i18n.GenericI18Enum
import com.mycollab.module.crm.i18n.CaseI18nEnum
import com.mycollab.vaadin.web.ui.WebUIConstants

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
object CaseTableFieldDef {
    @JvmField
    val selected = TableViewField(null, "selected", WebUIConstants.TABLE_CONTROL_WIDTH)

    @JvmField
    val action = TableViewField(null, "id", -1)

    @JvmField
    val priority = TableViewField(CaseI18nEnum.FORM_PRIORITY, "priority", WebUIConstants.TABLE_S_LABEL_WIDTH)

    @JvmField
    val status = TableViewField(GenericI18Enum.FORM_STATUS, "status", WebUIConstants.TABLE_M_LABEL_WIDTH)

    @JvmField
    val account = TableViewField(CaseI18nEnum.FORM_ACCOUNT, "accountName", WebUIConstants.TABLE_X_LABEL_WIDTH)

    @JvmField
    val origin = TableViewField(CaseI18nEnum.FORM_ORIGIN, "origin", WebUIConstants.TABLE_M_LABEL_WIDTH)

    @JvmField
    val phone = TableViewField(GenericI18Enum.FORM_PHONE, "phonenumber", WebUIConstants.TABLE_M_LABEL_WIDTH)

    @JvmField
    val type = TableViewField(GenericI18Enum.FORM_TYPE, "type", WebUIConstants.TABLE_M_LABEL_WIDTH)

    @JvmField
    val reason = TableViewField(CaseI18nEnum.FORM_REASON, "reason", WebUIConstants.TABLE_EX_LABEL_WIDTH)

    @JvmField
    val subject = TableViewField(CaseI18nEnum.FORM_SUBJECT, "subject", WebUIConstants.TABLE_EX_LABEL_WIDTH)

    @JvmField
    val email = TableViewField(GenericI18Enum.FORM_EMAIL, "email", WebUIConstants.TABLE_EMAIL_WIDTH)

    @JvmField
    val assignUser = TableViewField(GenericI18Enum.FORM_ASSIGNEE, "assignUserFullName", WebUIConstants.TABLE_X_LABEL_WIDTH)

    @JvmField
    val createdTime = TableViewField(GenericI18Enum.FORM_CREATED_TIME, "createdtime", WebUIConstants.TABLE_DATE_TIME_WIDTH)

    @JvmField
    val lastUpdatedTime = TableViewField(GenericI18Enum.FORM_LAST_UPDATED_TIME, "lastupdatedtime", WebUIConstants.TABLE_DATE_TIME_WIDTH)
}