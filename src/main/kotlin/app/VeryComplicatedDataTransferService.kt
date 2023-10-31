package app

class VeryComplicatedDataTransferService(
    private val dataPackager: IDataPackager,
    private val headerGenerator: IHeaderGenerator
) : IAnotherProtocolDataTransferService {
    override fun packData() {
        dataPackager.pack()
    }

    override fun addHeadersInfo() {
        headerGenerator.generate()
    }

    override fun sendData() {
        println("sending data with very complicated data transfer protocol")
        println("data sent successfully!")
    }
}