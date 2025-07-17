const mongoose = require('mongoose');
require('dotenv').config();
const pwd= process.env.ATLAS_PASSWORD;
const userName = process.env.ATLAS_USERNAME;
const DB = process.env.DB;
mongoose.connect(`mongodb+srv://${userName}:${pwd}@axsos.ymrbp61.mongodb.net/${DB}?retryWrites=true&w=majority&appName=Axsos`, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
})
    .then(() => console.log("Established a connection to the database"))
    .catch(err => console.log("Something went wrong when connecting to the database", err));