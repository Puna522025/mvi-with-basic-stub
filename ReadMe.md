# Assignment

### Setup Instructions

Clone the project from **https://github.com/Puna522025/tide-spacex-android.git**

### Project Structure

The app has following modules, each one being responsible for its own functionality.

_The modules are -_
1. **app** - This is our main App.
2. **tide-spacex-network** - This will contain everything related to networking.
3. **tide-spacex-ui** - This will contain everything related to UI - Rocket List and Rocket Details.

### Dependency Injection

_By following DI principles, we lay the groundwork for good app architecture, greater code reusability, and ease of testing._

Implemented **HILT** for our DI.

### Networking

Used OKHTTP, Retrofit and Rx for API calls and background execution.

### Architectural Pattern

Followed MVVM / MVI

### Testing

Used MockK for testing. Tested - 
1. ViewModels
2. Repository
3. Use cases

### Image Loading

Used Glide Library

### Other Details

1. User can filter the data based on Active and InActive states
2. User can refresh the data
3. Splash Screen
4. Rocket launches grouped together based on year and displayed under "Year" header.

**SPLASH SCREEN**
![Screenshot_20210911-104929_SpaceX](https://user-images.githubusercontent.com/24222492/132937271-13592b16-5652-4ce5-959c-04303a820a53.jpg)

**LOADER**
![Screenshot_20210911-104933_SpaceX](https://user-images.githubusercontent.com/24222492/132937276-061ab594-fccb-4787-999e-6b7a0dad0bba.jpg)

**Rockets List**
![Screenshot_20210911-104920_SpaceX](https://user-images.githubusercontent.com/24222492/132937282-36633a8b-b510-449c-acde-e6496f8e66e9.jpg)

**FILTER**
![Screenshot_20210911-104937_SpaceX](https://user-images.githubusercontent.com/24222492/132937346-46313467-59a3-4d1d-b163-29df9e984a5d.jpg)

**FILTERED LIST**
![Screenshot_20210911-104942_SpaceX](https://user-images.githubusercontent.com/24222492/132937356-689a0f5c-0ed0-4099-bbbb-bdf929e46078.jpg)

**ROCKET DETAILS SCREEN**
![Screenshot_20210911-104951_SpaceX](https://user-images.githubusercontent.com/24222492/132937357-fd481f6c-b9f7-4d6c-949d-bafaee110f25.jpg)

