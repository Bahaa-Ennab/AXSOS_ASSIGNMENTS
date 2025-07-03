import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonComponent from './components/PersonCard'
import Counter from './components/counter'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <PersonComponent firstname="sami" lastname="btata" age={25} haircolor="Brown" />
      <PersonComponent firstname="sami" lastname="btata" age={23} haircolor="Brown" />
      <PersonComponent firstname="sami" lastname="btata" age={24} haircolor="Brown" />
      <PersonComponent firstname="sami" lastname="btata" age={21} haircolor="Brown" />
      <button onClick={() => alert("This button has been clicked!")}>Click Me</button>
      <Counter/>
    </>
  )
}

export default App
