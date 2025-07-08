import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Home from './components/Home'
import Number from './components/number'
import Styled from './components/Styled'
import {Routes,Route,Link} from "react-router-dom";

function App() {

  return (
    <>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/:num" element={<Number />} />
        <Route path="/:word/:color/:bcolor" element={<Styled />} />
      </Routes>   
    </>
  )
}

export default App
