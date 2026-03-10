package oop_00000133876_AdamRifqyHajat.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for (device in devices) {
            when(device){
                is Switchable -> {
                    device.turnOff()
                }
            }
        }
    }
}