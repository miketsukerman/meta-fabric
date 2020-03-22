SUMMARY = "pybind11"
DESCRIPTION = "pybind11 is a lightweight header-only library that exposes C++ types in Python and vice versa"
HOMEPAGE = "https://github.com/pybind/pybind11.git"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=beb87117af69fd10fbf9fb14c22a2e62"

SRCREV = "4f72ef846fe8453596230ac285eeaa0ce3278bb4"
SRC_URI = "git://github.com/pybind/pybind11.git;protocol=http;branch=master"

DEPENDS_append = " \
    ${PYTHON_PN} \
"

inherit cmake python3native

S = "${WORKDIR}/git/"

EXTRA_OECMAKE += "\
    -DPYBIND11_TEST=OFF \
"
# By default, BitBake does not produce empty packages.
# This default behavior can cause issues when there is an RDEPENDS or
# some other hard runtime requirement on the existence of the package.
# Since we want to saticfy default behavior, allow default packages as empty
ALLOW_EMPTY_${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
