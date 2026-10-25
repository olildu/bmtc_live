package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.instantticket.ui.faredetails.compose.BottomSheetViewsKt;
import app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposableKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19822a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ vc(Modifier modifier, String str, Function0 function0, int i, int i2) {
        this.f19822a = i2;
        this.b = modifier;
        this.c = str;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19822a) {
            case 0:
                num.getClass();
                BottomSheetViewsKt.d(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 1:
                num.getClass();
                CardInfoLandingScreenKt.i(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 2:
                num.getClass();
                ChaloFilledButtonKt.h(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 3:
                num.intValue();
                FromAndToStopDetailViewKt.h(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 4:
                num.intValue();
                SearchFieldWithSwapButtonCardKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            default:
                num.intValue();
                SearchStopAndLocationItemComposableKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ vc(String str, Modifier modifier, Function0 function0, int i, int i2) {
        this.f19822a = i2;
        this.c = str;
        this.b = modifier;
        this.d = function0;
        this.e = i;
    }
}
