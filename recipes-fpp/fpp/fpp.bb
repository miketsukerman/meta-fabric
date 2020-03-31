DESCRIPTION = "Franca+ parser library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "bnfc-native pybind11-native cli11 spdlog"

SRCREV = "e6c3653b0ba5e29327990e720e3a0e13ece0aa5b"
SRC_URI = "git://github.com/miketsukerman/fpp.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_PYTHON_SUPPORT=ON -DENABLE_TESTSUITE=OFF -DENABLE_FPP_GEN=OFF"

BBCLASSEXTEND = "native nativesdk"