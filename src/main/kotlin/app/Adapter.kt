package app

class Adapter(private val anotherInterfaceService: IAnotherProtocolDataTransferService) :
    ISimpleProtocolDataTransferService {
    override fun sendData() {
        anotherInterfaceService.let {
            it.packData()
            it.addHeadersInfo()
            it.sendData()
        }
    }
}