import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;
import java.awt.Color;

public class HSV_Matching implements PlugInFilter {

	public int setup(String arg, ImagePlus img) {
			return DOES_RGB;
		}
	
		public void binnedHistogram(ImageProcessor ip) {
			Color color;
		double[] R_Sample = {0.0, 
				0.0, 
				0.0, 
				0.0, 
				1.953125E-5, 
				2.5065104166666665E-4, 
				0.001298828125, 
				0.004768880208333334, 
				0.0125390625, 
				0.02443359375, 
				0.037607421875, 
				0.04939453125, 
				0.05963541666666667, 
				0.068359375, 
				0.07624674479166667, 
				0.08292643229166667, 
				0.08853515625, 
				0.0934765625, 
				0.097802734375, 
				0.10230143229166666, 
				0.10627278645833334, 
				0.11034830729166667, 
				0.113828125, 
				0.11698893229166667, 
				0.11994466145833334, 
				0.12273111979166666, 
				0.12528645833333332, 
				0.12750325520833333, 
				0.12946614583333332, 
				0.13133138020833332, 
				0.13286783854166667, 
				0.13431315104166666, 
				0.13540364583333334, 
				0.13655924479166667, 
				0.13763346354166667, 
				0.13874348958333332, 
				0.13973958333333333, 
				0.140615234375, 
				0.141396484375, 
				0.14216471354166665, 
				0.14279947916666666, 
				0.143466796875, 
				0.144072265625, 
				0.1447265625, 
				0.1453515625, 
				0.14597981770833332, 
				0.14653971354166667, 
				0.14713216145833333, 
				0.14767252604166667, 
				0.14832356770833333, 
				0.14890950520833332, 
				0.149521484375, 
				0.15017578125, 
				0.15093098958333334, 
				0.15171223958333332, 
				0.15249674479166667, 
				0.1534375, 
				0.15434244791666665, 
				0.15540364583333333, 
				0.156591796875, 
				0.15774088541666667, 
				0.15878580729166666, 
				0.15984700520833334, 
				0.16097005208333334, 
				0.162099609375, 
				0.16314127604166667, 
				0.16427083333333334, 
				0.165390625, 
				0.16651041666666666, 
				0.16765299479166668, 
				0.16891276041666667, 
				0.17013671875, 
				0.17134114583333335, 
				0.17264322916666666, 
				0.174111328125, 
				0.17556640625, 
				0.17698893229166668, 
				0.17838216145833333, 
				0.17986653645833334, 
				0.18137369791666666, 
				0.182802734375, 
				0.18410807291666667, 
				0.18554036458333334, 
				0.18699544270833332, 
				0.18845052083333333, 
				0.19000325520833333, 
				0.191630859375, 
				0.193251953125, 
				0.19510091145833333, 
				0.19712565104166666, 
				0.19930013020833334, 
				0.20168619791666667, 
				0.204287109375, 
				0.20739908854166667, 
				0.21080729166666667, 
				0.21450846354166667, 
				0.21839192708333333, 
				0.222158203125, 
				0.22548828125, 
				0.228330078125, 
				0.23107421875, 
				0.233681640625, 
				0.236142578125, 
				0.23869466145833335, 
				0.241298828125, 
				0.24392252604166667, 
				0.246376953125, 
				0.24919270833333335, 
				0.25217122395833336, 
				0.25533854166666664, 
				0.25844401041666665, 
				0.26146809895833334, 
				0.26474934895833335, 
				0.267978515625, 
				0.27126953125, 
				0.2744596354166667, 
				0.2776920572916667, 
				0.2809244791666667, 
				0.28430013020833333, 
				0.287626953125, 
				0.29112630208333334, 
				0.2947265625, 
				0.298427734375, 
				0.3019563802083333, 
				0.30572591145833333, 
				0.30907552083333334, 
				0.31255208333333334, 
				0.31585286458333334, 
				0.3194401041666667, 
				0.3231119791666667, 
				0.32682942708333335, 
				0.33044596354166667, 
				0.334248046875, 
				0.3379361979166667, 
				0.3417024739583333, 
				0.3458528645833333, 
				0.35027669270833334, 
				0.35502278645833335, 
				0.360107421875, 
				0.36537760416666665, 
				0.3705143229166667, 
				0.37547200520833335, 
				0.3807552083333333, 
				0.3857649739583333, 
				0.390712890625, 
				0.3957421875, 
				0.40095377604166665, 
				0.4058561197916667, 
				0.41091796875, 
				0.416376953125, 
				0.4221875, 
				0.4280729166666667, 
				0.434423828125, 
				0.44119466145833336, 
				0.4484147135416667, 
				0.45599283854166667, 
				0.464697265625, 
				0.4743359375, 
				0.4853157552083333, 
				0.498037109375, 
				0.512236328125, 
				0.5279069010416667, 
				0.5449055989583333, 
				0.562978515625, 
				0.5812141927083333, 
				0.5984993489583333, 
				0.615751953125, 
				0.6321484375, 
				0.6485286458333334, 
				0.6655078125, 
				0.6837109375, 
				0.702841796875, 
				0.7231315104166667, 
				0.7451790364583334, 
				0.767822265625, 
				0.7893880208333334, 
				0.8100813802083333, 
				0.8323209635416666, 
				0.8538899739583333, 
				0.87578125, 
				0.8970084635416666, 
				0.9165690104166667, 
				0.934794921875, 
				0.95119140625, 
				0.9661360677083334, 
				0.9789029947916666, 
				0.9883821614583334, 
				0.9942317708333334, 
				0.9976953125, 
				0.999150390625, 
				0.999697265625, 
				0.9999283854166666, 
				0.999990234375, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0};
		double[] G_Sample = {0.0, 
				0.0, 
				0.0, 
				0.0, 
				0.0, 
				6.510416666666667E-6, 
				8.138020833333333E-5, 
				6.15234375E-4, 
				0.001875, 
				0.0041015625, 
				0.008268229166666667, 
				0.01513671875, 
				0.02599609375, 
				0.04007161458333333, 
				0.05426106770833333, 
				0.06810546875, 
				0.08005533854166667, 
				0.09024088541666667, 
				0.09869791666666666, 
				0.10586588541666667, 
				0.112236328125, 
				0.11774739583333334, 
				0.12257161458333334, 
				0.126669921875, 
				0.13041015625, 
				0.13379231770833333, 
				0.136591796875, 
				0.13912109375, 
				0.14128255208333335, 
				0.143134765625, 
				0.1451171875, 
				0.14680338541666665, 
				0.14833658854166668, 
				0.14991861979166668, 
				0.15158854166666666, 
				0.153212890625, 
				0.15483723958333334, 
				0.15662760416666666, 
				0.158271484375, 
				0.15989583333333332, 
				0.16180338541666667, 
				0.16361328125, 
				0.16534830729166666, 
				0.16707356770833334, 
				0.16880859375, 
				0.17069010416666666, 
				0.172666015625, 
				0.174833984375, 
				0.1769921875, 
				0.1791796875, 
				0.18119791666666665, 
				0.183505859375, 
				0.18566731770833333, 
				0.18791015625, 
				0.19025390625, 
				0.1927734375, 
				0.19550130208333333, 
				0.19863932291666667, 
				0.202138671875, 
				0.20608072916666667, 
				0.21012044270833333, 
				0.214453125, 
				0.21846028645833335, 
				0.22236002604166666, 
				0.22626302083333333, 
				0.22975911458333334, 
				0.23318684895833333, 
				0.236259765625, 
				0.239287109375, 
				0.24244466145833332, 
				0.245234375, 
				0.248046875, 
				0.2506282552083333, 
				0.253173828125, 
				0.25578450520833335, 
				0.2581705729166667, 
				0.26073893229166667, 
				0.263212890625, 
				0.265654296875, 
				0.2682421875, 
				0.27103841145833335, 
				0.273955078125, 
				0.27724283854166665, 
				0.28091796875, 
				0.28454752604166667, 
				0.28857096354166667, 
				0.2924674479166667, 
				0.29631184895833335, 
				0.300126953125, 
				0.30364908854166667, 
				0.30767252604166667, 
				0.311513671875, 
				0.31530598958333333, 
				0.31909505208333333, 
				0.3226171875, 
				0.3258984375, 
				0.32873046875, 
				0.3312532552083333, 
				0.333544921875, 
				0.33589518229166665, 
				0.338359375, 
				0.3407845052083333, 
				0.3430891927083333, 
				0.34527018229166667, 
				0.34734700520833334, 
				0.34948567708333333, 
				0.35157877604166665, 
				0.3537890625, 
				0.35604166666666665, 
				0.35826171875, 
				0.36062825520833336, 
				0.36306315104166664, 
				0.365615234375, 
				0.3682356770833333, 
				0.3708138020833333, 
				0.37334635416666667, 
				0.3757454427083333, 
				0.37785481770833335, 
				0.37951497395833333, 
				0.380927734375, 
				0.381982421875, 
				0.3828125, 
				0.38361979166666665, 
				0.384482421875, 
				0.3851041666666667, 
				0.38569986979166665, 
				0.38634765625, 
				0.386953125, 
				0.38765299479166665, 
				0.38828450520833335, 
				0.38896484375, 
				0.389619140625, 
				0.39039713541666665, 
				0.3912272135416667, 
				0.39210611979166665, 
				0.39296875, 
				0.39374674479166666, 
				0.39474283854166664, 
				0.3956803385416667, 
				0.3967578125, 
				0.397958984375, 
				0.399326171875, 
				0.40076171875, 
				0.40252278645833334, 
				0.404443359375, 
				0.40681640625, 
				0.40937174479166666, 
				0.41224609375, 
				0.41509114583333334, 
				0.41777994791666667, 
				0.4204296875, 
				0.42296223958333334, 
				0.42597330729166666, 
				0.42876627604166667, 
				0.43170247395833333, 
				0.435087890625, 
				0.43834309895833334, 
				0.441953125, 
				0.4454427083333333, 
				0.44904947916666665, 
				0.45281575520833334, 
				0.4571712239583333, 
				0.46183919270833335, 
				0.46755533854166664, 
				0.4745735677083333, 
				0.48302083333333334, 
				0.49328776041666667, 
				0.5048567708333334, 
				0.517568359375, 
				0.530771484375, 
				0.546025390625, 
				0.5634342447916667, 
				0.5816927083333333, 
				0.600029296875, 
				0.6189615885416667, 
				0.6376953125, 
				0.656845703125, 
				0.6765071614583333, 
				0.6975390625, 
				0.7198600260416667, 
				0.743486328125, 
				0.7689095052083333, 
				0.7965625, 
				0.8245540364583334, 
				0.8516731770833333, 
				0.8774055989583334, 
				0.9011328125, 
				0.9244498697916667, 
				0.947138671875, 
				0.9679622395833334, 
				0.9835546875, 
				0.9929524739583333, 
				0.9973209635416667, 
				0.9991438802083333, 
				0.999755859375, 
				0.9999153645833333, 
				0.9999772135416667, 
				0.9999967447916667, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0};
		double[] B_Sample = {0.0, 
				0.0, 
				3.2552083333333335E-6, 
				6.510416666666667E-6, 
				3.90625E-5, 
				3.41796875E-4, 
				0.0012369791666666666, 
				0.0030338541666666665, 
				0.0062076822916666665, 
				0.01060546875, 
				0.015712890625, 
				0.021233723958333332, 
				0.026826171875, 
				0.03261067708333333, 
				0.038388671875, 
				0.044134114583333335, 
				0.04936197916666667, 
				0.05444986979166667, 
				0.05994466145833333, 
				0.06657877604166666, 
				0.0726953125, 
				0.07935872395833334, 
				0.08693359375, 
				0.09326171875, 
				0.09947591145833333, 
				0.1066015625, 
				0.11380533854166666, 
				0.12098307291666667, 
				0.12743489583333334, 
				0.13367513020833333, 
				0.14056640625, 
				0.146416015625, 
				0.15220052083333332, 
				0.15780924479166666, 
				0.16353515625, 
				0.168828125, 
				0.17412109375, 
				0.17975260416666666, 
				0.18603841145833333, 
				0.192451171875, 
				0.19915364583333334, 
				0.20590169270833333, 
				0.212060546875, 
				0.21811197916666666, 
				0.22333984375, 
				0.22813802083333334, 
				0.23246744791666665, 
				0.23645833333333333, 
				0.24028645833333334, 
				0.244013671875, 
				0.24787434895833332, 
				0.251552734375, 
				0.25537434895833333, 
				0.25923502604166665, 
				0.2630110677083333, 
				0.26694661458333335, 
				0.27096354166666664, 
				0.274833984375, 
				0.27880859375, 
				0.282998046875, 
				0.2871549479166667, 
				0.291298828125, 
				0.29541666666666666, 
				0.29919270833333333, 
				0.3028385416666667, 
				0.3065462239583333, 
				0.309853515625, 
				0.31307291666666665, 
				0.31597005208333334, 
				0.31873046875, 
				0.321328125, 
				0.3238802083333333, 
				0.3261490885416667, 
				0.328310546875, 
				0.33059244791666664, 
				0.33275716145833334, 
				0.334951171875, 
				0.3369010416666667, 
				0.3388541666666667, 
				0.3410546875, 
				0.3430533854166667, 
				0.345068359375, 
				0.34698893229166666, 
				0.348974609375, 
				0.35094075520833334, 
				0.3531901041666667, 
				0.35578125, 
				0.358583984375, 
				0.361533203125, 
				0.36417317708333335, 
				0.36673828125, 
				0.36908528645833333, 
				0.37091796875, 
				0.372421875, 
				0.3737434895833333, 
				0.37484375, 
				0.375810546875, 
				0.37662434895833335, 
				0.3773274739583333, 
				0.377978515625, 
				0.37847330729166667, 
				0.3788606770833333, 
				0.379140625, 
				0.37939127604166667, 
				0.37959635416666665, 
				0.3798046875, 
				0.37998046875, 
				0.38015299479166664, 
				0.38033854166666664, 
				0.38048828125, 
				0.380625, 
				0.38073893229166667, 
				0.3808821614583333, 
				0.381025390625, 
				0.38116536458333333, 
				0.3813606770833333, 
				0.381630859375, 
				0.38189453125, 
				0.38220052083333333, 
				0.38256510416666667, 
				0.38299153645833334, 
				0.383447265625, 
				0.383955078125, 
				0.38444661458333335, 
				0.38490234375, 
				0.3853678385416667, 
				0.38578450520833335, 
				0.38635091145833333, 
				0.38690104166666667, 
				0.3874869791666667, 
				0.3880696614583333, 
				0.3885904947916667, 
				0.38923828125, 
				0.38994140625, 
				0.3907194010416667, 
				0.39148111979166667, 
				0.39228190104166666, 
				0.3930436197916667, 
				0.393876953125, 
				0.3946809895833333, 
				0.3955208333333333, 
				0.3965657552083333, 
				0.3975553385416667, 
				0.398701171875, 
				0.40013020833333335, 
				0.40158528645833336, 
				0.40345703125, 
				0.405712890625, 
				0.40815104166666666, 
				0.4109602864583333, 
				0.41373046875, 
				0.416611328125, 
				0.41947265625, 
				0.422314453125, 
				0.42518229166666666, 
				0.4278125, 
				0.43055338541666666, 
				0.433251953125, 
				0.43592447916666666, 
				0.43863606770833335, 
				0.441416015625, 
				0.44421549479166667, 
				0.4472786458333333, 
				0.45085286458333335, 
				0.455185546875, 
				0.46034830729166665, 
				0.465859375, 
				0.4723209635416667, 
				0.4798079427083333, 
				0.4888671875, 
				0.499892578125, 
				0.5128157552083333, 
				0.528447265625, 
				0.5466861979166666, 
				0.5667513020833334, 
				0.5867447916666667, 
				0.6055891927083333, 
				0.6240625, 
				0.6420149739583333, 
				0.6598274739583333, 
				0.6787565104166666, 
				0.699130859375, 
				0.7209765625, 
				0.7436328125, 
				0.7672102864583333, 
				0.791923828125, 
				0.815068359375, 
				0.8374381510416666, 
				0.8597428385416667, 
				0.8818489583333333, 
				0.9034602864583333, 
				0.9240625, 
				0.943544921875, 
				0.960966796875, 
				0.97455078125, 
				0.98470703125, 
				0.99166015625, 
				0.9957942708333334, 
				0.9980110677083334, 
				0.9991243489583334, 
				0.9996419270833333, 
				0.999892578125, 
				0.9999772135416667, 
				0.9999934895833333, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0, 
				1.0};
				
		int K = 256; // number of intensity values
		int[] R = new int[K]; // histogram array		
		int[] G = new int[K]; // histogram array
		int[] B = new int[K]; // histogram array
		double[] HistR = new double[K];
		double[] HistG = new double[K];
		double[] HistB = new double[K];
		int w = ip.getWidth();
		int h = ip.getHeight();
		
		for (int v = 0; v < h; v++) {
			for (int u = 0; u < w; u++) {
				color = new Color(ip.getPixel(u, v));
				R[color.getRed()] = R[color.getRed()] + 1;
				G[color.getGreen()] = G[color.getGreen()] + 1;
				B[color.getBlue()] = B[color.getBlue()] + 1;
			}
		}
		
		 for (int i = 0; i < 256; i++) {
			 if(i == 0) {
				 HistR[0] = R[0];
				 HistG[0] = G[0];
				 HistB[0] = B[0];
			}
			 else {
				 HistR[i] = HistR[i - 1] + R[i];
				 HistG[i] = HistG[i - 1] + G[i];
				 HistB[i] = HistB[i - 1] + B[i];
			 	}
	        }
		 

		 
		 for (int i = 0; i < 256; i++) {
			r_v =  HistR[i];
			g_v =  HistG[i];
			b_v =  HistB[i];
			HistR[i] = HistR[i]/HistR[255];
			HistG[i] = HistG[i]/HistG[255];
			HistB[i] = HistB[i]/HistB[255];
			 	        }
		 
//////////////// Matching
		 
		 
				 
			int[] map_R = new int[K]; // mapping map()
			int[] map_G = new int[K]; // mapping map()
			int[] map_B = new int[K]; // mapping map()


			 
			 for (int a = 0; a < K; a++) {
				 int j = K - 1;
				// ij.IJ.log("R mapped histogram");
				while (j >= 0 && HistR[a] <= R_Sample[j]) {
					map_R[a] = j;
					 j--;
				};
			   //ij.IJ.log(String.valueOf(map_R[a]));
			 };
			
			for (int b = 0; b < K; b++) {
				 int t = K - 1;
				 ij.IJ.log("G mapped histogram");
				while (t >= 0 && HistG[b] <= G_Sample[t]) {
					map_G[b] = t;
					 t--;
				};
				//ij.IJ.log(String.valueOf(map_G[b]));
			};
				
				for (int c = 0; c < K; c++) {
					 int p = K - 1;
					 ij.IJ.log("B mapped histogram");
					while (p >= 0 && HistG[c] <= B_Sample[p]) {
						map_B[c] = p;
						 p--;
					};
				//ij.IJ.log(String.valueOf(map_B[c]));
				};
				
				
///////////////////////// Draw new
				for (int row = 0; row < h; row++) {
					for (int col = 0; col < w; col++)  {
			                Color color_color = new Color(ip.getPixel(col, row));
			                int value[] = new int[3];
			                
			                int Red = color_color.getRed();
			                int Green = color_color.getGreen();
			                int Blue = color_color.getBlue();
			                
			                value[0] = map_R[Red];
			                value[1] = map_G[Green];
			                value[2] = map_B[Blue];
			                ip.putPixel(col, row, value);
			            }
			        }
			}

		public void run(ImageProcessor ip) {
		binnedHistogram(ip);
		}
	}
