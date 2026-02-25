package org.btg.practual.pages;

import org.openqa.selenium.By;

/**
 * Page Object para la página de Generación de Reportes en Chronos
 * URL: https://ozonodev.btgpactual.com.co/process/chronos
 */
public class ChronosReportPage {

    // Encabezados y títulos
    public static final By PAGE_TITLE = By.xpath("//h2[contains(text(), 'Generación de Reportes')]");
    public static final By PAGE_SUBTITLE = By.xpath("//h6[contains(text(), 'Por favor seleccione el reporte que desea generar')]");

    // Campos del formulario
    public static final By REPORT_FIELD = By.id("report");
    public static final By COMPANY_SELECT = By.cssSelector("[data-testid='select-company']");
    public static final By REPORT_DATE_FIELD = By.id("reportDate");

    // Botones
    public static final By GENERATE_BUTTON = By.xpath("//button[contains(text(), 'Generar')]");
    public static final By DOWNLOAD_BUTTON = By.xpath("//button[contains(span, 'Descargar')]");

    // Tabla de resultados
    public static final By RESULTS_TABLE = By.xpath("//div[@role='grid']");
    public static final By TABLE_ROWS = By.xpath("//div[@role='row']");
    public static final By TABLE_CELL_REPORT_ID = By.xpath("//div[@data-field='Reporte']");
    public static final By TABLE_CELL_USER = By.xpath("//div[@data-field='Usuario']");
    public static final By TABLE_CELL_DATE = By.xpath("//div[@data-field='FechaCreacion']");
    public static final By TABLE_CELL_PARAMETERS = By.xpath("//div[@data-field='Parametros']");
    public static final By TABLE_CELL_OBSERVATIONS = By.xpath("//div[@data-field='Observaciones']");

    // Búsqueda en tabla
    public static final By SEARCH_INPUT = By.id("search-toolbar");
    public static final By CLEAR_SEARCH_BUTTON = By.xpath("//button[@aria-label='Clear']");

    // Paginación
    public static final By PAGINATION_ROWS_SELECTOR = By.xpath("//p[@id=':r8:']");
    public static final By PAGINATION_NEXT_BUTTON = By.xpath("//button[@aria-label='Go to next page']");
    public static final By PAGINATION_PREV_BUTTON = By.xpath("//button[@aria-label='Go to previous page']");

    // Alertas y notificaciones
    public static final By SUCCESS_ALERT = By.xpath("//div[contains(@class, 'MuiAlert-message') and contains(text(), 'solicitud para la creación del reporte se ha enviado con éxito')]");
    public static final By ERROR_ALERT = By.xpath("//div[contains(@class, 'MuiAlert-message') and contains(text(), 'Ocurrió un error')]");
    public static final By ALERT_CLOSE_BUTTON = By.xpath("//button[@aria-label='Close' and @title='Close']");

    // Menú usuario (para logout si es necesario)
    public static final By USER_PROFILE_BUTTON = By.xpath("//button[@aria-label='open profile']");
    public static final By USER_NAME = By.xpath("//h6[contains(text(), 'Casallas, Patricia')]");

    // Sidebar navigation
    public static final By DASHBOARD_LINK = By.xpath("//span[contains(text(), 'Dashboard')]");
    public static final By MENU_DRAWER = By.xpath("//div[@class='MuiDrawer-root MuiDrawer-docked']");

    // Selectores alternativos robustos
    public static final By REPORT_INPUT_FIELD = By.cssSelector("input[id='report']");
    public static final By COMPANY_FIELD = By.cssSelector("[data-testid='select-company'] input");
    public static final By REPORT_DATE_INPUT = By.cssSelector("input[id='reportDate']");

    // Loading/Progress indicators
    public static final By LOADING_PROGRESS = By.xpath("//div[@class='MuiLinearProgress-bar']");
}
