package aps_ivan_hoffmann;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

	private CorreioService correioServiceMock;

	@Before
	public void init() {
		CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
	}

	@Test
		public void testMockGetEndereco900000() {
			CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
			when(correioServiceMock.buscaEndereco('9000000')).thenReturn("Porto Alegre");
			Assert.assertEquals('Porto Alegre', correioServiceMock.buscaEndereco());		
			
		}

	@Test
		public void testMockGetEndereco800000() {
			
			CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
			when(correioServiceMock.buscaEndereco('8000000')).thenReturn("Av. Assis Brasil");
			Assert.assertEquals('Av. Assis Brasil', correioServiceMock.buscaEndereco());
			
		}

}

}
