package defpackage;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18516a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ FontStyle e;
    public final /* synthetic */ FontWeight f;
    public final /* synthetic */ FontFamily g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TextDecoration i;
    public final /* synthetic */ TextAlign j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ TextStyle q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ CharSequence u;
    public final /* synthetic */ Object v;

    public /* synthetic */ ni1(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6) {
        this.u = annotatedString;
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = fontStyle;
        this.f = fontWeight;
        this.g = fontFamily;
        this.h = j3;
        this.i = textDecoration;
        this.j = textAlign;
        this.k = j4;
        this.l = i;
        this.m = z;
        this.n = i2;
        this.o = i3;
        this.v = map;
        this.p = function1;
        this.q = textStyle;
        this.r = i4;
        this.s = i5;
        this.t = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18516a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TextKt.Text_Nvy7gAk$lambda$2((String) this.u, this.b, this.c, (TextAutoSize) this.v, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextKt.Text_IbK3jfQ$lambda$12((AnnotatedString) this.u, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Map) this.v, this.p, this.q, this.r, this.s, this.t, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ni1(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6) {
        this.u = str;
        this.b = modifier;
        this.c = j;
        this.v = textAutoSize;
        this.d = j2;
        this.e = fontStyle;
        this.f = fontWeight;
        this.g = fontFamily;
        this.h = j3;
        this.i = textDecoration;
        this.j = textAlign;
        this.k = j4;
        this.l = i;
        this.m = z;
        this.n = i2;
        this.o = i3;
        this.p = function1;
        this.q = textStyle;
        this.r = i4;
        this.s = i5;
        this.t = i6;
    }
}
