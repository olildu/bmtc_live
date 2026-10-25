package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18416a;
    public final /* synthetic */ UniversalPickerViewState b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ TextFieldValue d;
    public final /* synthetic */ int e;

    public /* synthetic */ mp(UniversalPickerViewState universalPickerViewState, Function1 function1, TextFieldValue textFieldValue, int i, int i2) {
        this.f18416a = i2;
        this.b = universalPickerViewState;
        this.c = function1;
        this.d = textFieldValue;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18416a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CitySelectionUniversalPickerScreenKt.e(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                UniversalPickerComposableKt.e(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
