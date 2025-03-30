package trkck.mssc.brewery.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import trkck.mssc.brewery.services.BeerService;
import trkck.mssc.brewery.web.model.BeerDto;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @MockitoBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    BeerDto validBeer;

    @Before
    public void setUp() {
        validBeer = BeerDto.builder()
                .beerName("Beer1")
                .beerStyle("PALE_ALE")
                .upc(1234567890L)
                .build();
    }



//    @Test
//    void handlePost() throws Exception {
//
//        BeerDto beerDto = validBeer;
//        beerDto.setId(UUID.randomUUID());
//        BeerDto savedDto = beerDto.builder().id(UUID.randomUUID()).beerName("New Beeer").build();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//
//        given(beerService.saveNewBeer(any())).willReturn(savedDto);
//
//        mockMvc.perform(post("/api/v1/beer/").contentType(MediaType.APPLICATION_JSON)
//                .content(beerDtoJson)).andExpect(status().isCreated());
//
//    }


}