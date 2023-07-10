package io.zeebe.zeeqs.importer.hazelcast

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class HazelcastConfig(
        val id: String,
        @Id var ringBufferName: String,
        var sequence: Long)