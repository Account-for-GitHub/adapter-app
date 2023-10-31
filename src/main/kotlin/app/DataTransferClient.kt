package app

class DataTransferClient(private val dataTransferService: ISimpleProtocolDataTransferService) {
    fun send(){
        dataTransferService.sendData()
    }
}