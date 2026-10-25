package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.TripCommunicationIconType;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTripInfoContractKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7430a;

        static {
            int[] iArr = new int[TripCommunicationIconType.values().length];
            try {
                iArr[TripCommunicationIconType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripCommunicationIconType.WEATHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripCommunicationIconType.TRAFFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TripCommunicationIconType.BREAKDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TripCommunicationIconType.BREAKDOWN_BUFFER_BUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7430a = iArr;
        }
    }

    public static final boolean a(PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState) {
        Intrinsics.i(premiumBusBookingVehicleInfoState, "<this>");
        return (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned) && ((PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState).c == PremiumBusTripStatus.ACTIVE;
    }

    public static final IconType b(TripCommunicationIconType iconType) {
        Intrinsics.i(iconType, "iconType");
        int i = WhenMappings.f7430a[iconType.ordinal()];
        if (i == 1) {
            return IconType.IC_INFO_GREY_TRIANGLE;
        }
        if (i == 2) {
            return IconType.WEATHER;
        }
        if (i == 3) {
            return IconType.TRAFFIC;
        }
        if (i == 4) {
            return IconType.BREAKDOWN;
        }
        if (i == 5) {
            return IconType.BREAKDOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState) {
        Intrinsics.i(premiumBusBookingVehicleInfoState, "<this>");
        if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned) {
            return null;
        }
        if ((premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.NotFetched) || (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String d(PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState) {
        Intrinsics.i(premiumBusBookingVehicleInfoState, "<this>");
        if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned) {
            return null;
        }
        if ((premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.NotFetched) || (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
