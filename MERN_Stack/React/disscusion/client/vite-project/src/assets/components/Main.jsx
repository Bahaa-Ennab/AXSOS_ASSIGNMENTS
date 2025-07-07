import React, { useState } from 'react';

const Main = (props) => {
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);  // default value of false
    const [usernameError, setUsernameError] = useState("");

    const createUser = (e) => {
        e.preventDefault();

        const newUser = { username, email, password };
        const arr = [username, email, password]
        console.log("Welcome", newUser);
        console.log(newUser);
        props.passMessage(arr);
        setUsername("");
        setEmail("");
        setPassword("");
        setHasBeenSubmitted(true);

    };
    const handleUsername = (e) => {
        setUsername(e.target.value);
        if (e.target.value.length > 10 || e.target.value.length < 3) {
            setUsernameError("username should be between 3 - 10 letters ")
        } else {
            setUsernameError("")
        }
    }
    return (
        <div>

            <form onSubmit={createUser}>
                {
                    hasBeenSubmitted ?
                        <h3>Thank you for submitting the form!</h3> :
                        <h3>Welcome, please submit the form.</h3>
                }
                <div>
                    <label>Username: </label>
                    <input type="text" onChange={handleUsername} />
                    {usernameError ?
                        <p>{usernameError}</p> : ''
                    }
                </div>
                <div>
                    <label>Email Address: </label>
                    <input type="text" onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div>
                    <label>Password: </label>
                    <input type="text" onChange={(e) => setPassword(e.target.value)} />
                </div>
                {
                    usernameError ?
                        <input type="submit" value="Create Movie" disabled /> :
                        <input type="submit" value="Create Movie" />
                }            
                </form>
        </div>
    )


};
export default Main;