package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ew0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15593a;
    public final /* synthetic */ List b;
    public final /* synthetic */ TimeUtilsContract c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;

    public /* synthetic */ ew0(List list, TimeUtilsContract timeUtilsContract, Function1 function1, Modifier modifier, int i, int i2) {
        this.f15593a = i2;
        this.b = list;
        this.c = timeUtilsContract;
        this.d = function1;
        this.e = modifier;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15593a) {
            case 0:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionScreenKt.g(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionScreenKt.h(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
