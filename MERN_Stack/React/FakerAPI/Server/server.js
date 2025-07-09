const { faker } = require('@faker-js/faker');
const express = require("express");
const app = express();
const port = 8000;

// req is shorthand for request
// res is shorthand for response
const createProduct = () => {
  const newFake = {
    name: faker.commerce.productName(),
    price: "$" + faker.commerce.price(),
    department: faker.commerce.department()
  };

  return newFake;
};

const newFakeProduct = createProduct();


const createUser = () => {
  const newUser = {
    firstName: faker.person.firstName(),
    lastName: faker.person.lastName(),
    password: faker.internet.password(),
    email: faker.internet.email(),
    phonenumber: faker.phone.number(),
    id: faker.database.mongodbObjectId()
  }
  return newUser
}


const createCompany = () => {
  const newCompany = {
    id: faker.database.mongodbObjectId(),
    name: faker.company.name(),
    address: {
      street: faker.location.street(),
      city: faker.location.city(),
      state: faker.location.state(),
      zipCode: faker.location.zipCode(),
      country: faker.location.country()
    }

  }
  return newCompany
}

app.get("/api", (req, res) => {
  res.json({ message: "Hello World" });
});

app.get("/api/users/new", (req, res) => {
  const newFakeUser = createUser()

  res.json({ newFakeUser });
});

app.get("/api/companies/new", (req, res) => {
  const newFakeCompany = createCompany()

  const newFakeUser = createUser()

  res.json({ newFakeCompany, newFakeUser });
});

const server = app.listen(8000, () =>
  console.log(`Server is locked and loaded on port ${server.address().port}!`)
);
