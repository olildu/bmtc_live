package app.chalo.mticket.ui.tripinfo;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketTripInfoRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f5775a;
    public final ProductBookingRouteDetails b;
    public final ProductBookingStopDetails c;
    public final ProductBookingStopDetails d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketTripInfoRestoredState> serializer() {
            return MTicketTripInfoRestoredState$$serializer.f5776a;
        }
    }

    static {
        ProductBookingRouteDetails.Companion companion = ProductBookingRouteDetails.INSTANCE;
        e = new Lazy[]{LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(7)), null, null, null};
    }

    public /* synthetic */ MTicketTripInfoRestoredState(int i, Source source, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MTicketTripInfoRestoredState$$serializer.f5776a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5775a = source;
        this.b = productBookingRouteDetails;
        this.c = productBookingStopDetails;
        this.d = productBookingStopDetails2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripInfoRestoredState)) {
            return false;
        }
        MTicketTripInfoRestoredState mTicketTripInfoRestoredState = (MTicketTripInfoRestoredState) obj;
        return this.f5775a == mTicketTripInfoRestoredState.f5775a && Intrinsics.d(this.b, mTicketTripInfoRestoredState.b) && Intrinsics.d(this.c, mTicketTripInfoRestoredState.c) && Intrinsics.d(this.d, mTicketTripInfoRestoredState.d);
    }

    public final int hashCode() {
        Source source = this.f5775a;
        int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
        ProductBookingRouteDetails productBookingRouteDetails = this.b;
        int iHashCode2 = (iHashCode + (productBookingRouteDetails == null ? 0 : productBookingRouteDetails.hashCode())) * 31;
        ProductBookingStopDetails productBookingStopDetails = this.c;
        int iHashCode3 = (iHashCode2 + (productBookingStopDetails == null ? 0 : productBookingStopDetails.hashCode())) * 31;
        ProductBookingStopDetails productBookingStopDetails2 = this.d;
        return iHashCode3 + (productBookingStopDetails2 != null ? productBookingStopDetails2.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketTripInfoRestoredState(source=" + this.f5775a + ", route=" + this.b + ", fromStop=" + this.c + ", toStop=" + this.d + ")";
    }

    public MTicketTripInfoRestoredState(Source source, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2) {
        this.f5775a = source;
        this.b = productBookingRouteDetails;
        this.c = productBookingStopDetails;
        this.d = productBookingStopDetails2;
    }
}
