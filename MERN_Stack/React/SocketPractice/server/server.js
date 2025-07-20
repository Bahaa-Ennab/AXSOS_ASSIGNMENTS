const express = require('express');
const cors = require('cors')
const app = express();
require('dotenv').config()
require('../server/config/mongoose.config'); // This is new

const PORT = process.env.PORT;

app.use(cors())
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
require('./routes/person.routes')(app);


app.get('/', (req, res) => res.send('Hello from server!'));

const server = app.listen(PORT, () => console.log(`Server running on port ${PORT}`));

const io = require("socket.io")(server, { cors: true })

io.on("connection", socket => {

    socket.on("newUser", data =>{
        io.emit("newUserMsg",data)
    })

    socket.on('recivedmessage', data => {
        socket.broadcast.emit('msg', data)
    })
})