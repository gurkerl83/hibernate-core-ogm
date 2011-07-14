/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.cache.ehcache.regions;

import java.util.Properties;

import net.sf.ehcache.Ehcache;

import org.hibernate.cache.ehcache.strategy.EhcacheAccessStrategyFactory;
import org.hibernate.cache.spi.QueryResultsRegion;

/**
 * A query results region specific wrapper around an Ehcache instance.
 *
 * @author Chris Dennis
 * @author Alex Snaps
 */
public class EhcacheQueryResultsRegion extends EhcacheGeneralDataRegion implements QueryResultsRegion {

	/**
	 * Constructs an EhcacheQueryResultsRegion around the given underlying cache.
	 *
	 * @param accessStrategyFactory
	 */
	public EhcacheQueryResultsRegion(EhcacheAccessStrategyFactory accessStrategyFactory, Ehcache underlyingCache, Properties properties) {
		super( accessStrategyFactory, underlyingCache, properties );
	}

}