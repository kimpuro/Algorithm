function solution(sizes) {
    let newMap = sizes.map((wh)=>wh.sort((a,b)=>a-b))
    let maxW = 0;
    let maxH = 0;
    newMap.forEach((a)=>{
        if(maxW<a[0]){
            maxW=a[0]
        }
        if(maxH<a[1]){
            maxH=a[1]
        }
    })
    return maxW*maxH;
}