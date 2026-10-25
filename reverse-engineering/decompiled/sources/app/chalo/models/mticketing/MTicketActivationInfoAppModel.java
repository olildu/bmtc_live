package app.chalo.models.mticketing;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/mticketing/MTicketActivationInfoAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketActivationInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5617a;
    public final String b;
    public final long c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/mticketing/MTicketActivationInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/mticketing/MTicketActivationInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketActivationInfoAppModel> serializer() {
            return MTicketActivationInfoAppModel$$serializer.f5618a;
        }
    }

    public /* synthetic */ MTicketActivationInfoAppModel(int i, String str, String str2, long j, boolean z) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MTicketActivationInfoAppModel$$serializer.f5618a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5617a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketActivationInfoAppModel)) {
            return false;
        }
        MTicketActivationInfoAppModel mTicketActivationInfoAppModel = (MTicketActivationInfoAppModel) obj;
        return Intrinsics.d(this.f5617a, mTicketActivationInfoAppModel.f5617a) && Intrinsics.d(this.b, mTicketActivationInfoAppModel.b) && this.c == mTicketActivationInfoAppModel.c && this.d == mTicketActivationInfoAppModel.d;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5617a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return ((iE + ((int) (j ^ (j >>> 32)))) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicketActivationInfoAppModel(city=", this.f5617a, ", mticketId=", this.b, ", activatedAt=");
        sbE.append(this.c);
        sbE.append(", isActivated=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public MTicketActivationInfoAppModel(String city, String mticketId, long j, boolean z) {
        Intrinsics.i(city, "city");
        Intrinsics.i(mticketId, "mticketId");
        this.f5617a = city;
        this.b = mticketId;
        this.c = j;
        this.d = z;
    }
}
