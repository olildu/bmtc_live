package defpackage;

import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCategoryApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCategoryApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDisplayPropsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareBreakupApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareMappingApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigSubCategoryApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigValidDurationsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigCategoryAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCategoryAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDisplayPropsAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigDocumentPropsAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareInfoAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareMappingAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategoryAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigValidDurationsAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nx0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18551a;

    public /* synthetic */ nx0(int i) {
        this.f18551a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18551a) {
            case 0:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 1:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion2 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 2:
                ProductConfigCategoryApiResponseModel.Companion companion3 = ProductConfigCategoryApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 3:
                ProductConfigCategoryAppModel.Companion companion4 = ProductConfigCategoryAppModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 4:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion5 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 5:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion6 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigCategoryApiResponseModel$$serializer.f8150a);
            case 6:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion7 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(ProductConfigFareMappingApiResponseModel$$serializer.f8166a));
            case 7:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion8 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigSubCategoryApiResponseModel$$serializer.f8172a);
            case 8:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion9 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, ProductConfigValidDurationsApiResponseModel$$serializer.f8176a);
            case 9:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion10 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion11 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 11:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion12 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 12:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion13 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 13:
                ProductConfigCompleteDetailsApiResponseModel.Companion companion14 = ProductConfigCompleteDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 14:
                ProductConfigCompleteDetailsAppModel.Companion companion15 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 15:
                ProductConfigCompleteDetailsAppModel.Companion companion16 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigCategoryAppModel$$serializer.f8202a);
            case 16:
                ProductConfigCompleteDetailsAppModel.Companion companion17 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(ProductConfigFareMappingAppModel$$serializer.f8216a));
            case 17:
                ProductConfigCompleteDetailsAppModel.Companion companion18 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigSubCategoryAppModel$$serializer.f8219a);
            case 18:
                ProductConfigCompleteDetailsAppModel.Companion companion19 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, ProductConfigValidDurationsAppModel$$serializer.f8223a);
            case 19:
                ProductConfigCompleteDetailsAppModel.Companion companion20 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                ProductConfigCompleteDetailsAppModel.Companion companion21 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 21:
                ProductConfigCompleteDetailsAppModel.Companion companion22 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(ProductImageAppModel$$serializer.f8225a);
            case 22:
                ProductConfigCompleteDetailsAppModel.Companion companion23 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigServiceType.INSTANCE.serializer());
            case 23:
                ProductConfigCompleteDetailsAppModel.Companion companion24 = ProductConfigCompleteDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleAppModel$$serializer.f7071a);
            case 24:
                ProductConfigCompleteDetailsListApiResponseModel.Companion companion25 = ProductConfigCompleteDetailsListApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigDisplayPropsApiResponseModel$$serializer.f8156a);
            case 25:
                ProductConfigCompleteDetailsListApiResponseModel.Companion companion26 = ProductConfigCompleteDetailsListApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigDocumentPropsApiResponseModel$$serializer.f8160a);
            case 26:
                ProductConfigCompleteDetailsListAppModel.Companion companion27 = ProductConfigCompleteDetailsListAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigDisplayPropsAppModel$$serializer.f8208a);
            case 27:
                ProductConfigCompleteDetailsListAppModel.Companion companion28 = ProductConfigCompleteDetailsListAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigDocumentPropsAppModel$$serializer.f8210a);
            case 28:
                ProductConfigFareInfoApiResponseModel.Companion companion29 = ProductConfigFareInfoApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigFareBreakupApiResponseModel$$serializer.f8162a);
            default:
                ProductConfigFareInfoAppModel.Companion companion30 = ProductConfigFareInfoAppModel.Companion;
                return new ArrayListSerializer(ProductConfigFareBreakupAppModel$$serializer.f8212a);
        }
    }
}
