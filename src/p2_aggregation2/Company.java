package p2_aggregation2;

public class Company {
	private Asset asset;
	
	public Company(Asset purchasedAsset) {
		asset = purchasedAsset; // set the assetv ia constructor or setter
	}
}
//  Company ____________buys___________> Asset
// This is unidirectional
