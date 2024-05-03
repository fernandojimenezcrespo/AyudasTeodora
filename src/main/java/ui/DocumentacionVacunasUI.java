/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinServletService;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author ferna
 */
@Route(value = "DocumentacionVacunasUI", layout = MainView.class)
@Log4j2
public class DocumentacionVacunasUI extends Div {

    public DocumentacionVacunasUI() {
        String htmlContent = """
                             <html>
                           <body>
                           <div id="global" class="container"> 
                           	
                             <p class="text-info" id="vph">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success"> VIRUS DEL PAPILOMA HUMANO (VPH):Gardasil 9 </th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Igual para ambos sexos:<b>2 dosis</b> separadas al menos por un intervalo de 6 meses.</li>
                                     <li>Varones:Nacidos a partir del 1 de enero de 2011(&le;  12 años)</li>
                                     <li>Mujeres:Nacidas a partir de 1994 (&le;29 años)</li>
                                     <li>En las personas adultas se administran <strong>3 dosis</strong>. (0-2-6 meses) y se lo tienen que financiar los propios pacientes.</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="neumococo">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success">VACUNA NEUMOCOCO CONJUGADA 20 VALENTE (<font color="blue"> VNC20</font>) 
                             </th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Personas que no hayan recibido previamente la VNC13 y cumplan:</li>
                                     <li>Mayores de  65 años. (1957 y 1958)</li>
                                     <li>Grupos de riesgo </li>
                                     <li>Personas institucionalizadas.</li>
                                   </ul>
                                   <ul>
                                     <p><b>Grupos de Riesgo 1:Personas inmunodeprimidas y otras condiciones de alto riesgo:</b></p>
                                     <li>Inmunodeficiencias congénitas o adquiridas</li>
                                     <li>Tratamiento con inmunosupresores</li>
                                     <li>Asplenia, disfunción esplénica grave, deficiencias complemento y tto. con eculizumab/ravulizumab</li>
                                     <li>Trasplante de órgano sólido</li>
                                     <li>Infección por VIH</li>
                                     <li>Cáncer / Hemopatías malignas</li>
                                     <li>Enfermedad renal crónica avanzada y hemodiálisis</li>
                                     <li>Enfermedades inflamatorias crónicas con tratamiento inmunosupresor</li>
                                     <li>Trasplante de progenitories hematopoyéticos:se recomiendan 3 dosis de VNC</li>
                                     <li>Sindrome de Down</li>
                                     <li>Implante coclear.</li>
                                     <li>Fístula de LCR</li>
                                   </ul>
                                   <ul>
                                     <p><b>Grupos de Riesgo 2 Personas con patologías con riesgo moderado y otros grupos de riesgo:</b></p>
                                     <li>Alcoholismo</li>
                                     <li>Enfermedad hepática crónica, incluyendo cirrosis hepática</li>
                                     <li>Enfermedad cardiaca crónica</li>
                                     <li>Enfermedades respiratorias crónica,(incluida asma y fibrosis quística) y patología plulmonar tras COVID-19</li>
                                     <li>Enfermedades neurológicas y neuromusculares graves</li>
                                     <li>Diabetes mellitus</li>
                                     <li>Obesidad mórvida (IMC&ge;40 en adultos)</li>
                                     <li>Enfermedad celiaca</li>
                                     <li>Antecedente de enfermedad neumocócica confirmada</li>
                                     <li>Personas institucionalizadas en residencias de mayores y centros de discapacidad</li>
                                   </ul>
                                   <ul>
                                     <b>A tener en cuenta:</b>
                                     <li>Se puede vacunar en cualquier época del año.</li>
                                     <li>Se aconseja evitar campañas de vacunación de gripe y covid, aunque se puede coadministrar en lugares anatómicos distintos y dejando reflejado en qué extremidad se administra cada vacuna.</li>
                                   </ul>
                                   <table width="934" border="1">
                                     <tbody>
                                       <tr>
                                         <td colspan="2" rowspan="2"><b>GRUPO POBLACIONAL</b></td>
                                         <td width="140" rowspan="2"><b>SIN VACUNA PREVIA</b></td>
                                         <td colspan="3" align="center"><b>CON VACUNA PREVIA</b></td>
                                       </tr>
                                       <tr>
                                         <td width="202">Al menos una dosis de VNC13</td>
                                         <td width="201">Al menos una dosis de <font color="red"> VNP23 </font></td>
                                         <td width="104">VNC13+<font color="red"> VNP23 </font></td>
                                       </tr>
                                       <tr>
                                         <td width="112" rowspan="3">&ge;65 años</td>
                                         <td width="135">Sin patologia de riesgo</td>
                                         <td><font color="blue"> VNC20</font></td>
                                         <td><font color="red"> VNP23 </font> (intervalo 1 año)</td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td>no revacunar</td>
                                       </tr>
                                       <tr>
                                         <td>Grupo 2 riesgo moderado</td>
                                         <td><font color="blue"> VNC20</font></td>
                                         <td><font color="red"> VNP23 </font> (intervalo 1 año)</td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td>no revacunar</td>
                                       </tr>
                                       <tr>
                                         <td>Grupo 1 alto reisgo</td>
                                         <td><font color="blue"> VNC20</font></td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td>Valorar individualmente <font color="blue"> VNC20</font> a los 5 años de la útlima dosis de <font color="red"> VNP23 </font></td>
                                       </tr>
                                       <tr>
                                         <td rowspan="2">18-64 años</td>
                                         <td>Grupo 2 reisgo moderado</td>
                                         <td><font color="blue"> VNC20</font></td>
                                         <td><font color="red"> VNP23 </font> (intervalo 1 año)</td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td>No revacunar</td>
                                       </tr>
                                       <tr>
                                         <td>Grupo 1 alto riesgo</td>
                                         <td><font color="blue"> VNC20</font></td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td><font color="blue"> VNC20</font> (intervalo 1 año)</td>
                                         <td>Valorar individualmente <font color="blue"> VNC20</font> a los 5 años de la última dosis de <font color="red"> VNP23 </font></td>
                                       </tr>
                                       <tr>
                                         <td rowspan="2">6-17 años</td>
                                         <td>Grupo 2 riesgo moderado</td>
                                         <td>VNC13</td>
                                         <td><font color="red"> VNP23 </font> (intervalo 1 año)</td>
                                         <td>VNP13 (intervalo 1 año)</td>
                                         <td>NO revacunar</td>
                                       </tr>
                                       <tr>
                                         <td>Grupo 1 alto riesgo</td>
                                         <td>VNC13</td>
                                         <td><font color="red"> VNP23 </font> (intervalo 1 año)</td>
                                         <td>VNP13 (intervalo 1 año)</td>
                                         <td>No revacunar excepto en personas inmunodeprimidas 2ª dosis de <font color="red"> VNP23 </font> separada al menos 5 años de la 1ª dosis de <font color="red"> VNP23 </font></td>
                                       </tr>
                                     </tbody>
                                   </table></td>
                               </tr>
                               <tr>
                                 <td>&nbsp;</td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="herpes">
                             <table class="table table-bordered" >
                               <tr>
                                 <th class="success"><strong>HERPES ZOSTER (Shingrix)</strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Se administran 2 dosis separadas por un intervalo mínimo de 8 semanas</li>
                                     <li>En Castilla y León los nacidos en 1957 y 1958 &le; a 66 años y se irán añadiendo cohortes de edad.</li>
                                     <li>Se puede poner a partir de los 50 años y a partir de los 18 en el caso de riesgo <strong>HZ</strong>. </li>
                                     <li>Pacientes de riesgo.</li>
                                     <li>Se debe hacer recaptación.</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="tetanos">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success"><strong>TETÁNOS</strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Para estar vacunados completo del tétanos hay que tener 5 dosis.</li>
                                     <li>Si no ha estado vacunado nunca, se administran 3 dosis :0 -1 mes-1 año. (Vacuna Td). Después hasta alcanzar 5 dosis cada 10 años o después de 5 si se sufre herida o quemadura grave o sucia.</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="hepatitisA">
                             <table class="table table-bordered" >
                               <tr>
                                 <th class="success"><strong>HEPATITIS A</strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Se administran 2 dosis con un intervalo mínimo de 6 meses entre dosis.</li>
                                     <li>Si se convina con <strong>HEPATITIS B</strong>, son 3 dosis: 0- 1 mes - 6 meses</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="hepatitisB">
                             <table class="table table-bordered" >
                               <tr>
                                 <th class="success"><strong>HEPATITIS B</strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Se administran 3 dosis 0 - 1 mes - 6 meses.</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="hpeatitisAB">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success"><strong>HEPATITIS A-B</strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Se pueden poner juntas </li>
                                     <li>Son tres dosis 0 - 1 mes - 6 meses</li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="covid19">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success"><strong>COVID19</strong>          		</th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>Dosis de recuerdo tras los 5 meses de la anterior</li>
                                     <li>Si se ha pasado la enfermedad: </li>
                                     <ul>
                                       <li>Si son mayores de 80, instuticionalizados o personas de riesgo, se administrará a los 3 meses.</li>
                                       <li>Si son menores de 80 años será a los 5 meses.</li>
                                     </ul>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                             <p class="text-info" id="rubeola">
                             <table class="table table-bordered">
                               <tr>
                                 <th class="success"><strong>RUBEOLA </strong></th>
                               </tr>
                               <tr>
                                 <td><ul>
                                     <li>En adultos se pone la vacuna triple vírica.</li>
                                     <li>La vacunación correcta son 2 dosis, si no está vacunado. Pero  se pone una dosis y si se necesitase otra, ha de ser valorado por el especialista que lo solicita. </li>
                                   </ul></td>
                               </tr>
                             </table>
                             </p>
                           </div>
                           
                           </body>
                           </html>
                             """;

        Html html = new Html(htmlContent);
        add(html);

    }
}
