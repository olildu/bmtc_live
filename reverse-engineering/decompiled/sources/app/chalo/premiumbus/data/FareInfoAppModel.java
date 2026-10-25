package app.chalo.premiumbus.data;

import defpackage.a30;
import defpackage.n21;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/FareInfoAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6948a;
    public final double b;
    public final boolean c;
    public final double d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/FareInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/FareInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareInfoAppModel> serializer() {
            return FareInfoAppModel$$serializer.f6949a;
        }
    }

    public FareInfoAppModel(double d, double d2, boolean z, double d3, ArrayList arrayList) {
        this.f6948a = d;
        this.b = d2;
        this.c = z;
        this.d = d3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareInfoAppModel)) {
            return false;
        }
        FareInfoAppModel fareInfoAppModel = (FareInfoAppModel) obj;
        return Double.compare(this.f6948a, fareInfoAppModel.f6948a) == 0 && Double.compare(this.b, fareInfoAppModel.b) == 0 && this.c == fareInfoAppModel.c && Double.compare(this.d, fareInfoAppModel.d) == 0 && Intrinsics.d(this.e, fareInfoAppModel.e);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f6948a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        int i2 = this.c ? 1231 : 1237;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.d);
        return this.e.hashCode() + ((((i + i2) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31);
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f6948a, "FareInfoAppModel(payableAmount=", ", actualFare=");
        sbI.append(this.b);
        sbI.append(", isDiscountApplicable=");
        sbI.append(this.c);
        pk0.z(sbI, ", discountedFare=", this.d, ", fareBreakupComponentList=");
        return xs.l(sbI, this.e, ")");
    }

    public /* synthetic */ FareInfoAppModel(int i, double d, double d2, boolean z, double d3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(FareInfoAppModel$$serializer.f6949a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6948a = d;
        this.b = d2;
        this.c = z;
        this.d = d3;
        this.e = list;
    }
}
