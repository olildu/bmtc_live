package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.MultipleFromToStopComposableKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.fromto.MultipleFromToStopItemUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kk0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17506a;
    public final /* synthetic */ MultipleFromToStopItemUIState b;
    public final /* synthetic */ int c;

    public /* synthetic */ kk0(MultipleFromToStopItemUIState multipleFromToStopItemUIState, int i, int i2) {
        this.f17506a = i2;
        this.b = multipleFromToStopItemUIState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17506a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        MultipleFromToStopItemUIState multipleFromToStopItemUIState = this.b;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        ChaloColorToken.Custom custom = MultipleFromToStopComposableKt.f1846a;
        switch (i) {
            case 0:
                MultipleFromToStopComposableKt.c(multipleFromToStopItemUIState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                MultipleFromToStopComposableKt.d(multipleFromToStopItemUIState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return unit;
    }
}
