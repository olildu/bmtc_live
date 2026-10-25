package defpackage;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Scrollable2DStateKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20149a;
    public final /* synthetic */ State b;

    public /* synthetic */ yx(State state, int i) {
        this.f20149a = i;
        this.b = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20149a) {
            case 0:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$lambda$6(this.b, (DrawScope) obj);
            case 1:
                return Draggable2DKt.rememberDraggable2DState$lambda$0$0(this.b, (Offset) obj);
            case 2:
                return DraggableKt.rememberDraggableState$lambda$0$0(this.b, ((Float) obj).floatValue());
            case 3:
                return Boolean.valueOf(((Integer) obj).intValue() != CollectionsKt.K((List) this.b.getValue()));
            case 4:
                return Boolean.valueOf(((Integer) obj).intValue() != CollectionsKt.K((List) this.b.getValue()));
            case 5:
                return Scrollable2DStateKt.rememberScrollable2DState$lambda$0$0(this.b, (Offset) obj);
            default:
                return Float.valueOf(ScrollableStateKt.rememberScrollableState$lambda$0$0(this.b, ((Float) obj).floatValue()));
        }
    }
}
