
const person = {
    name : 'Sheru',
    address : {
                city  : 'hyderabad',
                state : 'Telangana'
    } ,
    profiles: ['Twitter','Facebook','LinkedIn'],
    printProfile: () => {
        person.profiles.map(
            (profile) => console.log(profile)
        )
    }
}



export default function LearningJavascript(){
    return(
        <>
            <div>{person.name}</div>
            <div>{person.address.state}</div>
            <div>{person.profiles[1]}</div>
            <div>{person.printProfile()}</div>
        </>
        
    )
}