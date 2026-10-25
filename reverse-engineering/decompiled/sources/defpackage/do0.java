package defpackage;

import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.productsummary.ui.pass.PassSummaryDataState;
import app.chalo.quickpay.ui.payforticket.PayForTicketViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.parser.ParseError;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class do0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15481a;

    public /* synthetic */ do0(int i) {
        this.f15481a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15481a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("ondc_ticket_table");
                return Unit.f17538a;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("ondc_ticket_table");
                return Unit.f17538a;
            case 2:
                return AndroidOverscroll_androidKt.defaultOverscrollFactory((CompositionLocalAccessorScope) obj);
            case 3:
                PremiumBusStopDetailsViewState it = (PremiumBusStopDetailsViewState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusStopDetailsViewState.a(it, false, false, null, null, null, PBStopDetailsZoomedImageState.Hide.f7940a, 31);
            case 4:
                PremiumBusStopDetailsViewState it2 = (PremiumBusStopDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusStopDetailsViewState.a(it2, true, false, null, null, null, null, 62);
            case 5:
                PremiumBusStopDetailsViewState it3 = (PremiumBusStopDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusStopDetailsViewState.a(it3, false, true, null, null, null, null, 60);
            case 6:
                return PremiumBusStopDetailsViewState.a((PremiumBusStopDetailsViewState) obj, false, true, null, null, null, null, 60);
            case 7:
                Intrinsics.i((TextFieldValue) obj, "it");
                return Unit.f17538a;
            case 8:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$3((Placeable.PlacementScope) obj);
            case 9:
                ParseError it4 = (ParseError) obj;
                Intrinsics.i(it4, "it");
                StringBuilder sb = new StringBuilder("position ");
                sb.append(it4.f18036a);
                sb.append(": '");
                return vo1.i('\'', (String) it4.b.invoke(), sb);
            case 10:
                return Boolean.valueOf(((Integer) obj).intValue() < 0);
            case 11:
                return Boolean.valueOf(((Integer) obj).intValue() <= 0);
            case 12:
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            case 13:
                return Boolean.valueOf(((Integer) obj).intValue() >= 0);
            case 14:
                PassSummaryDataState it5 = (PassSummaryDataState) obj;
                Intrinsics.i(it5, "it");
                return PassSummaryDataState.a(it5, false, true, null, null, null, null, null, 253);
            case 15:
                PassSummaryDataState it6 = (PassSummaryDataState) obj;
                Intrinsics.i(it6, "it");
                return PassSummaryDataState.a(it6, false, false, null, null, null, null, null, 253);
            case 16:
                PassSummaryDataState it7 = (PassSummaryDataState) obj;
                Intrinsics.i(it7, "it");
                return PassSummaryDataState.a(it7, false, false, null, null, null, null, null, 223);
            case 17:
                PassSummaryDataState it8 = (PassSummaryDataState) obj;
                Intrinsics.i(it8, "it");
                return PassSummaryDataState.a(it8, false, false, null, null, null, null, null, 253);
            case 18:
                PassSummaryDataState it9 = (PassSummaryDataState) obj;
                Intrinsics.i(it9, "it");
                return PassSummaryDataState.a(it9, false, false, null, null, null, null, null, 253);
            case 19:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, false, null, null, null, null, null, 251);
            case 20:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, false, null, null, null, null, null, 250);
            case 21:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, false, null, null, null, null, null, 253);
            case 22:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, false, null, null, null, null, null, 253);
            case 23:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, true, null, null, null, null, null, 253);
            case 24:
                return PassSummaryDataState.a((PassSummaryDataState) obj, false, false, null, null, null, null, null, 253);
            case 25:
                PayForTicketViewState it10 = (PayForTicketViewState) obj;
                Intrinsics.i(it10, "it");
                boolean z = it10.b;
                boolean z2 = it10.c;
                String routeJsonString = it10.d;
                String str = it10.e;
                Intrinsics.i(routeJsonString, "routeJsonString");
                return new PayForTicketViewState(routeJsonString, str, true, z, z2);
            case 26:
                PaymentDataState it11 = (PaymentDataState) obj;
                Intrinsics.i(it11, "it");
                return PaymentDataState.a(it11, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 1966079);
            case 27:
                PaymentDataState it12 = (PaymentDataState) obj;
                Intrinsics.i(it12, "it");
                return PaymentDataState.a(it12, null, false, null, true, null, null, false, null, null, null, null, false, false, false, null, false, null, 2096119);
            case 28:
                PaymentDataState it13 = (PaymentDataState) obj;
                Intrinsics.i(it13, "it");
                return PaymentDataState.a(it13, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2097143);
            default:
                PaymentDataState it14 = (PaymentDataState) obj;
                Intrinsics.i(it14, "it");
                return PaymentDataState.a(it14, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2096127);
        }
    }
}
