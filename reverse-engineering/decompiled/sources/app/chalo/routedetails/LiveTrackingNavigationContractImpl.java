package app.chalo.routedetails;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModelKt;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.MetroLandingArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routedetails/LiveTrackingNavigationContractImpl;", "Lapp/chalo/livetracking/routedetails/LiveTrackingNavigationContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingNavigationContractImpl implements LiveTrackingNavigationContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloNavigationManager f9175a;
    public final CrashlyticsLogger b;

    public LiveTrackingNavigationContractImpl(ChaloNavigationManager chaloNavigationManager, CrashlyticsLogger crashlyticsLogger) {
        this.f9175a = chaloNavigationManager;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.livetracking.routedetails.LiveTrackingNavigationContract
    public final void a() {
        try {
            this.f9175a.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.StopSelectionArgs.ONDC(null, null), null, null, 6));
        } catch (Exception e) {
            this.b.i(e);
        }
    }

    @Override // app.chalo.livetracking.routedetails.LiveTrackingNavigationContract
    public final void b(StopAppModel fromStop, StopAppModel toStop, Source source) {
        String strA;
        String strA2;
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(source, "source");
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(StopAppModel.INSTANCE.serializer(), fromStop);
        } catch (Exception unused) {
            strA = null;
        }
        try {
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA2 = json2.a(StopAppModel.INSTANCE.serializer(), toStop);
        } catch (Exception unused2) {
            strA2 = null;
        }
        ChaloNavigationManagerKt.e(this.f9175a, new StopBasedMetroLandingArgs(source, strA, strA2), null, 6);
    }

    @Override // app.chalo.livetracking.routedetails.LiveTrackingNavigationContract
    public final void c(Source source) {
        Intrinsics.i(source, "source");
        this.f9175a.b(new ChaloNavigationRequest.Navigate(new ChaloBusRouteInfoScreenArgs(source), null, null, 6));
    }

    @Override // app.chalo.livetracking.routedetails.LiveTrackingNavigationContract
    public final void d(StopAppModel fromStop, StopAppModel toStop, List routeIdsWithODPair, Source source, long j) {
        String strA;
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(routeIdsWithODPair, "routeIdsWithODPair");
        Intrinsics.i(source, "source");
        PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(PBStopPlaceSelectedAppModelKt.a(fromStop), PBStopPlaceSelectedAppModelKt.a(toStop), j);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA != null) {
            this.f9175a.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.SlotSelectionArgs(source, strA, null), null, null, 6));
        }
    }

    @Override // app.chalo.livetracking.routedetails.LiveTrackingNavigationContract
    public final void e(StopAppModel stopAppModel, StopAppModel stopAppModel2, Source source) {
        String strA;
        String strA2;
        Intrinsics.i(source, "source");
        if (stopAppModel != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(StopAppModel.INSTANCE.serializer(), stopAppModel);
            } catch (Exception unused) {
                strA = null;
            }
        } else {
            strA = null;
        }
        if (stopAppModel2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA2 = json2.a(StopAppModel.INSTANCE.serializer(), stopAppModel2);
            } catch (Exception unused2) {
                strA2 = null;
            }
        } else {
            strA2 = null;
        }
        ChaloNavigationManagerKt.e(this.f9175a, new MetroLandingArgs(source, strA, strA2), null, 6);
    }
}
