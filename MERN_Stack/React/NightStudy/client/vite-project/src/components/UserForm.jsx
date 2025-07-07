import React, { useState } from 'react';

const UserForm = (props) => {
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);  // default value of false
const [usernameError,setUsernameError]=useState("");

    const createUser = (e) => {
        // we must prevent the default refresh of the browser to keep our state from being reset
        e.preventDefault();

        // create a javascript object to hold all of the values
        const newUser = { username, email, password };


        console.log("Welcome", newUser);
        setUsername("");
        setEmail("");
        setPassword("");
        setHasBeenSubmitted(true);

    };
    const formMessage = () => {
        if (hasBeenSubmitted) {
            return "Thank you for submitting the form!";
        } else {
            return "Welcome, please submit the form";
        }

    };
        const handleUsername =(e) =>{
            setUsername(e.target.value);
            if(e.target.value.length > 5){
                setUsernameError("name is required")
            }else{
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
                    <p>{usernameError}</p>:''
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
            }            </form>
        </div>

    );
};

export default UserForm;