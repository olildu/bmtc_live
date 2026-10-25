package defpackage;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.textfields.ChaloExpandingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15896a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TextStyle e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    public /* synthetic */ ia1(String str, Modifier modifier, TextStyle textStyle, long j, TextStyle textStyle2, long j2, int i) {
        this.f15896a = 2;
        this.b = str;
        this.c = modifier;
        this.e = textStyle;
        this.f = j;
        this.d = textStyle2;
        this.g = j2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15896a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SnackbarKt.OneRowSnackbar_kKq0p4A$lambda$12((Function2) this.b, (Function2) this.c, (Function2) this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SnackbarKt.NewLineButtonSnackbar_kKq0p4A$lambda$6((Function2) this.b, (Function2) this.c, (Function2) this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                ChaloExpandingTextKt.a((String) this.b, (Modifier) this.c, this.e, this.f, (TextStyle) this.d, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ia1(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j, long j2, int i, int i2) {
        this.f15896a = i2;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = textStyle;
        this.f = j;
        this.g = j2;
        this.h = i;
    }
}
