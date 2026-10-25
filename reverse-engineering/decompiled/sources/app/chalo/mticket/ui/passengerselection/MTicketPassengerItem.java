package app.chalo.mticket.ui.passengerselection;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItem;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketPassengerItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5734a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketPassengerItem> serializer() {
            return MTicketPassengerItem$$serializer.f5735a;
        }
    }

    public /* synthetic */ MTicketPassengerItem(String str, int i, String str2, int i2, int i3, int i4, boolean z) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(MTicketPassengerItem$$serializer.f5735a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5734a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
    }

    public static MTicketPassengerItem a(MTicketPassengerItem mTicketPassengerItem, int i, int i2) {
        String passengerType = mTicketPassengerItem.f5734a;
        String passengerName = mTicketPassengerItem.b;
        if ((i2 & 4) != 0) {
            i = mTicketPassengerItem.c;
        }
        int i3 = i;
        int i4 = mTicketPassengerItem.d;
        int i5 = (i2 & 16) != 0 ? mTicketPassengerItem.e : 1;
        boolean z = mTicketPassengerItem.f;
        mTicketPassengerItem.getClass();
        Intrinsics.i(passengerType, "passengerType");
        Intrinsics.i(passengerName, "passengerName");
        return new MTicketPassengerItem(passengerType, i3, z, passengerName, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerItem)) {
            return false;
        }
        MTicketPassengerItem mTicketPassengerItem = (MTicketPassengerItem) obj;
        return Intrinsics.d(this.f5734a, mTicketPassengerItem.f5734a) && Intrinsics.d(this.b, mTicketPassengerItem.b) && this.c == mTicketPassengerItem.c && this.d == mTicketPassengerItem.d && this.e == mTicketPassengerItem.e && this.f == mTicketPassengerItem.f;
    }

    public final int hashCode() {
        return ((((((nf1.e(this.f5734a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicketPassengerItem(passengerType=", this.f5734a, ", passengerName=", this.b, ", count=");
        hq0.p(this.c, this.d, ", maxSelectionsAllowed=", ", minSelectionsAllowed=", sbE);
        sbE.append(this.e);
        sbE.append(", isEnabled=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public MTicketPassengerItem(String passengerType, int i, boolean z, String passengerName, int i2, int i3) {
        Intrinsics.i(passengerType, "passengerType");
        Intrinsics.i(passengerName, "passengerName");
        this.f5734a = passengerType;
        this.b = passengerName;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }
}
