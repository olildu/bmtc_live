package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gl implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15743a;
    public final /* synthetic */ PagerState b;

    public /* synthetic */ gl(PagerState pagerState, int i) {
        this.f15743a = i;
        this.b = pagerState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15743a;
        List it = (List) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-922752179, iIntValue, -1, "app.chalo.compose.components.ChaloScrollableTabRow.<anonymous> (ChaloScrollableTabRow.kt:51)");
                }
                ChaloScrollableTabRowKt.b(it, this.b.getCurrentPage(), composer, iIntValue & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(172474589, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRow.<anonymous> (PremiumBusScrollableTabRow.kt:55)");
                }
                PremiumBusScrollableTabRowKt.a(it, this.b.getCurrentPage(), composer, iIntValue & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
