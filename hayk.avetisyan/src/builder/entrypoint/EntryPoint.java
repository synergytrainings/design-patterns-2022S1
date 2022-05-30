package builder.entrypoint;

import builder.network.NeuralNetwork;
import builder.network.activation.Activation;
import builder.network.layers.DenseLayer;
import builder.network.layers.LSTMLayer;
import builder.network.layers.OutputLayer;
import builder.network.lossfunction.LossFunctions;

public class EntryPoint {

	public static void main(String[] args) {

		NeuralNetwork network = new NeuralNetwork.Builder()
				.learningRate(0.1)
				.layers()
				.layer(LSTMLayer.builder()
						.gateActivation(Activation.SIGMOID)
						.activation(Activation.TANH)
						.nIn(100)
						.nOut(100)
						.build()
				)
				.layer(DenseLayer.builder()
						.activation(Activation.LEAKYRELU)
						.nIn(100)
						.nOut(50)
						.build()
				)
				.layer(OutputLayer.builder()
						.lossFunction(LossFunctions.MSE)
						.activation(Activation.RELU)
						.nIn(50)
						.nOut(3)
						.build()
				)
				.build();

		System.out.println(network);
	}
}
