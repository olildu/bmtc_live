package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenUIKt;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ns implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18540a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ ImageUIState c;
    public final /* synthetic */ ImageUIState d;
    public final /* synthetic */ VerticalDashedLineUIState e;
    public final /* synthetic */ int f;

    public /* synthetic */ ns(Modifier modifier, ImageUIState imageUIState, ImageUIState imageUIState2, VerticalDashedLineUIState verticalDashedLineUIState, int i, int i2) {
        this.f18540a = i2;
        this.b = modifier;
        this.c = imageUIState;
        this.d = imageUIState2;
        this.e = verticalDashedLineUIState;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18540a) {
            case 0:
                ((Integer) obj2).getClass();
                ConfirmBookingScreenUIKt.c(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.d(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
