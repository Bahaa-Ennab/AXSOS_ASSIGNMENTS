const Person = require('../models/person.model')

module.exports.createPerson = (request, response) => {
    console.log("Request body:", request.body);  // تحقق من البيانات الداخلة

    const { name } = request.body;

    if (!name) {
        return response.status(400).json({ error: "Name is required" });
    }

    Person.create({ name })
        .then(person => response.json(person))
        .catch(err => {
            console.error("Error creating person:", err);
            response.status(400).json(err);
        });
}
