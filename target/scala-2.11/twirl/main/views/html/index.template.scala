
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import helper._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Play with MongoDB</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""'>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src='"""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/script.js")),format.raw/*11.71*/("""' type="text/javascript"></script>
    </head>
    <body>

        <div class="container">

            <h3>Add Users to our system</h3>

            """),_display_(/*19.14*/form(routes.MainController.addUser())/*19.51*/ {_display_(Seq[Any](format.raw/*19.53*/("""
                """),format.raw/*20.17*/("""<div class="form-group">
                    <label for="name">Name:</label>
                    <input name="name" id="name" type="text" class="form-control" required >
                </div>

                <div class="form-group">
                    <label for="email">Email:</label>
                    <input name="email" id="email" type="email" class="form-control" required >
                </div>

                <button type="submit" class="btn btn-primary">Add User</button>
            """)))}),format.raw/*31.14*/("""

            """),format.raw/*33.13*/("""<div>
                <h3>Search with users name</h3>
                """),_display_(/*35.18*/form(routes.MainController.getUserByName(), 'role -> "search", 'id -> "searchForm")/*35.101*/ {_display_(Seq[Any](format.raw/*35.103*/("""
                    """),format.raw/*36.21*/("""<div class="form-group">
                        <input id="searchString" name="searchString" type="search" value="" class="form-control" required >
                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>
                """)))}),format.raw/*40.18*/("""
            """),format.raw/*41.13*/("""</div>
            <div id="searchResult" style="display:none">
                <h3>Search result</h3>
                <table id="resultTable" class="table table-bordered table-hover">
                    <thead>
                        <td>#</td>
                        <td>Name</td>
                        <td>Email</td>
                    </thead>
                </table>
            </div>
            <div >
                <p id="noResult" class="alert alert-warning" style="display:none">No matching results found</p>
            </div>

            <div>
                <h3>Existing users in our system</h3>
                <p id="noUsers" class="alert alert-warning" style="display:none">No users found in system</p>
                <table id="persons" class="table table-bordered table-hover" style="display:none">
                    <thead>
                        <td>#</td>
                        <td>Name</td>
                        <td>Email</td>
                        <td></td>
                    </thead>
                </table>
            </div>

        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Tue May 10 19:50:59 BST 2016
                  SOURCE: C:/Users/maithili/Desktop/final-ob/ms-frontend/app/views/index.scala.html
                  HASH: 2f2ef1afe31bba1d016f4093c2ac260bc1428b24
                  MATRIX: 653->18|931->270|945->276|1005->315|1156->439|1171->445|1234->487|1412->638|1458->675|1498->677|1543->694|2076->1196|2118->1210|2216->1281|2309->1364|2350->1366|2399->1387|2705->1662|2746->1675
                  LINES: 28->3|33->8|33->8|33->8|36->11|36->11|36->11|44->19|44->19|44->19|45->20|56->31|58->33|60->35|60->35|60->35|61->36|65->40|66->41
                  -- GENERATED --
              */
          