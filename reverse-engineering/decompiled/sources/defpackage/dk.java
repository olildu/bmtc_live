package defpackage;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.LocalComponentContextKt;
import app.chalo.navigation.child.ChildComponent;
import com.arkivanov.decompose.Child;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dk implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15470a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ dk(Function3 function3, int i) {
        this.f15470a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15470a) {
            case 0:
                RowScope Button = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Button, "$this$Button");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(Button) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(964372346, iIntValue, -1, "app.chalo.compose.components.buttons.ChaloButtonWithCustomContent.<anonymous> (ChaloFilledButton.kt:265)");
                    }
                    this.b.invoke(Button, composer, Integer.valueOf(iIntValue & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 1:
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1858801064, iIntValue2, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet.<anonymous> (ChaloRoundedBottomSheet.kt:38)");
                    }
                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-285718786, true, new ob(7, WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()), this.b), composer2, 54), composer2, 3072, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 2:
                Child.Created child = (Child.Created) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(child, "child");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1768476779, iIntValue3, -1, "app.chalo.core.compose.DecomposeParentScreen.<anonymous> (DecomposeParentScreen.kt:43)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) LocalComponentContextKt.f1813a.provides(((ChildComponent) child.b).a()), ComposableLambdaKt.rememberComposableLambda(553485013, true, new h3(14, this.b, child), composer3, 54), composer3, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f17538a;
            case 3:
                return MovableContentKt.movableContentWithReceiverOf$lambda$0(this.b, obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                String amPM = (String) obj3;
                Intrinsics.i(amPM, "amPM");
                this.b.invoke(num, num2, amPM);
                return Unit.f17538a;
        }
    }
}
