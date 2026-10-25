package defpackage;

import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenConfigLayoutType;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.providers.cityprovider.CityProviderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19993a;
    public final /* synthetic */ HomeComponent b;

    public /* synthetic */ x70(HomeComponent homeComponent, int i) {
        this.f19993a = i;
        this.b = homeComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19993a) {
            case 0:
                return HomeScreenFragmentViewState.a((HomeScreenFragmentViewState) obj, null, null, null, null, null, null, CityProviderKt.b(this.b.m), HomeScreenConfigLayoutType.FAILURE, null, null, null, null, false, 31991);
            default:
                HomeScreenFragmentViewIntent intent = (HomeScreenFragmentViewIntent) obj;
                Intrinsics.i(intent, "intent");
                this.b.l1(intent);
                return Unit.f17538a;
        }
    }
}
