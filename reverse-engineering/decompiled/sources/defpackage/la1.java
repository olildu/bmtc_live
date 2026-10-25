package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18296a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ la1(float f, int i, Object obj, Object obj2, Object obj3) {
        this.f18296a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18296a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                return SnapFlingBehaviorKt.animateDecay$lambda$0(f, (Ref.FloatRef) obj4, (ScrollScope) obj3, (Function1) obj2, (AnimationScope) obj);
            case 1:
                return SnapFlingBehaviorKt.animateWithTarget$lambda$0(f, (Ref.FloatRef) obj4, (ScrollScope) obj3, (Function1) obj2, (AnimationScope) obj);
            default:
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                float f2 = BottomSheetScaffoldKt.f4445a;
                Intrinsics.i(semantics, "$this$semantics");
                if (f != ((Number) ((MutableState) obj3).getValue()).floatValue()) {
                    int i2 = 1;
                    if (bottomSheetScaffoldState.f4447a.c.getValue() == BottomSheetValue.Collapsed) {
                        SemanticsPropertiesKt.expand$default(semantics, null, new a(bottomSheetScaffoldState, coroutineScope, 0), 1, null);
                    } else {
                        SemanticsPropertiesKt.collapse$default(semantics, null, new a(bottomSheetScaffoldState, coroutineScope, i2), 1, null);
                    }
                }
                return Unit.f17538a;
        }
    }
}
