package defpackage;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19828a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ ve(Modifier modifier, String str, Function1 function1, int i) {
        this.d = modifier;
        this.b = str;
        this.c = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19828a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CanvasKt.Canvas$lambda$2(this.d, this.b, this.c, this.e, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                PremiumBusProductModificationReasonsScreenKt.j(this.d, this.b, this.c, (Composer) obj, iUpdateChangedFlags);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ve(String str, Function1 function1, Modifier modifier, int i) {
        this.b = str;
        this.c = function1;
        this.d = modifier;
        this.e = i;
    }
}
