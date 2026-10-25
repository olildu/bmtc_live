package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18463a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ KeyboardOptions g;
    public final /* synthetic */ KeyboardActions h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ VisualTransformation k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ Brush n;
    public final /* synthetic */ Function3 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ n9(Object obj, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function2, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, int i2, int i3, int i4, int i5) {
        this.f18463a = i5;
        this.s = obj;
        this.b = function1;
        this.c = modifier;
        this.d = z;
        this.e = z2;
        this.f = textStyle;
        this.g = keyboardOptions;
        this.h = keyboardActions;
        this.i = z3;
        this.j = i;
        this.k = visualTransformation;
        this.l = function2;
        this.m = mutableInteractionSource;
        this.n = brush;
        this.o = function3;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18463a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$34((TextFieldValue) this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$31((String) this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iIntValue2);
        }
    }
}
