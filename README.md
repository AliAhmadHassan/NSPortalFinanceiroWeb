# NSPortalFinanceiroWeb
Portal Financeiro para fornecedores, built to connect external partners (Netshoes/Nike) to the corporate financial engine. The project provides secure authentication, self-service user and supplier data, tracking of earlypayment requests, accounts payable visibility, communication channels, and exports driven by enterprise SOAP services.

## Stack and architecture
- **Web tier** - JSF 2.0/Facelets with PrimeFaces widgets and Bootstrap; templates such as `WebContent/templates/fiori.xhtml:1` and `WebContent/templates/master.xhtml:1` deliver a Fiori-inspired responsive shell with locale-aware scripts like `WebContent/static/js/portal.js:1`.
- **Servlet 3.0** - `WebContent/WEB-INF/web.xml:1` wires the `FacesServlet`, theme parameters (`primefaces.THEME`), welcome page, error handler, and session timeout.
- **Managed beans + DAL** - Each facelet page delegates to a bean under `src/br/com/aevee/nsPortFinanc/controller/*`, which orchestrates DAL classes that call SOAP services and manage UI state.
- **Session filtering** - `src/br/com/aevee/nsPortFinanc/filters/ControleDeAcesso.java:1` protects the application by white-listing public resources, checking for `dtLoginResp`, and expiring users after inactivity.
- **SOAP integration** - `src/br/com/aevee/nsPortFinanc/DAL/Base.java:1` instantiates WSDL-generated services (`WebContent/wsdl/*.wsdl:1`), injects credentials, increases timeouts, and applies handlers to strip envelope prefixes and format SAP-style dates.
- **Excel and PDF reporting** - Apache POI is used in `src/br/com/aevee/nsPortFinanc/Excel/JavaObjectToExcelSheet.java:1`; some beans also use iText (`com.lowagie.text`) to produce proofs or printable content.
- **Localization** - Labels and hints come from `src/br/com/aevee/nsPortFinanc/web/mensagens.properties:1`, keeping the experience consistent in Portuguese.

## Highlights
### Access, onboarding and security
- Login and forgotten-password flows live in `WebContent/index.xhtml:1`, backed by `UsuarioBean` and `DAL.Login` which persist `dtLoginResp` in session.
- First-time access and the requirement to accept contractual terms are enforced by `MenuPrincipalBean` and `DAL.AceiteContrato` before financial modules become available.

### Supplier and user administration
- `AdministracaoUsuarioBean` exposes DualListModel-based profile management, contact validation, and user creation/edition workflows (`src/br/com/aevee/nsPortFinanc/controller/AdministracaoUsuarioBean.java:1`).
- Supporting DAL classes (`DAL.Usuario`, `DAL.UserProfiles`, `DAL.Fornecedores`) translate those requests into SOAP payloads, sanitize contacts, and cache supplier data for fast selection.

### Early-payment requests and follow-up
- The request screen `WebContent/solicitacaoAcompanhamentoAntecipacaoFinanceira.xhtml:1` lets suppliers filter by CNPJ or company, pick invoices, view aggregated values, and trigger recalculations (`SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean`, `DAL.Adiantamento`).
- The history view (`WebContent/historicoAntecipacaoFinanceira.xhtml:1`) shows approved, pending, and rejected batches, summarizes totals (tax, juros, liquido), and can export data via `HistoricoPlanilha`.

### Accounts payable and publications
- `WebContent/publicacao.xhtml:1` and `PublicacaoBean` collate publications per note, show tax details, allow attachment download, and stream PDFs via `DAL.DownloadPDF`.
- Filtering, export, and row selection support rely on Excel helpers such as `PublicacaoPlanilha` and `SolicitacaoPlanilha`.

### Communication and support
- The "Fale conosco" screen (`WebContent/faleConosco.xhtml:1`) is powered by `ContatoBean`, letting users choose departments and subjects, upload files with PrimeFaces Upload, and deliver messages through `DAL.Contato`.

### Operational polish
- `MenuPrincipalBean` builds dynamic menus from user functions (`DTFuncoes`), surfaces notices from `DAL.Aviso`, and records confirmations or hides.
- Custom converters (`WebContent/src/br/com/aevee/nsPortFinanc/web/*Converter.java:1`) normalize display formats for money, dates, CNPJ, and supplier codes.
- Templates under `WebContent/templates` reuse header and footer slots and deliver growls, dialogs, and responsive layout rules aligned with corporate design.

## Notes for building and deploying
- The project is an Eclipse-style Java EE webapp (`.project`, `.classpath`) targeting any container that supports JSF/Servlet 3.0; deploy as a WAR and the `web.xml` already maps `/faces/*`.
- Ensure PrimeFaces, Bootstrap, Apache POI, iText, and the SOAP client libraries are present inside `WebContent/WEB-INF/lib`.
- To validate the flow, start the server, hit `/faces/index.xhtml`, log in, and the session filter will populate all managed beans from `dtLoginResp`. The repo already includes templates, CSS/JS assets, WSDLs, and message bundles so recruiters can see the full experience.
