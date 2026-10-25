package app.chalo.premiumbus.data.models.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBookingAvailableOptionsAppModelKt {
    public static final PremiumBusBookingPurchaseOptionAppModel a(List list) {
        Object next;
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel;
        List list2 = list;
        int i = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((PremiumBusBookingPurchaseOptionAppModel) it.next()).b == PremiumBusBookingAvailableOptionType.SUPER_PASS && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel = (PremiumBusBookingPurchaseOptionAppModel) next;
            if (premiumBusBookingPurchaseOptionAppModel.b == PremiumBusBookingAvailableOptionType.SUPER_PASS) {
                PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel2 = premiumBusBookingPurchaseOptionAppModel.c;
                if ((premiumBusBookingPurchaseOptionDetailsAppModel2 != null ? premiumBusBookingPurchaseOptionDetailsAppModel2.j : null) == PassTierType.VALUE) {
                    break;
                }
            }
        }
        PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel2 = (PremiumBusBookingPurchaseOptionAppModel) next;
        if (i != 1 || premiumBusBookingPurchaseOptionAppModel2 == null || (premiumBusBookingPurchaseOptionDetailsAppModel = premiumBusBookingPurchaseOptionAppModel2.c) == null || premiumBusBookingPurchaseOptionDetailsAppModel.h) {
            return null;
        }
        return premiumBusBookingPurchaseOptionAppModel2;
    }

    public static final boolean b(List list) {
        Intrinsics.i(list, "<this>");
        return a(list) != null;
    }
}
