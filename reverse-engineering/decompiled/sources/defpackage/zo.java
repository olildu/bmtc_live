package defpackage;

import app.chalo.constants.Source;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20217a;
    public final /* synthetic */ CityLocationSelectionComponent b;

    public /* synthetic */ zo(CityLocationSelectionComponent cityLocationSelectionComponent, int i) {
        this.f20217a = i;
        this.b = cityLocationSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20217a) {
            case 0:
                ChaloNavigationManagerKt.e(this.b.v, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                break;
            default:
                ChaloNavigationManagerKt.e(this.b.v, CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.CITY_SELECTION_SCREEN, null, 6), null, 6);
                break;
        }
        return Unit.f17538a;
    }
}
