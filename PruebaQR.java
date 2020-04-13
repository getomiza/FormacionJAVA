/**
 * 
 */
/**
 * IImport's
 */
// Generic Import's
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

// Specific Import's
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;



/**
 * @author JavierCasalengua
 *
 */
public class PruebaQR {
	// Attributes
	private static final String QR_CODE_IMAGE_PATH = "./MyQRCode.png";
	
	
	// Methods
	
	/**
	 * generateQRCodeImage
	 * private static void generateQRCodeImage(String text, int width, int height, String filePath)
	 * 
	 */
    private static void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            generateQRCodeImage("www.sdl.com", 350, 350, QR_CODE_IMAGE_PATH);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }																																		// main method closure
}																																			// Closure of the PruebaQR class