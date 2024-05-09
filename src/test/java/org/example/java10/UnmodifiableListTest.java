package org.example.java10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UnmodifiableListTest {

    @Test
    @DisplayName("Unmodifiable List는 불변성 리스트이기 때문에 요소를 바꿀 수 없다.")
    void testUnmodifiableList() {
        // Given
        List<String> list = Arrays.asList("a", "b", "c");

        // When
//        List<String> unmodifiable = list.stream().collect(Collectors.toUnmodifiableList());
        List<String> unmodifiable = list.stream().toList();

        // Then
        assertThrows(UnsupportedOperationException.class, () -> unmodifiable.add("d"));
    }
}