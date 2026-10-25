package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import com.arkivanov.decompose.extensions.compose.stack.animation.EmptyStackAnimator$invoke$lambda$2$lambda$1$$inlined$onDispose$1;
import com.google.android.gms.maps.model.Marker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18283a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ l6(Function0 function0, int i) {
        this.f18283a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f18283a) {
            case 0:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42(this.b, (GraphicsLayerScope) it);
            case 1:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47(this.b, (GraphicsLayerScope) it);
            case 2:
                ((Integer) it).intValue();
                this.b.invoke();
                return Unit.f17538a;
            case 3:
                Intrinsics.i((Marker) it, "it");
                Boolean bool = (Boolean) this.b.invoke();
                bool.booleanValue();
                return bool;
            case 4:
                Intrinsics.i((Marker) it, "it");
                this.b.invoke();
                return Unit.f17538a;
            case 5:
                Intrinsics.i((Marker) it, "it");
                this.b.invoke();
                return Unit.f17538a;
            case 6:
                Intrinsics.i((LayoutCoordinates) it, "it");
                this.b.invoke();
                return Unit.f17538a;
            case 7:
                return this.b.invoke();
            case 8:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$18$lambda$17(this.b, (DrawScope) it);
            case 9:
                return DragGestureDetectorKt.detectDragGestures$lambda$4(this.b, (PointerInputChange) it);
            case 10:
                this.b.invoke();
                return Unit.f17538a;
            case 11:
                this.b.invoke();
                return Unit.f17538a;
            case 12:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) it;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                this.b.invoke();
                return new EmptyStackAnimator$invoke$lambda$2$lambda$1$$inlined$onDispose$1();
            case 13:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9(this.b, (Throwable) it);
            case 14:
                return NavigationItemKt.Indicator_3J_VO9M$lambda$44$lambda$43(this.b, (GraphicsLayerScope) it);
            case 15:
                return ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6(this.b, (SemanticsPropertyReceiver) it);
            case 16:
                return ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25(this.b, (SemanticsPropertyReceiver) it);
            case 17:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$0(this.b, (Density) it);
            case 18:
                Intrinsics.i(it, "it");
                return this.b.invoke();
            case 19:
                return Float.valueOf(SheetState.anchoredDraggableState$lambda$5(this.b, ((Float) it).floatValue()));
            case 20:
                ((Integer) it).intValue();
                this.b.invoke();
                return Unit.f17538a;
            case 21:
                return Boolean.valueOf(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$lambda$0(this.b, (DragAndDropEvent) it));
            default:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$0(this.b, (Density) it);
        }
    }
}
