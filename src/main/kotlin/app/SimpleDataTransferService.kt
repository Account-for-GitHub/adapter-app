package app

class SimpleDataTransferService : ISimpleProtocolDataTransferService {
    override fun sendData() {
        println("sending data with simple data transfer protocol")
        println("data sent successfully!")
    }
}