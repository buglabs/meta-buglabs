DESCRIPTION = "BUG Avahi Profile"
DEPENDS = "avahi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r0"

SRC_URI = "file://bugdevice.service"

S = "${WORKDIR}"

do_install() {
	install -d ${D}${sysconfdir}/avahi/services
	install -m 0644 ${WORKDIR}/bugdevice.service ${D}${sysconfdir}/avahi/services/
}
