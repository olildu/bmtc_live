package app.chalo.productbooking.common.data.models.app;

import defpackage.dd;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigDisplayPropsAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigDisplayPropsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8207a;
    public final String b;
    public final Integer c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigDisplayPropsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigDisplayPropsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigDisplayPropsAppModel> serializer() {
            return ProductConfigDisplayPropsAppModel$$serializer.f8208a;
        }
    }

    public /* synthetic */ ProductConfigDisplayPropsAppModel(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ProductConfigDisplayPropsAppModel$$serializer.f8208a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8207a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigDisplayPropsAppModel)) {
            return false;
        }
        ProductConfigDisplayPropsAppModel productConfigDisplayPropsAppModel = (ProductConfigDisplayPropsAppModel) obj;
        return Intrinsics.d(this.f8207a, productConfigDisplayPropsAppModel.f8207a) && Intrinsics.d(this.b, productConfigDisplayPropsAppModel.b) && Intrinsics.d(this.c, productConfigDisplayPropsAppModel.c);
    }

    public final int hashCode() {
        String str = this.f8207a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return pk0.k(dd.e("ProductConfigDisplayPropsAppModel(category=", this.f8207a, ", displayName=", this.b, ", displayOrder="), this.c, ")");
    }

    public ProductConfigDisplayPropsAppModel(Integer num, String str, String str2) {
        this.f8207a = str;
        this.b = str2;
        this.c = num;
    }
}
