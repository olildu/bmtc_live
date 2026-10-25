package app.chalo.scenes.args;

import app.chalo.data.ProductBookingBranding;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.l60;
import defpackage.n21;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketBookingLeg;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketBookingLeg {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9252a;
    public final String b;
    public final ChaloTransitMode c;
    public final GroupTicketTripDetail d;
    public final ProductBookingBranding e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketBookingLeg$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/GroupTicketBookingLeg;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketBookingLeg> serializer() {
            return GroupTicketBookingLeg$$serializer.f9253a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new l60(6)), LazyKt.a(lazyThreadSafetyMode, new l60(7)), LazyKt.a(lazyThreadSafetyMode, new l60(8))};
    }

    public /* synthetic */ GroupTicketBookingLeg(int i, int i2, String str, ChaloTransitMode chaloTransitMode, GroupTicketTripDetail groupTicketTripDetail, ProductBookingBranding productBookingBranding) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(GroupTicketBookingLeg$$serializer.f9253a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9252a = i2;
        this.b = str;
        this.c = chaloTransitMode;
        this.d = groupTicketTripDetail;
        if ((i & 16) == 0) {
            this.e = ProductBookingBranding.None.INSTANCE;
        } else {
            this.e = productBookingBranding;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBookingLeg)) {
            return false;
        }
        GroupTicketBookingLeg groupTicketBookingLeg = (GroupTicketBookingLeg) obj;
        return this.f9252a == groupTicketBookingLeg.f9252a && Intrinsics.d(this.b, groupTicketBookingLeg.b) && this.c == groupTicketBookingLeg.c && Intrinsics.d(this.d, groupTicketBookingLeg.d) && Intrinsics.d(this.e, groupTicketBookingLeg.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + n21.c(this.c, nf1.e(this.f9252a * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f9252a, "GroupTicketBookingLeg(sequence=", ", configId=", this.b, ", mode=");
        sbP.append(this.c);
        sbP.append(", tripDetail=");
        sbP.append(this.d);
        sbP.append(", brandingType=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }

    public GroupTicketBookingLeg(int i, String configId, ChaloTransitMode mode, GroupTicketTripDetail groupTicketTripDetail, ProductBookingBranding brandingType) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(mode, "mode");
        Intrinsics.i(brandingType, "brandingType");
        this.f9252a = i;
        this.b = configId;
        this.c = mode;
        this.d = groupTicketTripDetail;
        this.e = brandingType;
    }
}
