# ParkingLotNearSortedSlots

I own a Multi-storey parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number starting at 1 increasing with increasing distance from the entry  point in steps of one. i want to create 
an automated ticketing system that allows my customers to use my parking lot without human intervention.

when a car enter my parking lot, i want to have a ticket issued to the driver. the ticket issuing process includes us documenting the registration number (number plate) and the colour of car and allocating an available 
parking slot to the car before actually  handing over a ticket to driver (we assume that our customers are nice  enough to always park in the slot allocated  to them). The customer should be allocated a parking slot which is nearest to the entry. At the exit the customer returns the ticket which then marks the spot they were using as being available.

Expected Functionalities:

1. create a parking slot for a given number of slots. you can assume:
	a. User has marked physical slots in order of distance - taking in account parking level/slot reachability etc. 
	b. All slots are equal and any car can go in any slot.

2. Park a Car
	a. input data is car registration number and colour of car.
	b. allots the nearest slot depending upon availability.
3. Vacated a slot 
	a. Input data is slot number to be freed 
4. Get status of allocated slots 
	a. this would get a list of occupied slots along with registration number and colour of car parked in respective slot.

5. Get Status of free slots
	a. this would get a list of available slots