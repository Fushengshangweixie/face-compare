package tool;  
    import java.lang.reflect.Method;
    import java.awt.image.BufferedImage;  
    import facetest.*;
    import org.opencv.core.Mat;
    import org.opencv.imgcodecs.Imgcodecs;  
      
    public class mat2BufferedImage {  
        public static BufferedImage matToBufferedImage(Mat matrix,bl x) {  
            int cols = matrix.cols();  
            int rows = matrix.rows();  
            int elemSize = (int) matrix.elemSize();  
            byte[] data = new byte[cols * rows * elemSize];  
            int type;  
            matrix.get(0, 0, data);  
            switch (matrix.channels()) {  
            case 1:  
                type = BufferedImage.TYPE_BYTE_GRAY;  
                break;  
            case 3:  
                type = BufferedImage.TYPE_3BYTE_BGR;  
                // bgr to rgb  
                byte b;  
                for (int i = 0; i < data.length; i = i + 3) {  
                    b = data[i];  
                    data[i] = data[i + 2];  
                    data[i + 2] = b;  
                }  
                break;  
            default:  
                return null;  
            }  
            BufferedImage image2 = new BufferedImage(cols, rows, type);  
            image2.getRaster().setDataElements(0, 0, cols, rows, data);
            Mat source=matrix;
            Imgcodecs.imwrite("F://1.jpg",source);
            if(x.getx()==1)
            {
                String idStr = "YAya";  
                try   
                { 
                Method method = FaceSearch.class.getMethod("main", String[].class);     
                method.invoke(null, (Object) new String[] { idStr });
                }   
                catch (Exception e)   
                {     
                    e.printStackTrace();     
                }  
                x.cinx(0);
            }
            return image2;
        }  
    }  