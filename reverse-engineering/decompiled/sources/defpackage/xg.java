package defpackage;

import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20017a;
    public final /* synthetic */ HomeTabScreensRetainedState b;

    public /* synthetic */ xg(HomeTabScreensRetainedState homeTabScreensRetainedState, int i) {
        this.f20017a = i;
        this.b = homeTabScreensRetainedState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20017a) {
            case 0:
                ChaloBusViewState it = (ChaloBusViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, null, null, this.b.e, null, null, null, null, null, false, null, false, null, null, null, null, 268402687);
            case 1:
                HomeScreenViewState it2 = (HomeScreenViewState) obj;
                Intrinsics.i(it2, "it");
                return HomeScreenViewState.a(it2, null, null, null, null, null, null, null, null, false, null, null, null, null, this.b.c, null, false, false, false, 507903);
            case 2:
                MyTicketsDataState it3 = (MyTicketsDataState) obj;
                Intrinsics.i(it3, "it");
                return MyTicketsDataState.a(it3, null, null, null, false, false, null, null, null, null, false, null, false, null, false, false, null, false, null, null, this.b.f, false, 25165823);
            default:
                RegularBusViewState it4 = (RegularBusViewState) obj;
                Intrinsics.i(it4, "it");
                return RegularBusViewState.a(it4, false, null, null, null, false, null, null, null, null, null, null, null, null, null, this.b.d, null, null, false, false, false, false, 4161535);
        }
    }
}
