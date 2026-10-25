package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.VisualTransformation;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19320a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ so(Modifier modifier, String str, String str2, String str3, String str4, boolean z, VisualTransformation visualTransformation, Integer num, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, int i, int i2, int i3) {
        this.f19320a = 2;
        this.d = modifier;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.g = str4;
        this.e = z;
        this.h = visualTransformation;
        this.i = num;
        this.j = focusRequester;
        this.k = softwareKeyboardController;
        this.l = function1;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19320a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.ElevatedAssistChip$lambda$3((Function0) this.b, (Function2) this.c, this.d, this.e, (Function2) this.f, (Function2) this.g, (Shape) this.h, (ChipColors) this.i, (ChipElevation) this.j, (BorderStroke) this.k, (MutableInteractionSource) this.l, this.m, this.n, this.o, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.AssistChip$lambda$0((Function0) this.b, (Function2) this.c, this.d, this.e, (Function2) this.f, (Function2) this.g, (Shape) this.h, (ChipColors) this.i, (ChipElevation) this.j, (BorderStroke) this.k, (MutableInteractionSource) this.l, this.m, this.n, this.o, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.m | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.n);
                NcmcOnlineRechargeScreenKt.b(this.d, (String) this.b, (String) this.c, (String) this.f, (String) this.g, this.e, (VisualTransformation) this.h, (Integer) this.i, (FocusRequester) this.j, (SoftwareKeyboardController) this.k, (Function1) this.l, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, this.o);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ so(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Function2 function4, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.f19320a = i4;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.f = function3;
        this.g = function4;
        this.h = shape;
        this.i = chipColors;
        this.j = chipElevation;
        this.k = borderStroke;
        this.l = mutableInteractionSource;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }
}
