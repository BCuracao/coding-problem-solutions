package Random;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;



/* DAILY CODE DAY #44 
 * Read and store image files. 
 * Look for duplicates using the Hashcode and remove them
*/
public class ImageFactory {

	public static void main(String[] args) {

		try {
			// Read and store all locally stored image files in a list
			List<File> filesInFolder = Files.walk(Paths.get("image/"))
					.filter(Files::isRegularFile)
					.map(Path::toFile)
					.collect(Collectors.toList());
			
			// Compare Hashcodes of files to find identical images
			List<Integer> hashCodes = new ArrayList<>();
			int duplicates = 0;
			
			for (int i = 0; i < filesInFolder.size(); i++) {
				if(!hashCodes.contains(filesInFolder.get(i).hashCode())) {
					hashCodes.add(filesInFolder.get(i).hashCode()); 
					System.out.println("Added unique image to list");
				}
				
				else {
					// Remove duplicate item from folder
					duplicates++;
					System.out.println("Item " + filesInFolder.get(i) + 
							" is already in the list");
					filesInFolder.get(i).delete();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



