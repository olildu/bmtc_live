package defpackage;

import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.onboarding.cityselection.ui.CitySelectionIntent;
import app.chalo.onboarding.cityselection.ui.CitySelectionRestoredState;
import app.chalo.scenes.ChaloNavigationManagerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15483a;
    public final /* synthetic */ CitySelectionComponent b;

    public /* synthetic */ dp(CitySelectionComponent citySelectionComponent, int i) {
        this.f15483a = i;
        this.b = citySelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15483a) {
            case 0:
                ChaloNavigationManagerKt.c(this.b.n);
                return Unit.f17538a;
            case 1:
                return new CitySelectionRestoredState(((CitySelectionDataState) this.b.f.getValue()).c);
            default:
                this.b.I0(CitySelectionIntent.BackClickedIntent.f6617a);
                return Unit.f17538a;
        }
    }
}
