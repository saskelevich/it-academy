<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/standings">
		<html>
			<body>
				<table border="1px solid black">
					<tr>
						<td>
							Position
						</td>
						<td>
							Team
						</td>
						<td>
							GamePlayed
						</td>
						<td>
							Win
						</td>
						<td>
							Draw
						</td>
						<td>
							Lose
						</td>
						<td>
							gs/ga
						</td>
					</tr>
					<xsl:for-each select="tournament/team">
						<tr>
							<td>
								<xsl:value-of select="@position" />
							</td>
							<td>
								<xsl:value-of select="@name" />
							</td>
							<xsl:for-each select="overall">
								<td>
									<xsl:value-of select="@gp" />
								</td>
								<td>
									<xsl:value-of select="@w" />
								</td>
								<td>
									<xsl:value-of select="@d" />
								</td>
								<td>
									<xsl:value-of select="@l" />
								</td>
								<td>
									<xsl:value-of select="@gs" />
									/
									<xsl:value-of select="@ga" />
								</td>
							</xsl:for-each>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>