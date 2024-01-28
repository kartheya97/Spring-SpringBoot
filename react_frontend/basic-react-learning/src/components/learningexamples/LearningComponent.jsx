import { Component } from "react";
import FirstComponent from "./FirstComponent";
import FourthComponent, { FifthComponent } from "./FourthComponent";
import SecondComponent from "./SecondComponent";
import ThirdComponent from "./ThirdComponent";
import LearningJavascript from "./LearningJavascript";

export default class LearningComponent extends Component{
    render(){
        return(
            <>
                 <FirstComponent />
                 <SecondComponent/>
                 <ThirdComponent/>
                 <FourthComponent />
                 <FifthComponent  />
                 <LearningJavascript />
           </>
        );
    }
}