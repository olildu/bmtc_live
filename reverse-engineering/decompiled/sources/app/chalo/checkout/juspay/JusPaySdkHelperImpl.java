package app.chalo.checkout.juspay;

import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.checkout.domain.provider.ICheckoutItemsProvider;
import app.chalo.juspay.UserUpiAccount;
import app.chalo.juspay.UserUpiAccountDetails;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/juspay/JusPaySdkHelperImpl;", "Lapp/chalo/checkout/juspay/JusPaySdkHelper;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JusPaySdkHelperImpl implements JusPaySdkHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f1403a;
    public final ICheckoutItemsProvider b;

    public JusPaySdkHelperImpl(StringProvider stringProvider, ICheckoutItemsProvider iCheckoutItemsProvider) {
        this.f1403a = stringProvider;
        this.b = iCheckoutItemsProvider;
    }

    @Override // app.chalo.checkout.juspay.JusPaySdkHelper
    public final CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem a(PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi) {
        return new CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem(this.b.d(juspayTurboUpi));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.checkout.juspay.JusPaySdkHelper
    public final ArrayList b(List list) {
        JuspayBank next;
        List<UserUpiAccount> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (UserUpiAccount userUpiAccount : list2) {
            UserUpiAccountDetails userUpiAccountDetails = userUpiAccount.b;
            int i = Integer.parseInt(userUpiAccountDetails.f4096a);
            JuspayBank.INSTANCE.getClass();
            Iterator<JuspayBank> it = JuspayBank.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getCode() != i);
            JuspayBank juspayBank = next;
            if (juspayBank == null) {
                juspayBank = JuspayBank.DEFAULT;
            }
            Object obj = JusPaySdkHelperKt.f1404a.get(juspayBank);
            String str = (String) (obj != null ? obj : null);
            arrayList.add(new CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UpiAccountItem(new PaymentUiItem(str != null ? new PaymentLogo.Url(str) : new PaymentLogo.Icon(IconType.UPI), userUpiAccountDetails.b, true, null, userUpiAccountDetails.e, null, Boolean.FALSE), userUpiAccount.f4094a, userUpiAccountDetails.g));
        }
        return arrayList;
    }
}
