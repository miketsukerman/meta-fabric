DESCRIPTION = "Franca+ parser library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "bnfc-native pybind11-native cli11 spdlog fmt"

SRCREV = "c75fbe420aae3d56304b91a1f202388d8f8a418d"
SRC_URI = "git://github.com/miketsukerman/fpp.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_PYTHON_SUPPORT=ON -DENABLE_TESTSUITE=OFF -DENABLE_FPP_GEN=OFF"

BBCLASSEXTEND = "native nativesdk"