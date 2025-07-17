import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { useEffect } from 'react'
import io from "socket.io-client"

function App() {
  const [socket] = useState(() => io(':8000'))
  const [msg, setMsg] = useState("")
  useEffect(() => {
    socket.on("msg", data => setMsg(data))
    return () => socket.removeAllListeners;

  },[socket])

  const sendMsg = (msg) => {
    socket.emit('recivedmessage',msg)
  }
  return (
    <>
      <h1>{msg}</h1>
      <button onClick={() => sendMsg("hiiiiiiiiiii")}>send msg</button>
    </>
  )
}

export default App
