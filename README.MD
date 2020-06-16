Interview
==============

## Interview Question:

### Analyze `index.html`

### Project setup
- move javascript out of index.html
- use a build tool that you are comfortable with to
  - bundle the split javascript code (modules, components, services, controller, tests etc.)  
  - run the tests 

### Data (Frontend or Backend)

- Input appointments can last either 4h or 8h, and are always between 8AM and 7PM. Appointment list size not defined, and appointments can overlap.
- Implement a filter function so that, **for each day**, either **one single 8h appointment**, or **two 4h appointments (one in the morning and one in the afternoon)**.
- Definition of morning: `appointment.serviceTimeSlot.appointmentStartDate` before 12h00
- Definition of afternoon: `appointment.serviceTimeSlot.appointmentEndDate` after 15h00


### UI

 1. Display the list of appointments returned by the resource in the template
 2. Enhance 1 by splitting the appointments into 2 dropdowns:
     - 2.1 A dropdown holding all the days of available dates (day, month) for appointments
     - 2.2 A dropdown showing the specific timeslots available for the date selected in the first dropdown