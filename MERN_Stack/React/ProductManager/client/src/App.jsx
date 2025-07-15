import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Routes, Route } from 'react-router-dom';

import MainComponent from './components/MainComponent'
import ProductComponent from './components/ProductComponent'
import ProductList from './components/ProductList';
import Detail from './components/Detail';
import Update from './components/Update';
function App() {

  return (
    <>

      <Routes>
        <Route path="/" element={<ProductComponent />} />
        <Route element={<MainComponent />} path="/product/" />
        <Route element={<Detail />} path="/product/:id" />
        <Route element={<Update/>} path="/product/:id/edit"/>
      </Routes>
      
    </>
  )
}

export default App
