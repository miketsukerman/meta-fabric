SUMMARY = "C++11 command line parser"
DESCRIPTION = "A command line parser for C++11 and beyond that provides a rich feature set with a simple and intuitive interface."
HOMEPAGE = "https://github.com/CLIUtils/CLI11"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c271fee3ae28e11b24b97284d9f82887"
SRCREV = "dd0d8e4fe729e5b1110232c7a5c9566dad884686"
PV .= "+git${SRCPV}"

SRC_URI += "git://github.com/CLIUtils/CLI11;protocol=http;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCLI11_BUILD_TESTS=OFF"

BBCLASSEXTEND = "native nativesdk"