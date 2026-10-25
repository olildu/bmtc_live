package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ri implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19212a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ ri(Modifier modifier, String str, String str2, Function0 function0, int i, int i2, int i3) {
        this.f19212a = i3;
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19212a;
        Unit unit = Unit.f17538a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ChaloCardInfoScreenKt.d(this.b, this.c, this.d, this.e, (Composer) obj, iUpdateChangedFlags, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                float f = ChaloSnackbarKt.f1826a;
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ChaloSnackbarKt.a(this.b, this.c, this.d, this.e, (Composer) obj, iUpdateChangedFlags2, this.g);
                break;
        }
        return unit;
    }
}
