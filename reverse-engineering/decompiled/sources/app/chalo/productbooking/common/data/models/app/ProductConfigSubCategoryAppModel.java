package app.chalo.productbooking.common.data.models.app;

import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigSubCategoryAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigSubCategoryAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8218a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigSubCategoryAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigSubCategoryAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigSubCategoryAppModel> serializer() {
            return ProductConfigSubCategoryAppModel$$serializer.f8219a;
        }
    }

    public /* synthetic */ ProductConfigSubCategoryAppModel(int i, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ProductConfigSubCategoryAppModel$$serializer.f8219a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8218a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigSubCategoryAppModel)) {
            return false;
        }
        ProductConfigSubCategoryAppModel productConfigSubCategoryAppModel = (ProductConfigSubCategoryAppModel) obj;
        return Intrinsics.d(this.f8218a, productConfigSubCategoryAppModel.f8218a) && Intrinsics.d(this.b, productConfigSubCategoryAppModel.b) && Intrinsics.d(this.c, productConfigSubCategoryAppModel.c) && Intrinsics.d(this.d, productConfigSubCategoryAppModel.d) && Intrinsics.d(this.e, productConfigSubCategoryAppModel.e) && Intrinsics.d(this.f, productConfigSubCategoryAppModel.f) && Intrinsics.d(this.g, productConfigSubCategoryAppModel.g);
    }

    public final int hashCode() {
        String str = this.f8218a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigSubCategoryAppModel(id=", this.f8218a, ", name=", this.b, ", infoNote=");
        gf.v(this.d, this.c, ", isActive=", ", isVisible=", sbE);
        hq0.t(this.e, ", plansTitle=", this.f, ", additionalInfo=", sbE);
        return vo1.p(sbE, this.g, ")");
    }

    public ProductConfigSubCategoryAppModel(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        this.f8218a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = str4;
        this.g = str5;
    }
}
