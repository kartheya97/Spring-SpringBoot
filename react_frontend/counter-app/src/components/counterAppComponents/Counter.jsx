import { useState } from 'react';
import './CounterStylings.css';
import CounterButton from './CounterButton';

export default function Counter(){
    const [count,setCount] =  useState(0);

    function incrementCounterFuntion(by){
            setCount(count + by); 
    }

    function decrementCounterFunction(by){
            setCount(count - by);
    }

    function resetCounterFunction(){
        setCount(0);
    }

    return(
        <>
                <span className="count">{count}</span>
                <CounterButton by={1} 
                               incrementMethod={incrementCounterFuntion} 
                               decrementMethod={decrementCounterFunction} />
                <CounterButton by={2} 
                               incrementMethod={incrementCounterFuntion} 
                               decrementMethod={decrementCounterFunction}/>
                <CounterButton by={5} 
                               incrementMethod={incrementCounterFuntion} 
                               decrementMethod={decrementCounterFunction}/>
                <button className="ResetButton" 
                       onClick={resetCounterFunction}>Reset</button>
        </>   
    )
}

