package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.tf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductFareInfoApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductFareInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8617a;
    public final Double b;
    public final Boolean c;
    public final Double d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductFareInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductFareInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductFareInfoApiResponseModel> serializer() {
            return SuperPassProductFareInfoApiResponseModel$$serializer.f8618a;
        }
    }

    public /* synthetic */ SuperPassProductFareInfoApiResponseModel(int i, Double d, Double d2, Boolean bool, Double d3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(SuperPassProductFareInfoApiResponseModel$$serializer.f8618a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8617a = d;
        this.b = d2;
        this.c = bool;
        this.d = d3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductFareInfoApiResponseModel)) {
            return false;
        }
        SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel = (SuperPassProductFareInfoApiResponseModel) obj;
        return Intrinsics.d(this.f8617a, superPassProductFareInfoApiResponseModel.f8617a) && Intrinsics.d(this.b, superPassProductFareInfoApiResponseModel.b) && Intrinsics.d(this.c, superPassProductFareInfoApiResponseModel.c) && Intrinsics.d(this.d, superPassProductFareInfoApiResponseModel.d) && Intrinsics.d(this.e, superPassProductFareInfoApiResponseModel.e);
    }

    public final int hashCode() {
        Double d = this.f8617a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d3 = this.d;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassProductFareInfoApiResponseModel(payableAmount=");
        sb.append(this.f8617a);
        sb.append(", actualFare=");
        sb.append(this.b);
        sb.append(", isDiscountApplicable=");
        sb.append(this.c);
        sb.append(", discountedFare=");
        sb.append(this.d);
        sb.append(", fareBreakup=");
        return xs.l(sb, this.e, ")");
    }
}
