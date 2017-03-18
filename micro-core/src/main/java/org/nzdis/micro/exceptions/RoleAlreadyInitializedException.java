/*******************************************************************************
 *  - Micro-Agent Platform, core of the Otago Agent Platform (OPAL),
 * developed at the Information Science Department, 
 * University of Otago, Dunedin, New Zealand.
 * 
 * This file is part of the aforementioned software.
 * 
 *  is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 *  is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with the Micro-Agents Framework.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.nzdis.micro.exceptions;

import org.nzdis.micro.Agent;
import org.nzdis.micro.Role;

public class RoleAlreadyInitializedException extends RuntimeException {

	public final String message; 
	
	public RoleAlreadyInitializedException(Role role, Agent owner, Agent initializer){
		message = new StringBuffer("This role instance (").append(role.getRoleName())
			.append(" has already been initialized on another agent (").append(owner.getAgentName())
			.append("), but agent ").append(initializer.getAgentName())
			.append(" tried to initialize it as well!").toString();
	}
	
	@Override
	public String toString(){
		return message;
	}
}
