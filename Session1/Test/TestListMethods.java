
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListMethods {

    ADSListADT<String> linkedList;

    @Before
    public void createList(){

        linkedList = new ADSLinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");

    }

    @Test
    public void testAddAddsElmToEndOfList(){
        //Arrange

        //Act
        linkedList.add("3");

        //Assert
        assertEquals(3,linkedList.indexOf("3"));
    }

    @Test
    public void insertMovesAllElementsToTheRight(){
        //Arrange

        //Act
        linkedList.insert(1,"hej");

        //Assert
        assertEquals(2,linkedList.indexOf("1"));
        assertEquals(1,linkedList.indexOf("hej"));
        assertEquals(3,linkedList.indexOf("2"));
    }

    @Test
    public void removeIndexNumberMovesAllElementsToLeft(){
        //Arrange

        //Act
        linkedList.remove(1);

        //Assert
        assertEquals(1,linkedList.indexOf("2"));
    }

    @Test
    public void removingElementMovesOtherElementsToLeft(){
        //Arrange
        //Act
        linkedList.remove("1");

        //Assert
        assertEquals(1,linkedList.indexOf("2"));
    }

    @Test
    public void indexOfReturnsCorrectPosition(){
        //Arrange

        //Act

        //Assert
        assertEquals(2,linkedList.indexOf("2"));
    }

    @Test
    public void indexOfForNonExistingInList(){
        //Arrange

        //Act

        //Assert
        assertEquals(-1,linkedList.indexOf("doesNotExist"));
    }

    @Test
    public void sizeReturnsSizeOfLinkedList(){
        //Arrange

        //Act

        //Assert
        assertEquals(3,linkedList.size());
    }

    @Test
    public void containsElementsReturnsTrue(){
        //Arrange

        //Act

        //Assert
        assertEquals(true,linkedList.contains("2"));
    }

    @Test
    public void containsElementsReturnsFalseIfNotContaining(){
        //Arrange
        //Act

        //Assert
        assertEquals(false,linkedList.contains("doesNotExist"));
    }


    @Test
    public void removeMovesAllElementsToLeft(){
        //Arrange

        //Act
        linkedList.remove(1);

        //Assert
        assertEquals(1,linkedList.indexOf("2"));
    }

    @Test
    public void removeReturnsRemovedElement(){
        //Arrange

        //Act

        //Assert
        assertEquals("1",linkedList.remove(1));
    }



    @Test
    public void setElementReturnsTheOldElement(){
        //Arrange

        //Act

        //Assert
        assertEquals("1",linkedList.set(1,"HEEEJ"));
    }

}
