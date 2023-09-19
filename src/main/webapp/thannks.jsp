<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<header>
    <h1>Survey</h1>
</header>
<section>
    <p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>

    <h2>Your information</h2>
    <label>Email:</label>
    <span>${surveyForm.user.email}</span><br>
    <label>Last Name:</label>
    <span>${surveyForm.user.lastName}</span><br>
    <label>First Name:</label>
    <span>${surveyForm.user.firstName}</span><br>

    He/she knows about us from: (<span>${surveyForm.wayPeopleKnow}</span>)<br>
    Do you want to receive notifications about new CDs? (<span>${surveyForm.isReceiveNotification}</span>)<br>
    Contact him/her through: (<span>${surveyForm.contactType}</span>)<br>

    <br>
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</section>
</body>
</html>