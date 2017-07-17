$.get("users", function(persons) {

    var response = jQuery.parseJSON(persons);
    var result = false;
    $(response).each(function(i, p) {
        result = true;
        $("#persons").append(
            $('<tr>').append(
                $('<td>').append(i+1)).append(
                $('<td>').append(p.name)).append(
                $('<td>').append(p.email)).append(
                $('<td>').append("<button type='button' class='btn btn-danger' onclick='deleteUser(\"" + p.name + "\")'>Delete</button>"))
        );
    });
    if(result == true) {
        $("#noResult").hide();
        $("#persons").show();
    } else {
        $("#persons").hide();
        $("#noUsers").show();
    }

});

$(document).ready(function(){
    $("#searchForm").submit(function( event ) {
      var result = false;
      event.preventDefault();
        $.post("searchUser",{searchString : $("#searchString").val()}, function(persons){

            var response = jQuery.parseJSON(persons);

            $('#searchResult tbody').remove();
            $(response).each(function(i, p) {
                result = true;
                $("#resultTable").append($('<tr>').append(
                    $('<td>').append(i+1)).append(
                    $('<td>').append(p.name)).append(
                    $('<td>').append(p.email))
                );
            });
            if(result == true) {
                $("#noResult").hide();
                $("#searchResult").show();
            } else {
                $("#searchResult").hide();
                $("#noResult").show();
            }
        });
    });
});

function deleteUser(name) {

    alert("Are you sure you want to delete ?");
    $.ajax({
        url: 'deleteUser/' + name,
        type: 'DELETE',
        success: function(result) {
            location.reload();
        }
    });
    return;
}