SRCS=./me/castrovrob/brunca/core/*.java ./me/castrovrob/brunca/game/*.java
PKGS=./me/castrovrob/brunca/core/*.class ./me/castrovrob/brunca/game/*.class

all:
	javac ${SRCS}
	jar -cfv ../lib/brunca.jar ${PKGS}

clean: 
	find . -name "*.class" -print -delete
