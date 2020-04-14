String primary_sub="",primary_pv_sub="",second_sub="",second_pv_sub="",third_sub="",third_pv_sub="";
if(!(primary.equals("")||primary.equals(" _ ")))
 primary_sub=primary.substring(0,primary.indexOf("_"));
if(!(primary_pv.equals("")||primary_pv.equals(" _ ")))
 primary_pv_sub=primary_pv.substring(0,primary_pv.indexOf("_"));
if(!(second.equals("")||second.equals(" _ ")))
 second_sub=second.substring(0,second.indexOf("_"));
if(!(second_pv.equals("")||second_pv.equals(" _ ")))
 second_pv_sub=second_pv.substring(0,second_pv.indexOf("_"));
if(!(third.equals("")||third.equals(" _ ")))
 third_sub=third.substring(0,third.indexOf("_"));
if(!(third_pv.equals("")||third_pv.equals(" _ ")))
 third_pv_sub=third_pv.substring(0,third_pv.indexOf("_"));



if(prefix_key.equals(primary_sub))
 empaddtnfield=primary.substring(primary.indexOf("_")+1,primary.length());
else if(prefix_key.equals(primary_pv_sub))
 empaddtnfield=primary_pv.substring(primary_pv.indexOf("_")+1,primary_pv.length());
else if(prefix_key.equals(second_sub))
 empaddtnfield=second.substring(second.indexOf("_")+1,second.length());
else if(prefix_key.equals(second_pv_sub))
 empaddtnfield=second_pv.substring(second_pv.indexOf("_")+1,second_pv.length());
else if(prefix_key.equals(third_sub))
 empaddtnfield=third.substring(third.indexOf("_")+1,third.length());
else if(prefix_key.equals(third_pv_sub))
 empaddtnfield=third_pv.substring(third_pv.indexOf("_")+1,third_pv.length());
 if(empaddtnfield.equals("")||empaddtnfield==null)
 {
     empaddtnfield="NO";
 }
