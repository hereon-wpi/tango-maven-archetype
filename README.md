# README #

Usage:

```
#!bash

$>  mvn archetype:generate                                                \
      -DarchetypeArtifactId=tango-maven-archetype                         \
      -DarchetypeVersion=1.2                                              \
      -DarchetypeRepository=http://dl.bintray.com/hzgde/hzg-wpn-projects  \
      -DartifactId=CamelCaseArtifectId
```

__NOTE__: artifactId will be used as class name, so it must follow standard Java naming convention