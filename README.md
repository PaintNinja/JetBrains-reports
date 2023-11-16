## Gradle publishing DSL
Houses code for reproducing a bug with the Gradle publishing Groovy DSL in IntelliJ.

Lots of IDE errors and warnings are shown in the IDE; however, publishing works fine:
![img.png](images/dsl.png)
![img_1.png](images/published_files.png)

- Buildscript: `build.gradle`
- Publish with: `gradlew publishToMavenLocal`
