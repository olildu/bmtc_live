package app.chalo.productbooking.common.data.models.api.response;

import defpackage.nx0;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigFareInfoApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigFareInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nx0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8163a;
    public final Long b;
    public final Boolean c;
    public final Long d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigFareInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigFareInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigFareInfoApiResponseModel> serializer() {
            return ProductConfigFareInfoApiResponseModel$$serializer.f8164a;
        }
    }

    public /* synthetic */ ProductConfigFareInfoApiResponseModel(int i, Long l, Long l2, Boolean bool, Long l3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(ProductConfigFareInfoApiResponseModel$$serializer.f8164a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8163a = l;
        this.b = l2;
        this.c = bool;
        this.d = l3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigFareInfoApiResponseModel)) {
            return false;
        }
        ProductConfigFareInfoApiResponseModel productConfigFareInfoApiResponseModel = (ProductConfigFareInfoApiResponseModel) obj;
        return Intrinsics.d(this.f8163a, productConfigFareInfoApiResponseModel.f8163a) && Intrinsics.d(this.b, productConfigFareInfoApiResponseModel.b) && Intrinsics.d(this.c, productConfigFareInfoApiResponseModel.c) && Intrinsics.d(this.d, productConfigFareInfoApiResponseModel.d) && Intrinsics.d(this.e, productConfigFareInfoApiResponseModel.e);
    }

    public final int hashCode() {
        Long l = this.f8163a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigFareInfoApiResponseModel(payableAmount=");
        sb.append(this.f8163a);
        sb.append(", actualFare=");
        sb.append(this.b);
        sb.append(", isDiscountApplicable=");
        sb.append(this.c);
        sb.append(", discountedFare=");
        sb.append(this.d);
        sb.append(", fareBreakup=");
        return xs.l(sb, this.e, ")");
    }

    public ProductConfigFareInfoApiResponseModel(Long l, Long l2, Boolean bool, Long l3, ArrayList arrayList) {
        this.f8163a = l;
        this.b = l2;
        this.c = bool;
        this.d = l3;
        this.e = arrayList;
    }
}
