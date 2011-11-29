DESCRIPTION = "Documentation for BUG"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
PR = "r1"

SRC_URI = "file://BUG_Guide.pdf \
           file://README \
           file://COPYING"

FILES_${PN} += "/home/root/*"

S = ${WORKDIR}

PACKAGE_ARCH = "all"

do_install() {
    install -d ${D}/home/root

    install -m 0644 ${WORKDIR}/README ${D}/home/root/
    install -m 0644 ${WORKDIR}/BUG_Guide.pdf ${D}/home/root/
}
