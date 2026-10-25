package defpackage;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.foundation.layout.RowColumnImplKt;
import androidx.compose.foundation.layout.RowColumnParentData;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h40 {
    public static long a(FlowLineMeasurePolicy flowLineMeasurePolicy, int i, int i2, int i3, int i4, boolean z) {
        return flowLineMeasurePolicy.isHorizontal() ? RowKt.createRowConstraints(z, i, i2, i3, i4) : ColumnKt.createColumnConstraints(z, i, i2, i3, i4);
    }

    public static int b(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        return flowLineMeasurePolicy.isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    public static int c(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment;
        RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(placeable);
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = flowLineMeasurePolicy.getCrossAxisAlignment();
        }
        return crossAxisAlignment.align$foundation_layout(i, layoutDirection, placeable, i2);
    }

    public static int d(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        return flowLineMeasurePolicy.isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    public static MeasureResult e(final FlowLineMeasurePolicy flowLineMeasurePolicy, final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        if (flowLineMeasurePolicy.isHorizontal()) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final LayoutDirection layoutDirection = flowLineMeasurePolicy.isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return MeasureScope.CC.s(measureScope, i8, i7, null, new Function1() { // from class: g40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h40.g(iArr2, i4, i5, i6, placeableArr, flowLineMeasurePolicy, i3, layoutDirection, i, iArr, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static void f(FlowLineMeasurePolicy flowLineMeasurePolicy, int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (flowLineMeasurePolicy.isHorizontal()) {
            flowLineMeasurePolicy.getHorizontalArrangement().arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
        } else {
            flowLineMeasurePolicy.getVerticalArrangement().arrange(measureScope, i, iArr, iArr2);
        }
    }

    public static Unit g(int[] iArr, int i, int i2, int i3, Placeable[] placeableArr, FlowLineMeasurePolicy flowLineMeasurePolicy, int i4, LayoutDirection layoutDirection, int i5, int[] iArr2, Placeable.PlacementScope placementScope) {
        int i6 = iArr != null ? iArr[i] : 0;
        for (int i7 = i2; i7 < i3; i7++) {
            Placeable placeable = placeableArr[i7];
            Intrinsics.f(placeable);
            int crossAxisPosition = flowLineMeasurePolicy.getCrossAxisPosition(placeable, i4, layoutDirection, i5) + i6;
            if (flowLineMeasurePolicy.isHorizontal()) {
                Placeable.PlacementScope.place$default(placementScope, placeable, iArr2[i7 - i2], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, iArr2[i7 - i2], 0.0f, 4, null);
            }
        }
        return Unit.f17538a;
    }
}
