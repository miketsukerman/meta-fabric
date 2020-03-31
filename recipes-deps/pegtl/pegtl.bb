SUMMARY = "The Parsing Expression Grammar Template Library (PEGTL)"
DESCRIPTION = "The Parsing Expression Grammar Template Library (PEGTL) is a zero-dependency C++ header-only parser combinator library for creating parsers according to a Parsing Expression Grammar (PEG)."
HOMEPAGE = "https://github.com/taocpp/PEGTL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae77b0d903a788cb48f4f0926ffc468b"
SRCREV = "7aff80da2ca4fcb0b47f32ba684ff2e1cd48c579"
PV .= "+git${SRCPV}"

SRC_URI += "git://github.com/taocpp/PEGTL;protocol=http;branch=2.x"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"