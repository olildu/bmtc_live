package defpackage;

import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.scenes.ChaloNavigationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n31 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18450a;
    public final /* synthetic */ RouteDetailsComponent b;

    public /* synthetic */ n31(RouteDetailsComponent routeDetailsComponent, int i) {
        this.f18450a = i;
        this.b = routeDetailsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ChaloNavigationManager chaloNavigationManager;
        switch (this.f18450a) {
            case 0:
                this.b.f1(RouteDetailsIntent.RouteBannerDialogueCtaClickedIntent.f4863a);
                return Unit.f17538a;
            case 1:
                chaloNavigationManager = this.b.O;
                gf.u(null, chaloNavigationManager);
                return Unit.f17538a;
            case 2:
                chaloNavigationManager = this.b.O;
                gf.u(null, chaloNavigationManager);
                return Unit.f17538a;
            case 3:
                RouteDetailsComponent routeDetailsComponent = this.b;
                String strB = CityProviderKt.b(routeDetailsComponent.k);
                if (strB == null) {
                    strB = "";
                }
                boolean z = true;
                if (!StringsKt.x(strB, "KOCHI", true) && !routeDetailsComponent.F.a()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                chaloNavigationManager = this.b.O;
                gf.u(null, chaloNavigationManager);
                return Unit.f17538a;
            case 5:
                this.b.f1(RouteDetailsIntent.ReportProblemModalAckClicked.f4858a);
                return Unit.f17538a;
            case 6:
                this.b.f1(RouteDetailsIntent.ReportProblemModalCancelClicked.f4859a);
                return Unit.f17538a;
            case 7:
                this.b.f1(RouteDetailsIntent.ReportProblemModalSubmitClicked.f4860a);
                return Unit.f17538a;
            default:
                List list = this.b.Z;
                if (list == null) {
                    list = EmptyList.f17557a;
                }
                String message = "fetching live seat availability for " + list.size() + " vehicles";
                Intrinsics.i(message, "message");
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RealtimeSocketRouteStreamResponseAppModel) it.next()).b);
                }
                return arrayList;
        }
    }
}
