// Removing an element at index 2:
let array1=[12,23,45,67,78]
let array2=[]
for(let i=0;i<array1.length;i++){
    console.log(array1[i])
}
console.log("We want to remove element from index 2:")
let m=2;
for(let i=0;i<array1.length;i++){
    if(i<2){
        array2[i]=array1[i]
    }
    else if(i==m){
        continue;
    }
    else {
        array2[i-1]=array1[i];
    }
}
console.log("Print array after deleted 2nd index number");
for(let i=0;i<array2.length;i++){
    console.log(array2[i]);
}
