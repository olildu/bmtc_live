package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.BufferType;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.userprofile.Gender;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/GetSeatDisplayTypeUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetSeatDisplayTypeUseCase {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7207a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SeatStatus.values().length];
            try {
                iArr[SeatStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeatStatus.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7207a = iArr;
            int[] iArr2 = new int[ReservationType.values().length];
            try {
                iArr2[ReservationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReservationType.WOMEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public static SeatDisplayType a(SeatInfoAppModel seat) {
        Intrinsics.i(seat, "seat");
        SeatStatus seatStatus = seat.d;
        ReservationType reservationType = seat.e;
        boolean z = reservationType == ReservationType.WOMEN && seat.k == BufferType.ACTIVE;
        int i = WhenMappings.b[reservationType.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.f7207a[seatStatus.ordinal()];
            if (i2 == 1) {
                return SeatDisplayType.GeneralAvailableSeat.f7251a;
            }
            if (i2 == 2) {
                return SeatDisplayType.GeneralUnavailableSeat.f7252a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.f7207a[seatStatus.ordinal()];
        if (i3 == 1) {
            return z ? SeatDisplayType.WomenActiveBufferAvailableSeat.f7253a : SeatDisplayType.WomenInactiveBufferAvailableSeat.f7255a;
        }
        if (i3 == 2) {
            return z ? SeatDisplayType.WomenActiveBufferUnavailableSeat.f7254a : SeatDisplayType.WomenInactiveBufferUnavailableSeat.f7256a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public static SeatDisplayTypeInfo b(SeatInfoAppModel seat, Gender userGender, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, int i) {
        boolean z;
        Intrinsics.i(seat, "seat");
        Intrinsics.i(userGender, "userGender");
        SeatDisplayType seatDisplayTypeA = a(seat);
        if (seatDisplayTypeA.equals(SeatDisplayType.WomenActiveBufferAvailableSeat.f7253a) && userGender == Gender.FEMALE && (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase)) {
            z = i > 1;
        }
        return new SeatDisplayTypeInfo(seatDisplayTypeA, z);
    }
}
