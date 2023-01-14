# JavaProblemSolution
자바 유닛 테스트 코드를 적용한 알고리즘 풀이 연습 저장소

## 자바 유닛 테스트 만드는 법

![image](https://user-images.githubusercontent.com/43310141/212461545-7d9be469-1fd6-42c8-bcb4-fb995a729e2d.png)

- 패키지 만들고 Soultion.java 생성
- 오른쪽 상단에 초록 화살표 (Run/Debug) 옆 Run/Debug Configurations 클릭
![image](https://user-images.githubusercontent.com/43310141/212461586-21a7c214-6d1a-4e4d-8e74-f82132606d03.png)

![image](https://user-images.githubusercontent.com/43310141/212461601-bc7a7118-be97-4547-a55e-93c5cf59a56a.png)

그럼 이렇게 유닛 테스트 파일이 생김

`SoultuonTest.java`
```java
package wee1.sol1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals(1,sol.solution(new int[] {1,2,3,4}));
        Assertions.assertEquals(4,sol.solution(new int[] {1,2,7,6,4}));
    }
}
```
그 후 `Assertions.assertEquals(<정답 리턴 결과>,<테스트할 메소드>);` 으로 테스트 케이스 세팅

|입력 | 출력|
|---|---|
|`[1,2,3,4]` | `1`| 
|`[1,2,7,6,4]` | `1`|
|`[...]`|`...`|

다시 Solutin.java로 돌아와서 테스트할 메소드 생성 
```java
package wee1.sol1;
public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0 ;i < nums.length-2; i++){
            for(int j = i + 1; j<nums.length-1; j++){
                for(int k = j + 1; k <nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        answer+=1;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int sum) {
        for(int i = 2; i<sum; i++){
            if(sum % i == 0) return false;
        }
        return true;
    }
}

```
실행해서 맞는지 
