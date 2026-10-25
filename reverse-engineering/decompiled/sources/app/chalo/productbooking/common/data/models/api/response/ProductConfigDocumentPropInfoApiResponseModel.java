package app.chalo.productbooking.common.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropInfoApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigDocumentPropInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8157a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigDocumentPropInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigDocumentPropInfoApiResponseModel> serializer() {
            return ProductConfigDocumentPropInfoApiResponseModel$$serializer.f8158a;
        }
    }

    public /* synthetic */ ProductConfigDocumentPropInfoApiResponseModel(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ProductConfigDocumentPropInfoApiResponseModel$$serializer.f8158a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8157a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigDocumentPropInfoApiResponseModel)) {
            return false;
        }
        ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel = (ProductConfigDocumentPropInfoApiResponseModel) obj;
        return Intrinsics.d(this.f8157a, productConfigDocumentPropInfoApiResponseModel.f8157a) && Intrinsics.d(this.b, productConfigDocumentPropInfoApiResponseModel.b) && Intrinsics.d(this.c, productConfigDocumentPropInfoApiResponseModel.c) && Intrinsics.d(this.d, productConfigDocumentPropInfoApiResponseModel.d) && Intrinsics.d(this.e, productConfigDocumentPropInfoApiResponseModel.e) && Intrinsics.d(this.f, productConfigDocumentPropInfoApiResponseModel.f) && Intrinsics.d(this.g, productConfigDocumentPropInfoApiResponseModel.g);
    }

    public final int hashCode() {
        String str = this.f8157a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigDocumentPropInfoApiResponseModel(name=", this.f8157a, ", formUrl=", this.b, ", longDesc=");
        gf.v(this.d, this.c, ", hasExpiry=", ", shortDesc=", sbE);
        cb0.t(sbE, this.e, ", tutorialUrl=", this.f, ", placeholderUrl=");
        return vo1.p(sbE, this.g, ")");
    }

    public ProductConfigDocumentPropInfoApiResponseModel(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.f8157a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
