SUMMARY = "Node-side server/client commmunication for solar-tracking python2.7 package"
AUTHOR = "Kevron Rees/Ryan Kapur"
SECTION = "devel/python"
LICENSE = "GPL &|() v3"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=25905bd825ed9118dc55c3ba118f6c29"
PR = "r1"


SRC_URI = "git://github.com/ryankapur/icarus;protocol=https;branch=speedUpDemo;name=icarus"
SRCREV_icarus = "5bd6c7d7d63352432a60721ba67b4ac9ee0974cc"

S = "${WORKDIR}/git/nodejs"

inherit setuptools

SRC_URI[md5sum] = "5bd6c7d7d63352432a60721ba67b4ac9ee0974cc"
SRC_URI[sha256sum] = "https://github.com/ryankapur/icarus"

DEPENDS = "iotivity-node"
RDEPENDS_${PN} = "iotivity-node \
 ws"
                  
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"
