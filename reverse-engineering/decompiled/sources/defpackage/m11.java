package defpackage;

import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.data.model.app.LocationTurnOnTooltipType;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18362a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ RegularBusViewState c;

    public /* synthetic */ m11(RegularBusViewState regularBusViewState, Function1 function1) {
        this.c = regularBusViewState;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RegularBusPageFeature regularBusPageFeature;
        switch (this.f18362a) {
            case 0:
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = this.c.q;
                if (regularBusPageDisplayItemData != null && (regularBusPageFeature = regularBusPageDisplayItemData.g) != null) {
                    this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature, null, null, 0, null, null, null, 118));
                }
                break;
            default:
                LocationTooltipData locationTooltipData = this.c.m;
                this.b.invoke(new RegularBusViewIntent.LocationTurnOnButtonClickedIntent(locationTooltipData != null ? locationTooltipData.b : LocationTurnOnTooltipType.Unknown.f2947a));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ m11(Function1 function1, RegularBusViewState regularBusViewState) {
        this.b = function1;
        this.c = regularBusViewState;
    }
}
