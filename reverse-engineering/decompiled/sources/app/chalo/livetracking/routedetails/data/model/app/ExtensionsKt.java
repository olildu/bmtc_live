package app.chalo.livetracking.routedetails.data.model.app;

import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4390a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteBookingType.values().length];
            try {
                iArr[RouteBookingType.TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteBookingType.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteBookingType.AIRPORT_ROUTE_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteBookingType.PREMIUM_BUS_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4390a = iArr;
            int[] iArr2 = new int[SeatAvailabilityLevel.values().length];
            try {
                iArr2[SeatAvailabilityLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SeatAvailabilityLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SeatAvailabilityLevel.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SeatAvailabilityLevel.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static final RouteBookingType a(RouteLiveDetailsAppModel routeLiveDetailsAppModel) {
        Intrinsics.i(routeLiveDetailsAppModel, "<this>");
        if (routeLiveDetailsAppModel.c) {
            return RouteBookingType.AIRPORT_ROUTE_TICKET;
        }
        if (routeLiveDetailsAppModel.d) {
            return RouteBookingType.PREMIUM_BUS_TICKET;
        }
        if (routeLiveDetailsAppModel.b) {
            return RouteBookingType.PASS;
        }
        if (routeLiveDetailsAppModel.f1713a) {
            return RouteBookingType.TICKET;
        }
        return null;
    }

    public static final IconType b(SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(seatAvailabilityLevel, "<this>");
        int i = WhenMappings.b[seatAvailabilityLevel.ordinal()];
        if (i == 1) {
            return IconType.SEATS_AVAILABLE;
        }
        if (i == 2) {
            return IconType.STANDING_AVAILABLE;
        }
        if (i == 3) {
            return IconType.OVERCROWDED;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringEnum c(SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(seatAvailabilityLevel, "<this>");
        int i = WhenMappings.b[seatAvailabilityLevel.ordinal()];
        if (i == 1) {
            return StringEnum.AVAILABLE;
        }
        if (i == 2) {
            return StringEnum.STANDING;
        }
        if (i == 3) {
            return StringEnum.NO_SEATS;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
