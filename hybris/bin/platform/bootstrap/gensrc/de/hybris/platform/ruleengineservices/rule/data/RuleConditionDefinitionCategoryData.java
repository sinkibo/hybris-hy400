/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 8, 2018 2:42:47 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.ruleengineservices.rule.data;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.rule.data.ImageData;

public  class RuleConditionDefinitionCategoryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RuleConditionDefinitionCategoryData.id</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>RuleConditionDefinitionCategoryData.name</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>RuleConditionDefinitionCategoryData.priority</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Integer priority;

	/** <i>Generated property</i> for <code>RuleConditionDefinitionCategoryData.icon</code> property defined at extension <code>ruleengineservices</code>. */
		
	private ImageData icon;
	
	public RuleConditionDefinitionCategoryData()
	{
		// default constructor
	}
	
		
	
	public void setId(final String id)
	{
		this.id = id;
	}

		
	
	public String getId() 
	{
		return id;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setPriority(final Integer priority)
	{
		this.priority = priority;
	}

		
	
	public Integer getPriority() 
	{
		return priority;
	}
	
		
	
	public void setIcon(final ImageData icon)
	{
		this.icon = icon;
	}

		
	
	public ImageData getIcon() 
	{
		return icon;
	}
	


}
