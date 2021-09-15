package com.gaedef;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DriveSelectorTest {

    private DriveSelector driveSelector = new DriveSelector();

    @Test
    @DisplayName("select a drive vehicle based in age")
    void shouldSelectDrive(){
        assertNotNull(driveSelector);
    }
}
