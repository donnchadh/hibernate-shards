/**
 * Copyright (C) 2007 Google Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

package org.hibernate.shards.defaultmock;

import java.io.Serializable;
import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.EntityMode;
import org.hibernate.Filter;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.ReplicationMode;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.jdbc.Work;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.type.Type;

/**
 * @author maxr@google.com (Max Ross)
 */
public class SessionDefaultMock implements Session {

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Object saveOrUpdateCopy(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Object saveOrUpdateCopy(final Object object, final Serializable id)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Object saveOrUpdateCopy(final String entityName, final Object object)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Object saveOrUpdateCopy(final String entityName, final Object object,
            final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public List find(final String query) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public List find(final String query, final Object value, final Type type)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public List find(final String query, final Object[] values, final Type[] types)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Iterator iterate(final String query) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Iterator iterate(final String query, final Object value, final Type type)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Iterator iterate(final String query, final Object[] values, final Type[] types)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Collection filter(final Object collection, final String filter)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Collection filter(final Object collection, final String filter, final Object value,
            final Type type) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Collection filter(final Object collection, final String filter, final Object[] values,
            final Type[] types) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public int delete(final String query) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public int delete(final String query, final Object value, final Type type)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public int delete(final String query, final Object[] values, final Type[] types)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Query createSQLQuery(final String sql, final String returnAlias, final Class returnClass) {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Query createSQLQuery(final String sql, final String[] returnAliases,
            final Class[] returnClasses) {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public void save(final Object object, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public void save(final String entityName, final Object object, final Serializable id)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public void update(final Object object, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public void update(final String entityName, final Object object, final Serializable id)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public EntityMode getEntityMode() {

        throw new UnsupportedOperationException();
    }

    @Override
    public org.hibernate.Session getSession(final EntityMode entityMode) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void flush() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void setFlushMode(final FlushMode flushMode) {

        throw new UnsupportedOperationException();
    }

    @Override
    public FlushMode getFlushMode() {

        throw new UnsupportedOperationException();
    }

    @Override
    public void setCacheMode(final CacheMode cacheMode) {

        throw new UnsupportedOperationException();
    }

    @Override
    public CacheMode getCacheMode() {

        throw new UnsupportedOperationException();
    }

    @Override
    public SessionFactory getSessionFactory() {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public Connection connection() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Connection close() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void cancelQuery() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isOpen() {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isConnected() {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDirty() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Serializable getIdentifier(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(final Object object) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void evict(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object load(final Class theClass, final Serializable id, final LockMode lockMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object load(final String entityName, final Serializable id, final LockMode lockMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object load(final Class theClass, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object load(final String entityName, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void load(final Object object, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void replicate(final Object object, final ReplicationMode replicationMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void replicate(final String entityName, final Object object,
            final ReplicationMode replicationMode) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Serializable save(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Serializable save(final String entityName, final Object object)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void saveOrUpdate(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void saveOrUpdate(final String entityName, final Object object)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void update(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void update(final String entityName, final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object merge(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object merge(final String entityName, final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void persist(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void persist(final String entityName, final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(final String entityName, final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void lock(final Object object, final LockMode lockMode) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void lock(final String entityName, final Object object, final LockMode lockMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void refresh(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void refresh(final Object object, final LockMode lockMode) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public LockMode getCurrentLockMode(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Transaction beginTransaction() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Transaction getTransaction() {

        throw new UnsupportedOperationException();
    }

    @Override
    public Criteria createCriteria(final Class persistentClass) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Criteria createCriteria(final Class persistentClass, final String alias) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Criteria createCriteria(final String entityName) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Criteria createCriteria(final String entityName, final String alias) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Query createQuery(final String queryString) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public SQLQuery createSQLQuery(final String queryString) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Query createFilter(final Object collection, final String queryString)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Query getNamedQuery(final String queryName) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(final Class clazz, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(final Class clazz, final Serializable id, final LockMode lockMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(final String entityName, final Serializable id) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(final String entityName, final Serializable id, final LockMode lockMode)
            throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public String getEntityName(final Object object) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public Filter enableFilter(final String filterName) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Filter getEnabledFilter(final String filterName) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void disableFilter(final String filterName) {

        throw new UnsupportedOperationException();
    }

    @Override
    public SessionStatistics getStatistics() {

        throw new UnsupportedOperationException();
    }

    @Override
    public void setReadOnly(final Object entity, final boolean readOnly) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Connection disconnect() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    /**
     * @deprecated
     */
    @Deprecated
    @Override
    public void reconnect() throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void reconnect(final Connection connection) throws HibernateException {

        throw new UnsupportedOperationException();
    }

    @Override
    public void doWork(final Work work) throws HibernateException {

        throw new UnsupportedOperationException();
    }
}
