package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo0 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18332a;
    public final /* synthetic */ TextFieldState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ TextFieldLabelPosition g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ InputTransformation p;
    public final /* synthetic */ OutputTransformation q;
    public final /* synthetic */ KeyboardOptions r;
    public final /* synthetic */ KeyboardActionHandler s;
    public final /* synthetic */ TextFieldLineLimits t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ ScrollState v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;
    public final /* synthetic */ PaddingValues y;
    public final /* synthetic */ MutableInteractionSource z;

    public /* synthetic */ lo0(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function9, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, int i5) {
        this.f18332a = i5;
        this.b = textFieldState;
        this.c = modifier;
        this.d = z;
        this.e = z2;
        this.f = textStyle;
        this.g = textFieldLabelPosition;
        this.h = function3;
        this.i = function2;
        this.j = function4;
        this.k = function5;
        this.l = function6;
        this.m = function7;
        this.n = function8;
        this.o = z3;
        this.p = inputTransformation;
        this.q = outputTransformation;
        this.r = keyboardOptions;
        this.s = keyboardActionHandler;
        this.t = textFieldLineLimits;
        this.u = function9;
        this.v = scrollState;
        this.w = shape;
        this.x = textFieldColors;
        this.y = paddingValues;
        this.z = mutableInteractionSource;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f18332a) {
            case 0:
                return OutlinedTextFieldKt.OutlinedTextField$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, composer, ((Integer) obj2).intValue());
            default:
                return TextFieldKt.TextField$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, composer, ((Integer) obj2).intValue());
        }
    }
}
