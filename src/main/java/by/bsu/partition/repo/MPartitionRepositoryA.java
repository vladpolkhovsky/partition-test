package by.bsu.partition.repo;

import by.bsu.partition.entity.EntityA;
import by.bsu.partition.entity.MEntityA;
import by.bsu.partition.entity.PartitionID;
import by.bsu.partition.entity.PartitionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MPartitionRepositoryA extends JpaRepository<MEntityA, PartitionID> {

}
