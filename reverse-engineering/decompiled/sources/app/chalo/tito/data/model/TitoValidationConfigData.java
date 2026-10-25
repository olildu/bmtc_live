package app.chalo.tito.data.model;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xi1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/tito/data/model/TitoValidationConfigData;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TitoValidationConfigData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xi1(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9644a;
    public final String b;
    public final TitoValidationConstraint c;
    public final List d;
    public final TITONotificationJobConfig e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/tito/data/model/TitoValidationConfigData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/tito/data/model/TitoValidationConfigData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TitoValidationConfigData> serializer() {
            return TitoValidationConfigData$$serializer.f9645a;
        }
    }

    public TitoValidationConfigData(int i, String str, String str2, TitoValidationConstraint titoValidationConstraint, List list, TITONotificationJobConfig tITONotificationJobConfig) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.b(TitoValidationConfigData$$serializer.f9645a.getDescriptor(), i, 23);
            throw null;
        }
        this.f9644a = str;
        this.b = str2;
        this.c = titoValidationConstraint;
        if ((i & 8) == 0) {
            this.d = EmptyList.f17557a;
        } else {
            this.d = list;
        }
        this.e = tITONotificationJobConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoValidationConfigData)) {
            return false;
        }
        TitoValidationConfigData titoValidationConfigData = (TitoValidationConfigData) obj;
        return Intrinsics.d(this.f9644a, titoValidationConfigData.f9644a) && Intrinsics.d(this.b, titoValidationConfigData.b) && Intrinsics.d(this.c, titoValidationConfigData.c) && Intrinsics.d(this.d, titoValidationConfigData.d) && Intrinsics.d(this.e, titoValidationConfigData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.b((this.c.hashCode() + nf1.e(this.f9644a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TitoValidationConfigData(productType=", this.f9644a, ", productSubType=", this.b, ", titoValidationConstraints=");
        sbE.append(this.c);
        sbE.append(", missedTapOutReasons=");
        sbE.append(this.d);
        sbE.append(", titoNotificationJobConfig=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }

    public TitoValidationConfigData(String productType, String productSubType, TitoValidationConstraint titoValidationConstraint, List missedTapOutReasons, TITONotificationJobConfig tITONotificationJobConfig) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(missedTapOutReasons, "missedTapOutReasons");
        this.f9644a = productType;
        this.b = productSubType;
        this.c = titoValidationConstraint;
        this.d = missedTapOutReasons;
        this.e = tITONotificationJobConfig;
    }
}
