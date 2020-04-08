DESCRIPTION = "Franca+ parser grammar library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "bnfc-native bison-native flex-native"

SRCREV = "f640931ac33535ace50ece5079e0d7604efed9cb"
SRC_URI = "git://github.com/miketsukerman/fpp-grammar.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"