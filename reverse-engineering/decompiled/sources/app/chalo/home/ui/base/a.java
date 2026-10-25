package app.chalo.home.ui.base;

import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeComponent f3233a;

    public /* synthetic */ a(HomeComponent homeComponent) {
        this.f3233a = homeComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strM;
        String strH;
        HomeComponent homeComponent = this.f3233a;
        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = homeComponent.L0;
        List list = pendingRideFeedbackStickyBannerUIState != null ? pendingRideFeedbackStickyBannerUIState.f2862a : null;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        List list2 = list;
        if (!list2.isEmpty() && (strM = homeComponent.v.m()) != null && (strH = homeComponent.m.h()) != null) {
            homeComponent.m1("ride feedback home banner dismissed", MapsKt.d(), list2);
            BuildersKt.d(homeComponent.j, null, null, new HomeComponent$handlePendingRideFeedbackDismissClick$1(homeComponent, list2, strM, strH, null), 3);
        }
        return Unit.f17538a;
    }
}
