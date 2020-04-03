DESCRIPTION = "Franca+ parser grammar library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "bnfc-native bison-native flex-native"

SRCREV = "2e2598dedf7503136d974e41c014f4cbd3d15973"
SRC_URI = "git://github.com/miketsukerman/fpp-grammar.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"