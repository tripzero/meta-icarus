
SUMMARY = "simple WebSocket implementation, up-to-date against RFC-6455, probably the fastest WebSocket lib for node.js."
AUTHOR = "Einar Otto Stangvik "
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../README.md;md5=b5dacce8d02ae1e2992d1c431a4ad679"
PR = "r1"


SRC_URI = "git://github.com/websockets/ws;protocol=https;branch=master;name=ws"
SRCREV_ws = "d5862f81a890767dcbbdc6c5573f56c4b1601bdb"

S = "${WORKDIR}/git/nodejs"

inherit setuptools

SRC_URI[md5sum] = "d5862f81a890767dcbbdc6c5573f56c4b1601bdb"
SRC_URI[sha256sum] = "https://github.com/ryankapur/icarus"

DEPENDS = "iotivity-node"
RDEPENDS_${PN} = "iotivity-node, ws"
                  
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"