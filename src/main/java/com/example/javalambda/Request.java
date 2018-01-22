package com.example.javalambda;

/**
 * Represents the event.json. Jackson will create an instance of this class and pass it to {@link HelloWorld::handleRequest} as the first parameter.
 */
@SuppressWarnings({"unused"})
class Request {

    private String name;
    private Address address;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Inner class that demonstrates hierarchical json fields
     */
    class Address {

        private String country;

        /**
         * Explicit default constructor needed for Jackson to properly parse the input json into {@link Request} with inner class.
         */
        public Address() {

        }

        String getCountry() {
            return country;
        }

        void setCountry(String country) {
            this.country = country;
        }

    }

}
