/** <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>XTemporal</title>
    <meta content="Marc Ubaldino" name="author">
  </head>
  <body>
    <h1> XTemporal: Date and Time Pattern Extraction </h1>
    XTemporal allows you to extract and normalize date/time
    patterns.&nbsp; Current library is seven (7) most common date
    patterns.&nbsp; This shadows developments with FlexPat and XCoord.
    <h1>Usage</h1>
    <p>From the command line you can quickly test XCoord on a set of
      given test cases or provide a file of your own.<br>
    </p>
    <pre style="margin-left: 40px;">ant test <br>file?&nbsp;&nbsp;&nbsp; test/mytest.txt<br></pre>
    <pre style="margin-left: 40px;">ant test-default</pre>
    <p>... runs internal unit tests coupled with the given patterns
      configuration file<br>
    </p>
    <p>Programmatically, the essential usage is:<br>
    </p>
    <pre style="margin-left: 40px;"> XTemporal xdt = new XTemporal(true);<br>      <br> xdt.configure();<br> xdt.test("/text/file.txt");<br><br> XTempResult res = xdt.extract_dates(buf, id);<br>	<br> // print our res.matches<br></pre>
    <h1>Pattern Definition</h1>
    <p><br>
      TBD<br>
    </p>
    <h1><br>
    </h1>
  </body>
</html>
*/
package org.mitre.xtemporal;
