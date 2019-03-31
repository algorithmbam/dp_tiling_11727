package dp_tiling_11727;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TilingTest {

	private Tiling tiling;
	
	@Before
	public void setUp() {
		tiling= new Tiling();
	}

	@Test
	public void in1_out1() {
		
		int result= tiling.dp(1);
		
		assertThat(result, is(1));
	}
	
	@Test
	public void in2_out3() {
		
		int result= tiling.dp(2);
		
		assertThat(result, is(3));
	}
	
	@Test
	public void in3_out5() {
		
		int result= tiling.dp(3);
		
		assertThat(result, is(5));
	}
	
	@Test
	public void in8_out171() {
		
		int result= tiling.dp(8);
		
		assertThat(result, is(171));
	}
	
	@Test
	public void in12_out2731() {
		
		int result= tiling.dp(12);
		
		assertThat(result, is(2731));
	}
}
