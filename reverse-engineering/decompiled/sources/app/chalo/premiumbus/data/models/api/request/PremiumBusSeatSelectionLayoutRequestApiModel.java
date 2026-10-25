package app.chalo.premiumbus.data.models.api.request;

import defpackage.nf1;
import defpackage.nt0;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumBusSeatSelectionLayoutRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusSeatSelectionLayoutRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(22)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7010a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumBusSeatSelectionLayoutRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PremiumBusSeatSelectionLayoutRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusSeatSelectionLayoutRequestApiModel> serializer() {
            return PremiumBusSeatSelectionLayoutRequestApiModel$$serializer.f7011a;
        }
    }

    public /* synthetic */ PremiumBusSeatSelectionLayoutRequestApiModel(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PremiumBusSeatSelectionLayoutRequestApiModel$$serializer.f7011a.getDescriptor(), i, 15);
            throw null;
        }
        this.f7010a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionLayoutRequestApiModel)) {
            return false;
        }
        PremiumBusSeatSelectionLayoutRequestApiModel premiumBusSeatSelectionLayoutRequestApiModel = (PremiumBusSeatSelectionLayoutRequestApiModel) obj;
        return Intrinsics.d(this.f7010a, premiumBusSeatSelectionLayoutRequestApiModel.f7010a) && Intrinsics.d(this.b, premiumBusSeatSelectionLayoutRequestApiModel.b) && Intrinsics.d(this.c, premiumBusSeatSelectionLayoutRequestApiModel.c) && Intrinsics.d(this.d, premiumBusSeatSelectionLayoutRequestApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f7010a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusSeatSelectionLayoutRequestApiModel(tripIds=");
        sb.append(this.f7010a);
        sb.append(", city=");
        sb.append(this.b);
        sb.append(", fromStopId=");
        return r30.i(sb, this.c, ", toStopId=", this.d, ")");
    }

    public PremiumBusSeatSelectionLayoutRequestApiModel(String str, String fromStopId, String toStopId, List list) {
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        this.f7010a = list;
        this.b = str;
        this.c = fromStopId;
        this.d = toStopId;
    }
}
