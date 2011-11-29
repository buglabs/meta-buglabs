DESCRIPTION = "A desktop icon for system shutdown."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r0"
PACKAGE_ARCH = "all"

SRC_URI = "file://bug-shutdown.desktop"

S = "${WORKDIR}"

FILES_${PN} += "/usr/share/applications/bug-shutdown.desktop"

do_install() {
	install -m 0755 -d ${D}/usr/share/applications
	install -m 0644 ${S}/bug-shutdown.desktop ${D}/usr/share/applications/
}
