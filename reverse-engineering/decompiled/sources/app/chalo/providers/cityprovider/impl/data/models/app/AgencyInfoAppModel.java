package app.chalo.providers.cityprovider.impl.data.models.app;

import defpackage.hq0;
import defpackage.n21;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/AgencyInfoAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AgencyInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8852a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/AgencyInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/app/AgencyInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AgencyInfoAppModel> serializer() {
            return AgencyInfoAppModel$$serializer.f8853a;
        }
    }

    public /* synthetic */ AgencyInfoAppModel(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, boolean z7, boolean z8) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(AgencyInfoAppModel$$serializer.f8853a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f8852a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = i2;
        this.i = z7;
        this.j = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgencyInfoAppModel)) {
            return false;
        }
        AgencyInfoAppModel agencyInfoAppModel = (AgencyInfoAppModel) obj;
        return Intrinsics.d(this.f8852a, agencyInfoAppModel.f8852a) && this.b == agencyInfoAppModel.b && this.c == agencyInfoAppModel.c && this.d == agencyInfoAppModel.d && this.e == agencyInfoAppModel.e && this.f == agencyInfoAppModel.f && this.g == agencyInfoAppModel.g && this.h == agencyInfoAppModel.h && this.i == agencyInfoAppModel.i && this.j == agencyInfoAppModel.j;
    }

    public final int hashCode() {
        return (((((((((((((((((this.f8852a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("AgencyInfoAppModel(agencyName=", this.f8852a, ", liveFeedUrlAvailable=", ", productEnabled=", this.b);
        z40.r(sbM, this.c, ", isQuickPayEnabled=", this.d, ", isWalletEnabled=");
        z40.r(sbM, this.e, ", isClosedLoopWalletEnabled=", this.f, ", isOnlineCardRechargeAvailable=");
        sbM.append(this.g);
        sbM.append(", priority=");
        sbM.append(this.h);
        sbM.append(", isOndcProductAvailable=");
        return n21.h(sbM, this.i, ", isTicketBookingEnabled=", this.j, ")");
    }

    public AgencyInfoAppModel(String agencyName, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, boolean z8) {
        Intrinsics.i(agencyName, "agencyName");
        this.f8852a = agencyName;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = i;
        this.i = z7;
        this.j = z8;
    }
}
