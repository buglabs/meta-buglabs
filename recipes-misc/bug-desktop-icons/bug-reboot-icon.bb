DESCRIPTION = "A desktop icon for system reboot."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r0"
PACKAGE_ARCH = "all"

SRC_URI = "file://bug-reboot.desktop"

S = "${WORKDIR}"

FILES_${PN} += "/usr/share/applications/bug-reboot.desktop"

do_install() {
	install -m 0755 -d ${D}/usr/share/applications
	install -m 0644 ${S}/bug-reboot.desktop ${D}/usr/share/applications/
}
