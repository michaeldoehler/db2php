/*
 * Copyright (C) 2008 Andreas Schnaiter
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.afraid.poison.db2php.generator;

import org.afraid.poison.db2php.generator.databaselayer.DatabaseLayer;

/**
 *
 * @author Andreas Schnaiter <rc.poison@gmail.com>
 */
public class CodeGeneratorSettings {

	private DatabaseLayer databaseLayer=DatabaseLayer.PDO;
	private boolean generateChecks=false;
	private boolean trackFieldModifications=true;
	private String classNamePrefix=new String();
	private String classNameSuffix=new String();

	/**
	 * @return the databaseLayer
	 */
	public DatabaseLayer getDatabaseLayer() {
		return databaseLayer;
	}

	/**
	 * @param databaseLayer the databaseLayer to set
	 */
	public void setDatabaseLayer(DatabaseLayer databaseLayer) {
		this.databaseLayer=databaseLayer;
	}

	/**
	 * @return the generateChecks
	 */
	public boolean isGenerateChecks() {
		return generateChecks;
	}

	/**
	 * @param generateChecks the generateChecks to set
	 */
	public void setGenerateChecks(boolean generateChecks) {
		this.generateChecks=generateChecks;
	}

	/**
	 * @return the trackFieldModifications
	 */
	public boolean isTrackFieldModifications() {
		return trackFieldModifications;
	}

	/**
	 * @param trackFieldModifications the trackFieldModifications to set
	 */
	public void setTrackFieldModifications(boolean trackFieldModifications) {
		this.trackFieldModifications=trackFieldModifications;
	}

	/**
	 * @return the classNamePrefix
	 */
	public String getClassNamePrefix() {
		return classNamePrefix;
	}

	/**
	 * @param classNamePrefix the classNamePrefix to set
	 */
	public void setClassNamePrefix(String classNamePrefix) {
		this.classNamePrefix=classNamePrefix;
	}

	/**
	 * @return the classNameSuffix
	 */
	public String getClassNameSuffix() {
		return classNameSuffix;
	}

	/**
	 * @param classNameSuffix the classNameSuffix to set
	 */
	public void setClassNameSuffix(String classNameSuffix) {
		this.classNameSuffix=classNameSuffix;
	}
}