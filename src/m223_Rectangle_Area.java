/*
在二维平面上计算出两个由直线构成的矩形重叠后形成的总面积。

每个矩形由其左下顶点和右上顶点坐标表示
*/
public class m223_Rectangle_Area {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int total = (D - B) * (C - A) + (H - F) * (G - E);
	        if (E >= C || A >= G || F >= D || B >= H) return total;
	        return total - (Math.min(G, C) - Math.max(A, E)) * (Math.min(H, D) - Math.max(B, F));
	    }
}

//參考:https://blog.csdn.net/qq_16927853/article/details/110518236

