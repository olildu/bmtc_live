package app.chalo.productpurchase.productselection.data.models.app;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AllProductConfigsResponseAppModelKt {
    public static final String a(ProductConfigResponseAppModel productConfigResponseAppModel) {
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).y;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
            return ((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).p;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
            return ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).p;
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel) {
        Intrinsics.i(superPassProductFareInfoResponseAppModel, "<this>");
        double d = superPassProductFareInfoResponseAppModel.b - superPassProductFareInfoResponseAppModel.d;
        int i = (int) d;
        return d - ((double) i) == 0.0d ? String.valueOf(i) : String.valueOf(d);
    }

    public static final String c(SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel) {
        Intrinsics.i(superPassProductFareInfoResponseAppModel, "<this>");
        double d = superPassProductFareInfoResponseAppModel.f8646a;
        int i = (int) d;
        return d - ((double) i) == 0.0d ? String.valueOf(i) : String.valueOf(d);
    }

    public static final String d(ProductConfigResponseAppModel productConfigResponseAppModel) {
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).v;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
            return ((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).m;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
            return ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).m;
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(ProductConfigResponseAppModel productConfigResponseAppModel) {
        Intrinsics.i(productConfigResponseAppModel, "<this>");
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).x;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
            return ((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).o;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
            return ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).o;
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String f(ProductConfigResponseAppModel productConfigResponseAppModel) {
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).w;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
            return ((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).n;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
            return ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).n;
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean g(ProductConfigResponseAppModel productConfigResponseAppModel) {
        Intrinsics.i(productConfigResponseAppModel, "<this>");
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).I.contains(ProductConfigServiceType.PREMIUM);
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
            return Intrinsics.d(((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).s, "premiumReserveTicket");
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean h(ProductConfigResponseAppModel productConfigResponseAppModel, int i) {
        if (i < productConfigResponseAppModel.getH()) {
            return false;
        }
        return productConfigResponseAppModel.getI() == -1 || i <= productConfigResponseAppModel.getI();
    }

    public static final int i(SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel) {
        Intrinsics.i(superPassProductConfigFareMappingResponseAppModel, "<this>");
        return (int) (superPassProductConfigFareMappingResponseAppModel.f / CalendarModelKt.MillisecondsIn24Hours);
    }
}
