package org.btg.practual;

import org.junit.jupiter.api.Test;
import org.btg.practual.tasks.FillReportData;
import org.btg.practual.tasks.SubmitReport;
import org.btg.practual.tasks.AccessChronosWeb;
import org.btg.practual.questions.ReportGenerationStatus;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HappyPathTest {

    @Test
    public void testTasksCanBeInstantiated() {
        // Verificar que los tasks se pueden instanciar correctamente
        AccessChronosWeb accessTask = AccessChronosWeb.theChronosWeb();
        assertNotNull(accessTask);

        FillReportData fillTask = FillReportData.withNumber("417")
                .forCompany("banco")
                .withDate("2026-02-01");
        assertNotNull(fillTask);

        SubmitReport submitTask = SubmitReport.theReport();
        assertNotNull(submitTask);

        ReportGenerationStatus statusQuestion = ReportGenerationStatus.forReport("417");
        assertNotNull(statusQuestion);
    }
}
