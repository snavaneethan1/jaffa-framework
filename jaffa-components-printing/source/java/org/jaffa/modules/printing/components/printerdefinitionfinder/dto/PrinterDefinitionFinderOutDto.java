// .//GEN-BEGIN:_1_be
/******************************************************
 * Code Generated From JAFFA Framework Default Pattern
 * 
 * The JAFFA Project can be found at http://jaffa.sourceforge.net
 * and is available under the Lesser GNU Public License
 ******************************************************/
package org.jaffa.modules.printing.components.printerdefinitionfinder.dto;

import java.util.*;
import org.jaffa.components.finder.*;
// .//GEN-END:_1_be
// Add additional imports//GEN-FIRST:_imports




// .//GEN-LAST:_imports
// .//GEN-BEGIN:_2_be
/** The output for the PrinterDefinitionFinder.
 */
public class PrinterDefinitionFinderOutDto extends FinderOutDto {

    /** Holds an array of rows to be returned. */
    private List rows;

    /** Default Constructor.*/    
    public PrinterDefinitionFinderOutDto() {
        rows = new ArrayList();
    }

    /** Add rows.
     * @param rows Rows.
     */    
    public void addRows(PrinterDefinitionFinderOutRowDto rows) {
        this.rows.add(rows);
    }
    
    /** Add rows at the specified position.
     * @param rows Rows.
     * @param index The position at which the rows is to be added.
     */    
    public void setRows(PrinterDefinitionFinderOutRowDto rows, int index) {
        //-- check bounds for index
        if ((index < 0) || (index > this.rows.size()))
            throw new IndexOutOfBoundsException();
        
        this.rows.set(index, rows);
    }
    
    /** Add an array of rows. This will overwrite existing rows.
     * @param rows An array of rows.
     */    
    public void setRows(PrinterDefinitionFinderOutRowDto[] rows) {
        this.rows = Arrays.asList(rows);
    }
    
    /** Clear existing rows.
     */    
    public void clearRows() {
        rows.clear();
    }
    
    /** Remove rows.
     * @param rows Rows.
     * @return A true indicates a rows was removed. A false indicates, the rows was not found.
     */    
    public boolean removeRows(PrinterDefinitionFinderOutRowDto rows) {
        return this.rows.remove(rows);
    }
    
    /** Returns a rows from the specified position.
     * @param index The position index.
     * @return Rows.
     */    
    public PrinterDefinitionFinderOutRowDto getRows(int index) {
        //-- check bounds for index
        if ((index < 0) || (index > rows.size()))
            throw new IndexOutOfBoundsException();
        
        return (PrinterDefinitionFinderOutRowDto) rows.get(index);
    }
    
    /** Returns an array of rows.
     * @return An array of rows.
     */    
    public PrinterDefinitionFinderOutRowDto[] getRows() {
        return (PrinterDefinitionFinderOutRowDto[]) rows.toArray(new PrinterDefinitionFinderOutRowDto[0]);
    }
    
    /** Returns a count of rows.
     * @return The count of rows.
     */    
    public int getRowsCount() {
        return rows.size();
    }


    /** Returns the debug information
     * @return The debug information
     */
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("<PrinterDefinitionFinderOutDto>");
        buf.append("<moreRecordsExist>"); if (getMoreRecordsExist() != null) buf.append(getMoreRecordsExist()); buf.append("</moreRecordsExist>");

        buf.append("<rows>");
        PrinterDefinitionFinderOutRowDto[] rows = getRows();
        for (int i = 0; i < rows.length; i++) {
            buf.append(rows[i].toString());
        }
        buf.append("</rows>");
        
        buf.append("</PrinterDefinitionFinderOutDto>");
        return buf.toString();
    }

    // .//GEN-END:_2_be
    // All the custom code goes here //GEN-FIRST:_custom






    // .//GEN-LAST:_custom
}