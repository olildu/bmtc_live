package app.chalo.metro.ui.confirmbooking;

import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.sr;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmationBookingScreenData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ConfirmationBookingScreenData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f5470a;
    public final ChaloTicketBookingMode b;
    public final String c;
    public final String d;
    public final ConfirmationScreenTripDetails e;
    public final List f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmationBookingScreenData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmationBookingScreenData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ConfirmationBookingScreenData> serializer() {
            return ConfirmationBookingScreenData$$serializer.f5471a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new sr(6)), LazyKt.a(lazyThreadSafetyMode, new sr(7)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new sr(8)), LazyKt.a(lazyThreadSafetyMode, new sr(9))};
    }

    public /* synthetic */ ConfirmationBookingScreenData(int i, ChaloTransitMode chaloTransitMode, ChaloTicketBookingMode chaloTicketBookingMode, String str, String str2, ConfirmationScreenTripDetails confirmationScreenTripDetails, List list, List list2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(ConfirmationBookingScreenData$$serializer.f5471a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5470a = chaloTransitMode;
        this.b = chaloTicketBookingMode;
        this.c = str;
        this.d = str2;
        this.e = confirmationScreenTripDetails;
        this.f = list;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationBookingScreenData)) {
            return false;
        }
        ConfirmationBookingScreenData confirmationBookingScreenData = (ConfirmationBookingScreenData) obj;
        return this.f5470a == confirmationBookingScreenData.f5470a && this.b == confirmationBookingScreenData.b && Intrinsics.d(this.c, confirmationBookingScreenData.c) && Intrinsics.d(this.d, confirmationBookingScreenData.d) && Intrinsics.d(this.e, confirmationBookingScreenData.e) && Intrinsics.d(this.f, confirmationBookingScreenData.f) && Intrinsics.d(this.g, confirmationBookingScreenData.g);
    }

    public final int hashCode() {
        int iB = r30.b((this.e.hashCode() + nf1.e(nf1.e((this.b.hashCode() + (this.f5470a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
        List list = this.g;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmationBookingScreenData(transitMode=");
        sb.append(this.f5470a);
        sb.append(", bookingMode=");
        sb.append(this.b);
        sb.append(", configId=");
        cb0.t(sb, this.c, ", agencyName=", this.d, ", tripDetails=");
        sb.append(this.e);
        sb.append(", passengerDetailsList=");
        sb.append(this.f);
        sb.append(", tncList=");
        return xs.l(sb, this.g, ")");
    }

    public ConfirmationBookingScreenData(ChaloTransitMode transitMode, ChaloTicketBookingMode bookingMode, String configId, String agencyName, ConfirmationScreenTripDetails confirmationScreenTripDetails, List passengerDetailsList, List list) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(bookingMode, "bookingMode");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(passengerDetailsList, "passengerDetailsList");
        this.f5470a = transitMode;
        this.b = bookingMode;
        this.c = configId;
        this.d = agencyName;
        this.e = confirmationScreenTripDetails;
        this.f = passengerDetailsList;
        this.g = list;
    }
}
