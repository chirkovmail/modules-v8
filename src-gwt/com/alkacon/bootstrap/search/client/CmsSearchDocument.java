/*
 * File   : $Source$
 * Date   : $Date$
 * Version: $Revision$
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.alkacon.bootstrap.search.client;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * A bean that holds the search results to the client.<p>
 */
public class CmsSearchDocument implements IsSerializable {

    /** The content locales. */
    private List<String> m_contentLocales;

    /** The doc type. */
    private List<String> m_docTypes;

    /** The excerpt. */
    private String m_excerpt;

    /** The structure id. */
    private String m_id;

    /** The modification date. */
    private String m_lastModification;

    /** The mod date as long. */
    private long m_lastModificationAsLong;

    /** The link. */
    private String m_link;

    /** The path. */
    private String m_path;

    /** The size. */
    private String m_size;

    /** The suffix. */
    private String m_suffix;

    /** The title. */
    private String m_title;

    /** The type. */
    private String m_type;

    /** The version. */
    private String m_version;

    /**
     * Returns the contentLocales.<p>
     *
     * @return the contentLocales
     */
    public List<String> getContentLocales() {

        return m_contentLocales;
    }

    /**
     * Returns the docType.<p>
     *
     * @return the docType
     */
    public List<String> getDocTypes() {

        return m_docTypes;
    }

    /**
     * Returns the excerpt.<p>
     *
     * @return the excerpt
     */
    public String getExcerpt() {

        return m_excerpt;
    }

    /**
     * Returns the id.<p>
     *
     * @return the id
     */
    public String getId() {

        return m_id;
    }

    /**
     * Returns the lastModification.<p>
     *
     * @return the lastModification
     */
    public String getLastModification() {

        return m_lastModification;
    }

    /**
     * Returns the lastModificationAsLong.<p>
     *
     * @return the lastModificationAsLong
     */
    public long getLastModificationAsLong() {

        return m_lastModificationAsLong;
    }

    /**
     * Returns the link.<p>
     *
     * @return the link
     */
    public String getLink() {

        return m_link;
    }

    /**
     * Returns the path.<p>
     *
     * @return the path
     */
    public String getPath() {

        return m_path;
    }

    /**
     * Returns the size.<p>
     *
     * @return the size
     */
    public String getSize() {

        return m_size;
    }

    /**
     * Returns the suffix.<p>
     *
     * @return the suffix
     */
    public String getSuffix() {

        return m_suffix;
    }

    /**
     * Returns the title.<p>
     *
     * @return the title
     */
    public String getTitle() {

        return m_title;
    }

    /**
     * Returns the type.<p>
     *
     * @return the type
     */
    public String getType() {

        return m_type;
    }

    /**
     * Returns the version.<p>
     *
     * @return the version
     */
    public String getVersion() {

        return m_version;
    }

    /**
     * Sets the content locales.<p>
     * 
     * @param locales the locales to set
     */
    public void setContentLocales(List<String> locales) {

        m_contentLocales = locales;
    }

    /**
     * Sets the docType.<p>
     *
     * @param docTypes the docType to set
     */
    public void setDocTypes(List<String> docTypes) {

        m_docTypes = docTypes;
    }

    /**
     * Sets the excerpt.<p>
     *
     * @param excerpt the excerpt to set
     */
    public void setExcerpt(String excerpt) {

        m_excerpt = excerpt;
    }

    /**
     * Sets the id.<p>
     *
     * @param id the id to set
     */
    public void setId(String id) {

        m_id = id;
    }

    /**
     * Sets the lastModification.<p>
     *
     * @param lastModification the lastModification to set
     */
    public void setLastModification(String lastModification) {

        m_lastModification = lastModification;
    }

    /**
     * Sets the lastModificationAsLong.<p>
     *
     * @param lastModificationAsLong the lastModificationAsLong to set
     */
    public void setLastModificationAsLong(long lastModificationAsLong) {

        m_lastModificationAsLong = lastModificationAsLong;
    }

    /**
     * Sets the link.<p>
     * 
     * @param link the link to set
     */
    public void setLink(String link) {

        m_link = link;

    }

    /**
     * Sets the path.<p>
     *
     * @param path the path to set
     */
    public void setPath(String path) {

        m_path = path;
    }

    /**
     * Sets the size.<p>
     * 
     * @param size
     */
    public void setSize(String size) {

        m_size = size;

    }

    /**
     * Sets the suffix.<p>
     * 
     * @param suffix the suffix
     */
    public void setSuffix(String suffix) {

        m_suffix = suffix;
    }

    /**
     * Sets the title.<p>
     *
     * @param title the title to set
     */
    public void setTitle(String title) {

        m_title = title;
    }

    /**
     * Sets the type.<p>
     *
     * @param type the type to set
     */
    public void setType(String type) {

        m_type = type;
    }

    /**
     * Sets the version.<p>
     *
     * @param version the version to set
     */
    public void setVersion(String version) {

        m_version = version;
    }

}
