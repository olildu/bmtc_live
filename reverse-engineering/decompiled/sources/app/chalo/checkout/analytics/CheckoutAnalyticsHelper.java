package app.chalo.checkout.analytics;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.utils.timeutil.TimeUtilsContract;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/analytics/CheckoutAnalyticsHelper;", "Lapp/chalo/checkout/analytics/ICheckoutAnalyticsHelper;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutAnalyticsHelper implements ICheckoutAnalyticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutProductDataResolver f1240a;
    public final CheckoutPaymentDataResolver b;
    public final AnalyticsContract c;
    public final BasicInfoContract d;
    public final TimeUtilsContract e;

    public CheckoutAnalyticsHelper(ICheckoutProductDataResolver iCheckoutProductDataResolver, CheckoutPaymentDataResolver checkoutPaymentDataResolver, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f1240a = iCheckoutProductDataResolver;
        this.b = checkoutPaymentDataResolver;
        this.c = analyticsContract;
        this.d = basicInfoContract;
        this.e = timeUtilsContract;
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void a(String str, Map map, boolean z) {
        this.c.e(str, this.f1240a.s().f2683a, map, AnalyticsFrequency.Always.b, z);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void b(String str, Map map) {
        this.c.F(str, this.f1240a.s().f2683a, map);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void c(Map map, int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("preferred mode", Integer.valueOf(i));
        linkedHashMap.put("popular mode", Integer.valueOf(i2));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "Payment Modes Screen opened", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void d(PostPaymentSuccessProductType.MTicket mTicket, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("reason", Boolean.TRUE);
        linkedHashMap.put("historyCallRetryCount", Integer.valueOf(i));
        List list = mTicket.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.b((String) it.next()));
        }
        linkedHashMap.putAll(MapsKt.i(new Pair("bookingId", mTicket.f1584a), new Pair("passengerTypes", new JsonArray(arrayList).toString()), new Pair("fare", String.valueOf(mTicket.c)), new Pair("startDate", mTicket.d), new Pair("expiryDate", mTicket.e), new Pair("city", mTicket.f), new Pair("agency", mTicket.g), new Pair("upTripRouteId", mTicket.h), new Pair("upTripStartStopId", mTicket.i), new Pair("upTripEndStopId", mTicket.j), new Pair("isFreeRide", String.valueOf(mTicket.k))));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "post payment mticket details fetched", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void e(String status, String str) {
        Intrinsics.i(status, "status");
        CheckoutPaymentData checkoutPaymentDataU = this.b.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair pair = new Pair("response", status);
        CheckoutOrderData checkoutOrderData = checkoutPaymentDataU.f2691a;
        linkedHashMap.putAll(MapsKt.i(pair, new Pair(PaymentConstants.ORDER_ID_CAMEL, checkoutOrderData.f2689a), new Pair("chaloOrderId", checkoutOrderData.b), new Pair("bookingId", checkoutOrderData.h), new Pair("reason", String.valueOf(str))));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "payment status response", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void f(int i) {
        Map map = this.f1240a.s().b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("historyCallRetryCount", Integer.valueOf(i));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "post payment super pass details fetched", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void g(String status, String str) {
        Intrinsics.i(status, "status");
        CheckoutPaymentData checkoutPaymentDataU = this.b.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair pair = new Pair("response", status);
        CheckoutOrderData checkoutOrderData = checkoutPaymentDataU.f2691a;
        linkedHashMap.putAll(MapsKt.i(pair, new Pair(PaymentConstants.ORDER_ID_CAMEL, checkoutOrderData.f2689a), new Pair("chaloOrderId", checkoutOrderData.b), new Pair("bookingId", checkoutOrderData.h), new Pair("reason", String.valueOf(str))));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "order status response", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void h(String str, Map map, boolean z) {
        Map map2 = this.f1240a.s().b;
        String str2 = this.b.u().f2691a.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map2);
        linkedHashMap.put("isClosedLoopWallet", Boolean.valueOf(z));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, str, linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void i(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN = this.e.N(this.d.j());
        StringBuilder sb = new StringBuilder();
        sb.append(iN);
        linkedHashMap.put("hourOfEvent", sb.toString());
        linkedHashMap.put("paymentProvider", this.b.u().d.f5657a.name());
        linkedHashMap.putAll(map);
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "payment cancelled", linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void j(String str) {
        String str2;
        ICheckoutProductDataResolver iCheckoutProductDataResolver = this.f1240a;
        Map map = iCheckoutProductDataResolver.s().b;
        String str3 = this.b.u().c;
        CheckoutProductType checkoutProductTypeA = iCheckoutProductDataResolver.a();
        Intrinsics.i(checkoutProductTypeA, "<this>");
        switch (CheckoutAnalyticsHelperKt.WhenMappings.f1241a[checkoutProductTypeA.ordinal()]) {
            case 1:
            case 2:
                str2 = "pass booked";
                break;
            case 3:
                str2 = "wallet load balance payment successful";
                break;
            case 4:
                str2 = "online card recharge payment successful";
                break;
            case 5:
                str2 = "electricity bill payment successful";
                break;
            case 6:
                str2 = "ncmc recharge payment successful";
                break;
            case 7:
                str2 = "";
                break;
            case 8:
                str2 = "instant ticket payment successful";
                break;
            case 9:
                str2 = "premium bus ticket payment successful";
                break;
            case 10:
                str2 = "ondc ticket payment successful";
                break;
            case 11:
                str2 = "ondc metro ticket payment successful";
                break;
            case 12:
                str2 = "metro ticket payment successful";
                break;
            case 13:
                str2 = "mticket payment success";
                break;
            case 14:
                str2 = "multi modal tkt payment successful";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("paymentId", str);
        int iN = this.e.N(this.d.j());
        StringBuilder sb = new StringBuilder();
        sb.append(iN);
        linkedHashMap.put("hourOfEvent", sb.toString());
        linkedHashMap.put("agency", str3);
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, str2, linkedHashMap, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void k(String itemName, String mode, boolean z, boolean z2, String str, Map map) {
        Intrinsics.i(itemName, "itemName");
        Intrinsics.i(mode, "mode");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("mode", mode), new Pair("payment app name", itemName), new Pair("top mode", String.valueOf(z)), new Pair("preferred mode", String.valueOf(z2)));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, "Payment mode selected", linkedHashMapK, 12);
    }

    @Override // app.chalo.checkout.analytics.ICheckoutAnalyticsHelper
    public final void l(Map map) {
        String str;
        ICheckoutProductDataResolver iCheckoutProductDataResolver = this.f1240a;
        Map map2 = iCheckoutProductDataResolver.s().b;
        CheckoutProductType checkoutProductTypeA = iCheckoutProductDataResolver.a();
        Intrinsics.i(checkoutProductTypeA, "<this>");
        switch (CheckoutAnalyticsHelperKt.WhenMappings.f1241a[checkoutProductTypeA.ordinal()]) {
            case 1:
            case 2:
                str = "pass payment failed";
                break;
            case 3:
                str = "wallet load balance payment failed";
                break;
            case 4:
                str = "online card recharge payment failed";
                break;
            case 5:
                str = "electricity bill payment failed";
                break;
            case 6:
                str = "ncmc recharge payment failed";
                break;
            case 7:
                str = "";
                break;
            case 8:
                str = "instant ticket payment failed";
                break;
            case 9:
                str = "premium bus ticket payment failed";
                break;
            case 10:
                str = "ondc ticket payment failed";
                break;
            case 11:
                str = "ondc metro ticket payment failed";
                break;
            case 12:
                str = "metro ticket payment failed";
                break;
            case 13:
                str = "mticket payment failed";
                break;
            case 14:
                str = "multi modal tkt payment failed";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map2);
        int iN = this.e.N(this.d.j());
        StringBuilder sb = new StringBuilder();
        sb.append(iN);
        linkedHashMap.put("hourOfEvent", sb.toString());
        linkedHashMap.putAll(map);
        ICheckoutAnalyticsHelper.DefaultImpls.a(this, str, linkedHashMap, 12);
    }
}
