import app.*

fun main(){
    val dataClient = DataTransferClient(SimpleDataTransferService())
    line()
    println("Simple Data Transfer Protocol")
    dataClient.send()

    val veryComplicatedDataTransferService = VeryComplicatedDataTransferService(DataPackager(), HeadersGenerator())
    val anotherDataClient = DataTransferClient(Adapter(veryComplicatedDataTransferService))
    line()
    println("Very Complicated Data Transfer Protocol")
    anotherDataClient.send()
}