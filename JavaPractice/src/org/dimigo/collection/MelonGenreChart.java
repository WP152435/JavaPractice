/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 1. 개요: 
 * 2. 작성일: 2017. 6. 12.
 * </pre> 
 *
 * @author : user
 * @version : 1.0
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		Map<String, List<Music>> charts = new HashMap<>();
		charts.put("발라드", new ArrayList<Music>());
		charts.put("댄스", new ArrayList<Music>());
		
		charts.get("발라드").add(new Music("팔레트", "아이유"));
		charts.get("댄스").add(new Music("I LUV IT", "PSY"));
		charts.get("댄스").add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(charts);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		charts.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(charts);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		charts.get("댄스").remove(0);
		printMap(charts);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		charts.clear();
		printMap(charts);
	}

	public static void printMap(Map<String, List<Music>> map)
	{
		for(Map.Entry<String, List<Music>> en : map.entrySet())
		{
			System.out.println("[" + en.getKey() + "]");
			int i = 1;
			for(Music music : en.getValue())
			{
				System.out.println(i + ". " + music);
				i++;
			}
		}
		System.out.println();
	}
}
