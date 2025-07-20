import React from 'react'
import { useState } from 'react'
import { useEffect } from 'react'
import io from "socket.io-client"
import { useLocation } from 'react-router-dom';


export const ChatComp = () => {
    const location = useLocation();
    const { name } = location.state || {};// fallback in case it's undefined
    const [socket] = useState(() => io(':8000'))



    const [msg, setMsg] = useState([])
    const [input, setInput] = useState("")
    let hasJoined = false

    useEffect(() => {
        if (hasJoined != true) {

            socket.emit("newUser", name + " joined the chat")
            hasJoined = true
        }
        socket.on("newUserMsg", data => {
            setMsg(prev => [...prev, { text: data }]);
        });

        socket.on("msg", data => {
            setMsg(prev => [...prev, { text: data, type: 'received' }]);
        });

        return () => socket.removeAllListeners("msg");
    }, [socket]);

    const sendMsg = () => {
        if (input.trim() === "") return
        socket.emit('recivedmessage', input);
        setMsg(prev => [...prev, { text: input, type: 'sent' }]);
        setInput("");
    }
    return (
        <>
            <h1>welcome {name}</h1>
            <div
                style={{
                    border: '1px solid #ccc',
                    borderRadius: '10px',
                    padding: '15px',
                    width: '90%',
                    maxWidth: '600px',
                    height: '400px',
                    margin: '20px auto',
                    overflowY: 'auto',
                    backgroundColor: '#f9f9f9',
                    display: 'flex',
                    flexDirection: 'column',
                    gap: '10px',
                }}>
                {msg.map((m, idx) => (
                    <p
                        key={idx}
                        style={{
                            alignSelf: m.type === 'sent' ? 'flex-end' : 'flex-start',
                            backgroundColor: m.type === 'sent' ? '#dcf8c6' : '#fff',
                            padding: '8px 12px',
                            borderRadius: '8px',
                            maxWidth: '70%',
                        }}
                    >
                        {m.text}
                    </p>
                ))}
            </div>
            <input type="text" onChange={(e) => setInput(e.target.value)} />
            <button onClick={sendMsg}>send msg</button>

        </>
    )
}
