package com.sapphire.common.collection;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ethan on 2016/3/7.
 */
public class MyMapTest {
   @Test
   public void test() {
      HashMap<String, String> map = new HashMap<String, String>();

      for (int i = 0; i < 20; i++) {
         map.put(RandomStringUtils.randomAlphabetic(4),
               RandomStringUtils.randomAlphabetic(10));
      }
      map.put("123", "456");
      Assert.assertEquals(map.size(), 21);

      Collection<String> collection = map.values();
      Assert.assertEquals(collection.size(), 21);
      map.clear();

      Set<Map.Entry<String, String>> entrySet = map.entrySet();

      Assert.assertNotNull(entrySet);
   }
}
