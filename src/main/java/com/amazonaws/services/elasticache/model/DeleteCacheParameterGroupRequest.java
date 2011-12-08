/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheParameterGroup(DeleteCacheParameterGroupRequest) DeleteCacheParameterGroup operation}.
 * <p>
 * Deletes the specified CacheParameterGroup. The CacheParameterGroup
 * cannot be deleted if it is associated with any cache clusters.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheParameterGroup(DeleteCacheParameterGroupRequest)
 */
public class DeleteCacheParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Cache Parameter Group to delete. <note> The specified
     * cache security group must not be associated with any Cache clusters.
     * </note>
     */
    private String cacheParameterGroupName;

    /**
     * Default constructor for a new DeleteCacheParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteCacheParameterGroupRequest() {}
    
    /**
     * Constructs a new DeleteCacheParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName The name of the Cache Parameter Group
     * to delete. <note> The specified cache security group must not be
     * associated with any Cache clusters. </note>
     */
    public DeleteCacheParameterGroupRequest(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    
    
    /**
     * The name of the Cache Parameter Group to delete. <note> The specified
     * cache security group must not be associated with any Cache clusters.
     * </note>
     *
     * @return The name of the Cache Parameter Group to delete. <note> The specified
     *         cache security group must not be associated with any Cache clusters.
     *         </note>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group to delete. <note> The specified
     * cache security group must not be associated with any Cache clusters.
     * </note>
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group to delete. <note> The specified
     *         cache security group must not be associated with any Cache clusters.
     *         </note>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group to delete. <note> The specified
     * cache security group must not be associated with any Cache clusters.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group to delete. <note> The specified
     *         cache security group must not be associated with any Cache clusters.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    