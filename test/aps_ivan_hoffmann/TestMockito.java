package aps_ivan_hoffmann;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	private CorreioService correioServiceMock;
	
	@Before
	public void init() {
		correioServiceMock = Mockito.mock(CorreioService.class);
	}
	
	@Test
	public void testMockEndereco900000() {
		
		when(correioServiceMock.buscaEndereco("900000")).thenReturn("Porto Alegre");
	
		Assert.assertEquals("Porto Alegre", correioServiceMock.buscaEndereco("900000"));		
		
	}
	
	@Test
	public void testMockEndereco800000() {
				
		when(correioServiceMock.buscaEndereco("800000")).thenReturn("Av. Assis Brasil");
		
		Assert.assertEquals("Av. Assis Brasil", correioServiceMock.buscaEndereco("800000"));
		
	}
	
	
}
