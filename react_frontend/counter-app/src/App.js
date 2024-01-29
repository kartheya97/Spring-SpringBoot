import './App.css';
import Counter from './components/counterAppComponents/Counter';
function App() {
  return (
    <div className="App">
    <Counter/> 
    </div>
  );
}

/*
function PlayingWithProps(properties){
  console.log(properties.property1);
  console.log(properties.property2);
  return(
    <div>Props</div>
  )
}

//This is modern Javascript approach.
function PlayingWithProps({property1,property2}){
  console.log(property1 + " "+property2);
}

*/



export default App;
