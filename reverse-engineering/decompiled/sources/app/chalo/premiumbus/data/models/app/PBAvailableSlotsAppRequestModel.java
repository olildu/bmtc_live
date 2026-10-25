package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.eo0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsAppRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBAvailableSlotsAppRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new eo0(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7085a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsAppRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsAppRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBAvailableSlotsAppRequestModel> serializer() {
            return PBAvailableSlotsAppRequestModel$$serializer.f7086a;
        }
    }

    public /* synthetic */ PBAvailableSlotsAppRequestModel(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PBAvailableSlotsAppRequestModel$$serializer.f7086a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7085a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBAvailableSlotsAppRequestModel)) {
            return false;
        }
        PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel = (PBAvailableSlotsAppRequestModel) obj;
        return Intrinsics.d(this.f7085a, pBAvailableSlotsAppRequestModel.f7085a) && Intrinsics.d(this.b, pBAvailableSlotsAppRequestModel.b) && Intrinsics.d(this.c, pBAvailableSlotsAppRequestModel.c) && Intrinsics.d(this.d, pBAvailableSlotsAppRequestModel.d) && Intrinsics.d(this.e, pBAvailableSlotsAppRequestModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f7085a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + r30.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBAvailableSlotsAppRequestModel(userId=", this.f7085a, ", userAcquisitionChannel=", this.b, ", userCampaign=");
        pk0.w(this.c, ", slotSearchRequests=", ", city=", sbE, this.d);
        return vo1.p(sbE, this.e, ")");
    }

    public PBAvailableSlotsAppRequestModel(String userId, String str, String str2, String str3, List list) {
        Intrinsics.i(userId, "userId");
        this.f7085a = userId;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
    }
}
