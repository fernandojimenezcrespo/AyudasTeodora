package com.ejemplo;



import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import lombok.extern.log4j.Log4j2;
import ui.AyudasTeodoraUI;
import ui.PdfsUI;

@Route
@Log4j2
public class MainView extends AppLayout {

    public MainView() {
        DrawerToggle toggle = new DrawerToggle();

        H1 title = new H1("Ayudas Teodora");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");

        SideNav nav = getSideNav();
        
        

        Scroller scroller = new Scroller(nav);
        scroller.setClassName(LumoUtility.Padding.SMALL);

        addToDrawer(scroller);
        addToNavbar(toggle, title);
    }

    private SideNav getSideNav() {
        SideNav sideNav = new SideNav();
        SideNavItem ayudasLink= new SideNavItem("Ayudas Teodora",AyudasTeodoraUI.class,VaadinIcon.PENCIL.create());
        ayudasLink.addItem(new SideNavItem("AyudaTeodora","/AyudasTeodora",VaadinIcon.INFO.create()));
        SideNavItem pdfLink= new SideNavItem("PDFs",PdfsUI.class,VaadinIcon.PAPERPLANE.create());
        pdfLink.addItem(new SideNavItem("Cribado","/CribadoPDF",VaadinIcon.NOTEBOOK.create()));
        pdfLink.addItem(new SideNavItem("Tensión Arterial","/TensionArterialPDF",VaadinIcon.HEART.create()));
        pdfLink.addItem(new SideNavItem("Control Sensores","/ControlSensores",VaadinIcon.CONTROLLER.create()));

         
         sideNav.addItem(ayudasLink,pdfLink);
        return sideNav;
    }


}