# repackage-import-spring-app
Importação de jars entre aplicações Spring Boot
## Instruções
- A importação "a" importará a "b" para seu contexto;
- Na aplicação "a" tem um serviço com a a utilização de um objeto que é referenciado na aplicação "b";
## Build
- Update nas dependências dos projetos;
- cd teste-app-b 
- mvn clean install
- cd teste-app-a
- mvn clean install
- observar o pom.xml da aplicação "a":
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>com.teste</groupId>
			<artifactId>teste-app-b</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>repackage</id>
						<configuration>
							<classifier>exec</classifier>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

</project>


```

