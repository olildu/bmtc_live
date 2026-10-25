package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.yn1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/VehicleBreakDownUpcomingTripUiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class VehicleBreakDownUpcomingTripUiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7405a;
    public final String b;
    public final String c;
    public final IconType d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/VehicleBreakDownUpcomingTripUiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/VehicleBreakDownUpcomingTripUiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<VehicleBreakDownUpcomingTripUiModel> serializer() {
            return VehicleBreakDownUpcomingTripUiModel$$serializer.f7406a;
        }
    }

    public /* synthetic */ VehicleBreakDownUpcomingTripUiModel(int i, IconType iconType, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(VehicleBreakDownUpcomingTripUiModel$$serializer.f7406a.getDescriptor(), i, 15);
            throw null;
        }
        this.f7405a = str;
        this.b = str2;
        this.c = str3;
        this.d = iconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleBreakDownUpcomingTripUiModel)) {
            return false;
        }
        VehicleBreakDownUpcomingTripUiModel vehicleBreakDownUpcomingTripUiModel = (VehicleBreakDownUpcomingTripUiModel) obj;
        return Intrinsics.d(this.f7405a, vehicleBreakDownUpcomingTripUiModel.f7405a) && Intrinsics.d(this.b, vehicleBreakDownUpcomingTripUiModel.b) && Intrinsics.d(this.c, vehicleBreakDownUpcomingTripUiModel.c) && this.d == vehicleBreakDownUpcomingTripUiModel.d;
    }

    public final int hashCode() {
        int iHashCode = this.f7405a.hashCode() * 31;
        String str = this.b;
        int iE = nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        IconType iconType = this.d;
        return iE + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("VehicleBreakDownUpcomingTripUiModel(vehicleName=", this.f7405a, ", etaToBreakdownLocation=", this.b, ", seatAvailabilityStr=");
        sbE.append(this.c);
        sbE.append(", seatAvailabilityIcon=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public VehicleBreakDownUpcomingTripUiModel(IconType iconType, String str, String str2, String seatAvailabilityStr) {
        Intrinsics.i(seatAvailabilityStr, "seatAvailabilityStr");
        this.f7405a = str;
        this.b = str2;
        this.c = seatAvailabilityStr;
        this.d = iconType;
    }
}
