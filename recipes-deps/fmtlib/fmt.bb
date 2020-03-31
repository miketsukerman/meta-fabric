SUMMARY = "A modern formatting library https://fmt.dev"
DESCRIPTION = "{fmt} is an open-source formatting library for C++. It can be used as a safe and fast alternative to (s)printf and iostreams."
HOMEPAGE = "https://github.com/fmtlib/fmt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=af88d758f75f3c5c48a967501f24384b"
SRCREV = "f94b7364b9409f05207c3af3fa4666730e11a854"
PV .= "+git${SRCPV}"

SRC_URI += "git://github.com/fmtlib/fmt;protocol=http;branch=master"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"