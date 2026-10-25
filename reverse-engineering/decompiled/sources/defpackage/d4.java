package defpackage;

import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntRect;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15426a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ d4(MutableState mutableState, int i) {
        this.f15426a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15426a) {
            case 0:
                return AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$3$lambda$2(this.b, (IntRect) obj, (IntRect) obj2);
            case 1:
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5(this.b, (IntRect) obj, (IntRect) obj2);
            default:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1480436635, iIntValue, -1, "app.chalo.stoptripdetails.ui.StopTripDetailsScreen.<anonymous> (StopTripDetailsScreen.kt:119)");
                    }
                    StopTripDetailsScreenKt.h((StopTripDetailsViewState) this.b.getValue(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }
}
