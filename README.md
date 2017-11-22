# Kotlin based dropwizard archetype

How to create a Kotlin project using dropwizard (interactive mode)
---

```
mvn archetype:generate -DarchetypeGroupId=com.udaan.archetypes -DarchetypeArtifactId=dropwizard-kotlin -DarchetypeVersion=1.0 -D
```

(when asked for ``$name`` during project creation via maven, make sure to use a camel case word such as ``HelloWorld`` as it is used to generate Configuration and Application classess such as ``HelloWorldConfiguration.kt`` and ``HelloWorldApplication.kt``. Furthermore, do not include any blank space for the same reason!)


# Credits
This project was derived from the [Dropwizard java-simple archetype](https://github.com/dropwizard/dropwizard/tree/master/dropwizard-archetypes)

