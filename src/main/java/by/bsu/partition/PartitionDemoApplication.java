package by.bsu.partition;

import by.bsu.partition.entity.EntityA;
import by.bsu.partition.entity.EntityB;
import by.bsu.partition.entity.MEntityA;
import by.bsu.partition.entity.MEntityB;
import by.bsu.partition.repo.MPartitionRepositoryA;
import by.bsu.partition.repo.PartitionRepositoryA;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class PartitionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartitionDemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(PartitionRepositoryA partitionRepositoryA, MPartitionRepositoryA mPartitionRepositoryA) {
		return (args -> {
			System.out.println("IdClass");
			{
				List<EntityA> all = partitionRepositoryA.findAll();
				for (EntityA entityA : all) {
					List<EntityB> childEntityB = entityA.getChildEntityB();
					for (EntityB entityB : childEntityB) {
						entityB.setName(UUID.randomUUID().toString());
					}
					partitionRepositoryA.save(entityA);
				}
			}
			System.out.println("EmbeddedId");
			{
				List<MEntityA> all = mPartitionRepositoryA.findAll();
				for (MEntityA entityA : all) {
					List<MEntityB> childEntityB = entityA.getChildEntityB();
					for (MEntityB mEntityB : childEntityB) {
						mEntityB.setName(UUID.randomUUID().toString());
					}
					mPartitionRepositoryA.save(entityA);
				}
			}
		});
	}

}
