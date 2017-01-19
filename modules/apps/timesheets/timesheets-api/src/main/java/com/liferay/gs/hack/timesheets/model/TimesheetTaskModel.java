/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gs.hack.timesheets.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.gs.hack.timesheets.service.persistence.TimesheetTaskPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TimesheetTask service. Represents a row in the &quot;TS_TimesheetTask&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.gs.hack.timesheets.model.impl.TimesheetTaskModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.gs.hack.timesheets.model.impl.TimesheetTaskImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TimesheetTask
 * @see com.liferay.gs.hack.timesheets.model.impl.TimesheetTaskImpl
 * @see com.liferay.gs.hack.timesheets.model.impl.TimesheetTaskModelImpl
 * @generated
 */
@ProviderType
public interface TimesheetTaskModel extends BaseModel<TimesheetTask>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a timesheet task model instance should use the {@link TimesheetTask} interface instead.
	 */

	/**
	 * Returns the primary key of this timesheet task.
	 *
	 * @return the primary key of this timesheet task
	 */
	public TimesheetTaskPK getPrimaryKey();

	/**
	 * Sets the primary key of this timesheet task.
	 *
	 * @param primaryKey the primary key of this timesheet task
	 */
	public void setPrimaryKey(TimesheetTaskPK primaryKey);

	/**
	 * Returns the uuid of this timesheet task.
	 *
	 * @return the uuid of this timesheet task
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this timesheet task.
	 *
	 * @param uuid the uuid of this timesheet task
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the timesheet task ID of this timesheet task.
	 *
	 * @return the timesheet task ID of this timesheet task
	 */
	public long getTimesheetTaskId();

	/**
	 * Sets the timesheet task ID of this timesheet task.
	 *
	 * @param timesheetTaskId the timesheet task ID of this timesheet task
	 */
	public void setTimesheetTaskId(long timesheetTaskId);

	/**
	 * Returns the group ID of this timesheet task.
	 *
	 * @return the group ID of this timesheet task
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this timesheet task.
	 *
	 * @param groupId the group ID of this timesheet task
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the timesheet ID of this timesheet task.
	 *
	 * @return the timesheet ID of this timesheet task
	 */
	public long getTimesheetId();

	/**
	 * Sets the timesheet ID of this timesheet task.
	 *
	 * @param timesheetId the timesheet ID of this timesheet task
	 */
	public void setTimesheetId(long timesheetId);

	/**
	 * Returns the project task ID of this timesheet task.
	 *
	 * @return the project task ID of this timesheet task
	 */
	public long getProjectTaskId();

	/**
	 * Sets the project task ID of this timesheet task.
	 *
	 * @param projectTaskId the project task ID of this timesheet task
	 */
	public void setProjectTaskId(long projectTaskId);

	/**
	 * Returns the company ID of this timesheet task.
	 *
	 * @return the company ID of this timesheet task
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this timesheet task.
	 *
	 * @param companyId the company ID of this timesheet task
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this timesheet task.
	 *
	 * @return the user ID of this timesheet task
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this timesheet task.
	 *
	 * @param userId the user ID of this timesheet task
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this timesheet task.
	 *
	 * @return the user uuid of this timesheet task
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this timesheet task.
	 *
	 * @param userUuid the user uuid of this timesheet task
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this timesheet task.
	 *
	 * @return the user name of this timesheet task
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this timesheet task.
	 *
	 * @param userName the user name of this timesheet task
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this timesheet task.
	 *
	 * @return the create date of this timesheet task
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this timesheet task.
	 *
	 * @param createDate the create date of this timesheet task
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this timesheet task.
	 *
	 * @return the modified date of this timesheet task
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this timesheet task.
	 *
	 * @param modifiedDate the modified date of this timesheet task
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the billable of this timesheet task.
	 *
	 * @return the billable of this timesheet task
	 */
	public boolean getBillable();

	/**
	 * Returns <code>true</code> if this timesheet task is billable.
	 *
	 * @return <code>true</code> if this timesheet task is billable; <code>false</code> otherwise
	 */
	public boolean isBillable();

	/**
	 * Sets whether this timesheet task is billable.
	 *
	 * @param billable the billable of this timesheet task
	 */
	public void setBillable(boolean billable);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TimesheetTask timesheetTask);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TimesheetTask> toCacheModel();

	@Override
	public TimesheetTask toEscapedModel();

	@Override
	public TimesheetTask toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}