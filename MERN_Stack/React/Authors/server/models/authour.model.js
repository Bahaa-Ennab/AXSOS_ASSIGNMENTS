const mongoose = require('mongoose');

const AuthourSchema = new mongoose.Schema({
    name: {
        type: String,
        required: [
            true,
            "name is required"
        ]
    }
}, { timestamps: true });

const Authour = mongoose.model('Authour', AuthourSchema);

module.exports = Authour;