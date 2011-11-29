DESCRIPTION = "Logrotate rules for BUG"
RDEPENDS_${PN} = "logrotate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://bug-rules"
PR="r0"
S = "${WORKDIR}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install() {
    install -d ${D}/etc/logrotate.d
    install -m 0644 bug-rules ${D}/etc/logrotate.d/
}
