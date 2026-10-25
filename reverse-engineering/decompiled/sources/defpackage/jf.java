package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17400a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ jf(Modifier modifier, String str, String str2, Function0 function0, Function0 function1, int i) {
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = function0;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17400a) {
            case 0:
                ((Integer) obj2).getClass();
                CardRechargeSuccessScreenKt.c(RecomposeScopeImplKt.updateChangedFlags(this.g | 1), (Composer) obj, this.b, this.c, this.d, this.e, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                SearchFieldWithSwapButtonCardKt.c(RecomposeScopeImplKt.updateChangedFlags(this.g | 1), (Composer) obj, this.b, this.c, this.d, this.e, this.f);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ jf(Modifier modifier, String str, Function0 function0, String str2, Function0 function1, int i) {
        this.b = modifier;
        this.c = str;
        this.e = function0;
        this.d = str2;
        this.f = function1;
        this.g = i;
    }
}
