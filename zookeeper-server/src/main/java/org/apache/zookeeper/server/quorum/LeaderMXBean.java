/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zookeeper.server.quorum;

import org.apache.zookeeper.server.ZooKeeperServerMXBean;

/**
 * Leader MBean.
 */
public interface LeaderMXBean extends ZooKeeperServerMXBean {
    /**
     * Current zxid of cluster.
     */
    public String getCurrentZxid();

    /**
     * @return information on current followers
     */
    public String followerInfo();

    /**
     * @return information about current non-voting followers
     */
    public String nonVotingFollowerInfo();

    /**
     * @return time taken for leader election in milliseconds.
     */
    public long getElectionTimeTaken();

    /**
     * @return size of latest generated proposal
     */
    public int getLastProposalSize();

    /**
     * @return size of smallest generated proposal
     */
    public int getMinProposalSize();

    /**
     * @return size of largest generated proposal
     */
    public int getMaxProposalSize();

    /**
     * Resets statistics of proposal size (min/max/last)
     */
    public void resetProposalStatistics();

    /**
     * @return Number of concurrent snapshots permitted to send to observers
     */
    public int getMaxConcurrentSnapSyncs();

    /**
     * @param maxConcurrentSnapSyncs Number of concurrent snapshots permitted to send to observers
     */
    public void setMaxConcurrentSnapSyncs(int maxConcurrentSnapSyncs);

    /**
     * @return Number of concurrent diff syncs permitted to send to observers
     */
    public int getMaxConcurrentDiffSyncs();

    /**
     * @param maxConcurrentDiffSyncs Number of concurrent diff syncs permitted to send to observers
     */
    public void setMaxConcurrentDiffSyncs(int maxConcurrentDiffSyncs);
}
