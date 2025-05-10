package org.eternity.script.generic;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor
@Getter
public class PlayTime {
    @Enumerated(EnumType.STRING) @Column(columnDefinition = "varchar(10)")
    private DayOfWeek dayOfWeek;
    private TimeInterval interval;
}
