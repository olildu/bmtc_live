package app.chalo.home.domain;

import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModelKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetAllRequestedBookedProductsUseCaseKt {
    public static final ArrayList a(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChaloUserBookingType.SuperPassBooking) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final long b(ChaloUserBookingType chaloUserBookingType) {
        Intrinsics.i(chaloUserBookingType, "<this>");
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).d.d;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType).d.i;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
            return ((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType).d.f7113a.b;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) {
            return QuickPayAppModelKt.a(((ChaloUserBookingType.TicketBooking.QuickPayBooking) chaloUserBookingType).d);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d.c.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) chaloUserBookingType).d.b.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d.h.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) chaloUserBookingType).d.h;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.OndcTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) chaloUserBookingType).d.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) {
            SuperPassRideBookingAppModel superPassRideBookingAppModel = ((ChaloUserBookingType.TicketBooking.PassRideBooking) chaloUserBookingType).d;
            long j = superPassRideBookingAppModel.d;
            long j2 = superPassRideBookingAppModel.c * ((long) 1000);
            return j < j2 ? j2 : j;
        }
        if ((chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
            return Long.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChaloUserBookingType.TicketBooking) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ValidationProduct d(ChaloUserBookingType chaloUserBookingType) {
        Intrinsics.i(chaloUserBookingType, "<this>");
        String str = chaloUserBookingType.f2987a;
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) {
            String str2 = ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).e;
            return str2 != null ? new ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation(str2) : new ValidationProduct.MobileTicketProduct.InstantTicketValidation(str);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) {
            return new ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation(str);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
            return new ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation(str);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) {
            return new ValidationProduct.QuickpayProduct.QuickpayValidation(((ChaloUserBookingType.TicketBooking.QuickPayBooking) chaloUserBookingType).d.i);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            return new ValidationProduct.SuperPassProduct.MagicPassValidation(str);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            return new ValidationProduct.SuperPassProduct.RideBasedPassValidation(str);
        }
        if (!(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking)) {
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
                return new ValidationProduct.MobileTicketProduct.OndcTicketValidation(str);
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) {
                String str3 = ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).e;
                return str3 != null ? new ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation(str3) : new ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation(str);
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                return new ValidationProduct.MobileTicketProduct.MetroTicketValidation(str);
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
                return new ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation(str);
            }
            if (!(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
