<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="html" />
	<xsl:template match="/standings">
		<html lang="en">
			<head>
				<meta charset="UTF-8" />
				<title>Task</title>
				<link rel="stylesheet"
					href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
			</head>
			<body>
				<div class="container-fluid">
					<table class="table table-striped">
						<thead class="thead-dark">
							<tr>
								<th>#</th>
								<th>Команда</th>
								<th>И</th>
								<th>В</th>
								<th>Н</th>
								<th>П</th>
								<th>Г</th>
								<th>О</th>
							</tr>
						</thead>
						<xsl:apply-templates select="tournament" />
					</table>
				</div>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="tournament">
		<xsl:for-each select="team">
			<tr>
				<td>
					<xs:value-of select="@position" />
				</td>
				<td>
					<xs:value-of select="@name" />
				</td>
				<td>
					<xs:value-of select="overall/@gp" />
				</td>
				<td>
					<xs:value-of select="overall/@w" />
				</td>
				<td>
					<xs:value-of select="overall/@d" />
				</td>
				<td>
					<xs:value-of select="overall/@l" />
				</td>
				<td>
					<xs:value-of select="overall/@gs" />
					:
					<xs:value-of select="overall/@ga" />
				</td>
				<td>
					<xs:value-of select="total/@p" />
				</td>
			</tr>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>