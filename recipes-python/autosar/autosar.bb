DESCRIPTION = "Franca+ parser grammar library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff5a8595669c0889f1ff6117a7f41a5c"

DEPENDS = "python3"

SRCREV = "98ef60a861b0fd483bbf98b1b509de14658da60d"
SRC_URI = "git://github.com/miketsukerman/autosar.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"