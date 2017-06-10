# Distributed-Automation-System-Design-Assignment-1

Generation of a MVC layer for a industrial system consisting of conveyors and work-stations. The system is capable of producing a packet that contains 4 products each. The program is implemented with HOLOBLOC FBDK. The details are as follows:

Following the MVC pattern, the production system is composed of 7 work stations (shown as rectangles). There are 2 assembly workstations, 2 painting workstations, one welding, one quality check and one packaging workstations. The inputs of raw materials come to the Assemble 1 and Welding workstations. On each of the input "branches" after the assembly and welding operations, the workpieces are painted (Painting A and Painting B workstations). The subassemblies are joint together in the Assembly 2 station. There comes then Quality check that removes failed products from going further and the good products are packaged at the packaging station.

Each workstation has its dedicated controller (device). The devices use Internet Protocol for communication between each other. Each workstation has a dedicated HMI, showing allowing to adjust a cycle time of the station and check the state machine is in (idle or busy). The HMI for the Quality workstation, should have a button allowing to reject the product coming to the workstation and the counter of products rejected so far.

Packaging station should give a pallet of finished products having the pallet containing 4 products.

In the FBDK, you should create a system that would represent the story above following the MVC design pattern. The overall system UI should allow entering amount of products one would like to manufacture. The amount should be divisible by 4. Thus, after entering amount of products - one should be able to see the system continuously running till it will deliver amount/4 pallets, at its output.
