package app.chalo.productbooking.common.data.models.api.response;

import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigDocumentPropsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8159a;
    public final String b;
    public final String c;
    public final ProductConfigDocumentPropInfoApiResponseModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "IDENTIFIER_STR_DELIMINATOR", "Ljava/lang/String;", "PROOF_STR_DELIMINATOR", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(String city, String agency, String documentId) {
            Intrinsics.i(city, "city");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(documentId, "documentId");
            StringBuilder sb = new StringBuilder();
            sb.append(city);
            return r30.i(sb, ":", agency, ":", documentId);
        }

        public final KSerializer<ProductConfigDocumentPropsApiResponseModel> serializer() {
            return ProductConfigDocumentPropsApiResponseModel$$serializer.f8160a;
        }
    }

    public /* synthetic */ ProductConfigDocumentPropsApiResponseModel(int i, String str, String str2, String str3, ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(ProductConfigDocumentPropsApiResponseModel$$serializer.f8160a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8159a = str;
        this.b = str2;
        this.c = str3;
        this.d = productConfigDocumentPropInfoApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigDocumentPropsApiResponseModel)) {
            return false;
        }
        ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel = (ProductConfigDocumentPropsApiResponseModel) obj;
        return Intrinsics.d(this.f8159a, productConfigDocumentPropsApiResponseModel.f8159a) && Intrinsics.d(this.b, productConfigDocumentPropsApiResponseModel.b) && Intrinsics.d(this.c, productConfigDocumentPropsApiResponseModel.c) && Intrinsics.d(this.d, productConfigDocumentPropsApiResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f8159a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel = this.d;
        return iHashCode3 + (productConfigDocumentPropInfoApiResponseModel != null ? productConfigDocumentPropInfoApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigDocumentPropsApiResponseModel(city=", this.f8159a, ", agency=", this.b, ", documentid=");
        sbE.append(this.c);
        sbE.append(", info=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductConfigDocumentPropsApiResponseModel(String str, String str2, String str3, ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel) {
        this.f8159a = str;
        this.b = str2;
        this.c = str3;
        this.d = productConfigDocumentPropInfoApiResponseModel;
    }
}
