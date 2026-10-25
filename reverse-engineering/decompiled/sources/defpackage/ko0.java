package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko0 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17517a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ TextStyle g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ VisualTransformation p;
    public final /* synthetic */ KeyboardOptions q;
    public final /* synthetic */ KeyboardActions r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ MutableInteractionSource v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ ko0(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, int i7) {
        this.f17517a = i7;
        this.b = str;
        this.c = function1;
        this.d = modifier;
        this.e = z;
        this.f = z2;
        this.g = textStyle;
        this.h = function2;
        this.i = function3;
        this.j = function4;
        this.k = function5;
        this.l = function6;
        this.m = function7;
        this.n = function8;
        this.o = z3;
        this.p = visualTransformation;
        this.q = keyboardOptions;
        this.r = keyboardActions;
        this.s = z4;
        this.t = i;
        this.u = i2;
        this.v = mutableInteractionSource;
        this.w = shape;
        this.x = textFieldColors;
        this.y = i3;
        this.z = i4;
        this.A = i5;
        this.B = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f17517a) {
            case 0:
                return OutlinedTextFieldKt.OutlinedTextField$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, composer, ((Integer) obj2).intValue());
            default:
                return TextFieldKt.TextField$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, composer, ((Integer) obj2).intValue());
        }
    }
}
