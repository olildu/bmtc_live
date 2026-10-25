package app.chalo.mticket.ui.passengerselection;

import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.sg0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketPassengerSelectionRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5755a;
    public final ProductBookingRouteDetails b;
    public final ProductBookingStopDetails c;
    public final ProductBookingStopDetails d;
    public final Source e;
    public final MTicketPassengerSelectionContainer f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketPassengerSelectionRestoredState> serializer() {
            return MTicketPassengerSelectionRestoredState$$serializer.f5756a;
        }
    }

    public /* synthetic */ MTicketPassengerSelectionRestoredState(int i, String str, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, Source source, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(MTicketPassengerSelectionRestoredState$$serializer.f5756a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5755a = str;
        this.b = productBookingRouteDetails;
        this.c = productBookingStopDetails;
        this.d = productBookingStopDetails2;
        this.e = source;
        this.f = mTicketPassengerSelectionContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerSelectionRestoredState)) {
            return false;
        }
        MTicketPassengerSelectionRestoredState mTicketPassengerSelectionRestoredState = (MTicketPassengerSelectionRestoredState) obj;
        return Intrinsics.d(this.f5755a, mTicketPassengerSelectionRestoredState.f5755a) && Intrinsics.d(this.b, mTicketPassengerSelectionRestoredState.b) && Intrinsics.d(this.c, mTicketPassengerSelectionRestoredState.c) && Intrinsics.d(this.d, mTicketPassengerSelectionRestoredState.d) && this.e == mTicketPassengerSelectionRestoredState.e && Intrinsics.d(this.f, mTicketPassengerSelectionRestoredState.f);
    }

    public final int hashCode() {
        String str = this.f5755a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        Source source = this.e;
        int iHashCode2 = (iHashCode + (source == null ? 0 : source.hashCode())) * 31;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer = this.f;
        return iHashCode2 + (mTicketPassengerSelectionContainer != null ? mTicketPassengerSelectionContainer.f5741a.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketPassengerSelectionRestoredState(productConfigId=" + this.f5755a + ", route=" + this.b + ", fromStop=" + this.c + ", toStop=" + this.d + ", source=" + this.e + ", passengerSelectionContainer=" + this.f + ")";
    }

    public MTicketPassengerSelectionRestoredState(String str, ProductBookingRouteDetails route, ProductBookingStopDetails fromStop, ProductBookingStopDetails toStop, Source source, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer) {
        Intrinsics.i(route, "route");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        this.f5755a = str;
        this.b = route;
        this.c = fromStop;
        this.d = toStop;
        this.e = source;
        this.f = mTicketPassengerSelectionContainer;
    }
}
