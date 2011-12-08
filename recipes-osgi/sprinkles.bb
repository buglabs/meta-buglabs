DESCRIPTION = "Sprinkle functional elements in Java programs."
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/PD;md5=b3597d12946881e13cb3b548d1173851"
PR = "r0"

inherit java

SRC_URI = "git://github.com/kgilmer/Sprinkles.git;protocol=git;branch=${BRANCH}"
SRCREV = "117d2985012f5c020701fb566b33189a7edfa186"
BRANCH = "master"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/osgi/bundle/${PN}.jar"
PACKAGE_ARCH = "all"

DEPENDS = "ant-native"

do_compile() {
	rm -Rf src/org/sprinkles/test
	ant
	cp Sprinkles.jar sprinkles.jar
}

do_install() {
	oe_jarinstall ${S}/${PN}.jar
	install -d ${D}/usr/share/osgi/bundle
	install -m 0644 ${S}/${PN}.jar ${D}/usr/share/osgi/bundle/${PN}.jar
}

#do_stage(){
#	install -m 0644 ${S}/${PN}.jar ${STAGING_DIR_JAVA}
#}

