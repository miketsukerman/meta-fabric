DESCRIPTION = "Franca+ parser library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "bnfc-native boost-native pybind11-native"

SRCREV = "c5844e85a9d0dd5c99699d24909014aa2fc350db"
SRC_URI = "git://github.com/miketsukerman/fpp.git;protocol=https;branch=update-cmake-scripts"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_PYTHON_SUPPORT=ON -DENABLE_TESTSUITE=OFF -DENABLE_FPP_GEN=OFF"

BBCLASSEXTEND = "native nativesdk"