package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.HorizontalImageDialogViewerKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19187a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ List c;
    public final /* synthetic */ PagerState d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ int f;

    public /* synthetic */ r80(Modifier modifier, PagerState pagerState, List list, CoroutineScope coroutineScope, int i) {
        this.f19187a = 0;
        this.b = modifier;
        this.d = pagerState;
        this.c = list;
        this.e = coroutineScope;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19187a) {
            case 0:
                ((Integer) obj2).getClass();
                HorizontalImageDialogViewerKt.c(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.d, (Composer) obj, this.b, this.c, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                PBStopDetailsMainScreenKt.f(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.d, (Composer) obj, this.b, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                PostValidationScreenKt.f(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.d, (Composer) obj, this.b, this.c, this.e);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ r80(Modifier modifier, List list, PagerState pagerState, CoroutineScope coroutineScope, int i, int i2) {
        this.f19187a = i2;
        this.b = modifier;
        this.c = list;
        this.d = pagerState;
        this.e = coroutineScope;
        this.f = i;
    }
}
