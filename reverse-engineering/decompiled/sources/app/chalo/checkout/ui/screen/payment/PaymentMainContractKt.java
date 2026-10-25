package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.providers.stringprovider.StringEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentMainContractKt {
    public static final int a(CheckoutScreenSectionUiModel checkoutScreenSectionUiModel) {
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.PreferredModes) {
            return 1;
        }
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.ChaloPay) {
            return 2;
        }
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OneClickUPI) {
            return 3;
        }
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.UPIApps) {
            return 4;
        }
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OtherPaymentModes) {
            return 5;
        }
        if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.NativeUPIApps) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(List list) {
        Intrinsics.i(list, "<this>");
        List<CheckoutScreenSectionUiModel> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (CheckoutScreenSectionUiModel checkoutScreenSectionUiModel : list2) {
            if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OneClickUPI) {
                List list3 = ((CheckoutScreenSectionUiModel.OneClickUPI) checkoutScreenSectionUiModel).i;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem) it.next()) instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UpiAccountItem) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final List c(List list, boolean z) {
        boolean z2;
        Intrinsics.i(list, "<this>");
        List<CheckoutScreenSectionUiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        boolean z3 = false;
        for (CheckoutScreenSectionUiModel oneClickUPI : list2) {
            if (oneClickUPI instanceof CheckoutScreenSectionUiModel.OneClickUPI) {
                CheckoutScreenSectionUiModel.OneClickUPI oneClickUPI2 = (CheckoutScreenSectionUiModel.OneClickUPI) oneClickUPI;
                StringEnum title = oneClickUPI2.g;
                String str = oneClickUPI2.h;
                List checkoutItemList = oneClickUPI2.i;
                CheckoutCtaDetail checkoutCtaDetail = oneClickUPI2.j;
                CheckoutCtaDetail checkoutCtaDetail2 = oneClickUPI2.l;
                Intrinsics.i(title, "title");
                Intrinsics.i(checkoutItemList, "checkoutItemList");
                z2 = z;
                z3 = true;
                oneClickUPI = new CheckoutScreenSectionUiModel.OneClickUPI(title, str, checkoutItemList, checkoutCtaDetail, z2, checkoutCtaDetail2);
            } else {
                z2 = z;
            }
            arrayList.add(oneClickUPI);
            z = z2;
        }
        boolean z4 = z;
        if (z3) {
            return arrayList;
        }
        return CollectionsKt.v0(new PaymentMainContractKt$sortByPriority$$inlined$sortedBy$1(), CollectionsKt.d0(new CheckoutScreenSectionUiModel.OneClickUPI(StringEnum.ONE_CLICK_UPI, null, EmptyList.f17557a, null, z4, null), arrayList));
    }

    public static final List d(List list, CheckoutScreenSectionUiModel.OneClickUPI oneClickUPI) {
        Intrinsics.i(list, "<this>");
        List<CheckoutScreenSectionUiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        boolean z = false;
        for (CheckoutScreenSectionUiModel checkoutScreenSectionUiModel : list2) {
            if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OneClickUPI) {
                z = true;
                checkoutScreenSectionUiModel = oneClickUPI;
            }
            arrayList.add(checkoutScreenSectionUiModel);
        }
        if (z) {
            return arrayList;
        }
        return CollectionsKt.v0(new PaymentMainContractKt$sortByPriority$$inlined$sortedBy$1(), CollectionsKt.d0(oneClickUPI, arrayList));
    }
}
