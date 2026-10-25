package app.chalo.helper;

import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.checkout.utility.CheckoutMTicketDetailsHelper;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/CheckoutMTicketDetailsHelperImpl;", "Lapp/chalo/checkout/utility/CheckoutMTicketDetailsHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutMTicketDetailsHelperImpl implements CheckoutMTicketDetailsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketRepository f2830a;
    public final MTicketUtilsHelper b;
    public final TimeUtilsContract c;

    public CheckoutMTicketDetailsHelperImpl(TicketRepository ticketRepository, MTicketUtilsHelper mTicketUtilsHelper, TimeUtilsContract timeUtilsContract) {
        this.f2830a = ticketRepository;
        this.b = mTicketUtilsHelper;
        this.c = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.checkout.utility.CheckoutMTicketDetailsHelper
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CheckoutMTicketDetailsHelperImpl$getMTicketDetails$1 checkoutMTicketDetailsHelperImpl$getMTicketDetails$1;
        String str2;
        Object next;
        List listD0;
        String str3;
        String str4;
        String str5;
        Set setKeySet;
        if (continuationImpl instanceof CheckoutMTicketDetailsHelperImpl$getMTicketDetails$1) {
            checkoutMTicketDetailsHelperImpl$getMTicketDetails$1 = (CheckoutMTicketDetailsHelperImpl$getMTicketDetails$1) continuationImpl;
            int i = checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutMTicketDetailsHelperImpl$getMTicketDetails$1 = new CheckoutMTicketDetailsHelperImpl$getMTicketDetails$1(this, continuationImpl);
            }
        } else {
            checkoutMTicketDetailsHelperImpl$getMTicketDetails$1 = new CheckoutMTicketDetailsHelperImpl$getMTicketDetails$1(this, continuationImpl);
        }
        Object objV = checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowK = this.f2830a.k();
            checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.L$0 = str;
            checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.label = 1;
            objV = FlowKt.v(flowK, checkoutMTicketDetailsHelperImpl$getMTicketDetails$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) checkoutMTicketDetailsHelperImpl$getMTicketDetails$1.L$0;
            ResultKt.b(objV);
        }
        Iterable iterable = (List) objV;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((MTicket) next).f5615a, str2));
        MTicket mTicket = (MTicket) next;
        if (mTicket == null) {
            return null;
        }
        String str6 = mTicket.f5615a;
        Map map = mTicket.h;
        if (map == null || (setKeySet = map.keySet()) == null || (listD0 = CollectionsKt.D0(setKeySet)) == null) {
            listD0 = EmptyList.f17557a;
        }
        List list = listD0;
        double dI = this.b.i(mTicket);
        long j = mTicket.i;
        TimeUtilsContract timeUtilsContract = this.c;
        String strQ = timeUtilsContract.Q(j);
        String strQ2 = timeUtilsContract.Q(mTicket.j);
        String str7 = mTicket.d;
        String str8 = mTicket.e;
        RouteStopsInfo routeStopsInfo = mTicket.f;
        return new PostPaymentSuccessProductType.MTicket(str6, list, dI, strQ, strQ2, str7, str8, (routeStopsInfo == null || (str5 = routeStopsInfo.f1717a) == null) ? "" : str5, (routeStopsInfo == null || (str4 = routeStopsInfo.c) == null) ? "" : str4, (routeStopsInfo == null || (str3 = routeStopsInfo.e) == null) ? "" : str3, Intrinsics.d(mTicket.s, Boolean.TRUE));
    }
}
