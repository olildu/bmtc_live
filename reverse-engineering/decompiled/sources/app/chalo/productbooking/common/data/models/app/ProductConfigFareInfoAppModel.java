package app.chalo.productbooking.common.data.models.app;

import defpackage.i71;
import defpackage.nx0;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareInfoAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigFareInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nx0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8213a;
    public final long b;
    public final boolean c;
    public final long d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigFareInfoAppModel> serializer() {
            return ProductConfigFareInfoAppModel$$serializer.f8214a;
        }
    }

    public /* synthetic */ ProductConfigFareInfoAppModel(int i, long j, long j2, boolean z, long j3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(ProductConfigFareInfoAppModel$$serializer.f8214a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8213a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigFareInfoAppModel)) {
            return false;
        }
        ProductConfigFareInfoAppModel productConfigFareInfoAppModel = (ProductConfigFareInfoAppModel) obj;
        return this.f8213a == productConfigFareInfoAppModel.f8213a && this.b == productConfigFareInfoAppModel.b && this.c == productConfigFareInfoAppModel.c && this.d == productConfigFareInfoAppModel.d && Intrinsics.d(this.e, productConfigFareInfoAppModel.e);
    }

    public final int hashCode() {
        long j = this.f8213a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i2 = this.c ? 1231 : 1237;
        long j3 = this.d;
        return this.e.hashCode() + ((((i + i2) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f8213a, "ProductConfigFareInfoAppModel(payableAmount=", ", actualFare=");
        sbG.append(this.b);
        sbG.append(", isDiscountApplicable=");
        sbG.append(this.c);
        xs.r(this.d, ", discountedFare=", ", fareBreakup=", sbG);
        return xs.l(sbG, this.e, ")");
    }

    public ProductConfigFareInfoAppModel(long j, long j2, boolean z, long j3, List fareBreakup) {
        Intrinsics.i(fareBreakup, "fareBreakup");
        this.f8213a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = fareBreakup;
    }
}
