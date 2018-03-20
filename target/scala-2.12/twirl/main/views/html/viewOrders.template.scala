
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, orderList: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.79*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("View Order", customer)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

        """),_display_(/*21.10*/if(!orderList.isEmpty())/*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
        """),_display_(/*22.10*/for(o <- orderList ) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
            """),format.raw/*23.13*/("""<p>Order Number: """),_display_(/*23.31*/o/*23.32*/.getId()),format.raw/*23.40*/("""</p>
            <p>Order Date: """),_display_(/*24.29*/o/*24.30*/.dateToString()),format.raw/*24.45*/("""</p>
		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                    <!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*40.22*/for(i <- o.getItems()) yield /*40.44*/ {_display_(Seq[Any](format.raw/*40.46*/("""
                    """),format.raw/*41.21*/("""<tr>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getId()),format.raw/*42.39*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct().getName()),format.raw/*43.54*/("""</td>
                        
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice()))),format.raw/*46.66*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal()))),format.raw/*47.70*/("""</td>
                   </tr>
                    """)))}),format.raw/*49.22*/("""<!-- End of For loop -->
              
			</tbody>
		</table>
        <div class="container-fluid">
            <p style="text-align: right; font-weight: bold;">Order Total: &euro; """),_display_(/*54.83*/("%.2f".format(o.getOrderTotal()))),format.raw/*54.117*/("""</p>
            <a class="btn btn-primary" href=""""),_display_(/*55.47*/routes/*55.53*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*55.87*/("""" role="button">Cancel Order</a>
    </div>
        
    </div>
</div>
        """)))}),format.raw/*60.10*/("""
""")))}/*61.2*/else/*61.6*/{_display_(Seq[Any](format.raw/*61.7*/("""
    """),format.raw/*62.5*/("""<p>You have no orders</p>
""")))}),format.raw/*63.2*/("""
"""),format.raw/*64.1*/("""<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*66.24*/("""{"""),format.raw/*66.25*/("""
		"""),format.raw/*67.3*/("""return confirm('Are you sure?');
	"""),format.raw/*68.2*/("""}"""),format.raw/*68.3*/("""
"""),format.raw/*69.1*/("""</script>
""")))}),format.raw/*70.2*/(""" """))
      }
    }
  }

  def render(customer:models.users.Customer,orderList:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orderList)

  def f:((models.users.Customer,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orderList) => apply(customer,orderList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 15:34:28 GMT 2018
                  SOURCE: C:/Users/User/Documents/lab6/app/views/viewOrders.scala.html
                  HASH: 9a1a749888c09a0426693dc2f5bc9964c0c86b89
                  MATRIX: 1000->1|1150->85|1186->116|1218->143|1272->78|1304->169|1332->171|1404->218|1440->246|1479->248|1512->254|1588->304|1629->336|1669->338|1703->345|1775->390|1789->395|1825->410|1859->417|1900->428|1941->442|1974->466|2014->468|2052->479|2088->499|2128->501|2170->515|2215->533|2225->534|2254->542|2315->576|2325->577|2361->592|2824->1028|2862->1050|2902->1052|2952->1074|3014->1109|3024->1110|3053->1118|3116->1154|3126->1155|3170->1178|3259->1240|3269->1241|3304->1255|3374->1298|3424->1327|3494->1370|3548->1403|3633->1457|3848->1645|3904->1679|3983->1731|3998->1737|4053->1771|4169->1856|4190->1859|4202->1863|4240->1864|4273->1870|4331->1898|4360->1900|4496->2008|4525->2009|4556->2013|4618->2048|4646->2049|4675->2051|4717->2063
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|56->24|56->24|56->24|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|77->45|77->45|78->46|78->46|79->47|79->47|81->49|86->54|86->54|87->55|87->55|87->55|92->60|93->61|93->61|93->61|94->62|95->63|96->64|98->66|98->66|99->67|100->68|100->68|101->69|102->70
                  -- GENERATED --
              */
          