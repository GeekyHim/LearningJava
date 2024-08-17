package TwoDArray;
public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = {
            {01, 02, 03, 04, 05},
            {06, 07, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30}};
            int m= arr.length, n=arr[0].length;
            int minr=0, minc=0, maxr=m-1, maxc=n-1;
            int looptru=(n/2);
            if(n%2!=0) looptru++; // because agar toh odd hai toh ek extra cycle chahiye
            // in case of even columns a clr middle is not defined, whereas odd cols a clr middle is defined
            /*
             * when the code runs
             * middle me ake spiral finish hoga?
             * odd ke case me if 5 hai toh 3
             * lekin even me 4 ka 2 bna
             * toh ab devide kiya toh even me toh 2 mil jayega 
             * lekin odd me bhi 2 ayega isilye
             * odd ke time +1 karna is imp 
             * kyuki loop 3 baar chlegi na
             * loop is running n/2 times when even and n/2 + 1 times when odd columns are present.
             */
            
            //(ISSUES HAI ABHI ISME) easier would have been to take while(minr<=maxr) && AND (minc<=maxc)  WORKS EASILY no need for n/2 stuff
            // har ek loop se phele if(minr>maxr || minc > max c) break;
             while(looptru>0){
                for(int j=minc;j<=maxc;j++){
                    System.out.print(arr[minr][j]+" ");
                }
                minr++;
                if(minr>maxr || minc > maxc) break;
                for(int i=minr;i<=maxr;i++){
                    System.out.print(arr[i][maxc]+" ");
                }
                maxc--;
                if(minr>maxr || minc > maxc) break;
                for(int j= maxc; j>=minc;j--){
                    System.out.print(arr[maxr][j]+" ");
                }
                maxr--;
                if(minr>maxr || minc > maxc) break;
                for(int i= maxr; i>=minr;i--){
                    System.out.print(arr[i][minc]+" ");
                }
                minc++;
                if(minr>maxr || minc > maxc) break;
                looptru--;

            }
    }
}
