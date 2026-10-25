package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceUniversalPickerScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ip implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17080a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ UniversalPickerViewState c;
    public final /* synthetic */ TextFieldValue d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ ip(Modifier modifier, UniversalPickerViewState universalPickerViewState, TextFieldValue textFieldValue, Function1 function1, int i, int i2) {
        this.f17080a = i2;
        this.b = modifier;
        this.c = universalPickerViewState;
        this.d = textFieldValue;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17080a) {
            case 0:
                ((Integer) obj2).getClass();
                CitySelectionUniversalPickerScreenKt.f(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                HomeOrWorkPreferenceUniversalPickerScreenKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                UniversalPickerComposableKt.i(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
