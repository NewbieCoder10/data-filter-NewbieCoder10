package edu.cnm.deepdive;

/**
 * This class contains stubs of the {@link #bandpass(int[], int, int)} and
 * {@link #smooth(int[])} methods. Implementation of these methods is
 * included in the practical exam problems of the Deep Dive Coding Java +
 * Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class Filter {

  private Filter() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /* BASIC PROBLEM */

  /**
   * Creates and returns an <code>int[]</code> containing only those values from
   * <code>data</code> that are greater than or equal to <code>lowerBound</code>
   * and less than <code>upperBound</code>. The values in the returned array are
   * in the same order as in <code>data</code>.
   * <p>For example, <code>Filter.bandpass(new int[] {1, 8, 7, 10}, 3, 9)</code>
   * will return an array containing the values <code>{8, 7}</code>; those are
   * the only values in <code>data</code> that are greater than or equal to 3,
   * and less than 9.</p>
   *
   * @param data        input to be filtered.
   * @param lowerBound  inclusive lower limit; values in <code>data</code> less
   *                    than <code>lowerBound</code> are filtered out.
   * @param upperBound  exclusive upper limit; values in <code>data</code>
   *                    greater than or equal to <code>upperBound</code> are
   *                    filtered out.
   * @return            filtered data.
   */
  public static int[] bandpass(int[] data, int lowerBound, int upperBound) {
    return null; // TODO Replace this line with implementation.
  }

  /* EXTRA CREDIT PROBLEM */

  /**
   * Creates and returns an <code>int[]</code> where each element (other than
   * the first and last elements, which are taken directly from
   * <code>data</code>) is computed from a weighted average of the corresponding
   * element and its adjacent elements in <code>data</code>. For element
   * <code>i</code>, where <code>0 &lt; i &lt; data.length - 1</code>, the computation
   * is
   * <p style="margin-left: 2em;">
   * <code>output[i] = Math.round((data[i - 1] + 2 * data[i] + data[i + 1]) / 4f);</code></p>
   * <p>For example, <code>Filter.smooth(new int[] {2, 1, 8, 7, 10})</code>
   * returns an array containing the values <code>{2, 3, 6, 8, 10}</code>.</p>
   *
   * @param data  input to be smoothed.
   * @return      smoothed data.
   */
  public static int[] smooth(int[] data) {
    return null; // TODO Replace this line with implementation for extra credit.
  }

}
