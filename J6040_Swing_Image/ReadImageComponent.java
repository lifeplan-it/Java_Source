import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
class ReadImageComponent extends Component {//[100]
  BufferedImage bufferedImage = null;//[101]
  ReadImageComponent() {//[102]
  String imageFilename = "pic.jpg"; //[103]
  try {//[104]
    bufferedImage = ImageIO.read(new File(imageFilename));//[105]
  } catch (IOException e) {//[106]
    System.out.println("image file not found. [" + imageFilename + "]");//[107]
  }
}

public void paint(Graphics graphics) {//[110]
    graphics.drawImage(bufferedImage, 0, 0, null);//[111]
}

public Dimension getPreferredSize() {//[120]
  int width = 100;//[123]
  int height = 100;//[134]
  if (bufferedImage != null) {//[125]
	width = bufferedImage.getWidth(null);//[126]
	height = bufferedImage.getHeight(null);//[127]
}

return new Dimension(width, height);//[128]
}
void writeImage() {//[130]
}
}