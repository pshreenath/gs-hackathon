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

package com.liferay.gs.hack.reports.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Map;

/**
 * Provides the local service interface for ReportsService. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Abdullah Bushnaq
 * @see ReportsServiceLocalServiceUtil
 * @see com.liferay.gs.hack.reports.service.base.ReportsServiceLocalServiceBaseImpl
 * @see com.liferay.gs.hack.reports.service.impl.ReportsServiceLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ReportsServiceLocalService extends BaseLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReportsServiceLocalServiceUtil} to access the reports service local service. Add custom service methods to {@link com.liferay.gs.hack.reports.service.impl.ReportsServiceLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public java.lang.Double generateUserTaskTime(long userId, long projectTaskId)
		throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public Map<User, java.lang.Double> generateClientReport(
		long clientOrganizationId) throws PortalException;

	public Map<User, java.lang.Double> generateProjectReport(
		long projectOrganizationId) throws PortalException;

	public Map<User, java.lang.Double> generateTaskReport(long projectTaskId)
		throws PortalException;

	public Map<User, java.lang.Double> mergeReport(
		Map<User, java.lang.Double> totalReport,
		Map<User, java.lang.Double> report);
}