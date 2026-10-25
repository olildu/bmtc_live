package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ClockFaceSizeModifier;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15778a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ h(int i, Placeable placeable) {
        this.f15778a = i;
        this.b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15778a) {
            case 0:
                Placeable.PlacementScope.placeRelative$default((Placeable.PlacementScope) obj, this.b, 0, 0, 0.0f, 4, null);
                return Unit.f17538a;
            case 1:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21(this.b, (Placeable.PlacementScope) obj);
            case 2:
                return BadgeKt.badgeBounds$lambda$7$lambda$6(this.b, (Placeable.PlacementScope) obj);
            case 3:
                return ClockFaceSizeModifier.measure_3p2s80s$lambda$0(this.b, (Placeable.PlacementScope) obj);
            case 4:
                Placeable.PlacementScope.place$default((Placeable.PlacementScope) obj, this.b, 0, 0, 0.0f, 4, null);
                return Unit.f17538a;
            case 5:
                return DragHandleKt.VerticalDragHandle$lambda$13$lambda$12$lambda$11(this.b, (Placeable.PlacementScope) obj);
            case 6:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3$lambda$2(this.b, (Placeable.PlacementScope) obj);
            case 7:
                return LazyLayoutBeyondBoundsProviderModifierNode.measure_3p2s80s$lambda$0(this.b, (Placeable.PlacementScope) obj);
            case 8:
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.i(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, this.b, 0, 0, 0.0f, 4, null);
                return Unit.f17538a;
            case 9:
                return SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42(this.b, (Placeable.PlacementScope) obj);
            case 10:
                return SliderDefaults.TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27(this.b, (Placeable.PlacementScope) obj);
            case 11:
                return TextAnnotatedStringNode.measure_3p2s80s$lambda$0$0(this.b, (Placeable.PlacementScope) obj);
            case 12:
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$26$lambda$25(this.b, (Placeable.PlacementScope) obj);
            case 13:
                return TextFieldSizeKt.textFieldMinSize$lambda$0$4$0$0(this.b, (Placeable.PlacementScope) obj);
            case 14:
                return TextFieldTextLayoutModifierNode.measure_3p2s80s$lambda$0(this.b, (Placeable.PlacementScope) obj);
            case 15:
                return TextStringSimpleNode.measure_3p2s80s$lambda$0$0(this.b, (Placeable.PlacementScope) obj);
            default:
                return TooltipKt.layoutCaret_J5j9r9c$lambda$22$lambda$21(this.b, (Placeable.PlacementScope) obj);
        }
    }
}
