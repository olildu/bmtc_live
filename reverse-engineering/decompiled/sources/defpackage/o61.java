package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SecureTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o61 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18573a;
    public final /* synthetic */ TextFieldState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TextStyle e;
    public final /* synthetic */ TextFieldLabelPosition f;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ InputTransformation o;
    public final /* synthetic */ int p;
    public final /* synthetic */ char q;
    public final /* synthetic */ KeyboardOptions r;
    public final /* synthetic */ KeyboardActionHandler s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ Shape u;
    public final /* synthetic */ TextFieldColors v;
    public final /* synthetic */ PaddingValues w;
    public final /* synthetic */ MutableInteractionSource x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ o61(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function9, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, int i6) {
        this.f18573a = i6;
        this.b = textFieldState;
        this.c = modifier;
        this.d = z;
        this.e = textStyle;
        this.f = textFieldLabelPosition;
        this.g = function3;
        this.h = function2;
        this.i = function4;
        this.j = function5;
        this.k = function6;
        this.l = function7;
        this.m = function8;
        this.n = z2;
        this.o = inputTransformation;
        this.p = i;
        this.q = c;
        this.r = keyboardOptions;
        this.s = keyboardActionHandler;
        this.t = function9;
        this.u = shape;
        this.v = textFieldColors;
        this.w = paddingValues;
        this.x = mutableInteractionSource;
        this.y = i2;
        this.z = i3;
        this.A = i4;
        this.B = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f18573a) {
            case 0:
                return SecureTextFieldKt.OutlinedSecureTextField_XvU6IwQ$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, composer, ((Integer) obj2).intValue());
            default:
                return SecureTextFieldKt.SecureTextField_XvU6IwQ$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, composer, ((Integer) obj2).intValue());
        }
    }
}
