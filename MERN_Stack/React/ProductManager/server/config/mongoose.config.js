const mongoose = require('mongoose');
require('dotenv').config();
const pwd= process.env.ATLAS_PASSWORD;
const userName = process.env.ATLAS_USERNAME;
const DB = process.env.DB;
mongoose.connect("mongodb+srv://bahaenab:bbb111222333@axsosac.qum1zpv.mongodb.net/products?retryWrites=true&w=majority&appName=AxsosAC", {
    useNewUrlParser: true,
    useUnifiedTopology: true,
})
    .then(() => console.log("Established a connection to the database"))
    .catch(err => console.log("Something went wrong when connecting to the database", err));