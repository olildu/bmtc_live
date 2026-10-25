package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.home.data.exceptions.FetchBannerException;
import app.chalo.home.data.exceptions.PremiumBusContentConfigException;
import app.chalo.location.LatLng;
import app.chalo.ncmc.data.error.BlockNCMCCardFailedException;
import app.chalo.ncmc.data.error.CardRechargeOrderCreationFailed;
import app.chalo.ncmc.data.error.ChaloCardValidationException;
import app.chalo.ncmc.data.error.ChangeNCMCCardPinFailedException;
import app.chalo.ncmc.data.error.FetchCardRechargeConfigurationException;
import app.chalo.ncmc.data.error.FetchChaloCardTransactionsFailedException;
import app.chalo.ncmc.data.error.FetchEligibleCardsException;
import app.chalo.ncmc.data.error.FetchLinkedChaloCardsInfoException;
import app.chalo.ncmc.data.error.LinkChaloCardFailedException;
import app.chalo.ncmc.data.error.NcmcOfflineRechargeConfirmationFailedException;
import app.chalo.ncmc.data.error.NcmcOnlineRechargePaymentOrderCreationException;
import app.chalo.ncmc.data.error.UnlinkCardFailedException;
import app.chalo.ncmc.data.error.UvikIntentHashCreationException;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.plotline.insights.Database.o;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.k;
import so.plotline.insights.Plotline;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.PlotlineWidget.b;
import so.plotline.insights.R;
import so.plotline.insights.Tasks.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15832a;
    public final /* synthetic */ String b;

    public /* synthetic */ hj0(String str, int i) {
        this.f15832a = i;
        this.b = str;
    }

    /* JADX INFO: Removed unreachable split cross block B:164:0x0130 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        switch (this.f15832a) {
            case 0:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20(this.b, (SemanticsPropertyReceiver) obj);
            case 1:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            case 2:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                return Unit.f17538a;
            case 3:
                return NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47(this.b, (SemanticsPropertyReceiver) obj);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = this.b;
                }
                return new ChaloCardValidationException(genericChaloErrorResponse, str);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = this.b;
                }
                return new UnlinkCardFailedException(genericChaloErrorResponse2, str2);
            case 6:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = this.b;
                }
                return new NcmcOnlineRechargePaymentOrderCreationException(genericChaloErrorResponse3, str3);
            case 7:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = this.b;
                }
                return new CardRechargeOrderCreationFailed(genericChaloErrorResponse4, str4);
            case 8:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = this.b;
                }
                return new FetchCardRechargeConfigurationException(genericChaloErrorResponse5, str5);
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse6 == null || (str6 = genericChaloErrorResponse6.b) == null) {
                    str6 = this.b;
                }
                return new UvikIntentHashCreationException(genericChaloErrorResponse6, str6);
            case 10:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse7 == null || (str7 = genericChaloErrorResponse7.b) == null) {
                    str7 = this.b;
                }
                return new FetchLinkedChaloCardsInfoException(genericChaloErrorResponse7, str7);
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse8 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse8 == null || (str8 = genericChaloErrorResponse8.b) == null) {
                    str8 = this.b;
                }
                return new NcmcOfflineRechargeConfirmationFailedException(genericChaloErrorResponse8, str8);
            case 12:
                GenericChaloErrorResponse genericChaloErrorResponse9 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse9 == null || (str9 = genericChaloErrorResponse9.b) == null) {
                    str9 = this.b;
                }
                return new FetchChaloCardTransactionsFailedException(genericChaloErrorResponse9, str9);
            case 13:
                GenericChaloErrorResponse genericChaloErrorResponse10 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse10 == null || (str10 = genericChaloErrorResponse10.b) == null) {
                    str10 = this.b;
                }
                return new BlockNCMCCardFailedException(genericChaloErrorResponse10, str10);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse11 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse11 == null || (str11 = genericChaloErrorResponse11.b) == null) {
                    str11 = this.b;
                }
                return new LinkChaloCardFailedException(genericChaloErrorResponse11, str11);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse12 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse12 == null || (str12 = genericChaloErrorResponse12.b) == null) {
                    str12 = this.b;
                }
                return new ChangeNCMCCardPinFailedException(genericChaloErrorResponse12, str12);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse13 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse13 == null || (str13 = genericChaloErrorResponse13.b) == null) {
                    str13 = this.b;
                }
                return new FetchEligibleCardsException(genericChaloErrorResponse13, str13);
            case 17:
                OfflineCardRechargeViewState it = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it, "it");
                return OfflineCardRechargeViewState.a(it, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, true, this.b, 524287);
            case 18:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, false, false, false, true, null, this.b, false, false, null, 2068479);
            case 19:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, true, this.b, 524287);
            case 20:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, true, null, this.b, true, null, null, null, null, false, false, false, null, false, null, 2097047);
            case 21:
                PbBulkBookingRideDetailsViewState pbBulkBookingRideDetailsViewState = (PbBulkBookingRideDetailsViewState) obj;
                String str16 = pbBulkBookingRideDetailsViewState.w;
                String str17 = this.b;
                return !Intrinsics.d(str16, str17) ? PbBulkBookingRideDetailsViewState.a(pbBulkBookingRideDetailsViewState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, str17, false, null, false, 62914559) : pbBulkBookingRideDetailsViewState;
            case 22:
                return PbPassPurchaseLandingScreenDataState.a((PbPassPurchaseLandingScreenDataState) obj, null, false, false, false, null, null, null, this.b, false, false, 3835);
            case 23:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                return Unit.f17538a;
            case 24:
                Context context = (Context) obj;
                Intrinsics.i(context, "context");
                final PlotlineWidget plotlineWidget = new PlotlineWidget(context);
                plotlineWidget.d = new ArrayList();
                plotlineWidget.e = new HashSet();
                plotlineWidget.f = new HashSet();
                plotlineWidget.g = null;
                plotlineWidget.h = 0.0d;
                plotlineWidget.j = 0;
                k kVarA = k.a();
                plotlineWidget.n = null;
                plotlineWidget.o = null;
                PlotlineWidget.b bVar = plotlineWidget.new b();
                String str18 = this.b;
                plotlineWidget.setTag(str18);
                plotlineWidget.b = str18;
                plotlineWidget.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.plotline_view_layout, (ViewGroup) plotlineWidget, true);
                plotlineWidget.i(Boolean.TRUE);
                try {
                    kVarA.f19446a.add(new WeakReference(bVar));
                    try {
                        final WeakReference weakReference = new WeakReference(plotlineWidget);
                        Plotline plotlineB = Plotline.b();
                        PlotlineWidget.k kVar = new PlotlineWidget.k() { // from class: ss0
                            @Override // so.plotline.insights.PlotlineWidget.k
                            public final void a() {
                                HashSet hashSet = PlotlineWidget.p;
                                PlotlineWidget plotlineWidget2 = (PlotlineWidget) weakReference.get();
                                if (plotlineWidget2 != null) {
                                    a.a(new o(plotlineWidget2.getContext(), plotlineWidget2.b, new us0(0, plotlineWidget2, new a7(29, plotlineWidget, plotlineWidget2))));
                                }
                            }
                        };
                        plotlineB.getClass();
                        try {
                            if (!plotlineB.d.booleanValue()) {
                                plotlineB.N.add(kVar);
                            }
                        } catch (Exception e) {
                            DebugHelper.a(e);
                        }
                    } catch (Exception e2) {
                        DebugHelper.a(e2);
                    }
                    break;
                } catch (Exception e3) {
                    DebugHelper.a(e3);
                }
                plotlineWidget.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return plotlineWidget;
            case 25:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final String str19 = this.b;
                return new DisposableEffectResult() { // from class: so.plotline.plotline_kmp.Plotline_androidKt$PLabel$1$invoke$lambda$5$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        so.plotline.insights.Plotline.b().Y.remove(new Pair(so.plotline.insights.Plotline.b().V, str19));
                    }
                };
            case 26:
                PremiumBusChangeStopDataState it2 = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it2, "it");
                Map map = it2.j;
                String str20 = this.b;
                LatLng latLng = (LatLng) map.get(str20);
                return PremiumBusChangeStopDataState.a(it2, null, null, null, null, null, null, str20, null, null, null, null, null, null, latLng != null ? new MapCameraViewState.UpdatedState.ZoomToLatLng(latLng, 0.0f, 2) : it2.n, null, 24511);
            case 27:
                GenericChaloErrorResponse genericChaloErrorResponse14 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse14 == null || (str14 = genericChaloErrorResponse14.b) == null) {
                    str14 = this.b;
                }
                return new PremiumBusContentConfigException(genericChaloErrorResponse14, str14);
            case 28:
                GenericChaloErrorResponse genericChaloErrorResponse15 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse15 == null || (str15 = genericChaloErrorResponse15.b) == null) {
                    str15 = this.b;
                }
                return new FetchBannerException(genericChaloErrorResponse15, str15);
            default:
                PremiumBusProductModificationReasonsViewState it3 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusProductModificationReasonsViewState.a(it3, null, null, null, null, null, false, null, this.b, false, null, null, null, null, null, null, 64767);
        }
    }
}
