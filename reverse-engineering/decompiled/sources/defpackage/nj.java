package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18517a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nj(long j, Function0 function0, Function1 function1, Function0 function2, SelectableDates selectableDates, int i) {
        this.b = j;
        this.d = function0;
        this.f = function1;
        this.e = function2;
        this.g = selectableDates;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18517a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Function function = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ChaloDatePickerKt.a(this.b, (Function0) function, (Function1) obj4, (Function0) obj5, (SelectableDates) obj3, (Composer) obj, iUpdateChangedFlags);
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                JourneyDetailsBottomSheetKt.a((Function2) function, (Function2) obj5, (Function3) obj4, this.b, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags2);
                return unit;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$11((Function0) function, this.b, (ModalBottomSheetProperties) obj5, (Animatable) obj4, (Function2) obj3, this.c, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ nj(Function0 function0, long j, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, Function2 function2, int i) {
        this.d = function0;
        this.b = j;
        this.e = modalBottomSheetProperties;
        this.f = animatable;
        this.g = function2;
        this.c = i;
    }

    public /* synthetic */ nj(Function2 function2, Function2 function3, Function3 function4, long j, Modifier modifier, int i) {
        this.d = function2;
        this.e = function3;
        this.f = function4;
        this.b = j;
        this.g = modifier;
        this.c = i;
    }
}
