const mongoose = require('mongoose');

const JokeSchema = new mongoose.Schema({
  setup: { type: String ,
    required: [true,"setup is required"],
    minlength:[6,"must be at least 6 letters" ]
  },
  punchline: { type: String }
}, 
{ timestamps: true });

const Joke = mongoose.model('Joke', JokeSchema);

module.exports = Joke;
