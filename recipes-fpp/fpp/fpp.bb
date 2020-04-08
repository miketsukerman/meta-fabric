DESCRIPTION = "Franca+ parser library"
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://License.md;md5=f96360df973a9211c5b8bbeffd19b28b"

DEPENDS = "fpp-grammar-native pybind11-native cli11 spdlog fmt"

SRCREV = "eb9b43031e0dee0aff2e9ae9958e6e60725feb8f"
SRC_URI = "git://github.com/miketsukerman/fpp.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_PYTHON_SUPPORT=ON -DENABLE_TESTSUITE=OFF -DENABLE_FPP_GEN=ON"

BBCLASSEXTEND = "native nativesdk"