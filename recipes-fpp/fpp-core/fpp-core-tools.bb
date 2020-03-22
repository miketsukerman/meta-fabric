DESCRIPTION = "Common API C++ stubs generator"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "fpp-native"

SRCREV = "d7b346e3a851e8a1e2351fccfa816537ac2db7e9"
SRC_URI = "git://github.com/miketsukerman/fpp-core-tools.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_PYTHON_SUPPORT=ON -DENABLE_TESTSUITE=OFF"

BBCLASSEXTEND = "native nativesdk"