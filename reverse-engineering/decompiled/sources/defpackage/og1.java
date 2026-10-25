package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.TargetedFlingBehaviorKt;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.TextFieldKeyInputKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class og1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18597a;

    public /* synthetic */ og1(int i) {
        this.f18597a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18597a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("super_pass_application_table");
                return Unit.f17538a;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("super_pass_application_table");
                return Unit.f17538a;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("super_pass_application_table");
                return Unit.f17538a;
            case 3:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("super_pass_bookings_table");
                return Unit.f17538a;
            case 4:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("super_pass_bookings_table");
                return Unit.f17538a;
            case 5:
                return SuspendAnimationKt.animateDecay$lambda$1((AnimationScope) obj);
            case 6:
                return SuspendAnimationKt.animate$lambda$2((AnimationScope) obj);
            case 7:
                return SuspendAnimationKt.animateTo$lambda$0((AnimationScope) obj);
            case 8:
                return Boolean.valueOf(SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$3$lambda$2((SwipeToDismissBoxValue) obj));
            case 9:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$15$lambda$14((SwipeToDismissBoxValue) obj);
            case 10:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$7$lambda$6((SwipeToDismissBoxValue) obj);
            case 11:
                return Boolean.valueOf(SwipeToDismissBoxState._init_$lambda$0((SwipeToDismissBoxValue) obj));
            case 12:
                return TabIndicatorOffsetNode.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
            case 13:
                return TargetedFlingBehaviorKt.NoOnReport$lambda$0(((Float) obj).floatValue());
            case 14:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                return Unit.f17538a;
            case 15:
                return TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$0((SelectionMovementDeletionContext) obj);
            case 16:
                return TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$1((SelectionMovementDeletionContext) obj);
            case 17:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$0((TextFieldPreparedSelection) obj);
            case 18:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$1((TextFieldPreparedSelection) obj);
            case 19:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$2((TextFieldPreparedSelection) obj);
            case 20:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$3((TextFieldPreparedSelection) obj);
            case 21:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$4((TextFieldPreparedSelection) obj);
            case 22:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$5((TextFieldPreparedSelection) obj);
            case 23:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$6((TextFieldPreparedSelection) obj);
            case 24:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$7((TextFieldPreparedSelection) obj);
            case 25:
                return TextFieldKeyInput._init_$lambda$0((TextFieldValue) obj);
            case 26:
                return TextFieldKeyInputKt.textFieldKeyInput_2WJ9YEU$lambda$0((TextFieldValue) obj);
            case 27:
                return TextFieldScrollerPosition.Saver$lambda$1((List) obj);
            case 28:
                return TextFieldSelectionManager.onValueChange$lambda$0((TextFieldValue) obj);
            default:
                return Boolean.valueOf(TextFieldSelectionState.observeTextToolbarVisibility$lambda$1$0((Rect) obj));
        }
    }
}
